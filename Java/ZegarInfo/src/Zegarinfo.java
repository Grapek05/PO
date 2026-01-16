import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class Zegarinfo {
    public static void main(String[] args) {
        Zegar z = new Zegar( 2000, true);
        z.start();
        JOptionPane.showMessageDialog(null, "Zamknąć");
        System.exit(0);
    }
}

class Zegar {
    private int odstep;
    private boolean dzwon;

    public Zegar(int odstep, boolean dzwon) {
        this.odstep = odstep;
        this.dzwon = dzwon;
    }
    public void start() {
        ActionListener al = new PokazZegar();
        Timer t = new Timer(odstep, al);
        t.start();
    }
    public class PokazZegar implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            Date d = new Date();
            System.out.println("Aktualna godzina: " + d);
            if (dzwon) Toolkit.getDefaultToolkit().beep();
        }
    }

}
