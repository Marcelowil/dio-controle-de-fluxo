import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        try{
        System.out.print("Digite o primeiro parametro: ");
        int parametroUm = sc.nextInt();

        System.out.print("Digite o segundo parametro: ");
        int parametroDois = sc.nextInt();

        contar(parametroUm,parametroDois);

        }catch(InputMismatchException e){
            System.out.println("Os valores dos parametros precisam ser numericos");
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        sc.close();
    }
    public static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
