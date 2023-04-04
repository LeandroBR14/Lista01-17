import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double area;
        double precolata = 80;
        double precogalao = 25;

        System.out.println("Qual o tamanho da área a ser pintada? (Em m²)");
        Scanner teclado = new Scanner(System.in);
        area = teclado.nextDouble();

        double latasNecessarias = Math.ceil (area / 108);
        double precoTotal = latasNecessarias * precolata;
        double galaocobre = Math.ceil (area / 21.6);
        double precoTotalGalao = galaocobre * precogalao;

        System.out.printf("Se for comprar apenas latas de 18 litros, gastará %.1f latas e R$%.2f", latasNecessarias, precoTotal);
        System.out.printf("\nSe for comprar apenas galões de 3,6 litros, gastará %.1f galões e R$ %.2f", galaocobre, precoTotalGalao);

        teclado.close();
    }
}
