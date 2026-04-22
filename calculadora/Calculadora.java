package calculadora;

public class Calculadora {

    private double a;
    private double b;

    
    
    public Calculadora() {}

    
    
    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setValores(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
        System.out.println("nao e possivel dividir numero igual a zero");
        return 0;
        }
        return a / b;
    }

   
    
}
