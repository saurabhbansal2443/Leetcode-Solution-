class Solution {
    public boolean isPowerOfTwo(int x) {
       if(x==1 ){
           return true ;
       }else if ( x%2==1 || x<1){
           return false;
       }

       return isPowerOfTwo(x/2);
    }
}