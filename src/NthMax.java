import java.util.Optional;

public class NthMax {

    public static Optional<Integer> findNthMax(int[] arr, int nthMax) {
        int length = arr.length;
        int xthMax = 1;

        if (length < nthMax) {
            System.out.println("Length < nthMax, array doesn't have the " + nthMax + " Max");
            return Optional.empty();
        }

//        Order array
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

//        Find Nth max of Array
        if (nthMax == 1) return Optional.of(arr[0]);

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                xthMax++;
                if (xthMax == nthMax) {
                    return Optional.of(arr[i + 1]);
                }
            }
        }
        System.out.println("Array doesn't have the " + nthMax + " Max");
        return Optional.empty();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4};
        Optional<Integer> secondMax = findNthMax(arr, 1);
        System.out.println(secondMax.orElse(null));
    }
}
