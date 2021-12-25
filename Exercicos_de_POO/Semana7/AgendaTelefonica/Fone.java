
public class Fone {
    private String id;
    private String number;

    public Fone(String id, String number){
        this.id = id;
        this.number = number;
    }
    
    //verifica se o número é um número de telefone válido
    public static boolean validate(String number){
        if(!(number.contains("0") || number.contains("1") || number.contains("2") || number.contains("3") 
        || number.contains("4") || number.contains("5") || number.contains("6") || number.contains("7") 
        || number.contains("8") || number.contains("9") || number.contains(".") || (number.contains("(")  && number.contains(")")))){
        return false;
        }
        else{
            return true;
        }
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


