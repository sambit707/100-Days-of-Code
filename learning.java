/**
 * EXERCISE 1: Variables, Operators & Loops
 *
 * TODO:
 * 1. printFizzBuzz(int n) — 1 se n tak print karo:
 *    - 3 aur 5 dono se divisible → "FizzBuzz"
 *    - sirf 3 se → "Fizz"
 *    - sirf 5 se → "Buzz"
 *    - warna number khud
 * 2. sumOfDigits(int n) — digits ka sum return karo (123 → 6)
 * 3. isPrime(int n) — prime check
 */

/* public class learning{
    public static void printFizzBuzz(int n){
        for(int i = 1; i<=n; i++ ){
            if(i % 3 ==0 && i % 5== 0){
                System.out.println("Fizzbuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
} 

public class learning {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] a) {
        System.out.println(sumOfDigits(123)); // 6
    }
} 
import java.util.Scanner;
public class learning {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number to test (or enter -1 to stop)");
            int n = sc.nextInt();

            if(n == -1){
                System.out.println("testing finished bye bye");
                break;
            }

            boolean isPrime = true;
                    if (n <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false; 
                    break;           
                }
            }
        }
        if(isPrime){
            System.out.println(n + " is prime number .\n");
        } else{
            System.out.println(n + " is not a prime number .\n");
        }
        }
   //     int n = 7;
     //   boolean isPrime = true; 



       sc.close();
    }
} 

    public class learning {
    
        public static void reversearr(int arr[]) {
            int left = 0;
            int right = arr.length -1;

            while (left < right) {
               int temp = arr[left];                
               arr[left] = arr[right];
               arr[right] = temp;
               left++;
               right--; 
            }
        }
    } 

        public class learning {
        
            public static void secondlargest(int arr[]) {
                int largest = Integer.MIN_VALUE;
                int second = Integer.MIN_VALUE;

                if(arr == null || arr.length < 2){
                    System.out.println(second + " does not exist");
                    return;
                }
                for(int value[] : arr ){
                  if (value > largest) {
                    second = largest
                  }
                }
            }
        } 

            Question 2: Implement Constructor Chaining (this())
Ek Student class banao jisme yeh 3 private variables hon:

int id

String name

String course

Requirement:

Ek aisa constructor banao jo id, name, aur course teeno le.

Ek doosra overloaded constructor banao jo sirf id aur name le, aur default course ko "Java Full Stack" set kar de.

Condition: Is doosre constructor ke andar variable assignment (this.id = id; wagera) dobara mat likhna. Isme Constructor Chaining (this(...)) use karke pehle wale constructor ko call karna hai.

Ek display() method likho details print karne ke liye.  

class student{
   private  int id;
   private String name ;
   private  String course;

    public student(int id, String name , String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public student(int id, String name){
       this(id, name, "java full stack developer");
    }

    public void display(){
        System.out.println(id + " id is printed");
        System.out.println(name + " name of the candidate");
        System.out.println(course + "course detail");
    }

}

public class learning {

    public static void main(String[] args) {
        student obj = new student(101, "sambit");
        obj.display();
    }
    
} */

   /* Question 3: Real-World Business Rule Enforcement
Ek Product class banao jisme:

private String productId

private double price

Requirement:
Constructor ke andar ek validation rule lagao:

Agar pass kiya gaya price <= 0 ho, toh price ko 0.0 set karo aur console par print karo: "Invalid price! Setting price to 0.0".

Agar valid price ho, toh wahi value assign karo.

productId immutable rehna chahiye (sirf getter ho, koi setter na ho).

price ke liye getter aur setter dono hone chahiye (aur setter mein bhi same rule hona chahiye ki negative price accept na ho). */ 

class Product {
    private String productId;
    private double price;

    public Product(String productId, double price) {
        this.productId = productId;
        if (price <= 0) {
            System.out.println("Invalid price! Setting price to 0.0");
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Invalid price! Setting price to 0.0");
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }
}

public class learning {

    public static void main(String[] args) {
        Product obj = new Product("Id123", 2.0);
        System.out.println(obj.getProductId() + " " + obj.getPrice());
    }
}