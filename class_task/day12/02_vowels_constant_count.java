class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        char[] res1 = s1.toCharArray();
        char[] res2 = s2.toCharArray();
        Arrays.sort(res1);
        Arrays.sort(res2);
        int start = 0;
        int end = res2.length-1;
        if(res1.length != res2.length)
        {
            return false;
        }
        while(start<end)
        {
            if(res1[start] != res2[start])
            {
                return false;
            }
            start++;
        }
        return true;
        
    }
}