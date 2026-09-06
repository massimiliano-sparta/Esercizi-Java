# 🎮 Esercizio Pratico: "Il Salva-Partita"
## Parte 1: La classe da salvare
Crea una classe chiamata Videogioco che ha:
1. Due attributi privati: nome (String) e livelloRaggiunto (int).
2. Un costruttore per inizializzarli entrambi.
3. I relativi getter e setter per entrambi gli attributi.
Regola della serializzazione: 
. Fai in modo che implementi l'interfaccia corretta 
  (non dimenticare l'import in cima!).

## Parte 2: Il gestore dei salvataggi
Crea una classe chiamata GestoreSalvataggi. 
Al suo interno scrivi due metodi statici:
### public static void salvaPartita(Videogioco gioco)
1. Deve aprire un FileOutputStream verso il file "salvataggio.bin".
2. Deve collegarlo a un ObjectOutputStream.
4. Deve usare writeObject per scrivere l'oggetto gioco.
5. Deve fare il flush() e chiudere lo stream con close().
6. Deve gestire l'eccezione IOException all'interno del try-catch.


### public static Videogioco caricaPartita()
1. Deve dichiarare una variabile temporanea di tipo Videogioco 
   inizializzata a null fuori dal try.
2. Deve aprire un FileInputStream dal file "salvataggio.bin".
3. Deve collegarlo a un ObjectInputStream.
4. Deve leggere l'oggetto usando readObject(), fare il cast corretto 
    a (Videogioco) e salvarlo nella variabile temporanea.
5. Deve chiudere lo stream.
6. Deve gestire sia IOException che ClassNotFoundException.
7. Deve restituire la variabile temporanea in fondo al metodo.

