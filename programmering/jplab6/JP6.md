## DAT100: Java Programmering 6 - Uke 6 / 38

Programmerinslab de neste ukene (uke 38 - 40) vil inneholde oppgaver som spesielt er relevant for programmeringsprosjektet i uke 41.

Programmeringsprojektet vil ha fokus på tabeller, metoder, objekter og klasser. Det er derfor viktig å jobbe med oppgavene på programmeringslab i forhold til å være godt forberedt til programmeringsprosjektet.

### Oppgave 1 - Tabeller og metoder

##### a)

Implementer en metode:

```java
public static void skrivUt (int[] tabell)
```

som kan skrive ut en tabell med heltal.

##### b)

Implementer en metode

```java
public static int summer (int[] tabell)
```

som gitt en `tabell` av heltall som parameter beregner summen av tallene som er lagret i tabellen.

Implementer tre varianter av metoden: en som bruker en vanlig for-løkke, en som bruker en while-løkke, og en som bruker en utvidet for-løkke.

Test de ulike implementasjoner av metoden på utvalgte tabeller og se at de gir riktig resultat. Metoden fra a) kan brukes ifm. test.

##### c)

Implementer en metode

```java
public static boolean finnesTall (int[] tabell, int tall)
```

som gitt en `tabell` og et tall returnerer `true` om tabellen `tabell` innholder tallet `tall` og `false` ellers.

##### d)

Implementer en metode

```java
public static boolean posisjonTall (int[] tabell, int tall)
```

som returnerer det første index (posisjon) i `tabell` som inneholder tallet `tall` og `-1` ellers.

##### e)

Implementer en metode

```java
public static int[] reverser(int[] tabell)
```

som gitt en `tabell` av heltall returnerer en ny tabell som har de samme elementene som `tabell` men i modsatt rekkefølge.

##### f)

Implementer en metode:

```java
public static boolean erSortert (int[] tabell)
```

som kan avgjere om ein array (tabell) av heiltal er sortert stigande (dvs. at alle tal skal vere større eller lik det forrige)

##### g)

Implementer en metode:

```java
public static int[] tabell settSammen(int[] tabell1,int[] tabell2)
```

som gitt to tabeller `tabell1` og `tabell2` som paramtere returnerer en ny tabell er er sammensettning av de to tabeller.

### Oppgave 2 - Tabeller («arrays») og strenger

Før du løser oppgavene nedenfor anbefales det å se igjennom dokumentasjon for String-klassen tilgjengelig via:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html

Gitt en streng `s` kan en metode fra String-klassen kalles ved å bruke `s.<metodenavn>`. Eksempelvis kan metoden `length()` kalles ved å bruke `s.length()`

Metodane i d) - f) nedanfor skal vere klassemetodar (static). Plasser dei ein eigen klasse og lag eit main-program som testar metodane.

##### a)

Lag en klasse med en main-metode som leser antall ord og oppretter en strengtabell (String-array) med den gitte størrelsen. Les deretter ordene fra brukeren og plasser dem i tabellen. Skriv ut tabellen for å se at ordene er kommet inn.

##### b)

Utvid main-metoden så den leser inn et mønster (streng). Tell hvor mange ord i tabellen fra pkt. a) som inneholder mønsteret og skriv ut svaret.

Se om der finnes en metode for å teste om en streng inneholder en gitt sekvens av tegn (char).

##### c)

Gå gjennom tabellen og skriv ut de midterste tegnene i hver streng der du bruker følgende regler. Dersom strengen inneholder bare ett tegn, skrives hele strengen ut. Dersom lengden er partall, skal de to midterste tegnene skrives ut. Dersom strengen har odde lengde (odde antall tegn), skal de 3 midterste tegnene skrives ut om strengen inneholder 3 tegn eller mer.

##### d)

Lag ein metode som skriv ut ein streng baklengs.

##### e)

Lag ein metode som gitt ein tabell av tekststrengar, returnerer den strengen i tabellen som kjem først i (Unikode) alfabetet.

##### f) - ekstra oppgåve

Implementer sjølv en metode svarande til metoden frå String-klassen brukt i e). Du skal bruke løkke.

### Oppgave 3 - Tabeller og decimaltall

Du skal lage et program for å lese inn temperaturen i Bergen for et bestemt klokkeslett for alle dager i en bestemt uke (dvs. 7 temperaturer).

**Temperaturer skal lagres i en tabell**.

Programmet skal videre finne og skrive ut gjennomsnittet av disse verdiene og den høyeste temperaturen for hele uken.

Skjermdialogen kan se ut som eksempelet nedenfor:

```
Analyse av temperaturer
***********************
Skriv inn temperaturene:
1. dag: 22.2
2. dag: 21.5
3. dag: 26.5
..
7. dag: 18.3

Gjennomsnittstemperaturen var 22.1
Maksimum for denne uken var 26.5 grader
```

### Oppgave 4 - Arrays og kjøretid for Java-programmer

Oppgaven fokuserer på bruk Java API dokumentasjon https://docs.oracle.com/en/java/javase/11/docs/api/index.html og måling av utføringstid for programmer.

Når der i API dokumentasjonen for Java plattformen står at en metode (eller klasse) er «deprecated» betyr at den er foreldet og at den dermed ikke skal brukes når vi lager ny kode. Grunnen til at foreldede metoder er fortsatt en del av mange Java pakker er for å sikre at koden som bruker en eldre versjon av API’en fortsatt kan kjøre uten at vi trenger å endre i koden.

De fleste programmene vi skriver i første semester vil utføres så raskt at det er vanskelig å måle utføringstiden av programmet.  På forelesningene har vi sagt at det finnes ferdige klasser i Java for å behandle tabeller. En slik klasse er `Arrays` (i pakken `java.util`): https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html

Her finnes det blant annet metoder for å sortere en tabell. Dersom vi sorterer en tabell med for eksempel 1000000 heltall, kan vi måle tiden ved hjelp av metoder i klassen `System` (i pakken java.lang):

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/System.html

eller klassene `Instant` og `Duration` (i pakken `java.time`):

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Instant.html

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html

##### a)

Vi skal sette av plass til en tabell med 1000000 elementer. Deretter fyller vi den med slumptall (tilfeldige tall). Det finnes flere måter å generere tilfeldige tall i Java. Den enkleste er kanskje metoden `random()` i klassen `Math`:

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html#random()

Denne metoden returnerer et flyttall større eller lik 0 og mindre enn 1.

Tabellen skal sorteres ved å bruke en passende metode fra klassen `Arrays`. Tiden for selve sorteringen skal måles og svaret skal skrives ut i millisekunder.

Det å lese API dokumentasjon for klassene `System` (eller `Instant` og `Duration`), `Math` og `Arrays` for å finne de rette metoder er en del av oppgaven.

##### b)

Varier antall av elementer i tabellen og undersøk hvordan utføringstiden påvirkes.
