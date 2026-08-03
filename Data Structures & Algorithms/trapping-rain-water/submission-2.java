class Solution {
    public int trap(int[] height) {
        int leftMax[] = new int[height.length];
        int rigthMax[] = new int[height.length];
        int minHeight[] = new int[height.length];

        int ans =0;
        leftMax[0] = height[0];
        rigthMax[height.length-1] = height[height.length-1];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        for(int j=height.length-2;j>=0;j--){
            rigthMax[j] = Math.max(rigthMax[j+1],height[j]);
        }
        for(int i=0;i<height.length;i++){
            minHeight[i] = Math.min(rigthMax[i],leftMax[i]);
        }
        for(int i=0;i<height.length;i++){
            ans += (minHeight[i] - height[i]);
        }

        return ans;
    }
}
