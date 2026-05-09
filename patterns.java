/*public class patterns {
    public static void main(String[] args) {
       
        int row = 5;

        for(int i = 1 ; i<= 5; i++ ){
           for(int j = 1 ; j<=i ; j++){
            System.out.print("*" + " ");
           }
           for(int j  = 1 ; j<=2* (row-i); j++){
               System.out.print("  ");
           }
        }

    }
} */

public class patterns {
    public static void main(String[] args) {
        int n = 5; // Total lines

        for (int i = 1; i <= n; i++) {
            // 1. Pehle stars ka loop (Jitni 'i' ki value hai)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // 2. Beech ke spaces ka loop
            // Formula: 2 * (n - i) 
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  "); // Do space taaki stars ke saath match kare
            }

            // 3. Phir se wahi stars ka loop (Mirror)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Line change
            System.out.println();
        }
    }
}

