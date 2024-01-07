package manutencao;

import java.util.Date;
import veiculos.Veiculo;


public class Manutencao {
    private Veiculo veiculo;
    private String descricao;
    private Date data;
    private Date dataProximaManu;
    private Mecanico mecanico;
    
    public void realizarManutencao(){
        
        this.veiculo.realizarManutencao();
    }
    
    public void acabaManutencao(){
        this.veiculo.acabaManutencao();
        
    }
}
