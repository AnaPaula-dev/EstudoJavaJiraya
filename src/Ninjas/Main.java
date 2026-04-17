package Ninjas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        GerenciadorExame exame = new GerenciadorExame();

        // 1. Entrada do usuário
        System.out.print("Digite seu nome ninja: ");
        String nomeUser = leitor.nextLine();
        Ninja player = new Ninja(nomeUser, 28);

        // 2. Usando os métodos das outras classes
        Ninja inimigoSorteado = exame.sortearOponente();
        
        // 3. Começar a luta
        exame.iniciarLuta(player, inimigoSorteado);

        leitor.close();
    }
}