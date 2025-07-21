public class CeilingofNumber {
//    public static void main (String[] args){
//        String x = "Hello World";
//        System.out.println(x);
// smallest number greater than equal target is called ceiling number
    //gretatest number smaller than equal to target is floor number
//    }
    public static void main(String[] args) {
        int[] arr = {-18,2,4,6,8,15,16,18,22,34,45};
        int target = 46;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }
    static int ceiling(int[] arr,int target){
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(target< arr[mid]){
                end=mid-1;

            }
            else if (target> arr[mid]){
                start = mid+1;


        }
            else{
                return mid;
            }
        }
        return start;
    }
}
