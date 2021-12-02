
import java.util.List;


class test4 {
    public static void main(String[] args) {
    bubbleSort(arr);
    }
    void bubbleSort(int[] List) {
        int temp;
        int size = List.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - (i + 1); j++) {
                if (List[j] > List[j + 1]) {
                    temp = List[j];
                    List[j] = List[j + 1];
                    List[j + 1] = temp;
                }
            }
        }System.out.println(Arrays.toString(List));
    }
}
