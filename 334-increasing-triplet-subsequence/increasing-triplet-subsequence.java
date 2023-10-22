class Solution {
    public boolean increasingTriplet(int[] nums) {
        int fn = Integer.MAX_VALUE;
        int sn = Integer.MAX_VALUE;

        for(int i:nums){

            if(fn>=i){
                fn=i ;
            }else if ( sn >=i){
                sn=i ;
            }else{
                return true ;
            }
        }

        return false;
    }
}