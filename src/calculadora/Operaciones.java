package calculadora;

public class Operaciones {

    //Atributos

    private double valor1;
    private double valor2;
    private double resultado;

    // COnstructor


    public Operaciones(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    // Método Calcular Suma
    public void calcularSuma() {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = valor1 + valor2;
    }

    // Método Calcular Resta
    public void calcularResta() {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = valor1 - valor2;
    }

    // Método Calcular Multiplicación

    public void calcularMultiplicacion() {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = valor1 * valor2;
    }

    // Mètodo Calcular Divisiòn

    public double calcularDivision() throws ArithmeticException {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = valor1 / valor2;

        if (valor2 == 0) {
            throw new ArithmeticException("Divisiòn por cero no permitida");
        }
        return resultado;
    }

    // Generacion de getter y setter

    public double getResultadoOperacion() {
        return resultado;
    }


}
