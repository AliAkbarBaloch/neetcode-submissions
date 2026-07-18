class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length() != t.length()){return false;}
        int result[26]={0};
        for(char c : s){
            result[c - 'a']++;
        }
        for(char c : t){
            result[c - 'a']--;
        }
       sort(s.begin(),s.end());
       sort(t.begin(),t.end());
       return s==t;
    }
};
