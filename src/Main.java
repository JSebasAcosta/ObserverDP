import java.util.concurrent.TimeUnit;
import java.util.Timer;
import java.util.TimerTask;
public class Main {


    public static void main(String[] args) throws InterruptedException {

        int contador=0;
        Accionista pepe=new Accionista();
        Empresa gasolina=new Empresa();
        gasolina.agregarCliente(pepe);

        Timer timer=new Timer();
        TimerTask cambiaPrecio=new TimerTask() {
            @Override
            public void run(){
                gasolina.CambiarPrecio();
            }
        };
        timer.schedule(cambiaPrecio, 0, 3500);


    }
}