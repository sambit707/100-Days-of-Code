
/* public class PraticeBuffer {

    public static void main(String[] args) {
      //  java.lang.StringBuffer sb = new java.lang.StringBuffer();  // it will use a buffer size of 16 bytes
        StringBuffer sb = new StringBuffer("sambit");
        System.out.println(sb.capacity());
    }   
}  */

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

      /* public  class PraticeBuffer {
      
        public static void main(String[] args) {
          StringBuffer str = new StringBuffer("sambit");
          StringBuffer sa = new StringBuffer("patnaik");
       //   str.append(" Sambit");
//          System.out.println(str);
  //        System.out.println(str.charAt(3));
         // System.out.println(str.indexOf("it", 4));
   //    String result = sa.toString();
     //  System.out.println(result);  
      
        }
      } 

        public class PraticeBuffer {
        
          public static void main(String[] args){
            String s = "Radar";
            String p = "code";
            String temp = " ";
            s = s.toLowerCase();
            char ch[] = s.toCharArray();
            boolean isPalindrome = true;

          for(int i = 0 ; i< s.length()/2 ; i++){
            if (ch[i] != ch[s.length() -1 -i]) {
                isPalindrome = false;
                break;
            }
            if (isPalindrome = true) {
              s = p;
              p = temp;
            }
          }
          System.out.println(temp);
          }
        } */

        public class PraticeBuffer {
    public void print(int a) {
        System.out.println("Int version called");
    }
    public void print(long a) {
        System.out.println("Long version called");
    }
    public void print(double a) {
        System.out.println("Double version called");
    }

    public static void main(String[] args) {
        PraticeBuffer obj = new PraticeBuffer();
        char c = 'A';
        obj.print(c); // Dhyan se dekh, maine char pass kiya hai!
    }
}
