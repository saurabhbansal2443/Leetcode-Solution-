class Solution {
    public int findDuplicate(int[] nums) {
         HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0 ; i<nums.length;i++){
            int ele = nums[i];

            if(hm.containsKey(ele)==true){
                hm.put(ele,hm.get(ele)+1);
            }else{
                hm.put(ele,1);
            }

            if(hm.get(ele)==2){
                return ele;
            }
        }

        return -1 ;

       

    }
}