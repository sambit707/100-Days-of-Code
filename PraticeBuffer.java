
public class PraticeBuffer {

    public static void main(String[] args) {
      //  java.lang.StringBuffer sb = new java.lang.StringBuffer();  // it will use a buffer size of 16 bytes
        StringBuffer sb = new StringBuffer("sambit");
        System.out.println(sb.capacity());
    }   
} 

   /*  public class PraticeBuffer {
    
      public static void main(String[] args) {
        String s = "RADaR";
         s = s.toLowerCase(); // chahe small ho ya capital ho true hi ayega
        char ch[] = s.toCharArray();
        // simple palindrome check
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (ch[i] != ch[s.length() - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
      }
    } */
 