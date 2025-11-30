public class TipeDataString {
    public static void main(String[] args) {
        System.out.println("=== STRING MASTERY ===");
        
        // 1. BASIC STRING OPERATIONS
        System.out.println("\n1. BASIC STRING OPERATIONS:");
        String firstName = "Danendra";
        String middleName = "Hardjo";
        String lastName = "Judanto";
        
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        
        // 2. STRING CONCATENATION METHODS
        System.out.println("\n2. STRING CONCATENATION METHODS:");
        String fullName1 = firstName + " " + middleName + " " + lastName; // Basic
        String fullName2 = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName); // concat()
        String fullName3 = String.format("%s %s %s", firstName, middleName, lastName); // String.format()
        String fullName4 = new StringBuilder().append(firstName).append(" ")
                            .append(middleName).append(" ").append(lastName).toString(); // StringBuilder
        
        System.out.println("+ Operator: " + fullName1);
        System.out.println("concat(): " + fullName2);
        System.out.println("String.format(): " + fullName3);
        System.out.println("StringBuilder: " + fullName4);
        
        // 3. STRING METHODS EXPLORATION
        System.out.println("\n3. STRING METHODS EXPLORATION:");
        String text = " Hello Java World! ";
        System.out.println("Original: '" + text + "'");
        System.out.println("Length: " + text.length());
        System.out.println("Trim: '" + text.trim() + "'");
        System.out.println("UpperCase: " + text.toUpperCase());
        System.out.println("LowerCase: " + text.toLowerCase());
        System.out.println("Replace: " + text.replace("Java", "Programming"));
        System.out.println("Substring(7,11): " + text.substring(7, 11));
        System.out.println("Char at 8: " + text.charAt(8));
        
        // 4. STRING COMPARISON
        System.out.println("\n4. STRING COMPARISON:");
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "JAVA";
        
        System.out.println("str1 == str2: " + (str1 == str2)); // true (string pool)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different objects)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (content)
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true
        
        // 5. STRING SEARCHING
        System.out.println("\n5. STRING SEARCHING:");
        String sentence = "Java programming is fun and Java is powerful";
        System.out.println("Sentence: " + sentence);
        System.out.println("Contains 'fun': " + sentence.contains("fun"));
        System.out.println("StartsWith 'Java': " + sentence.startsWith("Java"));
        System.out.println("EndsWith 'powerful': " + sentence.endsWith("powerful"));
        System.out.println("Index of 'programming': " + sentence.indexOf("programming"));
        System.out.println("Last index of 'Java': " + sentence.lastIndexOf("Java"));
        
        // 6. STRING SPLITTING & JOINING
        System.out.println("\n6. STRING SPLITTING & JOINING:");
        String csv = "Apple,Banana,Orange,Mango";
        String[] fruits = csv.split(",");
        System.out.println("CSV: " + csv);
        System.out.print("Split fruits: ");
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        String joined = String.join(" - ", fruits);
        System.out.println("Joined: " + joined);
        
        // 7. STRING PERFORMANCE COMPARISON
        System.out.println("\n7. STRING PERFORMANCE DEMO:");
        long startTime, endTime;
        
        // + Operator
        startTime = System.nanoTime();
        String resultPlus = "";
        for(int i = 0; i < 1000; i++) {
            resultPlus += "a";
        }
        endTime = System.nanoTime();
        System.out.println("+ Operator time: " + (endTime - startTime) + " ns");
        
        // StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 1000; i++) {
            sb.append("a");
        }
        String resultBuilder = sb.toString();
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ns");
        
        // 8. REAL-WORLD APPLICATIONS
        System.out.println("\n8. REAL-WORLD APPLICATIONS:");
        
        // Email validation
        String email = "danendra@example.com";
        boolean isValidEmail = email.contains("@") && email.contains(".") && email.length() > 5;
        System.out.println("Email '" + email + "' valid: " + isValidEmail);
        
        // Password strength check
        String password = "SecurePass123!";
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecial = !password.matches("[A-Za-z0-9 ]*");
        boolean isStrong = password.length() >= 8 && hasUppercase && hasLowercase && hasDigit && hasSpecial;
        System.out.println("Password strength: " + isStrong);
        
        // 9. STRING MANIPULATION CHALLENGES
        System.out.println("\n9. STRING MANIPULATION CHALLENGES:");
        String palindrome = "racecar";
        boolean isPalindrome = new StringBuilder(palindrome).reverse().toString().equals(palindrome);
        System.out.println("Is '" + palindrome + "' palindrome? " + isPalindrome);
        
        String spaced = "Hello World Java Programming";
        String noSpaces = spaced.replace(" ", "");
        System.out.println("Remove spaces: '" + spaced + "' -> '" + noSpaces + "'");
        
        // 10. STRING FORMATTING ADVANCED
        System.out.println("\n10. ADVANCED STRING FORMATTING:");
        double price = 1999.99;
        int quantity = 5;
        String product = "Laptop";
        
        String receipt = String.format("Product: %s | Price: $%.2f | Quantity: %d | Total: $%.2f", 
                                     product, price, quantity, price * quantity);
        System.out.println("Receipt: " + receipt);
        
        System.out.println("\n=== STRING MASTERY ACHIEVED! ===");
    }
}