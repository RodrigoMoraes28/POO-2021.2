public class Lapiseira {
    //declarando os atributos da lapiseira
    private float calibre;
    private Grafite grafite;  

    
    //iniciando a lapiseira com o construtor
    public Lapiseira(float calibre){
        this.calibre = calibre;
        grafite = null;
    }
    //imprimindo a lapiseira e tudo mais
    public String toString(){
        return("calibre: " + this.calibre + ", grafite: " + this.grafite);
    } 


    public boolean inserir(Grafite grafite){ 
        
        if(this.calibre != grafite.getCalibre()){
            System.out.println("fail: calibre incompatível");     
            return false;
        }
        else if(this.grafite != null){
            System.out.println("fail: ja existe grafite");
            return false;
        }
        else{           
            this.grafite = grafite;
            return true;
        } 
    } 
    
    public Grafite remover(){          
        if(grafite == null){
            System.out.println("fail: nao existe grafite");
            return null;            
        }
        else{
            Grafite aux = grafite;   
            grafite = null;
            return aux;    
        }
    }    

    public void escrever(){    
        if(this.grafite == null){
            System.out.println("fail: nao existe grafite");
        }
        else{
        if(this.grafite.getTamanho() == 10){
                System.out.println("warning: grafite acabou");
        }
        else if(this.grafite.getTamanho() < 10){
            System.out.println("warning: grafite acabou");
        }
        else if(this.grafite.getTamanho() - this.grafite.desgastePorFolha() < 10){
            System.out.println("fail: folha incompleta");
            System.out.println("warning: grafite acabou");
            this.grafite.setTamanho(10);
        }
        else if(this.grafite.getTamanho() - this.grafite.desgastePorFolha() == 10){
            System.out.println("warning: grafite acabou");
            this.grafite.setTamanho(10);
        }
        else{
            this.grafite.setTamanho(this.grafite.getTamanho() - this.grafite.desgastePorFolha());
        }            
        }       
    }
} 
 
