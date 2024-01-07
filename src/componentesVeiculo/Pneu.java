
package componentesVeiculo;


public class Pneu{

    private String tipo;
    private String tamanho;
    private double indiceCarga;
    private int qtd;
    
    
    public void calibrar(){
        
        
        
    }
    
    public void trocar( Pneu novoPneu){
        
    this.indiceCarga = novoPneu.indiceCarga;
    this.tipo = novoPneu.tipo;
    this.tamanho = novoPneu.tamanho;
    this.qtd = novoPneu.qtd;
    
    }
    
    
}
