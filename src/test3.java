import java.util.Scanner;
class test3 {
    public static void main(String[] args) {
        int[] nilai;
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = Keyboard.nextInt(); // jumlah elemen array disimpan di n
        nilai = new int[n];
        System.out.println("Masukkan “+ n + “ nilai : ");
        for (int i = 0; i < nilai.length; i++) // nilai.length akan sama dengan n
        {
            nilai[i] = Keyboard.nextInt();
        }
        System.out.println();
        System.out.println("Isi array nilai dari AKHIR ke AWAL: ");
        for (int i = 0; i < nilai.length; i++)//hati2 thd index array
        {
            System.out.println(nilai[nilai.length - i + 1]);
        }
    }
}
