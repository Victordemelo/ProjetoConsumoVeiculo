package principal;

import java.util.Scanner;
import model.Veiculo;

public class Principal {

    public static void main(String[] Args) {
        Scanner leitor = new Scanner(System.in);
        Veiculo carro = new Veiculo();

        System.out.println("Digite Quantos kilometros foram percorridos: ");
        carro.setDistancia_perc(leitor.nextDouble());
        System.out.println("Digite quantos litros de combustivel foram gastos: ");
        carro.setLitros_combus(leitor.nextDouble());

        System.out.println("O total do consumo foi: " + carro.getConsumo() + " Km/l");
    }
}