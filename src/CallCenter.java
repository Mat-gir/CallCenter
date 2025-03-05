import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CallCenter {
    private Map<String, Cliente> clienti = new HashMap<>();
    private Map<String, Chiamata> chiamate = new HashMap<>();

    public void aggiungiCliente(Cliente cliente){
        clienti.put(cliente.getNumeroTelefono(), cliente);
    }

    public void registraChiamata(String numeroTelefono, Date dataOra, Dipendente dipendente) throws Exception {
        if(!clienti.containsKey(numeroTelefono)){
            throw new Exception("Cliente non trovato per il numero: " + numeroTelefono);
        }
        chiamate.put(numeroTelefono, new Chiamata(numeroTelefono, dataOra, dipendente));
    }

    public void chiamata (String numeroTelefono) throws Exception{
        Cliente cliente = clienti.get(numeroTelefono);
        if(cliente == null){
            throw new Exception("Numero non registrato nel sistema");
        }
        System.out.println(cliente.toString());

        Chiamata chiamata = chiamate.get(numeroTelefono);
        if(chiamata != null) {
            System.out.printf(chiamata.toString());
        } else {
            System.out.println("Nessuna chiamata precedente registrata");
        }
    }
}
