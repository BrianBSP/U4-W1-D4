package esercizio;

public class Volontario implements Checkable {
    // attributi
    private String nomeCognome;
    private int eta;
    private String cv;

    // costruttori
    public Volontario(String nomeCognome, int eta, String cv) {
        this.nomeCognome = nomeCognome;
        this.eta = eta;
        this.cv = cv;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "------Volontario-------\n{" +
                "nomeCognome='" + nomeCognome + '\'' +
                ", \neta=" + eta +
                ", \ncv='" + cv + '\'' +
                '}';
    }

    @Override
    public void checkIn() {
        System.out.println("------Volontario: ------\n" + nomeCognome);
        System.out.println("------Inizio Turno------");
    }
}
