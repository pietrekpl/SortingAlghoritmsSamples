import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    private int[]array;
    private int size;


    public void sorting(int[]array){
        while (array == null || array.length == 0){
            return;
        }
        this.array = array;
        size = array.length;
        quickSort(0,size-1);
    }
    private  void quickSort(int lowerIndex, int higherIndex){
        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        while(i<=j){
            while (array[i]<pivot){
                i++;
            }while (array[j]>pivot){
                j--;
            }
            if (i<=j){
                changeNumbers(i,j);
                i++;
                j--;
            }
            if (lowerIndex<j){
                quickSort(lowerIndex,j);
            }
            if (higherIndex>i){
                quickSort(i,higherIndex);
            }
        }
    }
    public void changeNumbers(int i, int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String[] args) {
       QuickSort qs = new QuickSort();
        int[]array = {2,1,-2,3,6,9,8,7,23,11,5,-9};
        System.out.println("Before sorting : " + Arrays.toString(array));
        qs.sorting(array);
        System.out.println("After sorting : " + Arrays.toString(array));

    }
}
