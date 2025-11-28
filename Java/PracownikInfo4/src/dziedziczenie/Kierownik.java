package dziedziczenie;

public class Kierownik extends Pracownik {

    private double premiaExtra;

        public Kierownik(String n, double p, int r, int m, int d) {
            super(n, p, r, m, d);
            premiaExtra = 0;
        }

        public double getPensja() {
            double pensjaBazowa = super.getPensja();
            return pensjaBazowa+premiaExtra;
        }

        public void setPremiaExtra(double p) {
            this.premiaExtra = p;
    }
}
