public class Motorcycle {
    private Person person; //agregacao
    private int power;
    private int time;


    //Inicia o atributo power, time com zero e person com null
    public Motorcycle(int power){
        this.power = 1;
        this.time = 0;
        this.person = null;
    }

    //Comprar mais tempo
    public void buy(int time){
        this.time += time;
    }

    //Se estiver vazio, coloca a pessoa na moto e retorna true
    public boolean in(Person person){
        if(this.person == null){ // a pessoa precisa estar como argumento
            this.person = person;
            return true;
        }
        else return false; 
    }

    //Se houver uma person, retira e retorna
    //Se não, retorna null
    public Person out(){
        if(this.person != null){
            this.person = null;
            return person;
        }
        else{
            return null;
        }
    }

    public void drive(int time){
        if(person.age >= 10){
            this.time = time;
            System.out.println("");
        }
    }


    //buzinar
    public void honk(){ 
        char buzina = 'e';
        for(int i = 0 ; i <= power ;++i){
            System.out.println("P" + i*buzina +"m");
        }
    }
    public String toString(){
        return ("potencia: " + power +", minutos: " + time);

    }
}