class Solution {
    private int binarySearch(int nums[],int i,int j , int target){
        while(i<=j){
            int mid = i + (j-i)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                i = mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int pivot = -1;

        while(i<j){
            int mid = i + (j-i)/2;
            if(nums[mid] > nums[j]){
                i=mid+1;
            }else{
                j = mid;
            }
        }
        pivot = i;
        if(nums[pivot] <= target && target <= nums[nums.length-1]){
            return binarySearch(nums,pivot,nums.length-1,target);
        }else{
            return binarySearch(nums,0,pivot-1,target);

        }
    }
}
