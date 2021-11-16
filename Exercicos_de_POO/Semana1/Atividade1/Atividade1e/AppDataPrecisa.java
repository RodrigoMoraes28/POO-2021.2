import java.util.Scanner; 
 
public class AppDataPrecisa {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    DataPrecisa datadaquestao = new DataPrecisa();
    byte dia,mes;
    short ano;

    dia = sc.nextByte();
    mes = sc.nextByte();
    ano = sc.nextShort();
    sc.close();

    datadaquestao.inicializaData(dia, mes, ano);
        System.out.print("Data: ");
        datadaquestao.mostraData();
}
}

 