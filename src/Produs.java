public class Produs {
    private String denumire;
    private double pret;
    private int stoc;

    public Produs(String denumire, double pret, int stoc) {
        this.denumire = denumire;
        this.pret = pret;
        this.stoc = stoc;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    public int getStoc() {
        return stoc;
    }


    public double costPentru(int portii) {
        return this.pret * portii;
    }

    public boolean esteDisponibil(int portii) {
        return this.stoc >= portii;
    }

    @Override
    public String toString() {
        return String.format("Produs: %-18s | Preț: %6.2f lei | Stoc: %d porții", denumire, pret, stoc);
    }
}