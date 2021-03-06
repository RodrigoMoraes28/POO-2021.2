//Essa enumeração guarda possíveis labels para as operações.
 
enum Label {
    saque("saque"), 
    deposito("deposito"), 
    tarifa("tarifa"), 
    extorno("extorno"), 
    abertura("abertura");
    
    private String name;
    //nas enums o Construtor tem que ser privado
    private Label(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return this.name;
    }
}
//Operação guarda os dados de uma única operação.
class Operacao {
    private int indice;    
    private Label label;
    //O valor em negativo se for débito
    private int value;
    //O saldo residual
    private int saldo;
    public Operacao(int indice, Label label, int value, int saldo) {
        this.indice = indice;
        this.label = label;
        this.value = value;
        this.saldo = saldo;
    }
    //faz o preenchimento da string com espaços em branco até completar o length
    public static String pad(String string, int length) {
        return String.format("%1$"+length+ "s", string);
    }

    public String toString() {
        return pad("" + indice, 2) + ":" + pad("" + label, 9) + ":" + pad("" + value, 5) + ":" + pad("" + saldo, 5);
    }
    public int getIndice() {
        return this.indice;
    }
    public Label getLabel() {
        return this.label;
    }
    public int getValue() {
        return this.value;
    }
    public int getSaldo() {
        return this.saldo;
    }
}
 