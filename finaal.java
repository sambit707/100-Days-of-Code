class Calc {
    public void show() {
        System.out.println("by sambit");
    }

    public void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}

class advcalc extends Calc {
    public  void show() {
        System.out.println("by utej");
    }
}
public class finaal {
    public static void main(String[] args) {
    //   int num = 9;
      //  num = 10; /* so basically here what i am doing is i have first initialized it 9 then i have changed it to 10 but 
    // if i use the final keyword it will be constant for 9 only */
      //  System.out.println(num);
        advcalc obj = new advcalc();
        obj.add(5, 6);
        obj.show();
    }
}
