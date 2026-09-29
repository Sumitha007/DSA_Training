class Solution {
    String removeDuplicates(String s) {
        HashSet<Character>set = new HashSet<>();
        String ans = "";
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(!set.contains(ch))
            {
                set.add(ch);
                ans += ch;
            }
        }
        return ans;
    }
}
