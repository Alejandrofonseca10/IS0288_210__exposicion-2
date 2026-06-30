public class Main {
    public static void main(String[] args) {
        
        Cafetera miCafeteraReal = new Cafetera();

        
        Orden nuevaOrden = new OrdenHacerCafe(miCafeteraReal);

        
        Mesero mesero = new Mesero();

        
        mesero.tomarOrden(nuevaOrden);

       
        mesero.enviarACocina();
    }
}