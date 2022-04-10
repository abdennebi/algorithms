class Solution {

    public int lengthOfLongestSubstring(String s) {

        String longest = "";

        if (s != null && !s.isEmpty()) {

            String t = "";

            for (int i = 0; i < s.length(); i++) {

                String currentChar = s.substring(i, i + 1);

                if (t.contains(currentChar)) {

                    if (longest.length() < t.length()) {
                        longest = t;
                    }

                    int start_t = s.substring(0, i).lastIndexOf(currentChar) + 1;
                    t = s.substring(start_t, i + 1);

                } else {
                    t = t.concat(currentChar);
                    if (i == s.length() - 1) {
                        if (longest.length() < t.length()) {
                            longest = t;
                            t = "";;
                        }
                    }
                }
            }
        }
        return longest.length();
    }
}
