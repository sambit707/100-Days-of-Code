package typecasting.wrapperclass.question;

class A{
    int a = 5;
    public A(){
        int a = 6;
    }
}

public class demo{
     public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.a);
     }
}