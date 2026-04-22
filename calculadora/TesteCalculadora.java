package calculadora;

public class TesteCalculadora {
    
    public static void main(String[] agrs){

    Calculadora c1 = new Calculadora(8,4);

     Calculadora c2 = new Calculadora();
     c2.setValores(8, 2);

     System.out.println(c1);
     System.out.println(c2);
    }
}
