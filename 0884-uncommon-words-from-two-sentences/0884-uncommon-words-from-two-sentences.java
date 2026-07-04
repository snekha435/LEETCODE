import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> freq= new HashMap<>();
        
        String[] words1=s1.split(" ");
        for(String word:words1) {
            freq.put(word,freq.getOrDefault(word, 0)+1);
        }
        String[] words2=s2.split(" ");
        for(String word:words2){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }
        List<String>result=new ArrayList<>();
        for(String word:freq.keySet()){
            if(freq.get(word)==1){
                result.add(word);
            }
        }
    return result.toArray(new String[0]);
        
    }
}    

        