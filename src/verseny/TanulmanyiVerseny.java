package verseny;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class TanulmanyiVerseny {
    protected String megnevezes;
    protected String tantargy = "informatika";
    protected LocalDate kezdesiDatum;
    protected LocalTime kezdesiIdo;
    protected LocalTime befejezesiIdo;

    public TanulmanyiVerseny(String megnevezes, LocalDate kezdesiDatum, LocalTime kezdesiIdo, LocalTime befejezesiIdo) {
        this.megnevezes = megnevezes;
        this.tantargy = "informatika";
        this.kezdesiDatum = kezdesiDatum;
        this.kezdesiIdo = kezdesiIdo;
        this.befejezesiIdo = befejezesiIdo;
    }

    public String getMegnevezes() {
        return megnevezes;
    }

    public String getTantargy() {
        return tantargy;
    }

    public LocalDate getKezdesiDatum() {
        return kezdesiDatum;
    }

    public LocalTime getKezdesiIdo() {
        return kezdesiIdo;
    }

    public LocalTime getBefejezesiIdo() {
        return befejezesiIdo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TanulmanyiVerseny)) return false;
        TanulmanyiVerseny that = (TanulmanyiVerseny) o;
        return Objects.equals(megnevezes, that.megnevezes) &&
                Objects.equals(tantargy, that.tantargy) &&
                Objects.equals(kezdesiDatum, that.kezdesiDatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(megnevezes, tantargy, kezdesiDatum);
    }

    @Override
    public String toString() {
        return megnevezes + " (" + tantargy + "), " + kezdesiDatum.toString()
                + " " + kezdesiIdo.toString() + "-" + befejezesiIdo.toString();
    }
}
