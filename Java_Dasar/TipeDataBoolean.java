public class TipeDataBoolean {
    public static void main(String[] args) {
        System.out.println("=== BOOLEAN MASTERY ===");
        
        // 1. BASIC (yang lo udah tau)
        boolean benar = true;
        boolean salah = false;
        System.out.println("Basic: " + benar + ", " + salah);
        
        // 2. LOGICAL OPERATIONS
        boolean a = true;
        boolean b = false;
        
        System.out.println("\n=== LOGICAL OPERATIONS ===");
        System.out.println("AND: " + a + " && " + b + " = " + (a && b));
        System.out.println("OR: " + a + " || " + b + " = " + (a || b));
        System.out.println("NOT: !" + a + " = " + (!a));
        System.out.println("XOR: " + a + " ^ " + b + " = " + (a ^ b));
        
        // 3. REAL WORLD VALIDATION
        System.out.println("\n=== REAL WORLD VALIDATION ===");
        int age = 25;
        boolean hasLicense = true;
        boolean isSober = true;
        
        boolean canDrive = age >= 17 && hasLicense && isSober;
        System.out.println("Umur: " + age + ", Punya SIM: " + hasLicense + ", Sadar: " + isSober);
        System.out.println("Bisa nyetir? " + canDrive);
        
        // 4. COMPLEX CONDITIONS
        System.out.println("\n=== COMPLEX CONDITIONS ===");
        int score = 85;
        boolean attended = true;
        boolean submittedProject = true;
        
        boolean passed = score >= 75 && attended && submittedProject;
        boolean failed = score < 75 || !attended || !submittedProject;
        boolean excellent = score >= 90 && attended;
        
        System.out.println("Score: " + score + ", Hadir: " + attended + ", Project: " + submittedProject);
        System.out.println("Lulus: " + passed);
        System.out.println("Gagal: " + failed);
        System.out.println("Excelent: " + excellent);
        
        // 5. BOOLEAN SHORT-CIRCUITING
        System.out.println("\n=== SHORT-CIRCUIT EVALUATION ===");
        
        // method TIDAK dijalankan -> Demo
        System.out.println("1. Short-circuit AND (false && method):");
        boolean result1 = false && expensiveDatabaseCall(); // gak akan jalanin method
        System.out.println("Result: " + result1);
        
        System.out.println("2. Short-circuit OR (true && method):");
        boolean result2 = true || expensiveFileRead();  // gak akan jalanin method
        System.out.println("Result: " + result2);

        // Method di Jalankan -> not dead codeee
        System.out.println("3. Non short-circuit AND (true && method):");
        boolean result3 = true && expensiveDatabaseCall();
        System.out.println("   Result: " + result3);
        
        System.out.println("4. Non short-circuit OR (false || method):");
        boolean result4 = false || expensiveFileRead();
        System.out.println("   Result: " + result4);
        
        // 6. NULL SAFETY CHECK
        System.out.println("\n=== NULL SAFETY CHECK ===");
        String name = null;
        boolean isValidName = name != null && !name.isEmpty();
        System.out.println("Nama valid? " + isValidName);
        
        // 7. DE MORGAN'S LAW
        System.out.println("\n=== DE MORGAN'S LAW ===");
        boolean x = true, y = false;
        boolean demorgan1 = !(x && y) == (!x || !y);
        boolean demorgan2 = !(x || y) == (!x && !y);
        System.out.println("De Morgan 1: " + demorgan1);
        System.out.println("De Morgan 2: " + demorgan2);
        
        // 8. TRUTH TABLE SIMULATION
        System.out.println("\n=== TRUTH TABLE ===");
        System.out.println("A\tB\tA&&B\tA||B\tA^B\t!A");
        for(boolean boolA : new boolean[]{true, false}) {
            for(boolean boolB : new boolean[]{true, false}) {
                System.out.printf("%b\t%b\t%b\t%b\t%b\t%b%n", 
                    boolA, boolB, boolA && boolB, boolA || boolB, 
                    boolA ^ boolB, !boolA);
            }
        }
    }
    
    public static boolean expensiveDatabaseCall() {
        System.out.println("Database query executed!");
        return true;
    }

    public static boolean expensiveFileRead(){
        System.out.println("File read operation executed!");
        return true;
    }
}