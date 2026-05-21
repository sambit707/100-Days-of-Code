/* 
public class SecondLargest {
    public static void main(String[] args) {
        int nums[] = { 3, 7, 2, 8 ,98};
        int max = nums[0];
        int target = -1;
        int target2 = -1;
        for(int i= 0 ; i<nums.length; i++){
            if (nums[i] > max) {
                target2 = target;
                target = max;
                max = nums[i];
            }
           else if (nums[i]> target && nums[i]!= max) {
                target2 = target;
                target = max;
            }
            else if (nums[i] > target2 && nums[i] != max && nums[i]!= target2) {
                target2 = max;
             }
        }
        System.out.println("third largest number: " + target2);
    }
} */

    public class SecondLargest {
    
        public static void main(String[] a){
            int Nums[] = { 3, 7, 21, 8,14};
            int max = Nums[0];
            int target = -1;
            for(int i = 0; i<Nums.length; i++){
                if (Nums[i]> max) {
                    target = max;
                    max = Nums[i];
                }
                else if(Nums[i] > target && Nums[i] != max){
                    target = Nums[i];
                }
            }
            System.out.println("Second largest: " + target);
        }
    }
