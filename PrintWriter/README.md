# 📝 Esercizio Pratico: "Il Gestore di Note"
L'obiettivo è creare una classe in grado di scrivere una nota di testo 
su un file e poi rileggerla riga per riga stampandola a schermo.
## Parte 1: La classe e la scrittura
Crea una classe chiamata GestoreNote. Al suo interno scrivi un metodo statico: 
### public static void salvaNota(String testo, String nomeFile)
Questo metodo deve:
1. Aprire un PrintWriter collegato al file indicato dal parametro nomeFile.
2. Usare il metodo println(testo) dell'oggetto PrintWriter per scrivere la 
   nota nel file.
3. Chiudere il PrintWriter con close().
4. Gestire la possibile eccezione IOException all'interno di un blocco try-catch.

## Parte 2: La lettura
Sempre dentro la classe GestoreNote, aggiungi un secondo metodo statico: 
### public static void leggiNota(String nomeFile)
Questo metodo deve:
1. Aprire un FileInputStream collegato a nomeFile.
3. Collegare uno Scanner a quel FileInputStream.
3. Usare un ciclo while con la condizione hasNextLine() per verificare 
   se ci sono altre righe.
4. Dentro il ciclo, leggere la riga corrente usando nextLine() e stamparla 
   a schermo con System.out.println(...).
5. Chiudere lo Scanner con close().
6. Gestire la possibile eccezione IOException all'interno di un blocco try-catch.

## 💡 Gli Import necessari per questa sfida:
Per aiutarti a non dimenticare nulla, ecco i componenti che dovrai importare in cima:

import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
