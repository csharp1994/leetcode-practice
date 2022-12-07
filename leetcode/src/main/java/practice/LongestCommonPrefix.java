package practice;

public class LongestCommonPrefix {

    public String getLongestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder response = new StringBuilder();
        int shortestStrLength = strs[0].length();

        // find shortest str
        for (int i = 0; i < strs.length; i++) {

            // An empty string means there is no common prefix
            if (strs[i].length() == 0) {
                return strs[i];
            }

            if (strs[i].length() < shortestStrLength) {
                shortestStrLength = strs[i].length();
            }
        }

        // Only needs to look at characters between index 0 and shortestStrLength
        for (int i = 0; i < shortestStrLength; i++) {
            // Compare each character of the first string to all other strings
            char character = strs[0].charAt(i);

            for (String string : strs) {
                if (string.charAt(i) != character) {
                    return response.toString();
                }
            }

            // The character is found at index i in all input strings
            response.append(character);
        }

        return response.toString();
    }
}
