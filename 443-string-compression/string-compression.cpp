class Solution {
public:
    int compress(vector<char>& chars) {
        int n= chars.size();
        int r= 0;
        int w=0;
        while(r<n){
            char ch = chars[r];
            int count=0;
            while(r<n && chars[r]==ch){
                count++;
                r++;
            }
            chars[w]=ch;
            w++;
            if(count>1){
                string temp =to_string(count);
                for(char c:temp){
                    chars[w]=c;
                    w++;
                }
             }
        }
        return w;
    }
};