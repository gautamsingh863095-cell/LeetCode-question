class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=left;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    left=j+1;
                    break;
                }
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}