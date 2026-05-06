/* public class MultidimensionalArray {
    public static void main(String[] args) {
        int nums[][] = new int[5][7];

        for(int i = 0 ; i< nums.length; i++){
            for(int j = 0 ; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

  /*       for(int d[] : nums){
             for(int m : d){
                System.out.print(m + " ");
             }  
             System.out.println();
        }
       for(int i = 0 ; i< nums.length; i++){
        for(int j = 0 ; j<nums[i].length; j++){
            System.out.print(nums[i][j] + " " );
        } 
        System.out.println();
       }
    } 
} */

public class MultidimensionalArray {

    public static void main(String[] args) {
        int num[]= {3,5,1,9,2};
        int max = num[0];
        int min = num[0];
        for(int i = 0 ; i<num.length; i++){
            if (num[i] > max) {
                max = num[i];
            }
            if(num[i]< min){
                min = num[i];
            }
        }
        System.out.println("maxmimum number " + max + " ");
        System.out.println("minimum number " + min + " ");
    }
}