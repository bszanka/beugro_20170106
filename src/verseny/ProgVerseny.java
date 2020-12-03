package verseny;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ProgVerseny extends TanulmanyiVerseny implements Comparable<ProgVerseny> {
    private List<String> nyelvek = new ArrayList<>();

    public ProgVerseny(String megnevezes, LocalDate kezdesiDatum, LocalTime kezdesiIdo,
                       LocalTime befejezesiIdo, List<String> nyelvek) throws NincsMegadvaNyelv {
        super(megnevezes, "informatika", kezdesiDatum, kezdesiIdo, befejezesiIdo);
        this.nyelvek = nyelvek;
        if(nyelvek.isEmpty())
            throw new NincsMegadvaNyelv("Nincs megadva programozási nyelv!");
    }

    public List<String> getNyelvek() {
        return nyelvek;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s : nyelvek) {
            sb.append(s + ", ");
        }
        return super.toString() + ", támogatott nyelvek: " + sb.substring(0,sb.length()-2);
    }

    @Override
    public int compareTo(ProgVerseny o) {
        int kulonbseg = -(Integer.compare(nyelvek.size(),o.nyelvek.size()));
        if(kulonbseg == 0) {
            kulonbseg = kezdesiDatum.compareTo(o.kezdesiDatum);
            if (kulonbseg == 0)
                return kezdesiIdo.compareTo(o.kezdesiIdo);
            else
                return kulonbseg;
        }
        else
            return kulonbseg;
    }
}
