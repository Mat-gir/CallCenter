import java.util.Date;

public class Chiamata {
    private String numeroTelefono;
    private Date dataOra;
    private Dipendente dipendente;

    public Chiamata(String numeroTelefono, Date dataOra, Dipendente dipendente) {
        this.numeroTelefono = numeroTelefono;
        this.dataOra = dataOra;
        this.dipendente = dipendente;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Date getDataOra() {
        return dataOra;
    }

    public void setDataOra(Date dataOra) {
        this.dataOra = dataOra;
    }

    public Dipendente getDipendente() {
        return dipendente;
    }

    public void setDipendente(Dipendente dipendente) {
        this.dipendente = dipendente;
    }

    @Override
    public String toString() {
        return "Chiamata: " + numeroTelefono + ", dataOra " + dataOra + ", dipendente " + dipendente;
    }
}
