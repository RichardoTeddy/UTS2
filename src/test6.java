
import java.util.Scanner;

public class test6 {

    public static void main(String[] args) {
        int max = 0, min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Masukkan " + n + " nilai : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (i == 0) {
                max = a[0];
                min = a[0];
            }
            else {
                    max=max1(max,a[i]);    
                    min=min1(min,a[i]);}

        }
        System.out.println("Nilai max : " + max);
        System.out.println("Nilai min : " + min);
    }

    static int max1(int max, int x) {
        if (x > max) {
            max = x;
        }
        return max;
    }

    static int min1(int min, int x) {
        if (x < min) {
            min = x;
        }
        return min;
    }
}
