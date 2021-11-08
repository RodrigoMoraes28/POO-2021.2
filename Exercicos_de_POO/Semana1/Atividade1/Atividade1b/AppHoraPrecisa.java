import java.util.Scanner; 
 
public class AppHoraPrecisa {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    HoraPrecisa Horaprecisadaquestao = new HoraPrecisa();
    byte hora, minuto, segundo, centesimo;

    hora = sc.nextByte();
    minuto = sc.nextByte();
    segundo = sc.nextByte();
    centesimo = sc.nextByte();
    sc.close();

    Horaprecisadaquestao.inicializaHoraPrecisa(hora, minuto, segundo, centesimo);
        System.out.print("Hora da questão: ");
        Horaprecisadaquestao.mostraHoraPrecisa();
}
}

 