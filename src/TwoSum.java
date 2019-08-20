import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //    给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//    你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//    示例:
//    给定 nums = [2, 7, 11, 15], target = 9
//    因为 nums[0] + nums[1] = 2 + 7 = 9
//    所以返回 [0, 1]
// 暴力解法
// 暴力法很简单，遍历每个元素 xx，并查找是否存在一个值与 target - xtarget−x 相等的目标元素。
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

// 俩遍哈希表
    public int[] twoHash(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int j = 0; j<nums.length-1; j++) {
            int a = target - nums[j];
            if (map.containsKey(a) && map.get(a) != j){
                return new int[]{map.get(a),j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

// 一遍哈希表
    public int[] oneHash(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0; i<nums.length; i++) {
            int a = target - nums[i];
            if (map.containsKey(a)) {
                return new int[] { map.get(a), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

