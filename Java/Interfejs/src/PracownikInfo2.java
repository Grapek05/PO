import java.util.*;

public class PracownikInfo2  {
    public static void main(String[] args) {
        Pracownik[] wol = new Pracownik[3];
        wol[0] = new Pracownik("Jan", 1999.99, 2000, 1, 1);
        wol[1] = new Pracownik("Ali", 2000.01, 200, 1, 1);
        wol[2] = new Pracownik("Ozy", 2000, 2000, 1, 1);

        for (Pracownik p : wol) {
            System.out.println("Nazwa:" + p.getNazwa() + "Pensja:" + p.getPensja() + "Wyrok:" + p.getDzat());
        }

        System.out.println();
//        wol[0].premia(10);
        for (Pracownik p: wol) {
            p.premia(10);
        }

        for (Pracownik p : wol) {
             System.out.println("Nazwa:" + p.getNazwa() + "Pensja:" + p.getPensja() + "Wyrok:" + p.getDzat());
        }

        System.out.println();
        Arrays.sort(wol);

        for (Pracownik p : wol) {
            System.out.println("Nazwa:" + p.getNazwa() + "Pensja:" + p.getPensja() + "Wyrok:" + p.getDzat());
        }
    }
}

///  TODO: obiąć cześć ułamkową do 2 cześć po przecinku


