/**
 * A classe Data contém campos e metodos que
 * permitem a manipulacao de datas. 
 * Esta versão da classe tem os campos protegidos
 * para evitar a sua manipulação incorreta --
 * valores dos campos só podem ser acessados através de métodos.
 */
class Data { // declaracão da classe

    /**
     * Declaração dos atributos da classe
     */
    private byte dia, mes; 
    private short ano;

    /**
     * O método inicializaData recebe argumentos para inicializar 
     * os atributos da classe Data. Este método chama o método 
     * dataEhValida para verificar se os argumentos correspondem
     * a uma data válida: se forem, inicializa os atributos, caso contrário
     * inicializa todos os três atributos com o valor zero.
     * @param d o argumento correspondente ao atributo dia
     * @param m o argumento correspondente ao atributo mes
     * @param a o argumento correspondente ao atributo ano
     */
    public void inicializaData(byte d, byte m, short a) {
        if(dataEhValida(d,m,a)) {
            dia = d;
            mes = m;
            ano = a;
        }
        else {
            dia = mes = 0;
            ano = 0;
        }
    }

    /**
     * O método dataEhValida recebe três valores como argumentos
     * e verifica de maneira simples se os dados correspondem a uma data válida.
     * Se a data for válida, retorna a constante booleana true, 
     * caso contrário, retorna false.
     * Vale a pena notar que este algoritmo é simples e incorreto, uma
     * tarefa para casa consiste em pesquisar e escrever o algoritmo correto.
     * @param d o argumento correspondente ao atributo dia
     * @param m o argumento correspondente ao atributo mes
     * @param a o argumento correspondente ao atributo ano
     * @return true se a data for válida, false caso contrário
     */
    boolean dataEhValida(byte d, byte m, short a) {
        if(d >= 1 && d <= 31 && m >= 1 && m <= 12)
            return true;
        else 
            return false;
    }

    /**
     * O método getDia devolve o dia da data encapsulada.
     * @return o dia encapsulado pela classe
     */
    public byte getDia() {
        return dia;
    }

    /**
     * O método getMes devolve o mês da data encapsulada.
     * @return o mês encapsulado pela classe
     */
    public byte getMes() {
        return mes;
    }

    /**
     * O método getAno devolve o ano da data encapsulada.
     * @return o ano encapsulado pela classe
     */
    public short getAno() {
        return ano;
    }
 
    /**
     * O método mostraData não recebe argumentos nem retorna valores.
     * Este método somente imprime os valores dos atributos no
     * formato dd/mm/aaaa. Uma quebra de linha é impressa ao final.
     */
    void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}