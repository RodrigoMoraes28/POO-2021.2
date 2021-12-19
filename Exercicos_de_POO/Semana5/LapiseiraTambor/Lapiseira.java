import java.util.ArrayList; 
public class Lapiseira {           //Lapiseiras possuem um bico e um tambor.
                                  //O bico guarda o grafite que está em uso.
                                 //O tambor guarda os grafites reservas.

    private float calibre;
    private Grafite bico;
    private ArrayList<Grafite> tambor;
    

    public Lapiseira(float calibre){
        this.calibre = calibre;
        bico = null;   
        this.tambor = new ArrayList<Grafite>();
    }

    public String toString(){  
        String bico = "", tambor = "";
                 
        for(int i = 0 ; i < this.tambor.size() ; i++){
            tambor += this.tambor.get(i);            
        }
        if(this.bico != null)
            bico += this.bico;

        return("calibre: " + this.calibre + ", bico: [" + bico + "], tambor: {" + tambor + "}");
    } 


    public boolean inserir(Grafite grafite){  //O grafite é colocado como o ÚLTIMO grafite do tambor.

        if(this.calibre != grafite.getCalibre()){
            System.out.println("fail: calibre incompatível");     
            return false;
        }      
        else{
            tambor.add(grafite);             
            return true;           
        } 
    }  
    
    public Grafite remover(){      //Retira o grafite do bico.     
        if(bico == null){
            System.out.println("fail: nao existe grafite");
            return null;            
        }
        else{
            Grafite aux = bico;   
            bico = null;
            return aux;    
        }
    }
    
    
    public boolean puxar(){   //se ja tiver grafite no bico imprime falha , se n tiver nenhum no tambor tambem imprime falha

        if(this.bico != null) {
            System.out.println("fail: ja existe grafite no bico");
            return false;

        }else if (this.tambor.size() == 0) {
            System.out.println("fail: nao existe grafite no tambor");
            return false;
        } else{
            this.bico = this.tambor.get(0);
            this.tambor.remove(0);
            return true;
        }
}

    public void escrever(){    // Não é possível escrever se não há grafite no bico. 
        if(this.bico == null){
            System.out.println("fail: nao existe grafite");
        }
        else{
        if(this.bico.getTamanho() == 10){
                System.out.println("warning: grafite acabou");
        }
        else if(this.bico.getTamanho() < 10){
            System.out.println("warning: grafite acabou");
        }
        else if(this.bico.getTamanho() - this.bico.desgastePorFolha() < 10){
            System.out.println("fail: folha incompleta");
            System.out.println("warning: grafite acabou");
            this.bico.setTamanho(10);
        }
        else if(this.bico.getTamanho() - this.bico.desgastePorFolha() == 10){
            System.out.println("warning: grafite acabou");
            this.bico.setTamanho(10);
        }
        else{
            this.bico.setTamanho(this.bico.getTamanho() - this.bico.desgastePorFolha());
        }            
        }       
    }
}


