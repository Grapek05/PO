import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util .Scanner;
public class IOplik {
    public static void main(String[] args) {
        try {
            Path rsciezka = Paths.get("plik.txt");
            Path asciezka = rsciezka.toAbsolutePath();
            System.out.println(rsciezka);
            System.out.println(asciezka);
            Scanner plik = new Scanner (rsciezka);
            while (plik.hasNextLine()) {
                System.out.println(plik.nextLine());
            }

        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("Plik nie istnieje");
        }
        try {
            FileWriter zapis = new FileWriter("plik.txt", true);
            zapis.write("Haslo:");
            zapis.close();
        } catch (IOException e) {
            System.out.println("Błąd dostepu do pliku");
        }
    }
}
