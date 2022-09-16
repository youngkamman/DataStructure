import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class missingNumber {
    public static int missingNumberSort(int[] nums, int maxNum) {
        //First I sort the numbers I pass in
        Arrays.sort(nums);
        // Then I run a for loop for maxNum
        for (int i = 1; i < maxNum; i ++) {
            //while the for loop is running I will check [i] to see if it is not equal to nums array if not i will return i
            if (i != nums[i - 1]) {
                return i;
            }
        }
        // Here I am checking to see if nums array has all the numbers
        if (nums.length == maxNum && nums[maxNum - 1] == maxNum) {
            return 0;
        }

        return maxNum;
    }

        public static void main(String[] args) {
            int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
        int[] nums1 = {10,5,3,1,2,6,7,9,4};
        System.out.println(missingNumberSort( nums1,  10));
            System.out.println("Missing Max:" + missingNumberSort(missingMax, 10));
            System.out.println("Missing None:" + missingNumberSort(missingNone, 10));
            System.out.println("Missing Seven:" + missingNumberSort(missingSeven, 10));
            System.out.println("Missing Max:" + missingNumberSort(missingMax, 10));
            System.out.println("Missing None:" + missingNumberSort(missingNone, 10));
            System.out.println("Missing Seven:" + missingNumberSort(missingSeven, 10));

    }
}
