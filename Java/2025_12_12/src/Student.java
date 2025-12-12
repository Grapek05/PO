public class Student extends Osoba {
    private String spec;

    public Student(String n, String s) {
        super(n);
        this.spec = s;
    }

    public String getInfo() {
        return "Student specjalizacji " + spec;
    }
//    System.out.printf("Student specjalizacji %s", spec);
}