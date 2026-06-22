import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1); // insert into map or increase by 1 is alread exixst
        }

        
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1; 
    }
}
