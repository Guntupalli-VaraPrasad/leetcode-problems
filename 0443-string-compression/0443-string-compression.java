class Solution {
    public int compress(char[] chars) {
        int a = 0;
        for(int i=0;i<chars.length;) {
            int count=0;
            char ch = chars[i];
            while(i<chars.length && chars[i] == ch) {
                i++;
                count++;
            }
            chars[a++] = ch;
            if(count > 1) {
                for(char c : String.valueOf(count).toCharArray()) {
                    chars[a++] = c;
                }
            }
        }
        return a;
    }
}