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

    ArrayList<Client> getCadeiras(){
        this.cadeiras = new ArrayList<Client>();
        return cadeiras;
    }

    public Sala(int capacidade){
        for(int i = 0 ; i < this.cadeiras.size(); i++){
        if(this.cadeiras.get(i) == null){
            System.out.println("-");
        }
    }
}


    public boolean reservar(String id, String fone, int ind){

        for(int i = 0 ; i < this.cadeiras.size(); i++){
             if(this.cadeiras.get(i) != null){
                System.out.println("fail: cadeira ja esta ocupada");
            }
        }
        
        for(int i = 0 ; i < this.cadeiras.size(); i++){
            if(this.cadeiras.get(i).equals(id)){
               System.out.println("fail: cliente ja esta no cinema");
           }
       }        
  
     //atualize a função show para mostrar os clientes onde estiverem sentados.

    }
    public void cancelar(String id){
        if(id){
            resverar(id,fone,ind) = false;
        } 

    }
    
    public String toString(){;
    System.out.println("");
    }
}