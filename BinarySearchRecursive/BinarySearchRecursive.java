public class BinarySearchRecursive {
    public static int binarySearchRecursive(int[] arr, int target) {
        return binarySearchRecursives(arr, target, 0, arr.length - 1);
    }

    public static int binarySearchRecursives(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // indica que o valor não foi encontrado
        }

        int middle = (left + right) / 2;

        if (arr[middle] == target) {
            return middle;
        } else if (arr[middle] < target) {
            return binarySearchRecursives(arr, target, middle + 1, right);
        } else {
            return binarySearchRecursives(arr, target, left, middle - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int target = 52;
        int index = binarySearchRecursive(arr, target);

        if (index == -1) {
            System.out.println("O valor " + target + " não foi encontrado no array.");
        } else {
            System.out.println("O valor " + target + " foi encontrado no índice " + index + " do array.");
        }
    }

}