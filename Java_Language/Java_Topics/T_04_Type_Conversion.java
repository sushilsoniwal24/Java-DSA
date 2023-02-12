package Java_Language.Java_Topics;

public class T_04_Type_Conversion {

    public static void main(String[] args) {

        // * Widening or implicit Type Conversion.
        int num = 2147483647;
        long lg = num;
        lg = lg + 1;
        System.out.println("Int value : " + num); // 2147483647
        System.out.println("Long value : " + lg); // 2147483648

        // * Narrowing Or Explicit Type Casting.
        double db = 225.150;
        int a = (int) db;
        System.out.println("double after casting to int is:- " + a); // 225

        byte by = (byte) a;
        System.out.println("int after casting to byte is:- " + by); // -31
    }
}

/* ********** Complete Explanation Of Type Casting In Java ********** */

/**
 * ? Q:- WHAT IS TYPE CASTING & TYPE CONVERSION.
 * ! Type Casting:- In type casting a data type is converted into another data
 * type by programmer.
 * 
 * ! Type Conversion:- In type conversion a data type is converted into another
 * data type by compiler.
 */

/**
 * ? Widening or Automatic Type Conversion.
 * ! It converts a small data type to a large data type.
 * * byte -> short -> int -> long -> float -> double.
 */

/**
 * ? Narrowing Or Explicit Type Conversion.
 * ! It converts a large data type to a small data type.
 * * double -> float -> long -> int -> short -> byte.
 * ! Syntax:- data_type var_name = (small) var_name(large).
 */
