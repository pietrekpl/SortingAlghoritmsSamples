import java.util.Arrays;

public class BubbleSort {

public void sorting ( int[]array){
    for (int i = 0; i <array.length ; i++) {
        for (int j = 1; j <array.length ; j++) {
            if (array[j]<array[j-1]){
                int temp = array[j-1];
                array[j-1]= array[j];
                array[j] = temp;
            }
        }
    }
}
    public static void main(String[] args) {
    int[]array = {7,2,8, 11,3,44,15,22};
        System.out.println("Array before sorting : "+ Arrays.toString(array));
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sorting(array);
        System.out.println("Array after bubbleSort : " + Arrays.toString(array));
    }

}
