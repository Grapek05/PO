public class Abstrakcja {
    public static void main(String[] args) {
        Osoba[] wol = new Osoba[3];

        wol[0] = new Pracownik("Jan Kowal", 3000.00, 2025, 11, 14);
        wol[1] = new Pracownik("Anna Kowal", 3000.00, 2025, 11, 16);
        wol[2] = new Student("Pawel Kowal", "Biochem");

        for (Osoba p: wol) {
            System.out.println("Nazwa: " + p.getNazwa() + ", " + p.getInfo());
        }
    }
}