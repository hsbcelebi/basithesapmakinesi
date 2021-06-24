import java.util.Scanner;

public class Hesapla {

    public static void main(String[] args) {

        int n1, n2;

        Scanner scan = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz : ");
        n1 = scan.nextInt();

        System.out.print("2.sayıyı gririniz : ");
        n2 = scan.nextInt();

        System.out.println("Yapmak istediğiniz işlemin kodunu giriniz : \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme ");

        int islem = scan.nextInt();

        switch (islem) {

            case 1:
                int toplam = n1 + n2;
                System.out.print("Toplam Sonuç: " + toplam);
                break;

            case 2:
                int cikarma = n1 + n2;
                System.out.print("Çıkarma Sonuç: " + cikarma);
                break;

            case 3:
                int carpma = n1 + n2;
                System.out.print("Çarpma Sonuç: " + carpma);
                break;

            case 4:
                int bolme = n1 + n2;
                System.out.print("Bölme Sonuç: " + bolme);
                break;
            default:
                System.out.print("İşlem bulunamadı!");


        }

    }
}
