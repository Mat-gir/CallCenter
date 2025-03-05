import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try{
            CallCenter callCenter = new CallCenter();
            Cliente cliente1 = new Cliente("1", "Mattia", "Girometti", "Via Castellana", "Mestre Zelarino", "123456");
            Dipendente dipendente1 = new Dipendente("1", "Francesco", "Barbiero");

            callCenter.aggiungiCliente(cliente1);
            callCenter.registraChiamata("123456", new Date(), dipendente1);

            callCenter.chiamata("123456");
            callCenter.chiamata("654321");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}