package dziedziczenie;
import java.util.*;
public class PracownikInfo4  {
    public static void main(String[] args) {
        Kierownik k = new Kierownik("JK", 3000, 2025, 11, 14);
        k.setPremiaExtra(8000);

        Pracownik[] wol = new Pracownik[5];
        wol[0] = new Pracownik("JK", 3000, 2025, 11, 14);
        wol[1] = new Pracownik("JK", 3000, 2025, 11, 14);
        wol[2] = new Pracownik("JK", 3000, 2025, 11, 14);
        wol[3] = k;
        wol[4] = new Student("Sebastian Parowka", "Mechanik");
        for (Pracownik p : wol) {
            System.out.println("Nazwa:" + p.getNazwa() + "Pensja:" + p.getPensja() + "Wyrok:" + p.getDzat() + p.getInfoSpec());
        }
    }
}