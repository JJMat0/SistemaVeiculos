package veiculos;

import acidentes.Acidente;
import componentesVeiculo.Pneu;
import condutores.Condutor;
import java.util.ArrayList;
import manutencao.Manutencao;


public class Veiculo{
    
    protected String marca;
    protected String modelo;
    protected String matricula;
    protected short ano;
    protected Pneu pneumatico;
    protected String cor;
    protected ArrayList<Manutencao> listaManutencao;
    protected boolean usado;
    protected boolean disponivel;
    protected ArrayList<Acidente> listaAcidente;
    //protected ArrayList<Condutor> listaCondutor;
    
    
    
    public void realizarManutencao(){
        
        this.disponivel = false;
    }
    
    public void acabaManutencao(){
        this.disponivel = true;
        
    }
    
}
