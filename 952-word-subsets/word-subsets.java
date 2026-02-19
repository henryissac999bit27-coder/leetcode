class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> wordsub=new ArrayList<>();
        int[] req=new int[26];
        for(String word:words2){
            int[] cur=new int[26];
            for(char c:word.toCharArray()){
                cur[c-'a']++;
                req[c-'a']=Math.max(cur[c-'a'],req[c-'a']);
            }
        }
        for(String word:words1){
            int[] cur=new int[26];
            for(char c:word.toCharArray()) cur[c-'a']++;
            boolean ans=true;
            for(int i=0;i<26;i++){
                if(cur[i]<req[i]){
                    ans=false;
                    break;
                }
            }
            if(ans){
                wordsub.add(word);
            }
        }
        return wordsub;
    }
}