public class DuplicateValues {
    public static void duplicateValues(int[] arr) {
        int length = arr.length;
        int numberOfDuplication = 0;
        for (int i = 0; i < length - 1; i++) {
            boolean isConsidered = false;

//            Check if value of array is considered?
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    isConsidered = true;
                    break;
                }
            }
            if (isConsidered) continue;

            int count = 1;

            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) count++;
            }

            if (count > 1) {
                numberOfDuplication++;
                System.out.println("arr[" + i + "]" + " duplicates " + count + " times");
            }
        }
        if (numberOfDuplication == 0) System.out.println("Array doesn't have duplication");
        else System.out.println("Array has " + numberOfDuplication + " duplications");

    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
        int[] arr = {1, 1, 1, 2, 2, 3};
        duplicateValues(arr);
    }
}
