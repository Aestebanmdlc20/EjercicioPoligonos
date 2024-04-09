public class Triangulo extends Poligono {
    public Triangulo() {
        super();
    }

    public Triangulo(double longitudLado) {
        super(longitudLado);
    }

    public Triangulo(Color color, double longitudLado) {
        super(color, longitudLado);
    }

    @Override
    public double getPerimetro() {
        return 3 * longitudLado;
    }

    @Override
    public double getSuperficie() {
        return (Math.sqrt(3) / 4) * (longitudLado * longitudLado);
    }
}
