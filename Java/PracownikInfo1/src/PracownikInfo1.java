import java.util.*;
public class PracownikInfo1  {

    public static void main(String[] args) {
        Pracownik[] wol = new Pracownik[1];
        wol[0] = new Pracownik("JK", 3000, 2025, 11, 14);
        System.out.println("Nazwa:" + wol[0].getNazwa() +
                "Pensja:" + wol[0].getPensja() +
                "Wyrok:" + wol[0].getDzat());
    }
}
class Pracownik {
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

    //metoda(y)
    public String getNazwa()
    {
        return nazwa;
    }
    public double getPensja()
    {
        return pensja;
    }
    public Date getDzat()
    {
        return dzat;
    }
}
