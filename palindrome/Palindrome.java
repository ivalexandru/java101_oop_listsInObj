package com.sarmale.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        String x = "anca";
        String y = "ana";
        System.out.println(isPalindrome(x)); //false
        System.out.println(isPalindrome(y)); //true
    }

    public static boolean isPalindrome(String str) {
        int firstChar = 0;
        int lastChar = str.length() - 1;

        while (firstChar < ( str.length() / 2)) {
            if (str.charAt(firstChar) != (str.charAt(lastChar - firstChar))) {
                return false;
            }
            firstChar++;
        }
        return true;
    }

}

