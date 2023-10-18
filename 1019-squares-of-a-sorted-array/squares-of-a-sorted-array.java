class Solution {
    public int[] sortedSquares(int[] arr) {
        int[] ans = new int[arr.length];

        int st = 0 ;
        int end = arr.length-1 ;

        int p = ans.length-1;

        while(st<=end){
            int ss = arr[st]*arr[st];
            int es = arr[end]*arr[end];

            if(ss>es){
                ans[p]=ss;
                st++;
            }else{
                ans[p]=es;
                end--;
            }
            p--;
        }

        return ans ;
    }
}