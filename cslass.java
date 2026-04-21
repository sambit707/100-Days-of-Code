/*class calculator{
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}

public class cslass {
    public static void main(String[] args) {
        
        int num_1 = 4;
        int num_2 = 5;

        calculator Calc = new calculator();

       int sum =  Calc.add(num_1,num_2);
       if (sum == 10) {
        System.out.println("kya baat ha");
       }
       else{
        System.out.println("chud gye guru");
       }

      //  int sum = num_1 + num_2;
       System.out.println(sum);
    }

    
} 

    class calculator{
        public int multiply(int n1, int n2){
            int r = n1 * n2;
            return r;
        }
    }

    public class cslass {
    
        public static void main(String[] args) {
            int num1 = 5;
            int num2= 5;
          
            calculator Multi = new calculator();

          int sum =  Multi.multiply(num1,num2);
          System.out.println(sum);

        }
    }


        class division{
            public double division(double n1, double n3){
                double s = n3 / n1;
                return s;
            }
        }


        public class cslass {
        
            public static void main(String[] args) {
                 double num1 = 5;
                 double num2 = 6;
        division divi = new division();

                 double sum  = divi.division(num1, num2);
                 System.out.println(sum);

            }
        } 

            class loop{
                public int looping(int start, int end){
                      for(int i = start; i<=end; i++){
                        if(i%2 == 0){
                            System.out.println(i + " : kya baat ha");
                        }
                        else{
                            System.out.println(i  + " :  abhi kya kr sakte ha");
                        }
                    }
                    return 0;
                }
            }

            public class cslass {
            
                public static void main(String[] args) {

                    loop looping = new loop();

                    looping .looping(10, 20);

                }
            } 

                class sambit{
                    public int add(int num1, int num2){
                        int r = num1 + num2;
                        return r;
                    }
                }
           public class cslass {
           
            public static void main(String[] args) {

                sambit sam = new sambit();

                int result = sam.add(4,5);

                System.out.println(result);

            }
           } 

            class loop{
                public int loops(int start , int  end){
                    int count = 0;
                    for(int i = start; i<= end; i++){
                     for(int j= 1 ; j<=i ; j++){
                          count++;
                     }
                    }
                  return count;
                }
            }
          public class cslass {
          
            public static void main(String[] args) {

                loop calc = new loop();

                int result = calc.loops(1, 5);

                System.out.println("*");
                
            }
          } 

            class pattern{
               public int pat(int n){
                int starts = 0;
                for(int i = 1 ; i <=5; i++){
                    for(int j = 1; j <=i; j++){
                        System.out.print("*");
                        starts++;
                    }
                    System.out.println();
                }
                return starts;
               }
            }

            public class cslass {
            
                public static void main(String[] args) {
                   pattern s = new pattern();
                  int result =  s.pat(5);
                    
                }
            } 

                class sambit{
                    public int pattern(int s){
                        int count = 0;
                        for(int i = 10; i>=1; i--){
                            for(int j =1 ; j<=i; j ++){
                                System.out.print("*");
                                count++; // count increase karega yahan pe * ki value store hogi bas
                            }
                               System.out.println(); // new line add karne ke liye yeh ha 
                        }
                      
                        return count;
                    }
                }
           public class cslass {
           
            public static void main(String[] args) {
                sambit pat = new sambit();

                int result = pat.pattern(5);
            }
           } 

            class Calculator{
                public int Calc(int n1,int n2){
                    int r = n1 + n2;
                    return r;
                }
            }

            public class cslass {
            
                public static void main(String[] args) {
                    
                    Calculator Cal = new Calculator();

                    int result = Cal.Calc(5, 5);
                    System.out.println(result);
                }
            } 
public class cslass {

    public static void main(String[] args) {
        for(int i = 1; i<=20; i++){
            int result = i * i;
            System.out.println(result);
        }
    }
} 

    class Computer{
       public void Playmusic()
        {
          System.out.println("Music playing..");
        }
        public String getMePen(int cost){
            if (cost>=10) 
                return "pen  ";
            
                return"nothing";
             
        }
    }

    public class cslass {
        
        public static void main(String[] args) {
            
          Computer comp = new Computer();
          comp.Playmusic();
         String str = comp.getMePen(2);
       System.out.println(str);
        }
    } 

class Myprinter {
    // Method 1: Simple Message
    public String print() {
        return "Hello bhai";
    }

    // Method 2: Loop wala (String return karega saara message join karke)
    public String print(String msg, int count) {
        String result = "";
        for (int i = 1; i <= count; i++) {
            result += msg + " ";
        }
        return result;
    }

    // Method 3: Even/Odd wala (Return type String hona chahiye)
    public String print(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}

public class cslass {
 public static void main(String[] args) {
        Myprinter obj = new Myprinter();

        System.out.println(obj.print()); // Output: Hello bhai
        System.out.println(obj.print("Focus", 3)); // Output: Focus Focus Focus 
        System.out.println("Number 5 is: " + obj.print(5)); // Output: Number 5 is: odd
    }
    
} 

    class Number{
        public String numb(int num){
            if(num>=10){
                return "Big";
            }
            else{
                return " small";
            }
        }
    }

    public class cslass {
    
        public static void main(String[] args) {
            Number num = new Number();
           String str =  num.numb(12);
           System.out.println(str);
        }
    } 

        class PaymentProcessor{
            public void pay(int amount){
               System.out.println("paid " + amount + " using cash");
            }
            public void pay(String upild, int amount){
                System.out.println("paid " + amount + " to " + upild);
            }
            public void pay(int totalAmount, int months){
                int emi = totalAmount/ months;
                for(int i = 1; i<=months; i++){
                    System.out.println("month" + i + ": paid" + emi);
                }
            }
        }


        public class cslass {
        
            public static void main(String[] args) {
                PaymentProcessor obj = new PaymentProcessor();
                obj.pay(10);
                obj.pay("S123", 10);
                obj.pay(18000, 6);
            }
        } 

           class TaxOffice{
            public int calculateTax(int salary){
                int tax = salary * 10 / 100;
                return tax;
            }
           }

            public class cslass {
            
                public static void main(String[] args) {
                    TaxOffice obj = new TaxOffice();
                   int tax = obj.calculateTax(100000);
                    System.out.println(tax);
                }
            } 
                class StatusChecker{
                    public String checkAttendance(int days){
                        if(days>=20){
                            return "good";
                        }
                        else{
                            return "shortage";
                        }
                    }
                }

                public class cslass {
                
                    public static void main(String[] args) {
                        StatusChecker obj = new StatusChecker();
                        String str = obj.checkAttendance(21);
                        System.out.println(str);
                    }
                } 
               
                class Calculator{

                    int Num =5; 

                   public int add(int n1, int n2, int n3){
                    int result = n1+n2+n3;
                    System.out.println(Num );
                    return result;
                   }
              /*   public int add(int n1, int n2){
                    int result = n1 + n2;
                    return result;
                   }  
                }
                public class cslass {
                    public static void main(String[] args) {
                       
                         int data = 10;
                        Calculator obj = new Calculator();
                       Calculator obj1 = new Calculator();
                        int Add = obj.add(5, 4,7);
                       // int Add = obj.add(3,5);
                     //   System.out.println(Add);
                     System.out.println(obj.Num);
                     System.out.println(obj.Num);
                    }
                }    

                   class Calculator{
                    int num = 5    ;
                    public int add(int n1, int n2)
                    {
                        return n1+ n2; // anything inside a method is a local variable and anything outside is instance variable
                    }
                   }

                    public class cslass {
                    
                        public static void main(String[] args) {
                            int data = 10;
                            Calculator obj = new Calculator();
                            Calculator obj1 = new Calculator();
                         int ad =   obj.add(6, 7);
                            System.out.println(obj1.num);
                            System.out.println(ad);
                        }
                    } */


}