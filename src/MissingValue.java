public class MissingValue {
    public static void findMissingValue(int[] arr, int numberOfMissing) {
        int length = arr.length;
        for (int i = 1; i <= length + numberOfMissing; i++) {
            boolean flag = false;
            for (int j : arr) {
                if (i == j) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Missing value: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        findMissingValue(arr, 1);
    }
}
