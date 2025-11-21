import java.util.*;

public class PracownikInfo2  {
    public static void main(String[] args) {
        Pracownik[] wol = new Pracownik[3];
        wol[0] = new Pracownik("JK", 3000, 2025, 11, 14);
        wol[1] = new Pracownik("JK", 3000, 2025, 11, 14);
        wol[2] = new Pracownik("JK", 3000, 2025, 11, 14);
        for (Pracownik p : wol) {
             System.out.println("Nazwa:" + p.getNazwa() + "Pensja:" + p.getPensja() + "Wyrok:" + p.getDzat());
        }

    }
}

