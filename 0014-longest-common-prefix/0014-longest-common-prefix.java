class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int word_index = 0; word_index < strs[0].length(); word_index++) {
            char c = strs[0].charAt(word_index);

            for (int list_index = 1; list_index < strs.length; list_index++) {
                if (word_index == strs[list_index].length() || strs[list_index].charAt(word_index) != c) {
                    return strs[0].substring(0, word_index);
                }
            }
        }
        return strs[0];
    }
}
