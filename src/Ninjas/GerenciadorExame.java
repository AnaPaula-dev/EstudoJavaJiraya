package Ninjas;

import java.util.Random;

public class GerenciadorExame {
   private String[] listaOponentes = {"Gaara", "Neji Hyuuga", "Temari", "Shikamaru Nara", "Naruto Uzumaki"};
   private Random random = new Random();

   public Ninja sortearOponente() {
    int indice = random.nextInt(listaOponentes.length);
    return new Ninja(listaOponentes[indice], 25); 
}
public void iniciarLuta(Ninja jogador, Ninja inimigo) {
    java.util.Scanner pausa = new java.util.Scanner(System.in);
        System.out.println("\n--- O COMBATE COMECOU! " + jogador.nome + " VS " + inimigo.nome + " ---");
        
        while (jogador.vida > 0 && inimigo.vida > 0) {
            System.out.println("\n[Aperte ENTER para o proximo turno]");
        pausa.nextLine();
            jogador.atacar(inimigo);
            if (inimigo.vida > 0) {
                inimigo.atacar(jogador);
            }
            System.out.println("-------------------------");
        }
        
        System.out.println("FIM DA LUTA!");
    }
}

