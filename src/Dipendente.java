public class Dipendente {
    private String codiceDipendente;
    private String nome;
    private String cognome;

    public Dipendente(String codiceDipendente, String nome, String cognome) {
        this.codiceDipendente = codiceDipendente;
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getCodiceDipendente() {
        return codiceDipendente;
    }

    public void setCodiceDipendente(String codiceDipendente) {
        this.codiceDipendente = codiceDipendente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Dipendente: " + codiceDipendente + ", nome " + nome + ", cognome " + cognome;
    }
}
