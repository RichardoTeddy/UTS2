import java.util.Scanner;
class test1 {
    public static void main(String[] args) {
        int[] nilai = new int[5];
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 angka bulat : ");
        for (int i = 0; i < 5; i++) {
            nilai[i] = Keyboard.nextInt();
        }
        System.out.println();
        System.out.println("Cetak isi array dari AKHIR ke AWAL: ");
for (int i = 0; i < 5; i++) {
            System.out.println(nilai[4 - i]);
        }
    }
}
