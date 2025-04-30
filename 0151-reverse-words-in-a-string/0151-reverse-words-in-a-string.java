class Solution {
    public String reverseWords(String s) {
       // String a = s.toLowerCase();
        String sentance = s.trim().replaceAll("\\s+", " ");
        String sb = new StringBuffer(sentance).reverse().toString();

        String[] words = sb.split(" ");

        StringBuilder sbf = new StringBuilder();
        for(String word : words) {
            sbf.append(new StringBuffer(word).reverse().toString()).append(" ");
        }
        return sbf.toString().trim();
    }
}