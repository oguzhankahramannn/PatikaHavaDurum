import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
        Scanner scan = new Scanner(System.in);
        int sicaklik;
        System.out.println("Sıcaklık giriniz : ");
        sicaklik = scan.nextInt();
        if (sicaklik < 5) {
            System.out.println("Kayak yapmalısınız");
        }
        else if (sicaklik >5 && sicaklik<=15) {
            System.out.println("Sinemaya gitmelisiniz");
        }
        else if (sicaklik>15 && sicaklik <=25) {
            System.out.println("Pikniğe gitmelisiniz");
        }
        else {
            System.out.println("Yüzmeye gitmelisiniz");
        }

    }
}