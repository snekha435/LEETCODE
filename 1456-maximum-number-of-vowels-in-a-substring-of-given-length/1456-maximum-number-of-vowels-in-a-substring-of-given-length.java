class Solution {
    public int maxVowels(String s, int k) {
        int vc=0,max=0;
        for(int i=0;i<k;i++){
          if(isVowel(s.charAt(i))) vc++;
        }
        max=vc;
        int st=1,end=k;
        while(end<s.length()){
            if(isVowel(s.charAt(st-1))) vc--;
            if(isVowel(s.charAt(end))) vc++;
            max=Math.max(max,vc);
            st++;
            end++;

        }
        return max;
        
    }
    boolean isVowel(char ch){
        return(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
            
        
        
    }
}