package Pessoa;
public class TestePessoa {
    
    public static void main(String[] agrs){

    Pessoa p1 = new Pessoa("Thierry", 17, "01542784679");

    Pessoa p2 = new Pessoa();
    p2.setNome("Rodrigo");
    p2.setIdade(36);
    p2.setCpf("01237256783");
    
    System.out.println(p1);
    System.out.println(p2);
    

    

    }
}
