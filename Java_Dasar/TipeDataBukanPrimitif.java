/**
 * MASTER CLASS: TIPE DATA BUKAN PRIMITIF (WRAPPER CLASSES)
 * Konsep: Autoboxing, Unboxing, Method Utility, Null Safety
 */
public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        System.out.println("=== TIPE DATA BUKAN PRIMITIF MASTERY ===\n");
        
        // =============================================
        // 1. DASAR: DEKLARASI & INISIALISASI
        // =============================================
        System.out.println("1. DASAR PENGGUNAAN:");
        
        // Autoboxing (Java otomatis konversi)
        Integer iniInteger = 10;
        Long iniLong = 10L;  
        Boolean iniBoolean = true;
        Double iniDouble = 10.5;
        Character iniChar = 'A';
        
        System.out.println("Integer: " + iniInteger);
        System.out.println("Long: " + iniLong);
        System.out.println("Boolean: " + iniBoolean);
        System.out.println("Double: " + iniDouble);
        System.out.println("Character: " + iniChar);
        
        // =============================================
        // 2. AUTOBOXING & UNBOXING
        // =============================================
        System.out.println("\n2. AUTOBOXING & UNBOXING:");
        
        // Autoboxing: primitif -> object
        int primitifInt = 100;
        Integer objectInt = primitifInt;
        System.out.println("Autoboxing: " + primitifInt + " -> " + objectInt);
        
        // Unboxing: object -> primitif
        Integer anotherInt = 200;
        int kembaliPrimitif = anotherInt;
        System.out.println("Unboxing: " + anotherInt + " -> " + kembaliPrimitif);
        
        // Operasi dengan wrapper
        Integer a = 10;
        Integer b = 20;
        int hasil = a + b;
        System.out.println("10 + 20 = " + hasil);
        
        // =============================================
        // 3. NULL VALUE HANDLING
        // =============================================
        System.out.println("\n3. NULL VALUE HANDLING:");
        
        Integer bisaNull = null;
        System.out.println("Integer bisa null: " + bisaNull);
        
        Integer nilaiNull = null;
        if (nilaiNull != null) {
            int aman = nilaiNull;
            System.out.println("Nilai aman: " + aman);
        } else {
            System.out.println("Nilai adalah null!");
        }
        
        // =============================================
        // 4. METHOD UTILITY WRAPPER CLASS
        // =============================================
        System.out.println("\n4. METHOD UTILITY:");
        
        Integer number = 255;
        byte asByte = number.byteValue();
        short asShort = number.shortValue();
        double asDouble = number.doubleValue();
        
        System.out.println("255 as byte: " + asByte);
        System.out.println("255 as short: " + asShort); 
        System.out.println("255 as double: " + asDouble);
        
        String angkaStr = "123";
        int parsedInt = Integer.parseInt(angkaStr);
        Integer parsedInteger = Integer.valueOf(angkaStr);
        
        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Parsed Integer: " + parsedInteger);
        
        Integer x = 100;
        Integer y = 200;
        System.out.println("Compare 100 dan 200: " + x.compareTo(y));
        
        // =============================================
        // 5. CACHE VALUE OPTIMIZATION
        // =============================================
        System.out.println("\n5. CACHE VALUE:");
        
        Integer cache1 = 127;
        Integer cache2 = 127;
        System.out.println("127 == 127? " + (cache1 == cache2));
        
        Integer noCache1 = 128;
        Integer noCache2 = 128;
        System.out.println("128 == 128? " + (noCache1 == noCache2));
        System.out.println("128 equals 128? " + noCache1.equals(noCache2));
        
        // =============================================
        // 6. PRIMITIF vs WRAPPER
        // =============================================
        System.out.println("\n6. PRIMITIF vs WRAPPER:");
        
        int[] primitifArray = new int[1000];
        System.out.println("Primitif array size: " + primitifArray.length);
        
        Integer[] wrapperArray = new Integer[3];
        wrapperArray[0] = 100;
        wrapperArray[1] = null;
        wrapperArray[2] = 200;
        System.out.println("Wrapper array: " + wrapperArray[0] + ", " + wrapperArray[1] + ", " + wrapperArray[2]);
        
        // =============================================
        // 7. COLLECTIONS HARUS PAKAI WRAPPER
        // =============================================
        System.out.println("\n7. COLLECTIONS:");
        
        java.util.List<Integer> listAngka = new java.util.ArrayList<>();
        listAngka.add(10);
        listAngka.add(20);
        listAngka.add(null);
        
        System.out.println("List: " + listAngka);
        System.out.println("First element: " + listAngka.get(0));
        
        // =============================================
        // 8. COMMON MISTAKES
        // =============================================
        System.out.println("\n8. COMMON MISTAKES:");
        
        Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println("1000 == 1000? " + (i1 == i2));
        System.out.println("1000 equals 1000? " + i1.equals(i2));
        
        // =============================================
        // 9. LATIHAN PRAKTIS
        // =============================================
        System.out.println("\n9. LATIHAN PRAKTIS:");
        
        // Konversi String dengan error handling
        String input = "123abc";
        try {
            int hasilParsing = Integer.parseInt(input);
            System.out.println("Parsing berhasil: " + hasilParsing);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + input + "' bukan angka!");
        }
        
        // Arithmetic dengan wrapper
        Integer num1 = 15;
        Integer num2 = 4;
        
        System.out.println("15 + 4 = " + (num1 + num2));
        System.out.println("15 - 4 = " + (num1 - num2));
        System.out.println("15 * 4 = " + (num1 * num2));
        System.out.println("15 / 4 = " + (num1.doubleValue() / num2));
        
        System.out.println("\n=== MASTERY ACHIEVED! ===");
    }
}