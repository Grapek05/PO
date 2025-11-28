package dziedziczenie;

public class Student extends Pracownik {
    private String spec;

    public Student(String n, String s) {
        super(n);
        this.spec = s;
    }

        public String getInfoSpec() {
                return "Student specjalizacji: " + spec;
            }
}