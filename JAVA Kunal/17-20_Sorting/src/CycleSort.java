import java.util.*;
class CycleSort {
    public int missingNumber(int arr[]){
        int i=0;
        while(i<arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
            swap(arr, i, correct);
            }else {
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }

        }
        return arr.length;
    }
    public void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}