/* public class test {

    public static void main(String[] args)
    {
      int Runnable = 888;
      System.out.println(Runnable);
    }
} */

/*public class test {

    public static void main(String[] args) {
    //  int x = 2147483647;
   //   x = x - 1;
     double d = -10;
      char ch = 'A';
      boolean b = false;
      byte e = -128;
      int x = 0b0011;
      System.out.println(x);
    }
}*/


 /*  public class test {
 public static void main (String[] agrs){
    String input = "Sambit";
    String result = reverse(input);
    System.out.println("Reversed:" + reverseString("Sambit"));
 }
 public static String reverse(String str){
    if(str == null){
        return null;
    }
    String reversed = "";
    for(int i = str.length() - 1; i >= 0 ; i --){
        reversed = reversed + str.charAt(i);
    }
    return reversed;

 }

 public static String reverseString(String str){

    return reverse(str.substring(1))+str.charAt(0);
 }
} 


/*  public class test {
 
    public static void main (String[] agrs){
       float x = 012.34f;
      //  System.out.println(x);
      char ch = 65;
      char ab = 65;
      String s = "java";
      char c = '\u0039';
   //   int y = null;
 //  double d1 = 1_23.4_56;
   double d2 = 0123.456;
 String y = null;
 int z = 0b10_10;
 char ca = 0x0041;
      System.out.println(ch);
      
    }
    
 }
*/

/* public class test {

    public static void main(String[] args) {
        String name;
        static String college = "PMEC";
        void displayGrade (){
            char grade = 'A';
            System.out.println(name+ "from" + college + "got grade" + grade);
        }
    }
} 

    public class test {
    
        public static void main(String[] args) {
            
            float marks = 6.5f;
            char c = 1 ;
            boolean b = true;
            System.out.println(c);

        }
    } 

        public class test {
        
            public static void main(String[] args) {
                 int age = 25;
                 double height = 5.9;
                 String name = "Alex";

                 
                System.out.println("Name: " +  name + ",  Age: " + age + ",  Height" + height );
            }
        } 
---------------------------- type casting and conversion with type promotion -------------------------
            public class test {
            
                public static void main(String[] args) {
            //    float f = 5.6f;
             //   int x = (int)f;
             //   byte b = 127;
                
       //         byte b1 = 5;
         //       byte b2 = 6;
            //    byte b3 = (byte)(b1+b2);
                
              // int a = 130;
              // byte b = (byte)a;
            
           //    int c = (byte)a;
             //  double d = 5.99;
             //  int i = (int)d;
             int a = 257 ;
             byte b = (byte)a;

                System.out.println(a);
                }
            } 

                public class test {
                
                    public static void main(String[] args) {
                           int x = 258;
                           byte y = (byte)x;
                    System.out.println(y);
                    }
                 
                } 
-------------------- arthimetic operator-----------------
                    public class test {
                    
                        public static void main(String[] args) {
                            int num1 = 7;
                      //      int num2 = 5;
                       //     int result = num1 % num2 ;
                   //    num1 = num1 + 2;
                //   num1 += 2;  shot hand operator
               //    num1++; // increment operator
              // num1--; // decrement operator
              //  --num1; // pre increment
             // ++num is preincrement  it will first increment then it will fetch the value
             // num++ in post increment it will fetch the value first and then increment
              int result = ++num1;
                            System.out.println(result);
                        }
                    } 

// ---------------------- relational operators---------------------
// it is to compare two values
// = is a assignment operator but if we want to compare two value then we use == 
// for not equal to != we can use this 
// we can use <= , >= 
public class test {

    public static void main(String[] args) {
      int num = 5;
      int num1 = 6;
      int x = 6;
      int y = 7;
     boolean result = num != num1 || x >= y;
     System.out.println(result);
   
    }
} */
// ---------- logical operator -------------
// in here we have to compare the two values then have to show the result
// so for eg x y  a b are there then it have to check all then say the result
/* so there are actually 3 type of logical operator which is
And (&&) Or(||) and not (!)
in and if both the values are true then the output will be true
otherwise false .
for or operator if any of the value is true it will give true other wise false.
 and for (!) if you want to change it suppose a value is true it can be false and viceversa*/
 /*    public class test {
    
        public static void main(String[] args) {
            int x = 5;
            int y = 6;
            int a = 2;
            int b = 3;
            boolean result = a < b;
            System.out.println(!result);
        }
    } */
