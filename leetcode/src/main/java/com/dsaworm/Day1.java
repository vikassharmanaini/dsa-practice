package com.dsaworm;

public class Day1 {
    /***
     * You are given two strings word1 and word2. Merge the strings by adding
     * letters in alternating order, starting with word1. If a string is longer than
     * the other, append the additional letters onto the end of the merged string.
     * 
     * Return the merged string.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: word1 = "abc", word2 = "pqr"
     * Output: "apbqcr"
     * Explanation: The merged string will be merged as so:
     * word1: a b c
     * word2: p q r
     * merged: a p b q c r
     */
    public String mergeAlternately(String word1, String word2) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < word1.length(); i++) {

            result.append(word1.charAt(i));
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }
        if (word2.length() > word1.length()) {
            result.append(word2.substring(word1.length() - 1));
        }
        return result.toString();
    }


    //betterway
     public String mergeAlternatelybest(String word1, String word2) {
        int n =     Math.min(word1.length(), word2.length());
        StringBuilder str =new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        str.append(word1.substring(n));
        str.append(word2.substring(n));
        return str.toString();
    }

}
