public abstract class Poligono {
    protected Color color;
    protected double longitudLado;
    protected boolean relleno;
    protected double rotacion;

    public Poligono() {
        this.color = Color.NEGRO;
        this.longitudLado = 1.0;
        this.relleno = false;
        this.rotacion = 0.0;
    }

    public Poligono(double longitudLado) {
        this();
        this.longitudLado = longitudLado;
    }

    public Poligono(Color color, double longitudLado) {
        this(longitudLado);
        this.color = color;
    }


    //metodos abstractos (no tienen implementación en esta clase)
    //si quiero que un metodo no se sobreescriba ponemos public final int metodoPrueba....
    //usameos el final para indicar que el metodo no se puede modificar, ni aunque se herede
    public abstract double getPerimetro();
    public abstract double getSuperficie();

    public void rotar(double grados) {
        this.rotacion += grados;
    }

    /**
     * Este método imprime en la consola las características del polígono.
     * Las características incluyen el color, la longitud del lado, si está relleno o no, y su rotación.
     * Uso el operador ternario ? para evaluar la condicion, si relleno=true devuelve si, si relleno=false, devuelve no
     */
    public void dibujar() {
        System.out.println("Dibujando un polígono con las siguientes características:");
        System.out.println("Color: " + this.color);
        System.out.println("Longitud del lado: " + this.longitudLado);
        System.out.println("Relleno: " + (this.relleno ? "Sí" : "No"));
        System.out.println("Rotación: " + this.rotacion);
    }

    public void agrandar(double cm) {
        this.longitudLado += cm;
    }

    public void reducir(double cm) {
        this.longitudLado = Math.max(0, this.longitudLado - cm);
    }

    public void rellenar() {
        this.relleno = true;
    }
}