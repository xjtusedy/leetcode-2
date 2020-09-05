import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            m.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; ++i) {
            int t = target - nums[i];
            if (m.containsKey(t) && m.get(t) != i) {
                res[0] = i;
                res[1] = m.get(t);
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] a = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(a, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}