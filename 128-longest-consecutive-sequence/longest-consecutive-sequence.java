class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hm = new HashMap<>();

        for(int i:nums){
            hm.put(i,false);
        }

        for(int i : hm.keySet()){

            if(hm.containsKey(i-1)==false){
                hm.put(i,true);
            }
        }


        int maxfre = 0;

        for(int i : hm.keySet()){

            int k = 1 ;

            if(hm.get(i)==true){

                    while(hm.containsKey(i+k)==true){
                        k++;
                    }
            }

            maxfre = Math.max(k,maxfre);
        
        }

        return maxfre;


    }
}