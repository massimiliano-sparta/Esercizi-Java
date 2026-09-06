# 📘 Esercizio Pratico: "Il Salva-Libri"
## Parte 1: La classe da salvare
Crea una classe chiamata Libro che ha:
1. Due attributi privati: *titolo (String)* e *pagine (int)*.
2. Un **costruttore** per inizializzarli.
3. I *getter* per entrambi gli attributi (*getTitolo() e getPagine()*).
4. Regola della serializzazione: Fai in modo che la classe *implementi 
   Serializable* (non dimenticare l'import in cima!).

## Parte 2: Il metodo per salvare (Scrittura)
Crea una classe chiamata *GestoreFile*. Al suo interno scrivi un metodo 
**statico**: *public static void salvaLibro(Libro l)*
Questo metodo deve:
1. Aprire un FileOutputStream verso il file "preferito.bin".
2. Collegarlo a un ObjectOutputStream.
3. Usare il metodo writeObject(l) per salvare il libro.
4. Fare il flush() e chiudere lo stream con close(). Ricordati 
   di inserire tutto in un blocco try-catch per gestire la possibile 
   IOException!

## Parte 3: Il metodo per caricare (Lettura)
Sempre dentro la classe GestoreFile, scrivi un secondo metodo statico: public static Libro caricaLibro() Questo metodo deve:

1. Aprire un FileInputStream dal file "preferito.bin".
2. Collegarlo a un ObjectInputStream.
3. Leggere l'oggetto con readObject(), fare il cast a (Libro) 
   e salvarlo in una variabile.
4. Chiudere lo stream con close().
5. Restituire il libro letto. Ricordati di gestire nel try-catch 
   sia *IOException* che *ClassNotFoundException*!

## 💡 Un piccolo aiuto per l'idraulica (gli Import)
In cima ai tuoi file avrai bisogno di questi strumenti pronti all'uso:

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

