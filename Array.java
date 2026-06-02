// need of an array 

/*public class Array {
    public static void main(String[] args) {
        
        int nums[] = new int[4]; // assigning array if you don't know the variable
         nums[0] = 5;
         nums[1] = 8;
         nums[2] = 3;
         nums[3] = 6;
         for(int i = 0 ; i< nums.length; i++){ // nums.length is length of the number we have assigned in this case 4 we can also do 4 but if we don't know it we can simply do variable name.length
          System.out.println(nums[i]);
         }
        
    }
} */
// example of multidimensional array

   /*  public class Array {
    
        public static void main(String[] args) {
            int num[][] = new int [10][5];
            
                 
                 for(int i= 0; i<10; i++){
                for(int j=0 ; j<5;j++){
                    num[i][j] = (int)(Math.random()*10);
                }
            }
            
            //for(int i= 0; i< num.length;i++){
               // for(int j=0 ; j<num[i].length;j++){
               //     System.out.print(num[i][j]  + " ");
              //  }
             //   System.out.println();
         //   }
            for(int d[] : num){
                for(int m: d){
                   System.out.print(m + " ");
                }
                System.out.println();
            }
        }
        
    } */

     //   the sum finder

     /* public class Array {
     
        public static void main(String[] args) {
            int num[][] = new int[1][10];
           
             for(int i = 0; i<num[0].length; i++)
                num[0][i] = i + 1;
            int sum = 0;
            for(int d[] : num){
                for(int m : d){
                 sum = sum + m;
                 if ((m % 2 ==0)) {
                    System.out.println(m + " even number");
                 }else{
                    System.out.println(m + " is an odd number");
                 }
                }
            }
            System.out.println("Total sum : "+ sum);
        }
     } */

        // The Apple Finder ( search mission)
       
      /*   import java.util.Scanner;
        public class Array {
        
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String Fruit[] = {"Apple", "Mango", "Banana", "Orange"};
                
                System.out.println("Kaunsa Fruit dhund rahe ho");
                String Search = sc.next();
                boolean bound = false;
                for(String f: Fruit){
                if(f.equalsIgnoreCase(Search)){
                    bound = true;
                    break;
                }
                }
               if(bound){
                System.out.println(Search + "mil gya");
               }
               else{
                System.out.println(Search + " pananhi mila");
               }
            }
        } */



// row wise sum(2D array)

/*public class Array {

    public static void main(String[] args) {
        int num[][] = new int[3][5];

        for(int i = 0 ; i<3; i++){
            for(int j=0; j<5 ;j++){
                num[i][j] = (int)(Math.random()*10);
            }
        }

        int rowNum = 1;
     /*    for(int i = 0 ; i<3; i++){
            int sum = 0;
            for(int j = 0; j < 5; j++){
                sum = sum + num[i][j];
                System.out.print(num[i][j] + " ");
            }
                   System.out.println(" | Row no is: " + rowNum + " sum is : " + sum);
                   rowNum++;
        } 
  for(int d[] : num){
            int sum = 0;
            for(int m : d){
                sum = sum + m;
                System.out.print(m + " ");
            }
            System.out.println("| rowNum is " + rowNum + " sum is: " + sum);
        } 

    }
} */

    // Maximum value ( 2d array)

 /*   public class Array {
    
        public static void main(String[] args) {
            int num[][] = new int[4][5];

           for(int i= 0; i<4; i++){
            for(int j = 0 ; j<5; j++){
                num[i][j]= (int)(Math.random()*1000);
            }
           } 
           
            int max = num[0][0];
            for(int i = 0 ; i < 4; i++){
                int maxIndex = i;
                for(int j = i + 1 ; j < 5; j++){
                    if (num[i][j] > max) {
                        max = num[i][j];
                    }
                }
            }
            System.out.println("sabse bada no: " + max);
        }
    } */
   
/*   public class Array {
   
    public static void main(String[] args) {
        int arr[] = new int[5];
        for(int i = 0 ; i< arr.length; i++){
            arr [i] = (int)(Math.random()*10);
            System.out.println("Index" + i + " value" + arr[i]);
        }
    }
   } */
    public class Array {
    
        public static void main(String[] args) {
            String s[] = {"bAnglore"};
            char ch[] = s[0].toCharArray();
            int vowels = 0;
            int totalcount = 0;

            for (int i = 0; i <ch.length ; i++) {
                char c = Character.toLowerCase(ch[i]);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    totalcount++;
                }
            }
            System.out.println("Total vowels: " + vowels);
            System.out.println("total number are: " + totalcount);
        }
    }



      