public class Pratices {

    public static void main(String[] args) {
        int num[] = {1, 3, 5, 6, 7};
        int min = num[0];
        int max = num[0];

        for (int i = 0; i < num.length; i++){
            if (num[i] < min){
                min = num[i];
            }
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println("minimum number " + min);
        System.out.println("maxmimum number " + max);
    }
}