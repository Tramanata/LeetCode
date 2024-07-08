/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/

//First thought is create two sets, sort them, and set them equal to eachother
//Using Arrays functions, we can simplify this

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}
        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();

        Arrays.sort(t_char);
        Arrays.sort(s_char);

        return Arrays.equals(s_char, t_char);
    }
}
