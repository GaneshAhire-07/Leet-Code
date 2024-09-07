import java.util.Scanner;

public class  RemoveDuplicate{
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input the array elements
        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted elements (with possible duplicates):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Create an instance of Solution and call removeDuplicates
        RemoveDuplicate solution = new RemoveDuplicate();
        int newLength = solution.removeDuplicates(nums);

        // Output the array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
