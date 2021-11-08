class HoraAproximada {
    // declaracão da classe

   /**
    * Declaração dos atributos da classe
    */
   private byte hora, minuto; 

   /**
    * O método inicializaHoraAproximada recebe argumentos para inicializar 
    * os atributos da classe HoraAproximada. Este método chama o método 
    * HoraAproximadaEhValida para verificar se os argumentos correspondem
    * a uma hora válida: se forem, inicializa os atributos, caso contrário
    * inicializa todos os dois atributos com o valor zero.
    * @param h o argumento correspondente ao atributo hora
    * @param m o argumento correspondente ao atributo minuto
     
    */
   public void inicializaHoraAproximada(byte h, byte m) {
       if(HoraAproximadaEhValida(h,m)) {
           hora = h;
           minuto = m;          
       }
       else{
           hora = minuto = 0;             
       }
   }

   /**
    * O método HoraAproximadaEhValida recebe dois valores como argumentos
    * e verifica de maneira simples se os dados correspondem a uma hora válida.
    * Se a hora for válida, retorna a constante booleana true, 
    * caso contrário, retorna false.

    * @param h o argumento correspondente ao atributo hora
    * @param m o argumento correspondente ao atributo minuto      
    * @return true se a hora for válida, false caso contrário
    */
   boolean HoraAproximadaEhValida(byte h, byte m) {
       if(h >= 0 && h <= 23 && m >= 0 && m <= 59)
           return true;
       else 
           return false;
   }

   /**
    * O método getHora devolve a hora da hora encapsulada.
    * @return a hora encapsulado pela classe
    */
   public byte getHora() {
       return hora;
   }

   /**
    * O método getMinuto devolve o minuto da hora encapsulada.
    * @return o minuto encapsulado pela classe
    */
   public byte getMinuto() {
       return minuto;
   }

    
   
   /**
    * O método mostraHoraAproximada não recebe argumentos nem retorna valores.
    * Este método somente imprime os valores dos atributos no
    * formato hh:mm. Uma quebra de linha é impressa ao final.
    */
   void mostraHoraAproximada() {
       System.out.println(hora + ":" + minuto);
   }
   
   
   
}