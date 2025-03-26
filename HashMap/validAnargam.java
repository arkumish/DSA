class Solution {
    public boolean isAnagram(String s, String t) {
        //hash both array, check for 26 character
        int[] h1 = new int[26];
        int[] h2 = new int[26];

        for(char p : s.toCharArray())
              h1[p-'a']++;
        
         for(char p : t.toCharArray())
              h2[p-'a']++;

         for(int i=0;i<26;i++){
            if(h1[i]!=h2[i])
              return false;
         }
        
        return true;
        
    }
}