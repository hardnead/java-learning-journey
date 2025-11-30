import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MASTER CLASS UNTUK MEMPELAJARI SEMUA JENIS VARIABLE DI JAVA
 * Konsep: Declaration, Initialization, Scope, Type Inference, Final Variables
 */
public class Variable {
    
    // =============================================
    // 1. CLASS VARIABLES (STATIC VARIABLES)
    // =============================================
    /**
     * CATATAN: 
     * - Static variables milik CLASS, bukan instance
     * - Dapat diakses tanpa membuat object
     * - Nilai sama untuk semua instance
     * - Umumnya digunakan untuk constants/shared data
     */
    static String className = "VariableMaster";
    static int instanceCount = 0;
    
    // =============================================
    // 2. INSTANCE VARIABLES (NON-STATIC)  
    // =============================================
    /**
     * CATATAN:
     * - Instance variables milik OBJECT
     * - Setiap object punya copy sendiri
     * - final = tidak bisa diubah setelah inisialisasi
     */
    String instanceName;
    final String createdBy = "Danendra";
    
    // =============================================
    // 3. CONSTRUCTOR
    // =============================================
    /**
     * CATATAN:
     * - Constructor dipanggil saat object dibuat
     * - this.instanceName merujuk ke instance variable
     * - instanceCount++ menambah shared counter
     */
    public Variable(String name) {
        this.instanceName = name;
        instanceCount++;
    }
    
