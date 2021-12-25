import java.util.ArrayList;
class Sala{
        
/* [3.0 P] Inicializando.
Iniciar a sala de cinema.
Ao iniciar, você deve informar quantos assentos existem na sua sala.
Mostrar o estado da sala, escrevendo um - para cada cadeira vazia.
Se uma nova sala for iniciada, apague todas as informações da sala antiga.

[4.0 P] Reservas.
reservar uma cadeira para um cliente passando id, telefone e número da cadeira.
avise que houve erro ao tentar colocar duas pessoas na mesma cadeira.
avise que houve erro ao tentar colocar duas pessoas com mesmo id na sala.
atualize a função show para mostrar os clientes onde estiverem sentados.

[3.0 P] Cancelamentos.
Cancele reserva passando o id do cliente.
*/

    private ArrayList<Client> cadeiras;

    public Sala(int capacidade){

        this.cadeiras = new ArrayList<Client>();

        for(int i = 0 ; i < capacidade; i++){
            this.cadeiras.add(null);           
        }
    }
 
    public ArrayList<Client> getCadeiras(){
        return cadeiras;
    }
 

    /*public void cancelar(String id){
        
        if(id){
            resverar(id,fone,ind) = false;
        } 

    }
    */
 





 
    public boolean reservar(String idClient, String fone, int idcadeira){


        if(this.cadeiras.get(idcadeira) != null){
            System.out.println("fail: cadeira ja esta ocupada");            
            return false;
        }
        
        for(int i = 0 ; i < this.cadeiras.size(); i++){
            if(this.cadeiras.get(i) != null && this.cadeiras.get(i).getId().equals(idClient)){
               System.out.println("fail: cliente ja esta no cinema");
               return false;
           }
       }
 
        Client cliente = new Client(idClient , fone);

        this.cadeiras.set(idcadeira, cliente);
        return true;       
        //reservar uma cadeira para um cliente passando id, telefone e número da cadeira.

    }
    
    
    public String toString(){
    
    String saida = "[";
    
    for(int i = 0 ; i < this.cadeiras.size(); ++i){
        if(this.cadeiras.get(i) == null){
            saida += " - ";
        }
        else{
            saida += this.cadeiras.get(i);
        }
    }
    saida += "]";

    return saida;
}



    public static void main(String[] args) {
        Sala salinha = new Sala(5);
        System.out.println(salinha);

        salinha.reservar("Davi", "4444", 3);
        System.out.println(salinha);
    }



}