/*Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
    For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.


Example 1:

Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3. 
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".

Example 2:

Input: word = "xyxzxe", ch = "z"
Output: "zxyxxe"
Explanation: The first and only occurrence of "z" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".

Example 3:

Input: word = "abcd", ch = "z"
Output: "abcd"
Explanation: "z" does not exist in word.
You should not do any reverse operation, the resulting string is "abcd".


*/


class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=word.indexOf(ch);
        if(idx==-1){
            return word;
        }
        return new StringBuilder(word.substring(0, idx + 1)).reverse().toString() + word.substring(idx + 1);
    }
}

or 

class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                idx=i;
                break;
            }
        }
        int l=0;
        int r=idx;
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}