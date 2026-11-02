package other.tool.Polymorphism;

class A{
    public void show(){
        System.out.println("in A show");
    }

}

class B extends A{
    public void show(){
        System.out.println("in b show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in c show");
    }
}

public class demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();// so basically in line numbver 27 what i am doing is i am defining object ofas new b like object of b only to show runtime polymorphism and it can be only possible with inheritance
        obj.show();

        obj = new C();
        obj.show();
    }
}
