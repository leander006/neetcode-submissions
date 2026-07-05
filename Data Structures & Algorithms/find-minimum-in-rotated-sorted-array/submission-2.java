class Solution {
    public int findMin(int[] nums) {
        int i =0,j= nums.length-1;
        int pivot = -1;
        if(nums.length == 1){
            return nums[0];
        }
        while(i<j){
            int mid = (i +j)/2;
            if(nums[mid] > nums[j]){
                i = mid+1;
            }else{
                j = mid;
            }
            pivot = i;
        }
    System.out.println(pivot +" "+nums[pivot]);
        return nums[pivot];
    }
}
