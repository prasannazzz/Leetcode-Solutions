class Solution {
    public int partitionString(String s) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
                if(set.contains(ch)){
                ans++;
                set.clear();
            }
            set.add(ch);
        }
     return ans + 1;
    }
}