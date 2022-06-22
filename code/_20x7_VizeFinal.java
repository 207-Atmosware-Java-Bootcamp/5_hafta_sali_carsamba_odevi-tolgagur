import java.util.Scanner;
// kullanıcıdan alınan vize ve final notuna göre geçme(ortalama)
// not ortalaması: ortalama<50 altında ise kaldı
// not ortalaması: ortalama==50 Geçti
// not ortalaması: 55<=x<=70 BB
// not ortalaması: 70<=x<=84 BA
// not ortalaması: 84<=x<=100 AA
public class _20x7_VizeFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        not(scanner.nextInt());

    }

    public static void not(int num){
        if (num<50)
            System.out.println("kaldı");
        else if (num>=50 && num<=54) {
            System.out.println("geçti");
        }
        else if (55<=num && num<=70)
            System.out.println("BB");
        else if (70<=num && num<84)
            System.out.println("AB");
        else if (84<=num && num<=100) {
            System.out.println("AA");
        }
        else
            System.out.println("Geçersiz not aralığı");
    }
}