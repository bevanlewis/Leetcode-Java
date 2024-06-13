package ArrayAndHashing;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // Create two pointers
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        // pointers move from either side of the string and check if the
        // characters are either letter or digit and if they are equal in lower case
        while (leftPointer < rightPointer) {
            char leftChar = s.charAt(leftPointer);
            char rightChar = s.charAt(rightPointer);

            if (!Character.isLetterOrDigit(leftChar)) {
                leftPointer++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                rightPointer--;
            } else if (Character.toLowerCase(leftChar) == Character.toLowerCase(rightChar)) {
                leftPointer++;
                rightPointer--;
            } else {
                return false;
            }

        }

        return true;
    }
}
