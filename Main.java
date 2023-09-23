import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Geçerli bir sayı girmelisiniz.");
            return;
        }

        int max = Integer.MIN_VALUE; // En büyük sayıyı saklamak için minimum değer atanır
        int min = Integer.MAX_VALUE; // En küçük sayıyı saklamak için maksimum değer atanır

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int sayi = input.nextInt();

            if (sayi > max) {
                max = sayi; // Daha büyük bir sayı bulunduğunda max güncellenir
            }

            if (sayi < min) {
                min = sayi; // Daha küçük bir sayı bulunduğunda min güncellenir
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}
