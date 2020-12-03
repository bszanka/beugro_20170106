package verseny;

public interface VersenyLista {
    // új versenyt vesz fel a listára
    public void felvesz(TanulmanyiVerseny verseny);

    // visszaadja azoknak a programozó versenyeknek a rendezett listáját (a
    // természetes rendezettség sorrendjében), amelyeken használható a paraméterként
    // megkapott programozási nyelv
    public java.util.List<ProgVerseny> versenyek(String nyelv);

    // visszaadja azoknak a programozó versenyeknek a rendezett listáját (a
    // természetes rendezettség sorrendjében), amelyeken használható a paraméterként
    // megkapott összes programozási nyelv
    public java.util.List<ProgVerseny> versenyek(String[] nyelvek);

}
