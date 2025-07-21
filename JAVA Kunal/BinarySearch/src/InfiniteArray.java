public class InfiniteArray {
    public static void main(String[] args) {


    }
    static int ceiling(int[] arr,int target ,int start, int end) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;


            } else {
                return mid;
            }
        }
        return start;
    }
}
