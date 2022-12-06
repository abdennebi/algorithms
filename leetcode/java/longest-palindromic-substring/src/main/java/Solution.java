class Solution {
    public String longestPalindrome(String s) {

        if (s == null) return null;

        if (s.isEmpty() || s.isBlank() ) {
            return "";
        }

        if (s.length() == 1) return s;

        //if (s.length() == 2 && s.charAt(0) == s.charAt(1)) return s;

        int i = 0;
        int j = 0;
        int start = 0;
        int longest = 0;
        int before = 0;
        int after = 0;
        int n = s.length();

        for (i = 0; i < n -1 ; i++) {

            // even string
            j = 1;
            int k = 0;
            int length = 0;

            // odd string
            while (j <= i && j < n - i && (s.charAt(i - j) == s.charAt( i + j ))) {
                k = j;
                j++;
            }

            length = k + 1 + k;

            if (length > longest) {
                longest = length;
                before = k;
                after = k;
                start = i;
            }

            if (s.charAt(i) == s.charAt(i + 1)) {

                k = 0;
                j = 1;

                while (j <= i && j < n - i - 1  && (s.charAt(i - j) == s.charAt( i + j + 1 ))) {
                    k = j;
                    j++;
                }

                length = k + 2 + k;

                if (length > longest) {
                    longest = length;
                    before = k;
                    after = k + 1;
                    start = i;
                }
            }

            //i = i + 1;
        }

        String ans = s.substring(start - before , start + after + 1 );

        System.out.printf("s= %s, ans = %s, i = %d, j = %d", s, ans, start, longest);
        return ans;
    }


}