package dziedziczenie;
import java.util.Date;
import java.util.GregorianCalendar;


public class Pracownik {
    // pole(a)
    private String nazwa;
    private double pensja;
    private Date dzat; //dzat = data zatrudnienia

    // konstruktor
    public Pracownik(String n, double p, int r, int m, int d)
    {
        nazwa = n;
        pensja = p;
        GregorianCalendar rmd = new GregorianCalendar(r,m-1,d);
        dzat = rmd.getTime();
    }

    public Pracownik(String n) {
        nazwa = n;
    }

    //metoda(y)
    public String getNazwa() {
        return nazwa;
    }
    public double getPensja() {
        return pensja;
    }
    public Date getDzat() {
        return dzat;
    }
    public String getInfoSpec() {
        return "";
    }
}