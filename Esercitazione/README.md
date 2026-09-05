# 🏋️ ESERCITAZIONE - SET 2 (Obiettivo: Zero Errori al Primo Colpo)
## Esercizio 1 (Polimorfismo Base)
Creare una classe astratta chiamata Veicolo che definisce un metodo astratto 
String rumore().
Creare due sottoclassi concrete, Auto e Moto, che estendono Veicolo.
Entrambe le sottoclassi devono fare l'override del metodo rumore() e 
restituire rispettivamente "vrum" e "braap".

## Esercizio 2 (Membri Statici)
Creare una classe chiamata Calcolatrice.
Definire al suo interno un metodo statico public chiamato moltiplica 
che prende in ingresso due interi e restituisce un intero che rap-
presenta il loro prodotto.

## Esercizio 3 (Ereditarietà, Incapsulamento e Threading)
Creare una classe base chiamata *Impiegato* che ha:
        Due attributi privati: **nome (String)** e **ruolo (String)**.
        Un costruttore Impiegato(String nome, String ruolo) per inizializzarli.
        I relativi metodi getter e setter pubblici per entrambi gli attributi.

Creare una sottoclasse chiamata Sviluppatore che estende Impiegato e 
    implementa Runnable.
    La classe Sviluppatore deve avere:
        Due attributi privati: oreLavorate (int) e linguaggio (String).
        I relativi metodi getter e setter pubblici per questi due attributi.

Due costruttori:
            Il primo accetta: nome, ruolo e oreLavorate (3 parametri).
            Il secondo accetta: nome, ruolo, oreLavorate e linguaggio (4 parametri).
            (Ricorda la regola d'oro di super(...) in prima riga!)
L'override del metodo *run()* di Runnable che deve incrementare il 
valore di oreLavorate di 8 (quindi aggiunge 8 ore al totale e sovrascrive).
