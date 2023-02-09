import java.lang.reflect.Array;
import java.util.ArrayList;

public class Empresa implements Observables {

    int valorNuevo;
    private ArrayList<Observadores> observador;

    public Empresa() {
        observador = new ArrayList<Observadores>();
    }

    public void agregarCliente(Observadores nuevoCliente) {
        observador.add(nuevoCliente);
    }

    public void CambiarPrecio() {
        valorNuevo = (int) (Math.random() * (100 - 95) + 95); //numero entre 70 y 100
        notificar();
    }

    @Override
    public void notificar() {

        for (Observadores nuevoCliente : observador) {
            nuevoCliente.recibir();
            System.out.println("El valor de la accion de la empresa paso a: " + valorNuevo);
        }


    }
}
