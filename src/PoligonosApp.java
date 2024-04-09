public class PoligonosApp {
    public static void main(String[] args) {
        // Crear polígonos
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo(Color.VERDE, 10);
        Cuadrado cuadrado = new Cuadrado(20);

        // Escribir perímetro y superficie
        System.out.println("Perímetro y superficie de triangulo1: " + triangulo1.getPerimetro() + ", " + triangulo1.getSuperficie());
        System.out.println("Perímetro y superficie de triangulo2: " + triangulo2.getPerimetro() + ", " + triangulo2.getSuperficie());
        System.out.println("Perímetro y superficie de cuadrado: " + cuadrado.getPerimetro() + ", " + cuadrado.getSuperficie());

        // Sumar áreas
        Poligono[] poligonos = {triangulo1, triangulo2, cuadrado};
        double sumaAreas = sumaAreas(poligonos);
        System.out.println("Suma de las áreas: " + sumaAreas);
    }

    /**
     * Método que suma las áreas de un array de polígonos
     */
    public static double sumaAreas(Poligono[] poligonos) {
        double suma = 0;
        for (Poligono poligono : poligonos) {
            suma += poligono.getSuperficie();
        }
        return suma;
    }
}
