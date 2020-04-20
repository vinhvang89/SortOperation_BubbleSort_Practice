public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {1,89,34,21,14,56,72,65,32,99,66,69};
        int temp;
        for (int i = 0; i < numbers.length -1 ; i++) {
            for (int j = i+1; j < numbers.length  ; j++) {
                if( numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print( numbers[i] + " , ");
        }
    }
}
