import java.util.Scanner;

public class PRAK103_2410817320015_NazwaAmanda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int bilanganAwal = input.nextInt();
        input.close();

        int i = 0;
        int angka = bilanganAwal;

        do {
            if (angka % 2 != 0) {
                System.out.print(angka);
                i++;

                if (i < n) {
                    System.out.print(", ");
                }
            }
            angka++;
        } while (i < n);

        System.out.println();
    }

}