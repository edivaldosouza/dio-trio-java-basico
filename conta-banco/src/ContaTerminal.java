import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência! ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite a Agência! ");
        String agencia = sc.next();

        System.out.println("Por favor, digite seu Nome! ");
        String nome = sc.next();

        System.out.println("Por favor, digite o Saldo! ");
        Double saldo = sc.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
