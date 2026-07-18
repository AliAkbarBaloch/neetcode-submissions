class Solution {
public:
    bool isPalindrome(string s) {
        string filtered="";
        for(int i=0; i<s.length(); i++){
            if(isalnum(s[i])){
                filtered += tolower(s[i]);
            }

        }
        string result="";
        for(int i=filtered.length()-1;i>=0;i--){
            result+= filtered[i];
        }
        if(result == filtered)
            return true;
        return false;
        
    }
};
