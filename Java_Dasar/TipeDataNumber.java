public class TipeDataNumber {
    public static void main(String[] args){
        // 1. INTEGER NUMBER - DEFAULT VALUE 0        
        // Range: -128 to 127 (8-bit)
        System.out.println("\n=== INTEGER NUMBER -> (byte) ===");
        byte iniByte = 100;
        byte minByte = Byte.MIN_VALUE; // -128
        byte maxByte = Byte.MAX_VALUE; // 127
        System.out.printf("Ini adalah iniByte: %d%n", iniByte);
        System.out.printf("Ini adalah minByte: %d%n", minByte);
        System.out.printf("Ini adalah maxByte: %d%n", maxByte);

        System.out.println("\n=== INTEGER NUMBER -> (short) ===");
        // Range: -32,768 to 32,767 (16-bit)  
        short iniShort = 1000;
        short minShort = Short.MIN_VALUE; // -32,768
        short maxShort = Short.MAX_VALUE; // 32,767
        System.out.printf("Ini adalah iniShort: %,d%n", iniShort);
        System.out.printf("Ini adalah minShort: %,d%n", minShort);
        System.out.printf("Ini adalah maxShort: %,d%n", maxShort);

        System.out.println("\n=== INTEGER NUMBER -> (int) ===");
        // Range: -2^31 to 2^31-1 (32-bit) - DEFAULT untuk integer
        int iniInt = 1_000_000;
        int minInt = Integer.MIN_VALUE;   // -2,147,483,648
        int maxInt = Integer.MAX_VALUE;   // 2,147,483,647
        System.out.printf("Ini adalah iniInt: %,d%n", iniInt);
        System.out.printf("Ini adalah minInt: %,d%n", minInt);
        System.out.printf("Ini adalah maxInt: %,d%n", maxInt);

        System.out.println("\n=== INTEGER NUMBER -> (long) ===");
        // Range: -2^63 to 2^63-1 (64-bit)
        long iniLong = 1_000_000;         // Auto-widening dari int
        long iniLong2 = 1_000_000L;       // Explicit long literal
        long bigLong = 9_223_372_036_854_775_807L; // Max long value
        long minLong = Long.MIN_VALUE;    // -9,223,372,036,854,775,808
        long maxLong = Long.MAX_VALUE;    // 9,223,372,036,854,775,807
        System.out.printf("Ini adalah iniInt: %,d%n", iniLong);
        System.out.printf("Ini adalah iniLong2: %,d%n", iniLong2);
        System.out.printf("Ini adalah bigLong: %,d%n", bigLong);
        System.out.printf("Ini adalah minLong: %,d%n", minLong);
        System.out.printf("Ini adalah maxLong: %,d%n", maxLong);

        // 2. FLOATING POINT NUMBER - DEFAULT VALUE 0.0
        System.out.println("\n=== FLOATING POINT NUMBER -> (float) ===");
        // Single precision (32-bit) - HARUS pakai F/f
        float iniFloat = 10.123F;
        float scientificFloat = 1.234e2F; // 123.4 (scientific notation)
        float minFloat = Float.MIN_VALUE;  // 1.4E-45
        float maxFloat = Float.MAX_VALUE;  // 3.4028235E38
        System.out.printf("Ini adalah iniFloat: %.2f%n", iniFloat);
        System.out.printf("Ini adalah scientificFloat: %.2f%n", scientificFloat);
        System.out.printf("Ini adalah minFloat: %e%n", minFloat);
        System.out.printf("Ini adalah maxFloat: %e%n", maxFloat);

        System.out.println("\n=== FLOATING POINT NUMBER -> (double) ===");
        // Double precision (64-bit) - DEFAULT untuk floating point
        double iniDouble = 12.2424;
        double scientificDouble = 1.23456e3; // 1234.56
        double minDouble = Double.MIN_VALUE; // 4.9E-324  
        double maxDouble = Double.MAX_VALUE; // 1.7976931348623157E308
        System.out.printf("Ini adalah iniDouble: %.2f%n", iniDouble);
        System.out.printf("Ini adalah scientificDouble: %.2f%n", scientificDouble);
        System.out.printf("Ini adalah minDouble: %e%n", minDouble);
        System.out.printf("Ini adalah maxDouble: %e%n", maxDouble);

        // 3. CHARACTER & BOOLEAN
        System.out.println("\n=== CHARACTER & BOOLEAN -> (char) ===");
        // char sebenarnya number juga (16-bit Unicode)
        char iniChar = 'a';
        char iniCharDua = 'A';
        char unicodeChar = '\u0041'; // Juga 'A'
        int charToInt = iniChar; // 65 (ASCII value)
        System.out.printf("Ini adalah iniChar: %C%n", iniChar);
        System.out.printf("Ini adalah iniCharDua: %c%n", iniCharDua);
        System.out.printf("Ini adalah unicodeChar: %c%n", unicodeChar);
        System.out.printf("Ini adalah charToInt: %d%n", charToInt);
        System.out.printf("Unicode value dari 'A': U+%04X%n", (int)iniChar); // U+0041
        
        System.out.println("\n=== CHARACTER & BOOLEAN -> (boolean) ===");
        // boolean (true/false) - bukan number tapi sering dipakai
        boolean isJavaFun = true;
        boolean isFishFly = false;
        System.out.printf("Ini adalah isJavaFun: %b%n", isJavaFun);
        System.out.printf("Ini adalah isFishFly: %b%n", isFishFly);

        // 4. LITERALS NUMBER (Bermacam format penulisan)
        System.out.println("\n=== LITERALS NUMBER -> (decimalInt) ===");
        // Decimal (basis 10)
        int decimalInt = 25;
        System.out.printf("Ini adalah decimalInt: %d%n", decimalInt);

        System.out.println("\n=== LITERALS NUMBER -> (hexaDecimal) ===");
        // Hexadecimal (basis 16) - prefix 0x/0X
        int hexaDecimal = 0xA132B; // 660,267 in decimal
        int hexSmall = 0xFF; // 255 in decimal
        System.out.printf("Ini adalah hexaDecimal: %x%n", hexaDecimal);
        System.out.printf("Ini adalah hexaDecimal: %X%n", hexaDecimal);
        System.out.printf("Ini adalah hexSmall: %X%n", hexSmall);
        // Prefix 0x -> hexaDecimal, hexSmall
        System.out.printf("Ini adalah hexaDecimal: 0x%X%n", hexaDecimal);
        System.out.printf("Ini adalah hexaDecimal: 0x%X%n", hexSmall);

        System.out.println("\n=== LITERALS NUMBER -> (binaryDecimal) ===");
        // Binary (basis 2) - prefix 0b/0B  
        int binaryDecimal = 0b1010101; // 85 in decimal
        int binaryByte = 0b11111111; // 255 in decimal
        System.out.printf("Ini adalah binaryDecimal: 0b%s%n", Integer.toBinaryString(binaryDecimal));
        System.out.printf("Ini adalah binaryByte: 0b%s%n", Integer.toBinaryString(binaryByte));

        System.out.println("\n=== LITERALS NUMBER -> (octalNumbers) ===");
        // Octal (basis 8) - prefix 0
        int octalNumbers = 0123; // 83 in decimal
        System.out.printf("Ini adalah octalNumber: 0%o%n", octalNumbers);
        
        // 5. UNDERSCORE UNTUK READABILITY
        System.out.println("\n=== UNDERSCORE  -> (final) ===");
        final long BALANCE = 1_000_000_000_000L;
        final int MAX_VALUE = 60_000_000;
        final double PI = 3.141_592_653_589_793;
        final long CREDIT_CARD = 1234_5678_9012_3456L;
        final long HEX_WITH_UNDERSCORE = 0x7FFF_FFFF_FFFF_FFFFL;

        System.out.printf("Ini adalah BALANCE: %,d%n", BALANCE);
        System.out.printf("Ini adalah MAX_VALUE: %,d%n", MAX_VALUE);
        System.out.printf("Ini adalah PI: %.15f%n", PI);

        String ccFormatted = String.format("%016d", CREDIT_CARD).replaceAll("(.{4})", "$1 ").trim();
        System.out.printf("Ini adalah CREDIT_NUMBER: %s%n", ccFormatted);
        
        System.out.printf("Ini adalah HEX_WITH_UNDERSCORE: 0x%X%n", HEX_WITH_UNDERSCORE);

        // 6. KONVERSI TIPE DATA NUMBER       
        System.out.println("\n=== WIDENING CASTING -> (Otomatis) ===");
        // byte -> short -> int -> long -> float -> double
        byte sampleByte = 100;
        short autoShort = sampleByte;     // Auto widening
        int autoInt = autoShort;          // Auto widening  
        long autoLong = autoInt;          // Auto widening
        float autoFloat = autoLong;       // Auto widening (hati2 precision loss!)
        double autoDouble = autoFloat;    // Auto widening
        
        System.out.println("Widening dari byte " + sampleByte + " ke double " + autoDouble);
        
        System.out.println("\n=== NARROWING CASTING -> (Manual) ===");
        // double -> float -> long -> int -> short -> byte
        double sampleDouble = 123.456;
        float manualFloat = (float) sampleDouble;     // Manual casting
        long manualLong = (long) manualFloat;         // Manual casting
        int manualInt = (int) manualLong;             // Manual casting  
        short manualShort = (short) manualInt;        // Manual casting
        byte manualByte = (byte) manualShort;         // Manual casting
        
        System.out.println("Narrowing dari double " + sampleDouble + " ke byte " + manualByte);
        
        // 7. NUMBER OVERFLOW & UNDERFLOW DEMO
        System.out.println("\n=== NUMBER OVERFLOW DEMO -> (byte) ===");
        // Byte overflow (cyclic behavior)
        byte normalByte = 127;
        byte overflowByte = (byte)(normalByte + 1);   // Jadi -128!
        byte overflowByteDua = (byte)(overflowByte + 2);
        System.out.println("127 + 1 = " + overflowByte + " (OVERFLOW!)");
        System.out.println("127 + 2 = " + overflowByteDua + " (OVERFLOW!)");
        
        System.out.println("\n=== NUMBER OVERFLOW DEMO -> (int) ===");
        // Integer overflow
        int maxIntValue = Integer.MAX_VALUE;
        int overflowInt = maxIntValue + 1;
        int overflowIntDua = overflowInt + 2;            // Jadi MIN_VALUE!
        System.out.println("Integer.MAX_VALUE + 1 = " + overflowInt + " (OVERFLOW!)");
        System.out.println("Integer.MAX_VALUE + 2 = " + overflowIntDua + " (OVERFLOW!)");

        // Floating point precision issues
        System.out.println("\n=== FLOATING POINT PRECISION ISSUES ===");
        // Solusi: gunakan BigDecimal untuk precision critical operations
        // Penjumlahan
        double a = 0.1;
        double b = 0.2;
        double sum = a + b;
        // "Apakah bedanya kurang dari 0.0001?"
        boolean isSame = Math.abs(sum - 0.3) < 0.0001;
        System.out.println("0.1 + 0.2 = " + sum);     // Bukan 0.3!
        System.out.println("0.1 + 0.2 == 0.3? " + (sum == 0.3)); // false! -> (true)
        System.out.println("0.1 + 0.2 == 0.3? " + isSame);

        System.out.println();

        // Pengurangan
        double h = 0.3;
        double i = 0.2;
        double subtraction = h - i; // 0.09999999999999998
        boolean isSameSubtraction = Math.abs(subtraction - 0.1) < 0.0001;

        System.out.println("=== PENGURANGAN ===");
        System.out.println("0.3 - 0.2 = " + subtraction);
        System.out.println("0.3 - 0.2 ≈ 0.1? " + isSameSubtraction);
        
        System.out.println();

        // Perkalian
        double c = 0.1;
        double d = 0.2; 
        double product = c * d; // 0.020000000000000004
        boolean isSameProduct = Math.abs(product - 0.02) < 0.0001;

        System.out.println("=== PERKALIAN ===");
        System.out.println("0.1 * 0.2 = " + product);
        System.out.println("0.1 * 0.2 ≈ 0.02? " + isSameProduct);

        System.out.println();

        // Pembagian
        double e = 1.0;
        double f = 3.0;
        double divisionn = e / f; // 0.3333333333333333
        boolean isSameDivision = Math.abs(divisionn - 0.333333) < 0.0001;
        
        System.out.println("=== PEMBAGIAN ===");
        System.out.println("1.0 / 3.0 = " + divisionn);
        System.out.println("1.0 / 3.0 ≈ 0.333333? " + isSameDivision);
        
        System.out.println();

        // Akar & Pangkat 
        double g = 2.0;
        double sqrt = Math.sqrt(g); // 1.4142135623730951
        boolean isSameSqrt = Math.abs(sqrt - 1.4142) < 0.0001;

        System.out.println("=== AKAR KUADRAT ===");
        System.out.println("√2 = " + sqrt);
        System.out.println("√2 ≈ 1.4142? " + isSameSqrt);

        /**
        * RUMUS TOLERANCE SUPER GAMPANG:
        * 
        * Mau berapa angka di belakang koma?
        * tolerance = 1 ÷ (10 ^ (jumlah_angka + 1))
        * 
        * CONTOH:
        * - Mau 1 angka? → 1 ÷ (10 ^ (1 + 1)) = 1 ÷ 100 = 0.01
        * - Mau 2 angka? → 1 ÷ (10 ^ (2 + 1)) = 1 ÷ 1000 = 0.001  
        *   contoh : double toleranceUang = 0.001
        * - Mau 3 angka? → 1 ÷ (10 ^ (3 + 1)) = 1 ÷ 10000 = 0.0001
        * - Mau 4 angka? → 1 ÷ (10 ^ (4 + 1)) = 1 ÷ 100000 = 0.00001
        * - Mau 5 angka? → 1 ÷ (10 ^ (5 + 1)) = 1 ÷ 1000000 = 0.000001
        * 
        * USE CASE:
        * - UANG (2 angka): tolerance = 0.001
        * - PENGUKURAN (3 angka): tolerance = 0.0001  
        * - SCIENTIFIC (6 angka): tolerance = 0.0000001
        * - LATIHAN (4 angka): tolerance = 0.00001
 */
        
        // 8. ARITHMETIC OPERATIONS
        System.out.println("\n=== ARITHMETIC OPERATIONS ===");
        int x = 10;
        double y = 3.0;
        // Automatic widening dalam operasi
        double division = x / y; // int -> double
        System.out.println("10 / 3.0 = " + division);
        
        // Integer division (hati-hati!)
        int intDiv = x / 3; // Hasil 3, bukan 3.333!
        System.out.println("10 / 3 = " + intDiv + " (integer division)");
        
        // Modulo operation
        int modulus = x % 3; // Sisa bagi 
        System.out.println("10 % 3 = " + modulus); // Hasil 1
        
        // 9. INIFINTY & NaN (Special Floating Point Values)
        System.out.println("\n=== INFINITY & NaN ===");
        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        double nan = Double.NaN;
        
        System.out.println("Positive Infinity: " + positiveInfinity);
        System.out.println("Negative Infinity: " + negativeInfinity);
        System.out.println("NaN: " + nan);

        // 10. TYPE CHECKING & COMPARISON
        System.out.println("\n=== TYPE CHECKING ===");
        byte testByte = 100;
        double testDouble = 12.34;
        System.out.println("Tipe iniByte: " + ((Object)testByte).getClass().getSimpleName());
        System.out.println("Tipe iniDouble: " + ((Object)testDouble).getClass().getSimpleName());
        
        System.out.println("\n=== TIPS PENTING ===");
        System.out.println("1. Gunakan int untuk bilangan bulat umum");
        System.out.println("2. Gunakan long untuk bilangan sangat besar");  
        System.out.println("3. Gunakan double untuk floating point umum");
        System.out.println("4. Hati-hati dengan integer division");
        System.out.println("5. Selalu cast explicit untuk narrowing");
        System.out.println("6. Gunakan underscore untuk readability");
        System.out.println("7. Test boundary values untuk overflow");
    }
}