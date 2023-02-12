package Java_Language.Java_Topics;

public class T_05_Operators {

    public static void main(String[] args) {

        // Arithmetic Operators :- {+, -, *, /, %}.
        int num1 = 10, num2 = 15;

        System.out.println(num1 + num2); // 25
        System.out.println(num1 - num2); // -5
        System.out.println(num1 * num2); // 150
        System.out.println(num1 / num2); // 0
        System.out.println(num1 % num2); // 10

        // Relational Operators :- {==, !=, >, <, >=, <=}
        int num3 = 25, num4 = 30;

        System.out.println(num3 == num4); // false
        System.out.println(num3 != num4); // true
        System.out.println(num3 > num4); // false
        System.out.println(num3 < num4); // true
        System.out.println(num3 >= num4); // false
        System.out.println(num3 <= num4); // true

        // Logical Operators :- {&&, ||, !}
        int num5 = 12, num6 = 10;

        System.out.println((num5 == 12) && (num6 == 10)); // true
        System.out.println((num5 == 12) && (num6 == 20)); // false
        System.out.println((num5 == 12) || (num6 == 10)); // true
        System.out.println((num5 == 12) || (num6 == 20)); // true
        System.out.println(!(num5 > num6)); // false

        // Assignment Operators :- {=, +=, -=, etc}
        int a = 20, b = 10;
        b += a; // 30
        a *= b; // 600

        System.out.println("The Value Of a Is :- " + a);
        System.out.println("The Value Of b Is :- " + b);

        // Unary Operators :- {++, --, !}
        int p = 5, q = 20;

        System.out.println(p++); // 5
        System.out.println(p); // 6
        System.out.println(++q); // 21
        System.out.println(q); // 21

        // Bitwise Operators :- {~, <<, >>, >>>, &, ^}
        int l = 2, h = 5;
        System.out.println(l << 2); // 8
        System.out.println(h >> 1); // 2
        System.out.println(~l); // -3
    }
}
