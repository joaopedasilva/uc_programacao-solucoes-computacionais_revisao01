public class Main {
    public static void main(String[] args) throws Exception {
        int numero = 1, quantidade = 0;

        while (quantidade < 100) {
            if (numero % 2 == 0) {
                System.out.print(numero + ", ");
                quantidade++;
            }
            numero++;
        }
    }
}