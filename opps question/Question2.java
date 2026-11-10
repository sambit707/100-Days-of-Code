/* OTT Subscription Model (Inheritance & Polymorphism)
Scenario: Jo humne Netflix wala example discuss kiya tha!

Base Class: Plan (fields: planName, price). Ek method banao showFeatures().

Subclass 1: BasicPlan (extends Plan). showFeatures() ko override karo aur print karo: "720p Resolution, 1 Screen".

Subclass 2: PremiumPlan (extends Plan). showFeatures() ko override karo aur print karo: "4K Resolution, 4 Screens, Offline Download".
Task: Main method mein Polymorphism (Upcasting) dikhao:
Plan myPlan = new PremiumPlan(); likho aur showFeatures() call karke dekho konsa method chalta hai. Constructor mein super() ka use zaroor karna price set karne ke liye. */

class plan{
    private String planName;
    private int price;

    public plan(String planName, int price){
        this.planName = planName;
        this.price = price;
    } 

    public void showFeatures() {
        System.out.println("Default Plan features");
    }
}

class basicPlan extends plan{
    public basicPlan(){
        super("basicPlan", 100);
    }

    @Override
    public void showFeatures() {
        System.out.println("720p Resolution, 4 Screens, offline Download");
    }
}

class PremiumPlan extends plan{
    public PremiumPlan(){
        super("Premium plan" , 400);
    }

    @Override
    public void showFeatures() {
        System.out.println("4K Resolution, 4 Screens, Offline Download");
    }
}

public class Question2{
  public static void main(String[] args) {
    plan myPlan = new PremiumPlan();
    myPlan.showFeatures();
  }
}