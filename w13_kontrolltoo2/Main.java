//Sõnade lõputähed

// Trüki välja sõnade viimased tähed
// Väljasta erinevad sõnalõputähed nende esinemissageduse järjekorras - proovisin, aga ei saanud tööle.
// Iga lõputähega sõnade jaoks on eraldi fail, kuhu need tekstist kirjutatakse. Luuakse HTML-leht viidetega tekstis esinenud lõputähtedega failidele, iga viite juures arv, mitu korda vastava lõputähega sõna esines.


public class Main {
    public static void main(String[] args) {
        String text = "Majandusminister Taavi Aas allkirjastas reedel taastuvenergia vähempakkumise teise vooru.";
        TextLetters t = new TextLetters(text);
        t.printTextLastLetters();
    }
}

