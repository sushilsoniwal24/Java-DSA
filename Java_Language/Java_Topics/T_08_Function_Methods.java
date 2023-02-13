package Java_Language.Java_Topics;

public class T_08_Function_Methods {

    public static void main(String[] args) {

        // * For Primitives.
        int num = 40;
        System.out.println("Before Changing, The Num Was :- " + num);
        change(num);
        System.out.println("After Changing, The Num Is :- " + num);

        // * For Object & Refrences..
        int[] arr = { 15, 20, 25, 30 };
        System.out.println("Before Calling Any Method The Value Of arr[0] Is :- " + arr[0]);
        changeArray(arr);
        System.out.println("After Calling Any Method The Value Of arr[0] Is :- " + arr[0]);
    }

    // Todo :- For Primitive Data Types.
    public static void change(int num) {
        System.out.println("Before Changing, The Value Of Num In The Change Method Is :- " + num);
        num = num + 100;
        System.out.println("After Changing, The Value Of Num In The Change Method Is  :- " + num);
    }

    // Todo :- For Object & References.
    public static void changeArray(int[] nums) {
        System.out.println("Before Changing, The Value Of nums[0] Is :- " + nums[0]);
        nums[0] = nums[0] + 100;
        System.out.println("After Changing, The Value Of nums[0] Is :- " + nums[0]);
    }
}

/* ********** PASS BY VALUE IN JAVA ********** */
// ! Primitives :- Copy of the value is passed.
// ! Objects/References :- Copy of the reference variable is passed.
