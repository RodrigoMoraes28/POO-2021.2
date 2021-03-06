import java.util.ArrayList;
  
public class Contact {
    private String name;
    private ArrayList<Fone> fones;
    protected String prefix = "-"; //utilizado no toString
    //Crie um ArrayList para o ATRIBUTO fones
    //Se a variável fones não for null, adicione todos os fones usando o método addFone
    public Contact(String name, ArrayList<Fone> fones){
        this.name = name;
        this.fones = fones; 
    }

    //Se fone for válido, insira no atributo fones
    //Se não, informe o erro
    public void addFone(Fone fone){
        if(fone.isValid() && this.fones == null){
            this.fones = new ArrayList<Fone>();
            this.fones.add(fone);
        }
        else if(fone.isValid()){
            this.fones.add(fone);
        }
        else{
            System.out.println("fail: invalid number");
        }

    }
    //Se o índice existir no ArrayList, remova o telefone com esse índice
    public void rmFone(int index){
        
        if(index < 0){
            System.out.println("fail: number doesn't exist");
        }
        else if(index >= this.fones.size()){
            System.out.println("fail: number doesn't exist");
        }
        else{
            this.fones.remove(index);
        }
    }
    //Use um contador para mostrar o índice do telefone
    //Use o toString do fone para adicioná-lo à saída
    //O resultado dever ficar assim:
    //- david [0:oi:123] [1:tim:9081] [2:claro:5431]
    public String toString(){
        String fones = "";
        if(this.fones != null){
            for(int i = 0 ; i < this.fones.size() ; i ++){
                fones += " [" + i + ":" + this.fones.get(i).getId() + ":" + this.fones.get(i).getNumber() + "]";
            }
        }
        
        return(this.prefix + " " + this.name + fones); 
    }
    //GETS e SETS

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Fone> getFones(){
        return this.fones;   
    }
    //limpe a lista de fones
    //utilize o addFone para adicionar apenas os fones válidos
    
    public void setFones(ArrayList<Fone> fones){
        this.fones.clear();
        for (Fone fone : fones) {            
            addFone(fone);            
        }
    }
}
