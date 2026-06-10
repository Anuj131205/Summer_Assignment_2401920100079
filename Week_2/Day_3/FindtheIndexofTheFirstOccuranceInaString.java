class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (needle.length() > haystack.length()) return -1;
        int k = needle.length();
        for (int i = 0; i <= haystack.length() - k; i++) {
            String window = haystack.substring(i, i + k);
            if (window.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
