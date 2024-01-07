package veiculos;

import componentesVeiculo.Motor;
import condutores.Motorista;
import java.util.ArrayList;


public class VeiculoMotor extends Veiculo{
    
    private Motor motor;
    private ArrayList<Motorista> listaMotorista = new ArrayList<>();
    
    public void iniciarMotor(){
        
        motor.ligar();
    }
    
    public void desligarMotor(){
        
        motor.desligar();
    }
    
    public void adicionarMotorista(Motorista m){
        VeiculoMotor.this.listaMotorista.add(m);
    }
    
    public void removerMotorista(Motorista m){
        VeiculoMotor.this.listaMotorista.remove(m);
    }
    
    
    
}
