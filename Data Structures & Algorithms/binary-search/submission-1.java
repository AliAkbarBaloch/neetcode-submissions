class Solution {
    public int search(int[] nums, int target) {
        int result=0;
        boolean flag=false;
        for(int i=0;i<nums.length; i++){
            if(nums[i] == target){
                result= i;
                flag=true;
            }
        }
        if(flag){
            return result;
        }
        else{
            return -1;
        }
        
    }
}
