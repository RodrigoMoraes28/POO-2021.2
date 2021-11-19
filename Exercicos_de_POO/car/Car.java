public class Car{
    public int pass; // Passageiros
    public int passMax; // limite de Passageiros
    public int gas; // tanque
    public int gasMax; // limite do tanque
    public int km; // quantidade de quilometragem


    public Car(){ 
        this.gas = 0;
        this.pass = 0;
        this.passMax = 2;
        this.gasMax = 100;
    }
 
    public void drive (int km){
        if(pass <= 0){
            System.out.println("fail: nao ha ninguem no carro");
        }
        else if(this.gas <= 0){
            System.out.println("fail : tanque vazio");
        }
        else{           
            
            if(this.gas - km < 0){                            
                this.km += this.gas;
                System.out.println("fail: tanque vazio apos andar " + this.gas +" km");                 
                this.gas = 0;
                
            }
 
            else{
                this.km += km;
                this.gas -= km;
            } 
        } 
    }       
                 
    public void fuel(int gas){         
        this.gas += gas;
            while(this.gas > gasMax){
                this.gas = gasMax;            
        }        
    }    

    public void in(){
        if(pass < passMax){
        pass++;
        }
        else{
            System.out.println("fail: limite de pessoas atingido");
        }
    }
 
    public void out(){
        if(pass > 0){
            pass--;
        }
        else if(pass <= 0){
            System.out.println("fail: nao ha ninguem no carro");
        }
    }
  
    public String toString(){
        return ("pass: " + pass + ", gas: " + gas + ", km: " + km);
    } 
}


 
