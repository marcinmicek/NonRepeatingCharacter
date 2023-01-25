package pl.marcinmicek;

import java.util.*;

class NonRepeatingCharacter {

    public static String SearchingChallenge(String str) {
        // code goes here
        String input = str;

        for (char i : str.toCharArray()) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                str  = Character.toString(i);
                break;
            }
        }

        // if the non-repeating character is a space return string "space"
        if (str.equals(" ")) {
          str = "\"space\"";
        } else if (str.equals(input)) {
            str = "none (all characters are repeating)";
        }

        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println("Input the string to test:");
        Scanner s = new Scanner(System.in);
        System.out.println("The first non-repeating character in the input string is: " + SearchingChallenge(s.nextLine()));
    }

}
