
class Solution {
    public boolean detectCapitalUse(String word) {
        if (allCaps(word)) {
            return true;
        }

        if (allLower(word)) {
            return true;
        }

        if (Character.isUpperCase(word.charAt(0)) &&
            allLower(word.substring(1))) {
            return true;
        }

        return false;
    }

    private boolean allCaps(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                count++;
            }
        }

        if (word.length() == count) {
            return true;
        }

        return false;
    }

    private boolean allLower(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                count++;
            }
        }

        if (word.length() == count) {
            return true;
        }

        return false;
    }
}
