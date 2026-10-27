class HumanEncapsulation {
   private int age ;
   private String name ;

   public int getage(){
    return age;
   }

   public void setage(int a){
     age = a;
   }

   public String getname(){
    return name;
   }

   public void setname(String b){
    name = b;
   }
}


public class encapsulation{
    public static void main(String[] args){
 
        HumanEncapsulation obj = new HumanEncapsulation();
        HumanEncapsulation obj1 = new HumanEncapsulation();

         obj.setage(25);
        obj.setname("sambit");

        System.out.println(obj.getage() + " : " + obj.getname());
 
    }
}