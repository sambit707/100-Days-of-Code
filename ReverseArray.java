public class ReverseArray {
    public static void main(String[] args) {
          int num[] = {1,2,3,4,5};
        int res[] = new int[num.length];

        for(int i = 0 ; i < num.length; i++){
        res[i] = num[num.length - 1- i];

        }
        System.out.println("reversed number");
        for(int i = 0 ; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
