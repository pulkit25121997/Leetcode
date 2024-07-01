package Leetcode;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if(hashmap.containsKey(target-nums[i])) {
                return new int[]{hashmap.get(target-nums[i]), i};
            }
            hashmap.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        for(int i: result) {
            System.out.print(i + " ");
        }
    }
}
