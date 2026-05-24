public class FirstSet {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int rev = num % 10;
            reversed = (reversed * 10 ) + rev;
            num = num /10;
        }
        if ( reversed == original) {
            System.out.println("palindrome number" + reversed);
        }
        else{
            System.out.println("not a palindrome number");
        }
    }
}
