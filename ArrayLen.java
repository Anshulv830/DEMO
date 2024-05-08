public class ArrayLen {
    public static void main(String[] args) {

        // Scanner input =new Scanner(System.in);
        // int n = input.nextInt();

        int[] arr = { 1, 2, 7, 8, 6, 9, 10 };
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] < arr[i + 1] && arr[i] < arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
