public class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.suma(2, 2);
        System.out.println("La suma es: " + resultado);
    }
}
