class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        String v="aeiou";
        int maxvowel=0,maxcon=0;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                char c=(char)(i+'a');
                if(v.indexOf(c)!=-1){
                    maxvowel=Math.max(maxvowel,freq[i]);
                }
                else{
                    maxcon=Math.max(maxcon,freq[i]);
                }
            }
        }
        return maxvowel+maxcon;
        

        
    }
}