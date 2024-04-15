public class Task {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int x = 0; x < numbers.length - 1; x++) {
            System.out.print( numbers[x] + ", ");
        }
        System.out.print(numbers[numbers.length-1] + "]");
    }
}