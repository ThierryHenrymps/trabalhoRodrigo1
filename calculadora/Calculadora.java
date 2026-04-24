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
    
   public double soma() {
    return a + b;
    }

   public double subtracao() {
    return a - b;
    }

    public double multiplicacao() {
    return a * b;
    }

    public double dividir() {
    if (b == 0) {
        System.out.println("nao e possivel dividir por zero");
        return 0;
    }
    return a / b;
}

    

    

   
    
}
