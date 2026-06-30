class Mesero {
    private Orden orden;

    public void tomarOrden(Orden orden) {
        this.orden = orden;
    }

    public void enviarACocina() {
        if (orden != null) {
            orden.ejecutar();
        } else {
            System.out.println("El mesero no tiene ninguna orden asignada.");
        }
    }
}