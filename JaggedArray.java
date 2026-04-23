/* In here we will learn about jagged arrays so here in it the no of coloumns is not 
fixed in the array here is the below example of some coding problems  */


/* public class JaggedArray {

    public static void main(String[] args) {
        int nums[][] = new int[3][]; // jagged array

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[5];

        for(int i = 0 ; i < nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for(int d[] : nums){
            for(int m : d){
                System.out.print(m + " ");
            }
           System.out.println();
        }
    }
} */

    
/* public class JaggedArray {

    public static void main(String[] args) {
        int nums[][] = new int[3][]; // jagged array

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[5];

        for(int i = 0 ; i < nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i = 0 ; i<nums.length; i++){
            for(int j=0 ; j<nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

         for(int d[] : nums){
            for(int m : d){
                System.out.print(m + " ");
            }
           System.out.println();
        } 
    }
}  

    public class JaggedArray {
    
        public static void main(String[] args){
            int nums[][][] = new int[3][4][5]; // multidimensional array
            
            for(int i = 0; i<nums.length; i++){
                for(int j = 0 ;j <nums[i].length; j++){
                    for(int k = 0; k< nums[i][j].length; k++){
                        nums[i][j][k] = (int)(Math.random()*100);
                    }
                }
            }

            for(int i = 0 ; i< nums.length; i++){
                for(int j=0 ; j<nums[i].length; j++){
                    for(int k = 0; k<nums[i][j].length; k++){
                        System.out.print(nums[i][j][k] + " ");
                    }
                     System.out.println();
                }
            }
        }
    } */


        class item{
            String name;
            int rate;
            int discount;

            public item(String name, int rate, int discount){
                this.name = name;
                this.rate = rate;
                this.discount = discount;
            }
        }

        public class JaggedArray {
        
            public static void main(String[] args) {
                item apples = new item("apples" , 32, 9);
                item oranges = new item("Oranges" , 22, 0);
                item kiwi = new item("Kiwi" , 32, 2);

                item[] inventory = { apples , kiwi , oranges};

                int[] quantities = { 7,4,2};


                int grandTotal = 0;
                int totalSavings = 0;

                System.out.println("Shopping cart");

                for(int i = 0; i<inventory.length; i++){
                    
                   item currentItem = inventory[i];
                   int qty = quantities[i];

                   int basePrice = currentItem.rate * qty;
                   int itemDiscount = currentItem.discount * qty;
                   int finalPrice = basePrice - itemDiscount;

                   grandTotal += finalPrice;
                   totalSavings += itemDiscount;

            System.out.println(currentItem.name + ": " + qty + " units");
            System.out.println("   Original Price: " + basePrice);
            System.out.println("   Discount Applied: -" + itemDiscount);
            System.out.println("   Subtotal: " + finalPrice);
            System.out.println();

                }
            System.out.println();
            System.out.println("total discount" + totalSavings);
            System.out.println("final amount to pay: " + grandTotal);
          }
     }


