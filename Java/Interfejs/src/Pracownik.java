import java.io.PrintStream;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pracownik implements Comparable<Pracownik> {
    // pole(a)
    private String nazwa;
    private double pensja;
    private Date dzat; // data zatrudnienia

    // konstruktor
    public Pracownik(String n, double p, int r, int m, int d) {
        nazwa = n;
        pensja = p;
        GregorianCalendar rmd = new GregorianCalendar(r, m - 1, d);
        dzat = rmd.getTime();
    }

//    public Pracownik(String n) {
//        nazwa = n;
//    }

        public String getNazwa() {
            return nazwa;
    }
    public double getPensja() {
        return pensja;
    }
    public Date getDzat() {
        return dzat;
    }

//    public String getInfoSpec() {
//        return "";
//    }

    public void premia(double procent) {
        double p = pensja * procent/100;
        pensja += p;
//        pensja*=(1+(procent/100));
    }

    public int compareTo(Pracownik p) {
        return Double.compare(pensja, p.pensja);
    }

}