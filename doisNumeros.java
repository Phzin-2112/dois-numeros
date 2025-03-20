import java.util.Random;

public class doisNumeros {
    public static void main(String[] args) {
        Random random = new Random();

        int lancamento = random.nextInt(2); // Gera 0 ou 1

        if (lancamento == 0) {
            System.out.println("Resultado: 1");
        } else {
            System.out.println("Resultado: 0");
        }
    }
}
