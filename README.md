# Esercizi Java — Informatica, UniMe

Raccolta di esercizi ed esperimenti Java sviluppati durante il corso di
Programmazione a Oggetti (e affini) al corso di laurea in Informatica,
Università degli Studi di Messina.

## Struttura

| Cartella | Argomento |
|---|---|
| `Primi Esercizi/` | Basi del linguaggio: `Scanner`, condizionali, prime classi (`Rubrica`, `Esame`) |
| `Animali/` | Classi astratte e polimorfismo (`Animale` → `Cane`, `Gatto`) |
| `Veicoli/` | Ereditarietà singola (`Veicolo` → `Auto`, `Moto`) |
| `Persone/` | Gerarchia a più livelli (`Lavoratore` astratta → `Dipendente` → `Manager`, `Programmatore`) |
| `Eccezioni/` | Gestione delle eccezioni: `try/catch/finally`, eccezioni standard (`ArithmeticException`, `ArrayIndexOutOfBoundsException`) |
| `Conto Bancario/` | Eccezioni custom (`SaldoInsufficienteException`) applicate a un caso reale |
| `Socket/` | Programmazione di rete: lookup DNS, client/server con `Socket` e `ServerSocket` |
| `Primo Appello/` | Esercizi svolti in stile appello d'esame, con [README dedicato](Primo%20Appello/README.md) che riporta punteggio e traccia |
| `Esercitazione/` | Secondo set di esercizi (polimorfismo, membri statici, ereditarietà con `Runnable`), con [README dedicato](Esercitazione/README.md) |

## Note

- Ogni cartella è un esercizio a sé stante — nessuna dipendenza tra i pacchetti.
- I file `.class` compilati non sono tracciati (vedi `.gitignore`); si compila al volo con `javac` / `java NomeFile.java`.
- Alcuni esercizi in `Primo Appello/` includono un promemoria dei punti dell'appello originale, utile per ripasso.

## Come compilare ed eseguire

```bash
cd "Nome Cartella"
javac NomeClasse.java
java NomeClasse
```

(oppure, da Java 11+, `java NomeClasse.java` direttamente senza compilazione esplicita, per classi single-file)
