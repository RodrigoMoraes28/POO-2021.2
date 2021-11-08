import java.util.Scanner; 
 
public class AppHoraAproximada {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    HoraAproximada Horadaquestao = new HoraAproximada();
    byte hora, minuto;

    hora = sc.nextByte();
    minuto = sc.nextByte();
    sc.close();

    Horadaquestao.inicializaHoraAproximada(hora, minuto);
        System.out.print("Hora da questão: ");
        Horadaquestao.mostraHoraAproximada();
}
}

 