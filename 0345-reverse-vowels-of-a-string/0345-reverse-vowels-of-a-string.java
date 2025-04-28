class Solution {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        List<Character> li = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = charArray[i];
            if(isVowel(ch)==true)
            {
                li.add(ch);
            }
        }
        Collections.reverse(li);
            int k =0;
            int v =0;
            while(k<charArray.length)
            {
                 char ch = charArray[k];
              if(isVowel(ch)==true)
            {
                charArray[k] =li.get(v);
                k++;
                v++;
            } 
            else
            {
                k++;
            }
            }
                 
     String s2 = new String(charArray);
   return s2;
    }
     public boolean isVowel(char ch)
    {
          ch = Character.toLowerCase(ch);
        if (ch=='a' ||ch=='e' ||ch=='i'||ch=='o'||ch=='u')
         {
            return true;
         }
         else 
         {
          return false;
         }
         
    }
}