package com.Basics;

public class ReverseWordString1 {

	public static void main(String[] args) {
        String s = "java programming language";
        String rs = reverseWords(s);

        System.out.println(s);
        System.out.println(rs);
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder rs = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            rs.append(words[i]);
            if (i > 0) {
                rs.append(" ");
            }
        }

        return rs.toString();
    }
}








