package org.example;

// Abstract class with an abstract method
abstract class VowelCounter {
    public abstract int countVowel(String str);
}

// Child class that implements the abstract method
class VowelCounterChild extends VowelCounter {
    @Override
    public int countVowel(String str) {
        int count = 0;
        str = str.toLowerCase();  // Convert the string to lowercase
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);  // Access each character in the string
            // Check if the character is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        VowelCounterChild vowelCounter = new VowelCounterChild();

        String String1 = "Hello";
        System.out.println("There are " + vowelCounter.countVowel(String1) + " vowels in this string.");

        String String2 = "I love testing";
        System.out.println("There are " + vowelCounter.countVowel(String2) + " vowels in this string.");
    }
}

