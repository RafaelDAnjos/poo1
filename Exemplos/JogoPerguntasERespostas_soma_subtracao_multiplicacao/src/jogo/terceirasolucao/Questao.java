
package jogo.terceirasolucao;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public abstract class Questao {    
    int pontos;
    int operador1;
    int operador2;
    int resposta;
    
    public Questao(){        
        this.operador1 = ThreadLocalRandom.current().nextInt(0,100);
        this.operador2 = ThreadLocalRandom.current().nextInt(0,20);   
    }   
    public  abstract boolean verificarResposta();    
     public void exibirResultado(){
        if(this.verificarResposta())
          JOptionPane.showMessageDialog(null,"Você acertou!");
        else 
          JOptionPane.showMessageDialog(null,"Você errou!");
    }
}
