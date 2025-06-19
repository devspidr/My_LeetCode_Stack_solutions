/*Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

    For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".

Return the resulting string.
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