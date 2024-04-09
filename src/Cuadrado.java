public class Cuadrado extends Poligono {
    public Cuadrado() {
        super();
    }

    public Cuadrado(double longitudLado) {
        super(longitudLado);
    }

    public Cuadrado(Color color, double longitudLado) {
        super(color, longitudLado);
    }

    @Override
    public double getPerimetro() {
        return 4 * longitudLado;
    }

    @Override
    public double getSuperficie() {
        return longitudLado * longitudLado;
    }
}
