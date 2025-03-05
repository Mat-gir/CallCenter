public class Cliente {
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String indirizzo;
    private String città;
    private String numeroTelefono;

    public Cliente(String codiceCliente, String nome, String cognome, String indirizzo, String città, String numeroTelefono) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.città = città;
        this.numeroTelefono = numeroTelefono;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(String codiceCliente) {
        this.codiceCliente = codiceCliente;
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

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Cliente " + codiceCliente + ", nome " + nome + ", cognome " + cognome + ", indirizzo " + indirizzo + ", città " + città + ", numeroTelefono " + numeroTelefono;
    }
}
