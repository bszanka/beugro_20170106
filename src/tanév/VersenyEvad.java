package tanév;

import verseny.ProgVerseny;
import verseny.TanulmanyiVerseny;
import verseny.VersenyLista;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VersenyEvad implements VersenyLista {

    private String tanev;
    private Set<TanulmanyiVerseny> versenyek;

    public VersenyEvad(String tanev, Set<TanulmanyiVerseny> versenyek) {
        this.tanev = tanev;
        this.versenyek = versenyek;
    }

    @Override
    public void felvesz(TanulmanyiVerseny verseny) {

    }

    @Override
    public List<ProgVerseny> versenyek(String nyelv) {
        return null;
    }

    @Override
    public List<ProgVerseny> versenyek(String[] nyelvek) {
        return null;
    }
}
