import java.util.Arrays;
class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        /// step 1 : convert array into string
        for(int i = 0; i < nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }
        // custom sorting
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));

        // handle 0
        if(arr[0].equals("0")){
            return "0";
        }
        // join all string
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}