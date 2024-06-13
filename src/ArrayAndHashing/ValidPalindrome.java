package ArrayAndHashing;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // loop through the given string and take out all the non alpha num values
        // check if this string and it's reverse are equal

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

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
