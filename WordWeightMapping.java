class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
    StringBuilder ans = new StringBuilder();
     for(String word:words){
        int sum=0;
     
     for(int i=0;i<word.length();i++){
      
        char ch=word.charAt(i);
        int index=ch-'a';
        sum+=weights[index];
     }
     
        int mod=sum%26;
      
      char mapped = (char)('z' - mod);
    ans.append(mapped);

    }
return ans.toString();
        
    }
    public static void main(String args[]){
        Solution sc=new Solution();
        String words[]={"abcd","def","xyz"};
        int weights[]={5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        String result=sc.mapWordWeights(words,weights);
        System.out.print("word mapping="+result);
    }
}
