/*public class Test {
    int x = 10;
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.change(t1);
        System.out.println(t1.x);
    }
    public void change(Test t) {
        t.x = 500;
    }
}



public class Test {
     public static void main(String[] args) {
       // int num[] = { 3 , 4 ,5 ,6};
      //  num[1] = 6;
    // int num[] = new int [10];
    int arr[] = new int[20];
    for(int i= 0 ; i< arr.length; i++){
        arr[i] = i * 2;
    }
    for(int i = 0 ; i < arr.length; i++)
        System.out.println("Index " + i + " par rakhna ha " + arr[i] );
    }
} */
  

   /*  class Sum{
        public int add(int num[]){
           for(int i = 0 ; i<add(10); i++)
        }
    } 


    class SumF{
        public int add(){
          int numbers[] = {10, 20 ,30 ,40 ,50};
         int sum = 0;
         for(int i = 1 ; i<numbers.length; i++){
           sum = sum + numbers[i]; 
         }
         return sum;
        }
    }
    public class Test {
    
        public static void main(String[] args) {
         SumF obj = new SumF();
         int result = obj.add();
         System.out.println("total sum is: " + result);
        }
    } 

import java.util.Arrays;

public class Test {
        
            public static void main(String[] args) {
                int numbers[] = {12,45,2,89,33};
                int start = 0;
                int end = numbers.length - 1;
                int temp;
                while (start < end) {
                temp = numbers[start];
                numbers[start] = numbers[end];
                numbers[end] = temp;
                start++;
                end--;

                }
                System.out.println("Reverse Array: " + Arrays.toString(numbers));
            }
        } 

            import java.util.Arrays;

            public class Test {
            
                public static void main(String[] args) {
                    int Numbers[] = { 12, 45 , 2, 89 , 33};
                    int target = 89;
                    boolean found = false;
                    for(int i = 0; i < Numbers.length; i ++){
                        if(Numbers[i]== target){
                            System.out.println("mil gaya target: " + target + " at index " + i);
                            found = true;
                            break;
                        }
                    }
                      if(!found){
                        System.out.println("sorry, target nhi mila.");
                      }
                    }
                } */

                    import java.util.Arrays;
                    public class Test {
                    
                        public static void main(String[] args) {
                            int numbers[] = { 2 ,12 ,33, 45 ,89};
                            for(int i =  0; i< numbers.length - 1; i++){
                              int minIndex = i;
                              for(int j = i+ 1 ; j < numbers.length ; j++){
                                if(numbers[j] < numbers[minIndex]) {
                                    minIndex = j;
                                }
                              }
                              int temp = 
                            }
                        }
                    }
            

