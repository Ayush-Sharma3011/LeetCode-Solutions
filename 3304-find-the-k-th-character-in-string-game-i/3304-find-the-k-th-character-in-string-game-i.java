class Solution {
    public char kthCharacter(int k) {
        if (k == 1) return 'a';

        StringBuilder str = new StringBuilder("a");

        while (str.length() < k) {
            StringBuilder gstr = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                ch = (char) (ch + 1);
                gstr.append(ch);
            }
            str.append(gstr);
        }
        return str.charAt(k - 1);
    }
}