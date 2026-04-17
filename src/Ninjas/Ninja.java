package Ninjas;

import java.util.Random;

public class Ninja {

    String nome;
    int vida = 100;
    int poderAtaque;
    Random sorteio = new Random();

    public Ninja(String nome, int poderAtaque){
        this.nome = nome;
        this.poderAtaque = poderAtaque;
    }

   public void atacar(Ninja oponente){
    int danoGerado = sorteio.nextInt(this.poderAtaque + 1);

    System.out.println(this.nome + " atacou com um poder de " + danoGerado + "!");

    if (danoGerado == this.poderAtaque){
        System.out.println("CRITICO! Esse golpe doeu!!!");
        danoGerado +=10;
    }
    oponente.receberDano(danoGerado);
   }
   
    
    public void receberDano(int dano){
        this.vida -= dano;
      if(this.vida <= 0){
        System.out.println(this.nome + " foi derrotado!");
      } else {
        System.out.println(this.nome + " ainda tem " + this.vida + " de vida");
      }
    }
}