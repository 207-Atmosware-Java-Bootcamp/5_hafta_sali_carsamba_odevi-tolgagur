import java.util.Scanner;
//faktoriyel hesaplama
public class _20x9_Factoriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz :" );
        fak(scanner.nextInt());

    }

    public static void fak(int num){

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result*i;
            System.out.println(i+"! = " + result);
        }
    }
}