/* --------------- Conditional statement ------------------
it is basically a check of things suppose you want to execute a 
particular set of things then you can use this one it is basically true or false only
suppose for eg if today it will rain then do options are there
i will go to school else if it will not rain i will got then else if it will rain i will take
my raincoat and go so many possible options are there it is up to you what you want to do it    

public class test {

    public static void main(String[] agrs){
        int x = 8;
        int y = 7;
        int z = 9;
        
        if(x > y && x > z)
            System.out.println(x);
       else if(y > z)
        System.out.println(y);
      else
        System.out.println(z);
        
    }
} */

 /*------------ternary operator--------------
 well in here we can convert this code into ternary operator
  so basically what a ternary do is it reduce the code like the operation
  which take about 4-5 lines we can execute that in 1 line only by giving condition 
  two important things are there which is ? which is like asking a question that if it is true and if not 
  then we use colon (:) in here we say okay if it is not true then print this */

 /*public class test {
 
    public static void main(String[] args) {
        int i = 7;
        int result = 0;
   //     if(i%2==0)
     //       result = 10;
       // else
         //   result =20;
       // ?:
       result = (i%2 == 0) ? (i>=1? 10 : 20) : 1090; 
        System.out.println( result);

    }
 }*/
/*---------   switch case   ---------- */

/* public class test {

    public static void main(String[] args) {
        int n = 8;
        switch (n) {
            case 1:
                System.out.println("monday");
                break;
                case 2:
                System.out.println("tuesday");
                break;
                case 3:
                System.out.println("wednesday");
                break;
                case 4:
                System.out.println("thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
                default:
                    System.out.println("Invalid day ha yr, week mein 7 din hi hote ha");
        }
    }
} */

    /* Loooooooooopsss
    so basically what is a loop it is a continous process 
    suppose you want to print a no 1-100 you can do that with the help of the loop
 // repeat this sentence 4 times / multiple times
// comcept such as loops comes here we have while loop , do -while and for loop
    */
/* public class test {

    public static void main(String[] args) 
    {
        
        int i = 1;
        

         while (i<= 10 ) 
        {
            System.out.println("hi " + i);
            int j = 1;
            while (j<=3) {
                 System.out.println("hello " + j);
                 j++;
            }
           
            i++;
        }
        System.out.println("bye " + i);
    }
} */

   /* public class test {
    
        public static void main(String[] args) {
            int x = 1;
            while (x<=10) {
                if (x % 3 == 0 ) {
                    System.out.println(x + " ");
                }
                x++;
            }
        }
    } */ 
   /*public class test {
   
    public static void main(String[] args) {
        int i = 1;
while (i <= 3) {
    int j = 1;
    while (j <= 3) {
        System.out.print("*");
        j++;
    }
    System.out.println();
    i++;
}
    }
   } */

