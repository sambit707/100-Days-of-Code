/* In here we will learn about jagged arrays so here in it the no of coloumns is not 
fixed in the array here is the below example of some coding problems  */


/* public class JaggedArray {

    public static void main(String[] args) {
        int nums[][] = new int[3][]; // jagged array

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[5];

        for(int i = 0 ; i < nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for(int d[] : nums){
            for(int m : d){
                System.out.print(m + " ");
            }
           System.out.println();
        }
    }
} */

    
/* public class JaggedArray {

    public static void main(String[] args) {
        int nums[][] = new int[3][]; // jagged array

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[5];

        for(int i = 0 ; i < nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i = 0 ; i<nums.length; i++){
            for(int j=0 ; j<nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

         for(int d[] : nums){
            for(int m : d){
                System.out.print(m + " ");
            }
           System.out.println();
        } 
    }
}  */

    public class JaggedArray {
    
        public static void main(String[] args){
            int nums[][][] = new int[3][4][5]; // multidimensional array
            
            for(int i = 0; i<nums.length; i++){
                for(int j = 0 ;j <nums[i].length; j++){
                    for(int k = 0; k< nums[i][j].length; k++){
                        nums[i][j][k] = (int)(Math.random()*100);
                    }
                }
            }

            for(int i = 0 ; i< nums.length; i++){
                for(int j=0 ; j<nums[i].length; j++){
                    for(int k = 0; k<nums[i][j].length; k++){
                        System.out.print(nums[i][j][k] + " ");
                    }
                     System.out.println();
                }
            }
        }
    }
