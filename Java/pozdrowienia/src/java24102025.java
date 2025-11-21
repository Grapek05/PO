//import java.util.*;
import java.io.Console;
import java.util.*;
//import static java.lang.Math.PI;
//import static java.lang.Math.*;

//import java.util.Scanner;


public class java24102025 {
    public static void main(String[] args)
    {
        Scanner we = new Scanner(System.in);
//        System.out.println("Podaj imię:");
//        System.out.println(we.nextLine());
//        String imie = we.nextLine();
//        System.out.println("Masz na imię:"+we.nextLine());
//        System.out.println("Ile masz lat:");
//        System.out.println("Masz "+we.nextInt() + "lat ");
//        System.out.println("PI= "+ PI);
//        System.out.println("PI= "+ sin(PI/6));
        Console haslo = System.console();
//        System.out.println(" Podaj haslo:");
        char[] uhaslo = haslo.readPassword("Podaj haslo: ");
        System.out.println("Haslo: "+uhaslo);

//        System.out.println("PI= "+ sin(30));




    }

}
