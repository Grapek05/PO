import java.util.*;
public class PracownikInfo3  {

    public static void main(String[] args) {
        Pracownik[] wol = new Pracownik[3];
        wol[0] = new Pracownik("JK", 3000);
        wol[1] = new Pracownik(5000);
        wol[2] = new Pracownik();
        for (Pracownik p : wol) {
            System.out.println("Nazwa: " + p.getNazwa() + "Pensja: " + p.getPensja() + "Numer: " + p.getNi());
        };
    }
}
class Pracownik {
    // pole(a)
    private String nazwa = "";
    private double pensja;
    private Date dzat; //dzat = data zatrudnienia
    private static int n;
    private int ni; // numer identyfikacyjny

    static {
        Random r = new Random();
        n = r.nextInt(11);
    }
    {
        ni = n;
        n++;
    }

    // konstruktor

    public Pracownik(double p) {
        this("Pracownik #" + n, p);
    }
    public Pracownik() {}
    public Pracownik(String n, double p ) {
        nazwa = n;
        pensja = p;
    }
    public String getNazwa() {
        return nazwa;
    }
    public double getPensja() {
        return pensja;
    }
    public int getNi() {
        return ni;
    }
}
