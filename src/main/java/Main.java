public class Main {
    public static void main(String[] args) {
        int search = 12;
        sayiBul(search);

    }

    public static void sayiBul(int search) {
        int[] nums = new int[]{1, 2, 5, 7, 9, 0};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == search) {
                System.out.println("The searched number was found in the " + i + ". index");

            }
        }
        System.out.println("The number you are looking for is not in the list.");
    }
}

