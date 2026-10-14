class checkpoint {
    private int limit;
    private int checkcapacity;

    public void setLimit(int a) {
        limit = a;
    }

    public int getLimit() {
        return limit;
    }

    public void setcheckcapacity(int b){
        checkcapacity = b;
    }

    public int getcheckcapacity(){
        return checkcapacity;
    }

    public void checkLimit(int a) {
        if (a > limit) {
            System.out.println("overload you are not allowed to drive");
        } else {
            System.out.println("you are allowed to drive");
        }
    }
    public void checkcapacity(){
        if(checkcapacity <= 60){
            System.out.println("capacity also check now you can drive");
        }
        else{
            System.out.println("jail jao");
        }
    }
}

public class pratice1 {
    public static void main(String a[]) {
        checkpoint obj = new checkpoint();

        obj.setLimit(18);
        obj.setcheckcapacity(59);

        System.out.println(obj.getLimit());
        obj.checkLimit(20);
        obj.checkcapacity();
    }
}
