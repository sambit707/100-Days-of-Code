package typecasting.wrapperclass;

public class demo {
    public static void main(String args[]){
        int num = 5;
        Integer num1 = Integer.valueOf(num);

        String str = "12";
        int str1 = Integer.parseInt(str);

        System.out.println(num1);

        System.out.println(str1);
    }
}
