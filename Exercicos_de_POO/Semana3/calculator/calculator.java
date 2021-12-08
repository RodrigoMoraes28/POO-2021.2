import java.text.DecimalFormat;
 
class Calculator {
    private int batteryMax;
    private int battery;
    private float display;
    //Inicia os atributos, battery e display começam com o zero.
 
    //construtor calculator
    public Calculator(int batteryMax){
        this.batteryMax = batteryMax;
        this.battery = 0;
        this.display = 0;
    }
 

    public void chargeBattery(int value){
        if(battery + value <= batteryMax){
            battery = battery + value;
        }
    }    //Aumenta a bateria, porém não além do máximo.

    
    public void divide(int num, int den){    //Se conseguir gastar bateria e não for divisão por 0.
        if(useBattery()){
            if(den > 0){
                display = num/den;
            }
            else{
                System.out.println("Fail : divisão por zero");
            }
        }
    }

    //Se conseguir gastar bateria, armazene a soma no atributo display.
    public void sum(int a, int b){
        if(useBattery()){
            display = a + b;
        }
    }

    

    public void subtract(int a, int b){
        if(useBattery()){
            display = a - b;
        }
    }

    public void multiply(int a, int b){
        if(useBattery()){
            display = a * b;
        }
    }
    
    
    //Retorna o conteúdo do display com duas casas decimais.
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return ("Display = " + df.format(this.display) + ", Baterry = " + this.battery);         
    } 

    public boolean useBattery(){ //Tenta gastar uma unidade da bateria e emite um erro se não conseguir.
        if(battery > 0){
            battery--;
        return true;
        }
        else{
        System.out.println("Fail : bateria insuficiente");
        return false;        
        }
    }
}
       
