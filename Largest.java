public class Largest {
    public static void main(String[] args) {
        int Nums[] = {3, 7,2 ,8, 98};
        int min = Nums[0];
        int max = Nums[0];
        for(int i = 0 ; i< Nums.length; i++){
             if (Nums[i] < min) {
                min = Nums[i];
             }
             if(Nums[i] > max){
                max = Nums[i];
             }
        }
        System.out.println("lowest number: " + min);
        System.out.println("Highest number: " + max);
    }
}
