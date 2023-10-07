import java.util.Scanner;
public class ödev{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç terimlik Fibonacci serisi hesaplanacak: ");
        int terimSayisi = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.println("Fibonacci Serisi (" + terimSayisi + " terim):");
        for (int i = 1; i <= terimSayisi; i++) {
            if (i == 1) {
                System.out.print(a);
            } else {
                System.out.print(", " + a);
            }
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}
