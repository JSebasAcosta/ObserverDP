public class Main {


    public static void main(String[] args) {

        Cliente pepe=new Cliente();
        Empresa gasolina=new Empresa();
        gasolina.agregarCliente(pepe);
        gasolina.CambiarPrecio();
    }
}