//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
package ArraysPractice;

import java.util.HashSet;
import java.util.Set;

public class CheckIfPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        Set<Character> set=new HashSet<>();
        for (int i=0; i<sentence.length(); i++){
            set.add(sentence.charAt(i));
        }
        if (set.size()==26){
            return true;
        }else {
            return false;
        }
    }
}
