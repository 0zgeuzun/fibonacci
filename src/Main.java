import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını giriniz: ");
        int elemanSayisi = scanner.nextInt();

        System.out.println(elemanSayisi + " Elemanlı Fibonacci Serisi:");

        int ilkSayi = 0, ikinciSayi = 1;

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(ilkSayi + " ");

            int toplam = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = toplam;
        }

        scanner.close();
    }
}