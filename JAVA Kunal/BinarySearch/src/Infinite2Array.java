public class Infinite2Array {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,11,13,90,111,113,114};
        int target=10;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr, int target){
        //first find the range
        // first start with the box of 2
        int start = 0;
        int end = 1 ;
        //condition for the target to lie in range
        while(target>arr[end]){
            int newstart = end + 1;//newstart=temp
            //double the box value
            // end = previous end + size of box *2
            end = end + (end-start +1)*2;
            start = newstart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+ (end-start)/2;

            if (target>arr[mid]){
                start=mid+1;
            }else if (target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

