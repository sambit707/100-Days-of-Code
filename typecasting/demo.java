package typecasting;

class A{
    public void show1(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println(" in b show");
    }
}

public class demo {
    public static void main(String a[]){
        A obj = new A();
        obj.show1();

        B obj1 = (B) obj;
        obj1.show1();
        obj1.show2();
    }
}
