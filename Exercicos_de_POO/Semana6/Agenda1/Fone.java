public class Fone {
    private String id;
    private String number;

    public Fone(String id, String number){
        this.id = id;
        this.number = number;
    }
    
    //verifica se o número é um número de telefone válido
    public static boolean validate(String number){
        boolean ehigual = false;
        for(int j = 0 ; j < number.length(); j++)
            if((number.charAt(j) >= 48 && number.charAt(j) <= 57)
            || (number.charAt(j) == 40 || number.charAt(j) == 41 || number.charAt(j) == 46))
            ehigual = true;
        else{
            ehigual = false;
            break;
        }
        return ehigual;
    }
    //O resultado deve ficar assim
    //oi:1234
    public String toString(){
        return(id + ":" + number);
    }
    //GETS e SETS
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getNumber(){
        return this.number;
    }

    public void setNumber(String number){
        this.number = number;
    }
    //utiliza o static validate para retornar se essa instancia do fone é valida
    public boolean isValid(){
        return validate(number);
    }
}
