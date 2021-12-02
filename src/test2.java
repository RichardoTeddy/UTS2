import java.util.Scanner;
class test2 {

    public static void main(String[] args) {
        int[] lama, baru;
        lama = new int[5];
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 nomor : ");
        for (int i = 0; i < 5; i++) {
            lama[i] = Keyboard.nextInt();
        }
        baru = lama;
        System.out.println();
        System.out.println("Isi array lama dari AKHIR ke AWAL: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(lama[4 - i]);
        }
        System.out.println("Isi array baru dari AKHIR ke AWAL: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(baru[4 - i]);
        }
    }
}
