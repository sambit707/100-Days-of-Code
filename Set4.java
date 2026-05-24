public class Set4 {

    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,4,4,5};
        int n = 5;
        int uniqueElement ;
        for(int i = 0 ; i<nums.length-1; i++){
            if (nums.length ==0) {
                System.out.println("total numbers are: 0");
                return;
            }
            int j = 0;
            if(nums[i]!= nums[i+1]){
                nums[j] = nums[i];
                j++;
            }
            nums[j] = nums[nums.length-1];
            j++;
            System.out.println("total unique element count: " + j);

            System.out.println("unique elements are: ");
            for(int k = 0; k<j ; k++){
                System.out.println(nums[k] + " ");
            }
        }
        
    }
}