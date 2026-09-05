# Esercizio 1 (Dall'Appello 1 - 5 Punti)
Creare una classe astratta Animale e definire al suo interno un metodo astratto 
String verso(). Definire due sottoclassi concrete, Cane e Gatto, che estendono 
Animale, implementano il metodo e ritornano rispettivamente "bau" e "miao".

# Esercizio 2 (Dall'Appello 2 - Metodo Statico)
Creare la classe Convertitore che contiene un metodo statico chiamato converti 
per convertire i chilometri in metri. Il metodo deve prendere in ingresso un 
intero (chilometri) e restituire un intero (metri).

# Esercizio 3 (Dall'Appello 1 - 13 Punti)
Data una classe base Persona con variabili private nome e cognome, i relativi 
getter e setter, e un costruttore Persona(String nome, String cognome).
Definire una sottoclasse Studente che estende Persona e implementa Runnable.

La classe Studente deve definire:
*Una variabile privata matricola (di tipo int)*.
*Una variabile privata cds (Corso di Studi, di tipo String)*.

I relativi metodi getter e setter per queste due variabili (Information Hiding).
*Due costruttori*:
**Il primo accetta nome, cognome e matricola**.
**Il secondo accetta nome, cognome, matricola e cds**. 
(*Usa correttamente super(...) per inizializzare nome e cognome*).

Fare l'override del metodo run() (*richiesto da Runnable*): 
il metodo deve *elevare la matricola al quadrato* e sovrascrivere il valore 
della matricola stessa con il risultato (ricorda che run() non restituisce 
nulla ed è public void).
