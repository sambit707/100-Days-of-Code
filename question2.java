public class question2 {
    public static int secondlargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("second largest doesn't exist");
            return Integer.MIN_VALUE;

        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondlargest = largest;
                largest = num;
            } else if (num > secondlargest && num != largest) {
                secondlargest = num;
            }
        }

        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("second largest doesn't exist");
            return Integer.MIN_VALUE;
        }

        return secondlargest;
    }
}
