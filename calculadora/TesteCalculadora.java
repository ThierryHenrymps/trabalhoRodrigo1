package calculadora;
import java.util.Scanner;

public class TesteCalculadora {
    
    public static void main(String[] agrs){

    Scanner input = new Scanner(System.in);

    int opcao = 0;

    while(opcao != 5){
        
    Menu.menu();
    
    opcao = input.nextInt();
    

    switch (opcao) {
        case 1:
            
            System.out.println("Digite o primeiro numero");
            double a1 = input.nextDouble();
            System.out.println("Digite o primeiro numero");
            double a2 = input.nextDouble();
    
            Calculadora soma = new Calculadora();
            soma.setValores(a1, a2);

            System.out.println(soma.soma());

            break;
    
        case 2:

            System.out.println("Digite o primeiro numero");
            double b1 = input.nextDouble();
            System.out.println("Digite o primeiro numero");
            double b2 = input.nextDouble();
    
            Calculadora sub = new Calculadora();
            sub.setValores(b1, b2);

            System.out.println(sub.subtracao());

            break;
        
        case 3:

            System.out.println("Digite o primeiro numero");
            double c1 = input.nextDouble();
            System.out.println("Digite o primeiro numero");
            double c2 = input.nextDouble();
    
            Calculadora mult = new Calculadora();
            mult.setValores(c1, c2);

            System.out.println(mult.multiplicacao());

            break;

        case 4:

            System.out.println("Digite o primeiro numero");
            double d1 = input.nextDouble();
            System.out.println("Digite o primeiro numero");
            double d2 = input.nextDouble();
    
            Calculadora div = new Calculadora();
            div.setValores(d1, d2);

            System.out.println(div.dividir());

            break;
        
        case 5:
            
            System.out.println("Saindo");
            break;

         default:
                    System.out.println("Opção inválida!");

    }
}
    
    }
}
