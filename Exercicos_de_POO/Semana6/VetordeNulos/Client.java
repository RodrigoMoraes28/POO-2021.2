class Client {
    private String id;
    private String fone;
    
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

    public Client(String id, String fone){
        this.id = id;
        this.fone  = fone;
    }

    public String toString(){
        
    };

    public String getId(){
        return id;
    }

    void setId(String id){
        this.id = id;
    };

    public String getFone(){
        return fone;
    }

    void setFone(String fone){
        this.fone = fone;
    };

}
