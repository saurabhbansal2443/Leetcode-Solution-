class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int rowmin = 0 ;
        int rowmax = matrix.length-1;
        int colmin = 0 ;
        int colmax = matrix[0].length-1;

        int totalElements = matrix.length * matrix[0].length;
        int count = 1 ;


        while(count<=totalElements){

            // colmin ---> colmax (rowmin)

            for(int c=colmin ; c<=colmax && count<=totalElements ; c++){
                ans.add(matrix[rowmin][c]);
                count++;
            }

            // rowmin+1 --> rowmax (colmax)

            for(int r=rowmin+1 ; r<=rowmax && count<=totalElements ; r++){
                 ans.add(matrix[r][colmax]);
                count++;
            }

            // colmax-1 ---> colmin (rowmax)    

             for(int c=colmax-1 ; c>=colmin && count<=totalElements ; c--){
                ans.add(matrix[rowmax][c]);
                count++;
            }

            // rowmax-1 ---> rowmin +1 (colmin)

            for(int r= rowmax-1 ; r>=rowmin+1 && count<=totalElements ; r--){
                 ans.add(matrix[r][colmin]);
                count++;
            }

            rowmin++;
            rowmax--;
            colmin++;
            colmax--;

        }

        return ans ;


    }
}