/*     public class test {
    
        public static void main(String[] args) {
            int i = 1;
while (i <= 4) {
    int j = 1;
    while (j <= i) {
        System.out.print(j);
        j++;
    }
    System.out.println();
    i++;
}
        }
    }
/* int i = 1 
i < 10 true 
if (i % 2 == 0){
i +=3
} else{
    i++

    so in this case 1 < 10 true but 1 % 2 != 0 so 
    it will not execute += 3
    it will come to the else part here i will be 2
    2%2==0 yes true
    then i which is 2 will be += 3 which is 5 
}
public class test {

    public static void main(String[] args) {
int i = 1;
while (i < 10) {
    if (i % 2 == 0) {
        i += 3;
    } else {
        i++;
    }
    System.out.print(i + " ");
}
    }
} 
public class test {

    public static void main(String[] args) {
        int left = 1;
        int right = 5;
        System.out.println(left+ "-" + right + " ");
           left++;
           right--;
        
    }
} 

// ----------------- again while loop practice-------------------
public class test {

    public static void main(String[] args) {
        int i = 1;
        

        while(i<=5)
        {
            System.out.println("hi: " + i );
            int j = 1;
            while (j <= i) {
                System.out.println("hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("bye " + i);
    }
} 
public class test {

    public static void main(String[] args) {
          int i = 1234;
          int j = 0;
          while(i > 0){
           int lastDigit = i % 10;
           j = (j * 10) + lastDigit;
           i = i / 10;

          }
          System.out.println(j);
    }
} 
public class test {

    public static void main(String[] args) {
        int i = 121;
        int temp = i;
        int rev = 0;
        while (i > 0) {
            int lastdigit = i % 10;
            rev = ( rev * 10) + lastdigit;
            i = i / 10;
        }
         if (rev == temp) {
                System.out.println("palindrome no");
            }
            else{
                System.out.println("not a palindrome no");
            }
    }
} 
import java.util.Scanner;
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int num =  sc.nextInt();
        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
    System.out.println(fact);
    sc.close();

    }
} 
public class test {

    public static void main(String[] args) {
        int i = 153;
        int j = 0;
        int temp = i;
        while (i > 0) {
            int d = i % 10;
            j = j + (d*d*d);
            i = i /10;
        }
        if(j == temp){
            System.out.println("AMSTRONG NO");

        }
        else{
            System.out.println("not a amstrog no");
        }
    }
} 
// ------------ do while loop-------------
public class test {

    public static void main(String[] args) {
        int i = 1;
        do
        {
            System.out.println("Hi " + i);
            i++;
        }  while(i<=4);
    }
} 
import java.util.Scanner;
    public class test {
    
        public static void main(String[] args) {
            Scanner sc = new  Scanner(System.in);
            int num;
            do{
                System.out.println("Num dal idhar bc: ");
                num = sc.nextInt();

                if(num >= 1 && num <= 10){
                 System.out.println("Oye balle balle winner : ");
                 }
                 else{
                    System.out.println("bsdk galat phirse try kar: ");
                 }

            }while (num < 1  || num > 10);
            System.out.println("khatam tata bye bye: ");
            sc.close();
        }
    } 
   import java.util.Scanner;
   public class test {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1234;
        int cum;
        do{
            System.out.println("Password dal bsdk: ");
            cum = sc.nextInt();

            if(cum == num){
                System.out.println("7 crore: ");
            }
            else{
                System.out.println("phirse type");
            }
        }while(num!= cum);
        System.out.println("ab kya hoga kuch nhi: ");
        sc.close();
    }
   } 
  import java.util.Scanner;
  public class test {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        int total = 0;
        do{
            System.out.println("Enter a no: ");
            sum = sc.nextInt();
            if(sum != 0){
                total = total + sum;
                System.out.println("sum of the no is : " + total);
            }
            else{
                System.out.println("Enter again");
            }
        }while(sum != 0);
        System.out.println("Kya yr 0 dalne ko mana kia tha: ");
    }
  }
  /* 1< 4 true sum = sum + n 
  0+ 1 = 1 + 2 = 3 + 3 = 6 
  
  m = 1
  1 <= 3 - true 
  1*1 = 1
  2<=3 - true
  2*2 = 4
  3*3 = 9 
  j = 1
  1>0 - true
  1==5 false
  1 
  
  a = 2
  2
  2* 2 = 4
  4< 10 - true
  

  // --------------------- for loop-----------------
  public class test {
  
    public static void main(String[] args) {
        
        for(int i = 1; i<=5; i++)
        {
            System.out.println("day " + i);
         //   for(int j= 1 ; j<=9; j++){
          //      System.out.println(" " + (j+8) + " - " + (j+9));

          //  }
        }
    }
  } 
public class test {

    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            int j = 1;
            while(j <= 3){
               System.out.println("kya haal");
               j++;
            }
            System.out.println("hello laude " );
            x++;
        }
    }
} 

    public class test {
    
        public static void main(String[] args) {
            int x = 1;
            while (x<=10) {
                int j = 1;
                while (j<=3) {
                    System.out.println(j);
                    j++;
                }
                System.out.println("x: " + x + 1);
                x++;
            }
        }
    } 
   public class test {
   
    public static void main(String[] args) {
        int x = 1;
        while (x<=100) {
         System.out.println(x);
         x++;
                   if (x/5 == 0) {
            System.out.println("High");
          }
         else if (x/10 == 0) {
            System.out.println("jackpot");
         }
        }
    }
   } 
 public class test {
 
    public static void main(String[] args) {
        for(int i =1; i<=100; i++){
            if (i%10 == 0) {
                System.out.println("high");
            }
            else if (i % 5 == 0) {
                System.out.println("jackpot");
            }
            else{
                System.out.println(i);
            }
        }
    }
 } 
public class test {

    public static void main(String[] args) {
        int num = 54321;
        int j = 0;
        while(num > 0){
          int lastdigit = num % 10;
          j = (j * 10) + lastdigit;
          num = num / 10;
          System.out.println(j);

        }
        
    }
} 
public class test {

    public static void main(String[] args) {
        for(int i = 1 ; i<=5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 

public class test {
 
    public static void main(String[] args) {
        int n = 7;
        boolean isPrime = true;
        for(int i = 2; i<n; i++){
            if(n%i ==0){
                isPrime = false;
                break;
            }
        }
if (isPrime && n > 1) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is NOT a Prime Number");
        }
    
}
} 

public class test {

    public static void main(String[] args) {
         int n = 5;
         for(int i = 1; i<=10; i++){
            System.out.println(n + "*" + i + "=" + (n*i));
         }
    }
} 

   public class Exercise {
    public static void main(String[] args) {
        
        double num1 = 11;
        double num2 = 2;
        char operator = '/';
        String again = "y"; 

        // The loop runs as long as 'again' is "y"
        while (again.equals("y")) {
            
            // Check the operator and perform the corresponding calculation
            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Result: " + (num1 / num2));
                 break;
                default:
                 System.out.println("invalid operator");
                    
            }

            // Set the flag to "n" to ensure the loop terminates after one run
            again = "a";
        }

        // Final message printed after the loop ends
        System.out.println("Thank you for using the calculator.");
    }
} 

public class Exercise {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for(int i = 3; i<=6; i++){
           int c = a + b;
           System.out.print(c + " ");
           a = b ;
           b = c ;
        }
    }
} 
public class Exercise {

    public static void main(String[] args) {
        int n = 7654321;
        int m = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            m = (m * 10) + lastDigit;
            n = n/10;
            
        }
        System.out.println(m);
    }
} 
public class Exercise {
    public static void main(String[] args) {
        int i = 11;
        int j = 0; // Reversed number store karne ke liye
        int temp = i; // Original number ki photocopy

        // STEP 1: Reverse the number (Palindrome Logic)
        while (i > 0) {
            int lastDigit = i % 10;
            j = (j * 10) + lastDigit;
            i = i / 10; // i yahan khatam (0) ho jayega
        }
       
        System.out.println("Reversed number: " + temp);

        // STEP 2: Check if Palindrome
        if (j == temp) {
            boolean isPrime = true;

            // STEP 3: Check if Prime (Using temp because i is 0)
            if (temp <= 1) {
                isPrime = false;
            } else {
                // Loop starts from 2 to temp-1
                for (int k = 2; k < temp; k++) { 
                    if (temp % k == 0) {
                        isPrime = false;
                        break; // Factor mil gaya toh aage check karne ki zaroorat nahi
                    }
                }
            }

            if (isPrime) {
                System.out.println(temp + " is a PalPrime Number");
            } else {
                System.out.println(temp + " is Palindrome but NOT Prime.");
            }
        } else {
            System.out.println(temp + " is Not a Palindrome.");
        }
    }
}*
public class Exercise {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            int j = 0;
            int temp = i;
            int lastDigit = i % 10;
            j = (j * 10) + lastDigit;
            i = i/10;
            System.out.println("Num: " + j);
        }
    }
} */

    