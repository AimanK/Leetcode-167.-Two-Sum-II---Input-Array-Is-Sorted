import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    /**

        Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.


Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

    **/


    int[] arr = {2,7,11,15};

    System.out.println(Arrays.toString(twoSum(arr, 9)));

    /**

      SOLUTION:
      - First, we set two pointers, one for left, and one for the right, set two the beginning and ends of our numbers[] array.
      - Then, we initiate a while loop (left < right)
      - Within the loop, if the sum of the two pointers are equal to target, return an int array with the two indices added by one.
      - Within the loop, if the sum of the two pointers are greater than the target, bring in the right pointer.
      - Within the loop, if the sum of the two pointers are less than the target, bring in the left pointer.
      - Outside of the loop, and at end of program, return an empty array or one with values of {-1,-1};

    **/
    
  }


   public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        
        
        while (left < right)
        {
            if (numbers[left] + numbers[right] == target)
            {
                return new int[] {left+1, right+1};
            }
            
            if (numbers[left] + numbers[right] > target)
            {
                right--;
            }
            
            if (numbers[left] + numbers[right] < target)
            {
                left++;
            }
            
        
        }
        
        return new int[] {-1,-1};
    }
}