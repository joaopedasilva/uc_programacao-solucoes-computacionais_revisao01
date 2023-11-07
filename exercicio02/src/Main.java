import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int termo, produto;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tabuada");
        System.out.print("Digite o termo: ");
        termo = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            produto = termo * i;
            System.out.println(termo + " x " + i + " = " + produto);
        }

        entrada.close();
    }
}