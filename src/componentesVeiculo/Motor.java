
package componentesVeiculo;


public class Motor {
    
    private String potencia;
    private String numCilindros;
    private String combustivel;
    private boolean ligado;
    
    
    public boolean ligar(){
        
        return this.ligado = true;
    }
    
    public boolean desligar(){
        
        return this.ligado = false;
    }
}
