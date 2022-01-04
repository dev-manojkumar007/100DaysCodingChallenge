/**
 * Created by dev-manojkumar007 on 04 Jan, 2022
 * Given an array of strings words, return the first palindromic string in the array.
 * If there is no such string, return an empty string "".
 **/
public class FirstPalindrome {

    public String firstPalindrome(String[] words) {

        for(int i=0;i<words.length;i++) {

            if(isPalindrome(words[i]))
                return words[i];
        }
        return "";
    }

    private boolean isPalindrome(String word) {

        int i=0,j=word.length()-1;

        while(i<j){
            if(word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
