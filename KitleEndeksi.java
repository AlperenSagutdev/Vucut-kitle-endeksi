import java.util.Scanner;
public class KitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo,boy;

        System.out.print("Boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();

        double endeks = kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz: "+endeks);

    }
}
