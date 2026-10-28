// practice of the anonymous object



class A{

    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in a show");
    }
}


public class demo{
    public static void main(String[] args) {
    //    A obj = new A();
      //  obj.show();
      new A(); /*  like this also we can create object but this is called anonymous object like this can be used only once  
      but the earlier object which we created that is called reference object */
                     
    }
}