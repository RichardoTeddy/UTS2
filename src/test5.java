public class test5 {

    public static void main(String[] args) {
        int []array={10,20,30,10,50,70};
        minMax(array);
        System.out.println("Program ini dibuat oleh Richardo Teddy_215314015");
    }

     static void minMax(int[] array) {
        int min=array[0],max=array[0];
        for(int a=0;a<array.length;a++){
            if (array[a]<min){
                min=array[a];}
            else if (array[a]>max){
                max=array[a];
            }
        }
         System.out.println("Nilai Min = "+min);
         System.out.println( "Nilai Max = "+max);
    }
    
}
