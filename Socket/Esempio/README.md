# Programmazione di Rete (Client-Server con i Socket) 🌐!
Questo è un altro pilastro immancabile del tuo esame. 
Nel secondo appello, ad esempio, ti veniva chiesto 
proprio di implementare un Client TCP.

Vediamo tutta la logica spiegata in modo semplice: 
1. La Logica del Client-Server (L'analogia del Telefono)
Per far parlare due computer diversi in rete tramite 
protocollo TCP (connessione sicura che garantisce l'arrivo dei dati in ordine)
Java usa due classi fondamentali del pacchetto java.net:

## ServerSocket (Il Server - Chi aspetta)
È come un telefono fisso che squilla in un ufficio
. Sta fermo su una specifica "porta" (un canale numerico, es. 1245) 
  e aspetta che qualcuno lo chiami

## Socket (Il Client - Chi chiama)
È come un telefono cellulare che avvia la chiamata
. Per connettersi, ha bisogno di sapere due cose: 
  - l'indirizzo IP del server (dove si trova) 
  - la porta (con chi vuole parlare)

Una volta che il Server "risponde alla chiamata" 
(tramite il metodo .accept()), si crea un canale 
di comunicazione bidirezionale

Tutto lo scambio di dati avviene tramite i flussi 
di input e output (i famosi Stream) associati a quel socket:

Per inviare dati: 
- Si prende l'output stream e 
  ci si scrive sopra (usiamo PrintWriter)

Per leggere dati: 
- Si prende l'input stream e 
  si legge quello che arriva (usiamo BufferedReader)

2. Come si scrive un Client TCP d'Esame (Esempio Completo e Isolato)
Prendiamo l'esercizio esatto del tuo secondo appello
La traccia chiedeva di:
- Creare una classe Client

- Collegarsi al server all'IP 172.16.6.72 e alla porta 1245

- Creare un metodo public String codifica(String messaggioIn) che 
  invia il messaggio al server, aspetta la risposta, leggendo 
  una riga, e la restituisce

- Usare println per inviare e readLine per leggere

Ecco il codice completo, pulito e autonomo (senza main), pronto per l'esame:

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.net.Socket; // Tutti gli import necessari in cima!

public class Client {

    // Costruttore vuoto, richiesto o di default
    public Client() {
    }

    // Metodo richiesto dalla traccia d'esame
    public String codifica(String messaggioIn) {
        String rispostaDelServer = "";

        // try-with-resources: apre il Socket e i canali di I/O chiudendoli alla fine!
        try (
            // 1. Ci colleghiamo al server usando IP e Porta indicati dalla traccia
            Socket mioSocket = new Socket("172.16.6.72", 1245);

            // 2. Creiamo il canale per SCRIVERE al server (autoflush abilitato con 'true')
            PrintWriter out = new PrintWriter(mioSocket.getOutputStream(), true);

            // 3. Creiamo il canale per LEGGERE dal server
            BufferedReader in = new BufferedReader(new InputStreamReader(mioSocket.getInputStream()))
        ) {
            
            // 4. Inviamo il messaggio al server tramite println
            out.println(messaggioIn);

            // 5. Leggiamo la risposta inviata dal server tramite readLine
            rispostaDelServer = in.readLine();

        } 
        catch (IOException e) {
            // Gestione obbligatoria delle eccezioni di rete
            System.out.println("Errore di connessione: " + e.getMessage());
        }

        // 6. Restituiamo il risultato al metodo chiamante
        return rispostaDelServer;
    }
}


🔍 Analizziamo i dettagli chiave per non fare errori:
I tre oggetti magici:
Socket mioSocket = new Socket(ip, porta): 
- Stabilisce fisicamente la connessione TCP
- Se il server non è attivo, questa riga lancia 
  subito una IOException.
PrintWriter out = ...: Ci permette di usare il 
comodissimo metodo .println(...) per spedire 
righe di testo in rete
- Il parametro true attiva l'AutoFlush, dice a 
 Java di spedire immediatamente il testo senza 
 accumularlo in memoria)

BufferedReader in = ...: Serve per leggere i messaggi in arrivo
- Usa .readLine(), che si mette in attesa 
  finché dal server non arriva una riga 
  intera che finisce con un "invio" (\n)

## Il try-with-resources
*La sintassi moderna da 30 e lode*: 
Invece di scrivere i faticosi blocchi finally per fare 
.close() a mano su socket, lettore e penna, rischiando 
di dimenticarli o fare pasticci, scrivendoli dentro le 
parentesi tonde del try:
try (Socket s = ...; PrintWriter out = ...; 
BufferedReader in = ...) { ... }
Java si occuperà di chiudere tutto automaticamente 
in totale sicurezza non appena si esce dal blocco 
try, sia se tutto va bene, sia se si verifica 
un'eccezione.


# 🌐 La classe Server (Esempio completo e isolato)
1. Si mette in ascolto su una porta specifica (es. 1245).
2. Rimane in attesa finché un client non si connette.
3. Legge il messaggio inviato dal client.
4. Risponde al client inviandogli il testo modificato,
   ad esempio in lettere maiuscole.
5. Ecco il codice pulito da scrivere all'esame:

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.net.ServerSocket; // Classe specifica per il Server!
import java.net.Socket;

public class Server {

    // Costruttore di default
    public Server() {
    }

    // Metodo per avviare il server su una determinata porta
    public void avvia(int porta) {
        
        // try-with-resources: apre il ServerSocket e lo chiude in automatico alla fine
        try (
            // 1. Creiamo il "telefono dell'ufficio" in ascolto sulla porta
            ServerSocket serverSocket = new ServerSocket(porta)
        ) {
            System.out.println("Server in ascolto sulla porta " + porta + "...");

            // 2. Il server si blocca qui in attesa che un client chiami.
            // Quando un client si connette, accept() si sblocca e restituisce il Socket del client!
            try (Socket clientSocket = serverSocket.accept()) {
                System.out.println("Client connesso!");

                // 3. Creiamo i canali di lettura e scrittura collegati al client
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // 4. Leggiamo il messaggio inviato dal client
                String messaggioRicevuto = in.readLine();
                System.out.println("Ricevuto dal client: " + messaggioRicevuto);

                // 5. Elaboriamo la risposta (es. tutto in maiuscolo)
                String risposta = messaggioRicevuto.toUpperCase();

                // 6. Spediamo la risposta al client
                out.println(risposta);
                
                // I flussi "in" e "out" si chiuderanno automaticamente qui alla chiusura del clientSocket
            }

        } 
        catch (IOException e) {
            System.out.println("Errore nel server: " + e.getMessage());
        }
    }
}
