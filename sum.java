public class sum {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};  // predefined input
        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
        }

        System.out.println("Sum = " + sum);
    }
}
