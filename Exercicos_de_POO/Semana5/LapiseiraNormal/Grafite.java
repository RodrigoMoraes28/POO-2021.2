public class Grafite {
    private float calibre;  
    private String dureza;                               
    private int tamanho;   

    
    public float getCalibre() {
        return calibre;
    }

    public String getDureza() {
        return dureza;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public Grafite(float calibre, String dureza, int tamanho){  
        this.calibre = calibre;
        this.dureza = dureza;
        this.tamanho = tamanho;        
    }    

    public int desgastePorFolha(){ 

        if(dureza.equals("HB")){
            return 1;
        }
        else if(dureza.equals("2B")){
            return 2;
        }

        else if(dureza.equals("4B")){
            return 4;
        }
        else if(dureza.equals("6B")){
            return 6;
        }
        return 0; 
    }     

    public String toString(){
        String resposta = ("[" + calibre + ":" + dureza + ":" + tamanho + "]");
        return resposta; 
    } 
}
