import java.util.*;
class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        List<String>words=new ArrayList<>();
        String curr_word="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' '){
                curr_word+=s.charAt(i);
            }
             else if(!curr_word.isEmpty()){
               words.add(curr_word);
                curr_word="";
            }
        }if(!curr_word.isEmpty()) words.add(curr_word);
       
        Collections.reverse(words);

         StringBuilder ans =new StringBuilder();
        for(int i =0;i< words.size();i++){
          ans.append(words.get(i));
          if(i<words.size()-1)
          ans.append(" ");
        } return ans.toString();
    }
   
}