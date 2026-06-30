class OrdenHacerCafe implements Orden {
    private Cafetera cafetera;

    
    public OrdenHacerCafe(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    @Override
    public void ejecutar() {
        this.cafetera.hacerCafe();
    }
}