class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int carry = 0 ;

        int p = num.length-1 ;

        while(p>=0 || k>0){

            int val = p>=0 ?num[p] : 0 ;
            int d = k%10 ;
            k=k/10;

            int sum = val + d + carry ;

            int digit = sum%10 ;
            carry = sum /10 ;

            ans.add(digit);
            p--;

        }

        if(carry>0){
            ans.add(carry);
        }

         
         
        Collections.reverse(ans);

        return ans ;
    }
}