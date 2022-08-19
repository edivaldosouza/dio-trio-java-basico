import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String[] nomes = new String[10];
            
            for(int i=0 ; i<10 ; i++)
                nomes[i] = sc.nextLine();

            System.out.println("Terceiro: "+nomes[2]);    
            System.out.println("Setimo: "+nomes[6]);  
            System.out.println("Nono: "+nomes[8]);  

        }
}
