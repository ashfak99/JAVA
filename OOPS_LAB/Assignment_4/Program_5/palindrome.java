
public class palindrome {

    static boolean isPalindrome(int[] nums)
    {
        int start=0,end=nums.length-1; 
        while (end>start) { 
            if(nums[start]!=nums[end]) return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,3,2,1};
        int[] array2 = {10,20,30,3,20,10};
        System.out.println("Array 1 : "+ isPalindrome(array));
        System.out.println("Array 2 : "+ isPalindrome(array2));
    }
}