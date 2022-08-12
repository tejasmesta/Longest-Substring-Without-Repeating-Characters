class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        
        if(n==1)
        {
            return 1;
        }
        
        int retVal = Integer.MIN_VALUE;
        
        for(int i=0;i<n-1;i++)
        {
            HashSet<Character> set = new HashSet<>();
            
            set.add(s.charAt(i));
            
            int j = i+1;
            
            for(j=i+1;j<n;j++)
            {
                if(set.contains(s.charAt(j)))
                {
                    break;
                }
                else{
                    set.add(s.charAt(j));
                }
            }
            
            retVal = Math.max(retVal,j-i);
        }
        
        return retVal==Integer.MIN_VALUE?0:retVal;
    }
}
