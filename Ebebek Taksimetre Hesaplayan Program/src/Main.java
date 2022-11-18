import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double yol, miktar, fiyat;
        double oran = 2.20;
        double acilis = 10;

        Scanner input = new Scanner(System.in);

        System.out.println("Toplam gidilen yol miktarını KM cinsinden yazınız:");
        yol = input.nextDouble();
        miktar = acilis + (yol*oran);

        fiyat = miktar <= 20 ? 20 : miktar;

        System.out.println("\n Toplam Borcunuz: "+ fiyat + "Tl'dir");


    }
}