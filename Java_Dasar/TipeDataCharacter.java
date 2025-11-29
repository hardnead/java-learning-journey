public class TipeDataCharacter {
    public static void main(String[] args){
        // 1. BASIC CHARACTERS
        System.out.println("\n1. BASIC CHARACTERS:");
        char e = 'E';
        char k = 'K';
        char o = 'O';
        System.out.println("Initials: " + e + k + o);
        System.out.printf("Formatted: %c%c%c%n", e, k, o);
    
        // 2. UNICODE CHARACTERS  
        System.out.println("\n2. UNICODE CHARACTERS:");
        char unicodeE = '\u0045'; // E
        char unicodeK = '\u004B'; // K
        char unicodeO = '\u004F'; // O
        System.out.println("Unicode EKO: " + unicodeE + unicodeK + unicodeO);
        System.out.printf("Unicode Hex: \\u%04X \\u%04X \\u%04X%n", 
                                (int)unicodeE, (int)unicodeK, (int)unicodeO);
        
        // 3. INTERNATIONAL CHARACTERS
        System.out.println("\n3. INTERNATIONAL CHARACTERS:");
        char japanese = 'あ'; // Japanese Hiragana
        char arabic = 'ش';  // Arabic letter
        char russian = 'Я'; // Russian letter
        char chinese = '中'; // Chinese character
        System.out.println("International: " + japanese + " " + arabic + " " + russian + " " + chinese);
        
        // 4. SPECIAL SYMBOLS
        System.out.println("\n4. SPECIAL SYMBOLS:");
        char heart = '\u2665'; // ♥
        char spade = '\u2660'; // ♠
        char copyright = '\u00A9'; // ©
        char trademark = '\u2122'; // ™
        char smiley = '\u263A'; // ☺
        System.out.println("Symbols: " + heart + " " + spade + " " + copyright + " " + trademark + " " + smiley);
        
        // 5. CHARACTER OPERATIONS
        System.out.println("\n5. CHARACTER OPERATIONS:");
        char start = 'A';
        System.out.println("Character Arithmetic:");
        for(int i = 0; i < 5; i++) {
            char current = (char)(start + i);
            System.out.printf("%c -> %c (ASCII: %d)%n", start, current, (int)current);
        }
        
        // 6. ASCII/UNICODE VALUES
        System.out.println("\n6. ASCII/UNICODE VALUES:");
        char upperA = 'A';
        char lowerA = 'a';
        char zero = '0';
        char space = ' ';
        System.out.printf("'A' = %d (ASCII)%n", (int)upperA);
        System.out.printf("'a' = %d (ASCII)%n", (int)lowerA); 
        System.out.printf("'0' = %d (ASCII)%n", (int)zero);
        System.out.printf("' ' = %d (ASCII)%n", (int)space);
        System.out.printf("Difference A-a: %d%n", (lowerA - upperA));
        
        // 7. CHARACTER METHODS
        System.out.println("\n7. CHARACTER METHODS:");
        char testChar1 = 'X';
        char testChar2 = '7';
        char testChar3 = '$';
        char testChar4 = 'x';
        
        System.out.println("Character.isLetter('X'): " + Character.isLetter(testChar1));
        System.out.println("Character.isDigit('7'): " + Character.isDigit(testChar2));
        System.out.println("Character.isLetterOrDigit('$'): " + Character.isLetterOrDigit(testChar3));
        System.out.println("Character.isUpperCase('X'): " + Character.isUpperCase(testChar1));
        System.out.println("Character.isLowerCase('x'): " + Character.isLowerCase(testChar4));
        System.out.println("Character.toUpperCase('x'): " + Character.toUpperCase(testChar4));
        System.out.println("Character.toLowerCase('X'): " + Character.toLowerCase(testChar1));
        System.out.println("Character.isWhitespace(' '): " + Character.isWhitespace(' '));
        
        // 8. ESCAPE SEQUENCES
        System.out.println("\n8. ESCAPE SEQUENCES:");
        System.out.println("Newline: Hello\nWorld");
        System.out.println("Tab: Name\tAge");
        System.out.println("Backslash: C:\\\\Users\\\\Java");
        System.out.println("Quote: He said, \"Hello!\"");
        System.out.println("Single quote: It\\'s working");
        
        // 9. CHARACTER COMPARISON
        System.out.println("\n9. CHARACTER COMPARISON:");
        char char1 = 'A';
        char char2 = 'B';
        char char3 = 'a';
        System.out.printf("'A' < 'B': %b%n", char1 < char2);
        System.out.printf("'A' == 'a': %b%n", char1 == char3);
        System.out.printf("'A' equals 'A': %b%n", Character.valueOf(char1).equals(Character.valueOf('A')));
        
        // 10. CHARACTER ARRAY
        System.out.println("\n10. CHARACTER ARRAY:");
        char[] nameArray = {'J', 'A', 'V', 'A'};
        System.out.print("Character array: ");
        for(char c : nameArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        String fromCharArray = new String(nameArray);
        System.out.println("String from char array: " + fromCharArray);
    }    
}