class Conta {
    //O número da conta
    private int id;
    private Financas financas;
     
    public Conta(int id){
        this.id = id;   
        this.financas = new Financas();
        financas.addOperacao(Label.abertura, 0);
        //Se a conta já existir, resete todos os valores para uma nova conta.
        //Inicia a conta com a operação de "abertura".
        //Para facilitar a visualização dos dados, utilize inteiros para registrar as operações financeiras.

    }

    //adiciona valor à conta
    //Os saques devem ter valor negativo e os depósitos positivos.
    public boolean creditar(Label label, int value){    
        if(value < 0){
            System.out.println("fail: valor invalido");
            return false;
        }
        else{
            financas.addOperacao(Label.deposito, value);
            return true;
        }
    } 
 
    public boolean extornar(int indice){ 

        if(indice > this.financas.getExtrato().size()){
            System.out.println("fail: indice " + indice + " invalido");
            return false;
        } 

        else if(!(this.financas.getExtrato().get(indice).getLabel().equals(Label.tarifa))){
            System.out.println("fail: indice " + indice + " nao e tarifa");
            return false;
        }   
 
        else{
            if(this.financas.getExtrato().get(indice).getValue() < 0){
                this.financas.addOperacao(Label.extorno, (this.financas.getExtrato().get(indice).getValue() * -1));
            }
            else{
            this.financas.addOperacao(Label.extorno, this.financas.getExtrato().get(indice).getValue());
            }
            return true;
        }        
                      
    } 

    /*
    Saque, Depósito e Tarifas
    Verifique se o valor é válido.
    No caso da tarifa, o valor final de saldo poderá ser negativo.
    No caso do saque, verifique se há saldo suficiente efetuar a operação
    */    
    //só realiza a operação se houver dinheiro suficiente na conta
    
    public boolean sacar(int value){
        if(value > this.financas.getSaldo()){
            System.out.println("fail: saldo insuficiente");
            return false;
        }else{
            if(value > 0){
                value = -1 * value;
            }
            financas.addOperacao(Label.saque, value);
            return true;
        }
    }

    //retira o dinheiro, mesmo que o saldo fique negativo
    public boolean tarifar(int value){
        if(value > 0){
            value = -1 * value;
        }
        financas.addOperacao(Label.tarifa, value);
        return true;     
    }
    

    public String toString(){
        
        return("conta:" + this.id + " saldo:" + this.financas.getSaldo());
    }

    public Financas getFinancas(){
        return financas;
    }
   
}
