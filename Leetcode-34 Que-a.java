class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int fi=-1;
        int li=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
            fi=i;
            break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
            li=i;
            break;
            } 
        }
        int[] ans = new int[2];
        ans[0]=fi;
        ans[1]=li;
        return ans;

   }
   } 
