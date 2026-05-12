public class Reverse {
  /*   public static void main(String[] args) {
        String name = "Sambit";
        String str = "";
        for(int i = name.length()-1 ; i>=0 ; i--){
          str = str + name.charAt(i);
        }
        System.out.println(str);
    } */
   public static void main(String[] args) {
    int num = 321;
    int rev = 0;
   //  for(int i = num ; i!=0; i = i /10){
      while(num!=0){  
       int lastdigit = num % 10;
       rev = (rev *10) + lastdigit;
       num = num/10;
     }
     System.out.println(rev);
   }
}
