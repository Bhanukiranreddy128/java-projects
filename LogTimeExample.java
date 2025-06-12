package java11_6_2025;

public class LogTimeExample {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;

        int low = 0;
        int high = numbers.length - 1;

        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == target) {
                System.out.println("Found number " + target + " at position " + mid);
                found = true;
                break;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Number " + target + " not found in the array.");
        }
    }
}
