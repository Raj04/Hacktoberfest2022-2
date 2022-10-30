//Problem link: https://leetcode.com/problems/single-element-in-a-sorted-array/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        
        while(low<high){
            mid=(low+high)/2;
            
            if(((mid%2)!=0&&nums[mid-1]==nums[mid])||((mid%2)!=1&&nums[mid+1]==nums[mid])){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return nums[low];
    }
}
