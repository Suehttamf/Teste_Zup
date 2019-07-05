package invertida;
import java.util.Scanner;

public class Invertida {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in); 
       String ola = leitor.next();
       String xau = "";
       
       for(int a = ola.length()-1; a >= 0; a--){
           xau = xau + Character.toString(ola.charAt(a));
       }
        System.out.println(xau);
    }
    
}
