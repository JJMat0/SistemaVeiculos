package veiculos;

import java.util.ArrayList;


public class FrotaVeicular {
    
    public static ArrayList<Veiculo> frota = new ArrayList<>();
    private String nomeFrota;
    private short tamanho;
    private short qtdDisponiveis;
 
    public FrotaVeicular(){}
    
    public void adicionarVeiculo(Veiculo v){
        FrotaVeicular.frota.add(v);
    }
    
    public void removerVeiculo(Veiculo v){
        FrotaVeicular.frota.remove(v);
    }
    
    
    
    
}
