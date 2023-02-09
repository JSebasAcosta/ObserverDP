public class Cliente implements Observadores{


    @Override
    public void recibir() {
        System.out.println("Se ha recibido la notificacion.");

    }
}
