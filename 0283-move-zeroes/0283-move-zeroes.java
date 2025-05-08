class Solution {
    public void moveZeroes(int[] nums) {
        int a = nums.length;
        int moveElement = 0;
        for(int num : nums) {
            if(num !=0) {
                nums[moveElement++] = num;
            }
        }
        while(moveElement < a) {
            nums[moveElement++] = 0;
        }
    }
}