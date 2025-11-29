public class HelloWorld {
    public static void main(String[] args){
        displayHeader();
        displayAboutMe();
        displayEducation(); 
        displayMission();
        displayQuote();
        displayFooter();
    }
    
    public static void displayHeader() {
        String line = "=".repeat(42);
        System.out.println(line);
        System.out.println("           HELLO UNIVERSE               ");
        System.out.println("       Java Backend Developer         ");
        System.out.println(line);
    }
    
    public static void displayAboutMe() {
        System.out.println("\nABOUT ME:");
        System.out.println("  Name     : Danendra Hardjo Judanto");
        System.out.println("  Campus   : Institut Teknologi Bandung");
        System.out.println("  Location : Jawa Barat");
    }
    
    public static void displayEducation() {
        System.out.println("\nEDUCATION:");
        System.out.println("  - Institut Teknologi Bandung");
        System.out.println("  - Sekolah Tinggi Ilmu Statistika");
    }
    
    public static void displayMission() {
        System.out.println("\nMISSION:");
        System.out.println("  Become a proficient Java Backend Developer");
        System.out.println("  Master Spring Boot and Microservices");
        System.out.println("  Build scalable and efficient applications");
    }
    
    public static void displayQuote() {
        System.out.println("\nQUOTE:");
        System.out.println("  \"First, solve the problem. Then, write the code.\"");
        System.out.println("  - John Johnson");
    }
    
    public static void displayFooter() {
        String line = "-".repeat(42);
        System.out.println("\n" + line);
        System.out.println("  Code by: Danendra - Java Developer");
        System.out.println("  Date: " + java.time.LocalDate.now());
        System.out.println(line);
    }
}