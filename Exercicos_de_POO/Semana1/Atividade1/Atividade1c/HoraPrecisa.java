class HoraPrecisa { // declaracão da classe

    /**
     * Declaração dos atributos da classe
     */
    private byte hora, minuto, segundo, centesimo; 
 
    /**
     * O método inicializaHoraPrecisa recebe argumentos para inicializar 
     * os atributos da classe HoraPrecisa. Este método chama o método 
     * HoraPrecisaEhValida para verificar se os argumentos correspondem
     * a uma hora válida: se forem, inicializa os atributos, caso contrário
     * inicializa todos os quatros atributos com o valor zero.
     * @param h o argumento correspondente ao atributo hora
     * @param m o argumento correspondente ao atributo minuto
     * @param s o argumento correspondente ao atributo segundo
     * @param c o argumento correspondente ao atributo centesimo de segundo
     * 
      
     */
    public void inicializaHoraPrecisa(byte h, byte m, byte s,byte c) {
        if(HoraPrecisaEhValida(h,m,s,c)) {
            hora = h;
            minuto = m; 
            segundo = s;
            centesimo = c;  
        }
        else{
            hora = minuto = segundo = centesimo = 0;             
        }
    }

    /**
     * O método HoraPrecisaEhValida recebe quatro valores como argumentos
     * e verifica de maneira simples se os dados correspondem a uma hora válida.
     * Se a hora for válida, retorna a constante booleana true, 
     * caso contrário, retorna false.
 
     * @param h o argumento correspondente ao atributo hora
     * @param m o argumento correspondente ao atributo minuto
     * @param s o argumento correspondente ao atributo segundo
     * @param c o argumento correspondente ao atributo centesimo de segundo
     * @return true se a hora for válida, false caso contrário
     */
    boolean HoraPrecisaEhValida(byte h, byte m, byte s, byte c) {
        if(h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59 && c >= 0 && c <= 99)
            return true;
        else 
            return false;
    }

    /**
     * O método getHora devolve a hora da hora encapsulada.
     * @return a hora encapsulada pela classe
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
     * O método getSegundo devolve o segundo da hora encapsulada.
     * @return o segundo encapsulado pela classe
     */
    public byte getSegundo(){
        return segundo;
    }
    /**
    * O método getCentesimo devolve o centesimo de segundo da hora encapsulada.
    * @return o centesimo de segundo encapsulado pela classe
    */
    public byte getCentesimo(){
        return centesimo;
    }
     
    
    /**
     * O método mostraHoraPrecisa não recebe argumentos nem retorna valores.
     * Este método somente imprime os valores dos atributos no
     * formato hh:mm:ss:ccc. Uma quebra de linha é impressa ao final.
     */
    void mostraHoraPrecisa() {
        System.out.println(hora + ":" + minuto + ":" + segundo + ":" + centesimo);
    }
}