    // =============================================
    // 4. MAIN METHOD - PROGRAM ENTRY POINT
    // =============================================
    public static void main(String[] args) {
        System.out.println("=== VARIABLE MASTERY ===");
        
        // =============================================
        // 5. VARIABLE DECLARATION STYLES
        // =============================================
        /**
         * CATATAN:
         * - Style 1: Declare lalu assign (2 step)
         * - Style 2: Declare + assign (1 step) 
         * - Style 3: Multiple declaration (hemat baris)
         */
        System.out.println("\n1. VARIABLE DECLARATION STYLES:");
        
        // Style 1: Declaration then assignment
        String name;
        name = "Danendra Hardjo Judanto";
        
        // Style 2: Declaration + assignment
        int age = 18;
        String address = "Indonesia";
        
        // Style 3: Multiple variables
        int x = 5, y = 10, z = 15;
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Coordinates: " + x + ", " + y + ", " + z);
        
        // =============================================
        // 6. TYPE INFERENCE WITH VAR (Java 10+)
        // =============================================
        /**
         * CATATAN:
         * - var mendeteksi tipe data secara otomatis
         * - Hanya untuk LOCAL variables
         * - Harus langsung diinisialisasi
         * - Tidak bisa untuk null tanpa cast
         */
        System.out.println("\n2. TYPE INFERENCE WITH VAR:");
        
        var firstName = "Danendra";          // Compiler tahu ini String
        var middleName = "Hardjo";           // String
        var lastName = "Judanto";            // String
        var currentAge = 18;                 // int
        var height = 175.5;                  // double
        var isDeveloper = true;              // boolean
        var languages = new String[]{"Java", "Python", "JavaScript"}; // String[]
        
        System.out.println("Full Name: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Age: " + currentAge + " | Height: " + height);
        System.out.println("Is Developer: " + isDeveloper);
        System.out.print("Languages: ");
        for(var lang : languages) {
            System.out.print(lang + " ");
        }
        System.out.println();
        
        // =============================================
        // 7. FINAL VARIABLES (CONSTANTS)
        // =============================================
        /**
         * CATATAN:
         * - final = nilai tidak bisa diubah (immutable)
         * - Konvensi: UPPER_CASE untuk constants
         * - Bisa digunakan dengan var
         * - Berguna untuk nilai yang fixed (config, settings)
         */
        System.out.println("\n3. FINAL VARIABLES:");
        
        final String BIRTH_PLACE = "Jayapura, Papua";
        final double PI = 3.14159;
        final int MAX_USERS = 1000;
        final var COMPANY = "Tech Corp";  // final + var = immutable dengan type inference
        
        System.out.println("Birth Place: " + BIRTH_PLACE);
        System.out.println("PI: " + PI);
        System.out.println("Max Users: " + MAX_USERS);
        System.out.println("Company: " + COMPANY);
        
        // =============================================
        // 8. VARIABLE SCOPE DEMONSTRATION
        // =============================================
        /**
         * CATATAN:
         * - Class scope: dapat diakses di seluruh class
         * - Method scope: hanya di dalam method
         * - Block scope: hanya di dalam block {}
         * - Variable di block dalam tidak bisa diakses dari luar
         */
        System.out.println("\n4. VARIABLE SCOPE DEMONSTRATION:");
        
        // Class/Static variable - dapat diakses di mana saja
        System.out.println("Class Name: " + className);
        
        // Method scope variable - hanya ada di main method
        String methodScoped = "I exist only in main method";
        System.out.println("Method Scoped: " + methodScoped);
        
        // Block scope variable - hanya ada di dalam block {}
        {
            String blockScoped = "I exist only in this block";
            System.out.println("Block Scoped: " + blockScoped);
        }
        // System.out.println(blockScoped); // ❌ ERROR: cannot find symbol
        
        // =============================================
        // 9. VARIABLE SHADOWING (FIXED VERSION)
        // =============================================
        /**
         * CATATAN:
         * - Shadowing = variable dalam scope menutupi variable luar
         * - Di Java, tidak bisa redeclare variable dengan nama sama
         * - Solusi: gunakan nama berbeda untuk inner scope
         */
        System.out.println("\n5. VARIABLE SHADOWING:");
        
        String shadowVar = "Original Value";
        System.out.println("Before inner block: " + shadowVar);
        
        {
            // Tidak bisa pake nama shadowVar lagi, jadi pake nama berbeda
            String innerVar = "Inner Value"; 
            System.out.println("Inside block: " + innerVar);
        }
        
        System.out.println("After block: " + shadowVar);
        
        // =============================================
        // 10. TYPE INFERENCE LIMITATIONS
        // =============================================
        /**
         * CATATAN:
         * - var HARUS langsung diinisialisasi
         * - var TIDAK bisa infer dari null
         * - var TIDAK bisa untuk declaration tanpa assignment
         */
        System.out.println("\n6. TYPE INFERENCE LIMITATIONS:");
        
        // ✅ Valid penggunaan var
        var valid1 = "String";                    // Compiler infer sebagai String
        var valid2 = 42;                         // Compiler infer sebagai int
        var valid3 = new ArrayList<String>();    // Compiler infer sebagai ArrayList<String>
        
        System.out.println("valid1: " + valid1);
        System.out.println("valid2: " + valid2);
        System.out.println("valid3: " + valid3);
        
        // ❌ Invalid (jangan di-uncomment)
        // var invalid1;                          // ERROR: cannot infer type
        // var invalid2 = null;                   // ERROR: cannot infer from null
        // var invalid3 = (String) null;          // ERROR: still null
        
        System.out.println("Valid var examples compiled successfully!");
        
        // =============================================
        // 11. FINAL DENGAN MUTABLE OBJECTS
        // =============================================
        /**
         * CATATAN:
         * - final mencegah REASSIGNMENT reference
         * - Tapi tidak mencegah MODIFICATION content
         * - List, Map, Set adalah mutable objects
         */
        System.out.println("\n7. FINAL WITH MUTABLE OBJECTS:");
        
        final List<String> hobbies = new ArrayList<>();
        hobbies.add("Coding");     // ✅ BOLEH - memodifikasi content
        hobbies.add("Gaming");     // ✅ BOLEH
        // hobbies = new ArrayList<>(); // ❌ ERROR - reassignment tidak boleh
        
        final Map<String, Integer> scores = new HashMap<>();
        scores.put("Java", 95);    // ✅ BOLEH
        scores.put("Python", 88);  // ✅ BOLEH
        
        System.out.println("Hobbies: " + hobbies);
        System.out.println("Scores: " + scores);
        
        // =============================================
        // 12. VARIABLE LIFECYCLE & OBJECT CREATION
        // =============================================
        /**
         * CATATAN:
         * - Setiap 'new' membuat object baru di memory
         * - Instance variables unique per object
         * - Static variables shared across all instances
         */
        System.out.println("\n8. VARIABLE LIFECYCLE:");
        
        Variable instance1 = new Variable("Instance 1");
        Variable instance2 = new Variable("Instance 2");
        
        System.out.println("Instance 1: " + instance1.instanceName);
        System.out.println("Instance 2: " + instance2.instanceName);
        System.out.println("Created by: " + instance1.createdBy); // final, sama untuk semua
        System.out.println("Total instances: " + instanceCount);  // static, counter global
        
        // =============================================
        // 13. PRACTICAL VARIABLE USAGE
        // =============================================
        /**
         * CATATAN:
         * - final untuk configuration values
         * - var untuk local variables yang jelas context-nya
         * - Good naming convention untuk readability
         */
        System.out.println("\n9. PRACTICAL VARIABLE USAGE:");
        
        // Configuration values (biasanya final)
        final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydb";
        final int MAX_CONNECTIONS = 100;
        final boolean DEBUG_MODE = true;
        
        // User data (biasanya var untuk simplicity)
        var username = "danendra_dev";
        var userAge = 18;
        var isActive = true;
        var lastLogin = java.time.LocalDateTime.now();
        
        System.out.println("Database: " + DATABASE_URL);
        System.out.println("Max Connections: " + MAX_CONNECTIONS);
        System.out.println("Debug Mode: " + DEBUG_MODE);
        System.out.println("User: " + username + " | Age: " + userAge);
        System.out.println("Active: " + isActive + " | Last Login: " + lastLogin);
        
        // =============================================
        // 14. VARIABLE BEST PRACTICES
        // =============================================
        /**
         * CATATAN BEST PRACTICES:
         * - Gunakan descriptive names (customerName vs cnt)
         * - Gunakan final untuk values yang tidak berubah
         * - Pilih scope yang tepat (jangan global jika tidak perlu)
         * - Inisialisasi segera setelah declaration
         */
        System.out.println("\n10. VARIABLE BEST PRACTICES:");
        
        // ✅ Good naming - jelas dan descriptive
        var customerName = "John Doe";
        var customerCount = 5;
        
        // ❌ Bad naming - tidak jelas
        // var cnt = 5;
        // var nm = "John";
        
        System.out.println("Customer: " + customerName);
        System.out.println("Count: " + customerCount);
        
        // Method scope variable untuk temporary values
        var temporaryResult = calculateTemporaryValue();
        System.out.println("Temporary Result: " + temporaryResult);
        
        // final untuk constants, var untuk mutable values
        final var API_KEY = "secret123";  // Constant
        var sessionToken = "temp456";     // Mutable
        
        System.out.println("API Key: " + API_KEY);
        System.out.println("Session Token: " + sessionToken);
        
        System.out.println("\n=== VARIABLE MASTERY ACHIEVED! ===");
    }
    
    // =============================================
    // 15. HELPER METHOD
    // =============================================
    /**
     * CATATAN:
     * - Helper method biasanya ditaruh di bawah main
     * - static method dapat diakses tanpa object
     * - var dapat digunakan di local method variables
     */
    public static String calculateTemporaryValue() {
        var temp = "Calculated Value";  // var dalam method
        return temp;
    }
}