//Leetcode 56 : Merge Intervals
// First we sort the array based on the start number then compare second start number with previous end number
// if previous end number is greater than current start number or equal we merge both the intervals

package Arrays;
import java.util.*;

public class mergeintervals {
    public static void main(String[] args) {
        int[][] arr= {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(arr)));

    }
    public static int[][] merge(int[][] intervals) {
        if (intervals.length<=1){return intervals;}
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        List<int[]> result = new ArrayList<>();

        int [] newInterval = intervals[0];
        result.add(newInterval);

        for(int[] i: intervals){
            if(i[0]<=newInterval[1]){
                newInterval[1]=Math.max(newInterval[1],i[1]);

            }
            else{
                newInterval=i;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

}



