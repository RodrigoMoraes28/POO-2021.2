class Fone {
    private String id;
    private String number;
    public Fone(String id, String number);
    //verifica se o número é um número de telefone válido
    public static boolean validate(String number);
    //O resultado deve ficar assim
    //oi:1234
    public String toString();
    //GETS e SETS
    String getId();
    void setId(String id);
    String getNumber();
    void setNumber(String number);
}