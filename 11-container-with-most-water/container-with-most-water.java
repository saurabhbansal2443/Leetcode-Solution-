class Solution {
    public int maxArea(int[] height) {
        int ans = 0 ;

        int start = 0 ;
        int end = height.length-1;

        while(start<end){

            int width = end - start ;

            int minHeight = Math.min(height[start] , height[end]);
            int capacity = width * minHeight;

            ans = Math.max(ans,capacity);

            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }

        return ans ;
    }
}