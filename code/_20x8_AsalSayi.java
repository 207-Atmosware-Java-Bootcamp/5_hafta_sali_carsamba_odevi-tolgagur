import java.util.Scanner;
// girilen bir sayının asal olup olmaması kodlayan algoritma
public class _20x8_AsalSayi {
    public static void main(String[] args) {
        System.out.println("Sayı giriniz");
        Scanner scanner = new Scanner(System.in);
        even(scanner.nextInt());
    }

    public static void even(int num){
        if (num>0)
            System.out.println(num%2==0?"asal":"asal değil");
        else
            System.out.println("0 dan küçük asal sayı olacaz.");
    }
}