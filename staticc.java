class mobile {
    int price;
    String brand;
    static String name;

    public mobile() {

        brand = "";
        price = 200;
        name = "phone";
        System.out.println("in constructor");
    }


    static{
        name = "phone";
        System.out.println(" in static");
    }

    public void display(){
        System.out.println(brand + " " + price + " " + name);
    }

}

public class staticc {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("mobile");
    //    mobile obj = new mobile();
      //   obj.brand = "apple";
       // obj.price = 1200;
      //  mobile.name = "smartphone";

       // mobile obj2 = new mobile();
        
       // obj.display();
    }
}
