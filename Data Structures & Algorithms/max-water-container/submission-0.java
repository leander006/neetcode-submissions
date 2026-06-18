class Solution {
    public int maxArea(int[] heights) {
        int res =0;
        int i = 0;
        int j = heights.length-1;
       while(i<j){
            int maxArea = Math.min(heights[i],heights[j]) * (j-i);
            res = Math.max(maxArea,res);
            if(heights[i] < heights[j]){
                System.out.println("i "+i+" heights[i]  "+heights[i] );
                    i++;
            }else{
                System.out.println("j "+j+" heights[j] "+heights[j] );
                j--;
            }
       }
       return res;
    }
}
