import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {44,725,3,723,11087};
        bubble(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item smaller than the previous one
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }

        }
    }

}

