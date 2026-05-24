import java.lang.*;
public class PraticeBuffer {

    public static void main(String[] args) {
      //  java.lang.StringBuffer sb = new java.lang.StringBuffer();  // it will use a buffer size of 16 bytes
        StringBuffer sb = new StringBuffer("sambit");
        System.out.println(sb.capacity());
    }   
}