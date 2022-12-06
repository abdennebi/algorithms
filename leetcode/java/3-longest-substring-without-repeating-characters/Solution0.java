class Solution0 {

    public int lengthOfLongestSubstring(String s) {

        String longest = "";

        if (s != null && !s.isEmpty()) {

            String t = "";

            for (int i = 0; i < s.length(); i++) {

                String currentChar = s.substring(i, i + 1);

                if (t.contains(currentChar)) {

                    int index = t.indexOf(currentChar);

                    if (longest.length() < t.length()) {
                        longest = t;
                        t = s.substring(index + 1, i + 1);
                    }

                } else {
                    t = t.concat(currentChar);
                    if (i == s.length() - 1) {
                        if (longest.length() < t.length()) {
                            longest = t;
                            t = "";
                        }
                    }
                }
            }
        }
        return longest.length();
    }
}
