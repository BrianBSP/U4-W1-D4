package esercizio;

public class DipendentePartTime extends Dipendente {
    // attributi
    private int oreLavorate;
    private int pagaAllOra;

    public DipendentePartTime(int stipendio, Dipartimento dipartimento, int oreLavorate, int pagaAllOra) {
        super(stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
        this.pagaAllOra = pagaAllOra;
    }

    @Override
    public int calculateSalary() {
        return oreLavorate * pagaAllOra;
    }

    @Override
    public String toString() {
        return "--------DipendentePartTime---------- \n{" +
                "oreLavorate=" + oreLavorate +
                ", \npagaAllOra=" + pagaAllOra +
                ",  \nstipendioPartTime=" + calculateSalary() +
                '}';
    }
}
