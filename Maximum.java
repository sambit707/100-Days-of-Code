public class Maximum {

    public static void main(String[] args) {
        int nums[] = {1,8,3,15,2};

        int max = nums[0];
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                
            }
            
        }
        System.out.println("MAXIMUM NUMBER: " + max);
    }
}