//Finanças registra o saldo e guarda as movimentações financeiras
import java.util.ArrayList;
import java.util.List;
 
class Financas {
    
    //O id da próxima operação dessa conta
    private int nextId;
    //A lista de operações realizadas
    private List<Operacao> extrato;
    private int saldo;

    public Financas(){
        this.nextId = 0;    
        this.extrato = new ArrayList<Operacao>();
        this.saldo = 0;
    }

    //Adiciona value ao saldo
    //Crie operação e adiciona ao vetor de operações
    //Incrementa o nextId
    public void addOperacao(Label label, int value){            
        saldo += value;
        Operacao novaOperacao = new Operacao(nextId, label, value, saldo);
        extrato.add(novaOperacao);
        this.nextId++;        
    } 
    /*
    Retornar o extrato.
    Extrato completo
    Retornar todas as movimentações da conta desde a abertura
    A descrição pode ser "abertura", "saque", "deposito", "tarifa", "extorno".
    Os saques devem ter valor negativo e os depósitos positivos.
    */ 
    //#extrato mostra todas as operações desde a abertura da conta
    public List<Operacao> getExtrato(int qtdOp){
        //#extratoN mostra as ultimas N operacoes
 
        List<Operacao> aux = new ArrayList<Operacao>();
        for(int i = extrato.size() - qtdOp; i < extrato.size(); i++){
            aux.add(this.extrato.get(i));             
        }
        return aux; 
    }
  
    public List<Operacao> getExtrato(){

        List<Operacao> aux2 = new ArrayList<Operacao>();
        for(int i = 0 ; i < extrato.size(); i++){
            aux2.add(this.extrato.get(i));
        }
        return aux2;
    }

    public int getSaldo(){
        return this.saldo;
    }

}