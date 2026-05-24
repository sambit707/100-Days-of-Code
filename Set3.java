public class Set3 {
    public static void main(String[] args) {
        int nums[] = {1,2,4,5};
        int n = 5;
        int sum = 0;
        int expectedSum = (n*(n+1))/2;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
         int missingnumber = expectedSum - sum;
System.out.println("missing number " + missingnumber);
    }
}
