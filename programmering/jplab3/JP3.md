# DAT100: Java Programmering 3 - torsdag/fredag uke 3

## Obligatorisk innlevering / fremvisning

Oppgave 4, 5 og 6 utgjør en **obligatorisk innlevering** og skal demonstreres på lab’en for undervisere eller lab-assistenter.

Dere skal jobbe i *grupper* på 2-3 medlemmer med de obligatoriske programmeringsoppgavene.

**ALLE** i
gruppen må være tilstede for demonstrasjon av programkjøring for å få godkjent. Derfor bør dere ikke
jobbe i grupper på tvers av klassene. Koden skal ikke leveres inn.
**Tidsfrist** for demonstrasjon er på lab-tiden i uke 37.

### Oppgave 1

```java
public class Oppg1 {

  public static void main(String[] args) {

    int i;

    System.out.println("Test av repetisjonssetning.");
    System.out.println("***************************");

    i = 1;

    while (i <= 10) {
      System.out.println("Dette er linje nr. " + i);

      if (i == 4) {
        System.out.println();
      }

      if (i == 8) {
        System.out.println();
      }

      i = i + 1;
    }
  }
}
```

Lag et nytt Eclipse prosjekt med en klasse der du limer inn koden ovenfor (se tips sist i dokumentet om
automatisk kode formattering i Eclipse). Sjekk om du får forventet resultat.

### Oppgave 2

Lag et program for å finne alle oddetallene fra og med en nedre grense til og med en øvre grense. Grensene
skal leses inn ved hjelp av `showInputDialog` og resultatet vises ved bruk av
`showMessageDialog`.

**Hint** Avgjør først om den nedre grensen er et oddetall (bruk operatoren %).

**Eksempel**

```
Nedre grense 4
Øvre grense 11
Resultat: 5, 7, 9, 11
```

### Oppgave 3

For å regne ut verdien x<sup>n</sup>, der *n* er et positivt heltall og *x* har en reell (double) verdi, kan du bruke funksjonen `Math.pow(x,n)` i Math-klassen. Dokumentasjon for Math-klassen finnes via
http://docs.oracle.com/javase/8/docs/api/index.html og listen All Classes.

Men du kan også lage en program-løkke vha. en while-setninge der du regner ut x<sup>n</sup> direkte ved å starte med å sette en variabel til `1.0`, og deretter multipliserer den med *x* så mange ganger som *n*-verdien er.

Lag en klasse der du i main-metoden regner ut x<sup>n</sup> på begge måter. Verdier til *x* og *n* skal leses inn fra tastaturet (dialogboks). Skriv ut resultatet med forklarende tekst.

Kjør programmet flere ganger med ulike inndata. Får du alltid det samme resultatet på begge måter?

### Oppgave 4 - Obligatorisk

**Oppgave 4** fra uke [https://github.com/dat100hib/dat100public/blob/master/programmering/jplab2/JP2-2.md#-oppgave-4]

### Oppgave 5 - Obligatorisk

Lag et program som leser inn et heltall n > 0, beregner verdien n! (n fakultet) og skriver verdien til n! der
n! = 1\*2\*3\*…\*(n-1)\*n.

### Oppgave 6 - Obligatorisk

**Oppgave 5** fra uke  https://github.com/dat100hib/dat100public/blob/master/programmering/jplab2/JP2-2.md#-oppgave-5
