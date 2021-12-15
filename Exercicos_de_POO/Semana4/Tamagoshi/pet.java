class Pet{
    private int energyMax, hungryMax, cleanMax;
    private int energy, hungry, shower;
    private int diamonds;
    private int age;
    private boolean alive;
    // Atribui o valor de energia
    // Se o valor ficar abaixo de 0, o pet morre de fraqueza
    // Garanta que os valores ficarão no interalo 0 - max
    // Use esse modelo para fazer os outros métodos set

    public Pet(int energy, int hungry, int shower){
        this.energy = energyMax = energy;
        this.hungry = hungryMax = hungry;  
        this.shower = cleanMax = shower;
        this.diamonds = 0;
        this.age = 0;
     }

    void setEnergy(int value){
        if(value <= 0){
            this.energy = 0;
            System.out.println("fail: pet morreu de fraqueza");
            this.alive = false;
        }
        else if(value > this.energyMax)
            this.energy = this.energyMax;
        else
            this.energy = value;
    }

    
    void setHungry(int value){
        if(value <= 0){
            this.hungry = 0;
            System.out.println("fail: pet morreu de fome");
            this.alive = false;
        }
        else if(value > this.hungryMax)
            this.hungry = this.hungryMax;
        else
            this.hungry = value;
    }


    void setClean(int value){
        if(value <= 0){
            this.shower = 0;
            System.out.println("fail: pet morreu de sujeira");
        }
        else if(value > this.cleanMax)
            this.shower = this.cleanMax;
        else 
            this.shower = value;
    }

     
    public int getClean(){ // pega os privados e retornar publico
        return shower;
    }    
    public int getHungry(){
        return hungry;
    }
    public int getEnergy(){
        return energy;
    }
    public int getEnergyMax(){
        return energyMax;
    }
    public int getCleanMax(){
        return cleanMax;
    }
    public int getHungryMax(){
        return hungryMax;
    } 

      

    public boolean testAlive(){  
        if(this.hungry == 0 || this.shower == 0 || this.energy == 0){   
                System.out.println("fail: pet esta morto");  
                this.alive = false;
                return alive;
        }
        else
            this.alive = true;
            return alive;
    }
    
    // Invoca o método testAlive para verificar se o pet esta vivo
    // Se estiver vivo, altere os atributos utilizando os métodos set e get

    //o unico metodo que ganha diamantes eh brincando

    public void play(){ //# O comando "$play" altera em -2 energia, -1 saciedade, -3 limpeza, +1 diamante, +1 idade.

        if(testAlive()){
        this.energy = energy - 2;
        this.hungry--;
        this.shower = shower - 3;
        this.diamonds++;
        this.age++;
        setClean(this.shower);
        setEnergy(this.energy);
        setHungry(this.hungry);
        }
    }

    public void shower(){ //# O comando "$clean" alteram em -3 energia, -1 na saciedade, MAX na limpeza, +0 diamantes, +2 na idade.

        if(testAlive()){
        this.energy = energy - 3;
        this.hungry--;
        this.shower = cleanMax;
        this.age = age +2;
        setClean(this.shower);
        setEnergy(this.energy);
        setHungry(this.hungry);   
        }
    }
    public void eat(){ // # O Comando "$eat" altera em -1 a energia, +4 a saciedade, -2 a limpeza, +0 diamantes,  +1 a idade

        if(testAlive()){
        this.energy--;    
        this.hungry = hungry  + 4;
        this.shower = shower - 2;
        this.age++;
        setClean(this.shower);
        setEnergy(this.energy);
        setHungry(this.hungry);   
        }
 
    }
    public void sleep(){ //# O Comando "$sleep" aumenta energia até o máximo, altera a saciedade em -1 e # idade aumenta do número de turnos que o pet dormiu.

        if(testAlive()){
        if(this.energy <= this.energyMax - 5){//# Para dormir, precisa ter perdido pelo menos 5 unidades de energia{
        this.energy = energyMax;
        this.hungry--;
        this.age++;
        setClean(this.shower);
        setEnergy(this.energy);
        setHungry(this.hungry);   
        }
        else{
            System.out.println("fail: nao esta com sono");
        }
    }
}


public String toString(){  //exemplo : E:20/20, S:9/10, L:7/15, D:2, I:4 
    return("E:" + energy + "/" + energyMax + ", " + "S:" + hungry + "/" + hungryMax + ", " + "L:" + shower + "/" + cleanMax + ", " + "D:" + diamonds + ", "+ "I:" + age);
}
}

