public abstract class Osoba {
    public abstract String getInfo();
    private String nazwa;
    public Osoba(String n) {
        this.nazwa = n;
    }
    public String getNazwa() {
        return nazwa;
    }
}