class human {
    private int age;
    private String name;
    private String[] canvote = {"sambit", "Hemant", "vedhansh", "utej"};

    public int getage() {
        return age;
    }

    public void setage(int a) {
        if (a >= 18) {
            age = a;
            System.out.println("The user can vote");
        } else {
            age = a;
            System.out.println("the user cannot vote");
        }
    }

    public String getname() {
        return name;
    }

    public void setname(String a) {
        for (String voter : canvote) {
            if (voter.equalsIgnoreCase(a)) {
                this.name = a;
                System.out.println("Name is valid for voting.");
                return;
            }
        }
        this.name = a;
        System.out.println("Name is not allowed to vote.");
    }

    public void printstatus() {
        boolean validName = false;
        for (String voter : canvote) {
            if (voter.equalsIgnoreCase(this.name)) {
                validName = true;
                break;
            }
        }

        if (this.age >= 18 && validName) {
            System.out.println(this.age + " : " + this.name + " -> Eligible to vote");
        } else {
            System.out.println(this.age + " : " + this.name + " -> Not eligible to vote");
        }
    }
}

public class gettersetter {
    public static void main(String[] a) {
        human obj = new human();
        obj.setage(25);
        obj.setname("Sambit");
        obj.printstatus();
    }
}