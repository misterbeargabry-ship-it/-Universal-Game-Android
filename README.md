# Universal Game Android v0.3

## Funzioni incluse
- Schermata Home con riepilogo della raccolta e collegamenti rapidi.
- Scheda Libreria con elenco dei file importati e rimozione dei singoli elementi.
- Scheda Importa con selezione multipla dei file tramite selettore documenti Android.
- Scheda Info con dettagli e limiti della versione.
- Selezione di diversi tipi di file (il selettore accetta qualsiasi formato).
- Salvataggio locale della libreria tra un avvio e l'altro, conservando i riferimenti ai file selezionati.
- Interfaccia scura nera e viola.

## Limiti
Questa versione organizza e conserva i riferimenti ai file: non avvia giochi, non emula console e non installa automaticamente APK. L'importazione non copia i file nella memoria dell'app: mantiene il collegamento autorizzato al documento scelto.

## Compilazione APK
1. Aprire la cartella del progetto in Android Studio.
2. Usare JDK 17 e Android SDK 35.
3. Attendere la sincronizzazione Gradle.
4. Selezionare **Build > Build Bundle(s) / APK(s) > Build APK(s)**.

- Application ID: `com.universalgames.app`
- Version code: `3`
- Version name: `0.3.0`
