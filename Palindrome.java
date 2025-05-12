public class Palindrome {

    public static boolean isPalindrome(int x) {

        int original = x;
        int b = 0;

        while (x != 0) {
            int j = x % 10;               
            b = b * 10 + j;
            x = x / 10;                       
        }

        return (original == b);
        
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));     // true
        System.out.println(isPalindrome(-121));    // false
        System.out.println(isPalindrome(10));      // false
        System.out.println(isPalindrome(0));       // true
        System.out.println(isPalindrome(12321));   // true
        System.out.println(isPalindrome(123321));  // true
        System.out.println(isPalindrome(1000021)); // false
    }
}