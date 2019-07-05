package palindromo;

public class Palindromo {

    public static void main(String[] args) {
        String pali = "ovo";
        int a = 0;
        int b = pali.length() - 1;
        
        boolean palin = true;
        while (a <= b){
            if(pali.charAt(a)!= pali.charAt(b)){
                palin = false;
            }
            a++; b--;
        }
        if(palin){
            System.out.println("Essa palavra é Palindromo");
        } else{
            System.out.println("Essa palavra não é Palindromo");
        }
    }
    
}



