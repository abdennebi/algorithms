import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        // int[] nums = {2, 7, 11, 15};
        // int[] nums = {-3,4,3,90};
        // int[] nums = {0, 7, 11, 0};
        // int[] nums = {3, 2, 4};
        int[] nums = {3, 3}; // 6

        int[] result = twoSum(nums, 6);

        System.out.format("[%d, %d]", result[0], result[1]);
    }

        // [2, 7, 11, 15]
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{i, map.get(complement)};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }


    // [2, 7, 11, 15]
    public static int[] twoSum2(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i, map.get(complement)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    // [2, 7, 11, 15]
    public static int[] twoSum1(int[] nums, int target) {

        int[] result = {-1, -1};

        for (int i = 0 ; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((j == i) || ((nums[i] + nums[j]) != target)) continue;
                result[0] = i; result[1] = j;
                return result;
            }
        }
        return result;
    }
}
