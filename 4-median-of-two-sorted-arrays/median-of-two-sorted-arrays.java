class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1,nums2);

        if(ans.length%2==0){
            return (double)(ans[ans.length/2]+ans[(ans.length/2)-1])/2;
        }else{

            return  (double)ans[ans.length/2];
        }
    }

    public int[] merge(int[] nums1 , int[] nums2){

        int[] ans = new int[nums1.length + nums2.length];

        int p1 = 0 ;
        int p2 = 0 ;
        int p3 = 0 ;

        while(p1<nums1.length|| p2<nums2.length){

            int val1 = p1<nums1.length ? nums1[p1] : Integer.MAX_VALUE;
              int val2 = p2<nums2.length ? nums2[p2] : Integer.MAX_VALUE;

              if(val1<val2){
                  ans[p3++]=nums1[p1++];
              }else{
                  ans[p3++]=nums2[p2++];
              }
        }

        return ans ;
    }
}