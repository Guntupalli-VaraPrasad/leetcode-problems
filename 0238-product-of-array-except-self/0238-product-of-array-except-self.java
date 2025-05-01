class Solution {
    public int[] productExceptSelf(int[] nums) {
            int a = nums.length;
            int[] answer = new int[a];
            answer[0] = 1;
            for(int i=1;i<a;i++) {
                answer[i] = answer[i-1]*nums[i-1];
            }
            int suffix = 1;
            for(int i=a-1;i>=0;i--) {
            answer[i] = answer[i] * suffix;
            suffix *= nums[i];
            }
            return answer;
        }
        
    }
