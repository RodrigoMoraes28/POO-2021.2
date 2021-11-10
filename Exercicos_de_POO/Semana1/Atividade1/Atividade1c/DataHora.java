import java.util.Scanner; 
 
public class DataHora {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    Data hoje = new Data();
    HoraPrecisa Horaprecisadaquestao = new HoraPrecisa();

    byte dia,mes;
    short ano;

    byte hora, minuto, segundo, centesimo;


    dia = sc.nextByte();
    mes = sc.nextByte();
    ano = sc.nextShort();

    hora = sc.nextByte();
    minuto = sc.nextByte();
    segundo = sc.nextByte();
    centesimo = sc.nextByte();
    sc.close();

    hoje.inicializaData(dia,mes,ano); // inicializando a data de hoje
    System.out.print("Dia de hoje: ");

    hoje.mostraData();
    Horaprecisadaquestao.inicializaHoraPrecisa(hora, minuto, segundo, centesimo); // inicializando a hora e o resto
        System.out.print("Hora de hoje: ");
        Horaprecisadaquestao.mostraHoraPrecisa(); // mostrando a hora de hoje
}
}

 