import java.lang.reflect.Array;
import java.util.ArrayList;

public class Empresa implements Observables {

    int valorNuevo;
    int valorAnterior = 85;
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
            if (valorAnterior == valorNuevo) {
                System.out.println("El valor de la accion en la empresa sigue en: " + valorAnterior);
            } else {
                System.out.println("El valor de la accion en la empresa paso de: " + valorAnterior + " a: " + valorNuevo);
            }
            nuevoCliente.recibir();
        }
        valorAnterior = valorNuevo;

    }
}
