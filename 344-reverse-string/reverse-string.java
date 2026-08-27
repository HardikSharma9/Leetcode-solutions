class Solution {
    public void rec_rev(char[] s, int l, int r) {
        if (l >= r) return; 
        char temp = s[l];   
        s[l] = s[r];
        s[r] = temp;
        rec_rev(s, l + 1, r - 1); 
    }

    public void reverseString(char[] s) {
        rec_rev(s, 0, s.length - 1); // Initial call
    }
}