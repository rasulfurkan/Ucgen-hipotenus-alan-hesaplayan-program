import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değiişken oluştur.

        int a, b;

        double c, u, Alan ;

        //Kullanıcıdan yeni verileri al.

        Scanner girdi = new Scanner(System.in);

        System.out.println("1. kenarı giriniz = ");
        a= girdi.nextInt();
        System.out.println("2. kenarı giriniz = ");
        b= girdi.nextInt();

        c= Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs = "+ c);

        u=(a+b+c)/2;
        Alan=u*(u-a)*(u-b)*(u-c);
        System.out.println("Alan = "+ Alan);

        //İnstagram= rasulfurkan







    }
}