package org.example;
public class Test2 {
    // Interface with replaceSymbolA method
    interface ReplaceSymbolA {
        String replaceSymbolA(String str);
    }

    // Interface with replaceSymbolB method
    interface ReplaceSymbolB {
        String replaceSymbolB(String str);
    }

    // Class for implementation
    static class SymbolReplacer {
        public String replaceSymbolA(String str) {
            return str.replace('a', 'z');
        }

        public String replaceSymbolB(String str) {
            return str.replace('b', 'w');
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        SymbolReplacer replacer = new SymbolReplacer();

        String example1 = "Lela";
        System.out.println(replacer.replaceSymbolA(example1)); // Output: Lelz

        String example2 = "Gabelaia";
        System.out.println(replacer.replaceSymbolB(example2)); // Output: Gawelaia
    }
}
