class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int majority=-1;
        for(int i=0;i<nums.length;i++){
            if(count==0){majority=nums[i];}
            if(nums[i]==majority){count++;}
            else{count--;}
        }return majority;
    }
}
/*import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);  }
        int n = nums.length;
        for (int key : map.keySet()) {
            if (map.get(key) > n / 2)
                return key;
        }return -1;
    }}*/