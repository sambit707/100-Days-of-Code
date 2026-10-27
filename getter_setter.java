class human{
    private int age;
    private String name;
    
    public human(int age, String name){
         this.age = age;
         this.name = name;
    }
    
public human( String name){
    this.age = 12;
    this.name = name;
}
        
    public int getAge() {
        return age;
    }
    public void setAge(int age ) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}



public class getter_setter {
   public static void main(String[] args) {
   
    human obj1 = new human(2, "sambit");
    human obj = new human("utej");
   // obj.setAge(25);
   // obj.setName("sambit");

    System.out.println(obj1.getAge() + " " + obj1.getName());
    System.out.println(obj.getName());
   }
}
