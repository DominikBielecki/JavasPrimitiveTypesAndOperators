import java.util.concurrent.atomic.AtomicInteger;

public class PrimitiveTypesQuiz {
    public static void main(String[] args) {

      // what will be printed to the console after this program runs:

//     System.out.println('a' + 'A');

//         System.out.println("\"");

//System.out.println("what will be the result of this addition? " + 1 + 2 + 3);

// System.out.println(1 + 2 + 3 + " and what the result will be here?");

//System.out.println("what will be the result of this addition? " + (1 + 2 + 3));

//       boolean boolExample = !(true);
//
//        System.out.println(boolExample);
//
//        //byte data type, so 8 bit integer
////        //
//        byte by = (byte)135;
//        System.out.println(by);
//
//        byte bySecond = (byte)256;
//        System.out.println(bySecond);
//
//        //why is there a mistake here?
//        int i = 12345678901234567;

  //      why is there a mistake here?
   //    long lg = 12345678901234567;


        //what's going on here
//        char c =  0x6d;
//        char d =  0155;
//        System.out.println(c + " = " + d);
//
//        double test = 2.0 - 1.9;
//        System.out.println(test);
//
////        // find the value of a variable
//        int a = 1000000000;
//        System.out.println("Here the variable has a value: " + a);
//
//        a += 1000000000;
//        System.out.println("Here the variable has a value: " + a);
//
//        a += 1000000000;
//        System.out.println("Here the variable has a value: " + a);
//
//        a += 1000000000;
//        System.out.println("Here the variable has a value: " + a);
//
////        //what will be printed to the console after this program runs:
//        System.out.println(2147483647 + 1);
//        System.out.println(2147483647L + 1);
//
//        int value = 12_346_789;
//        System.out.println("Value of a variable is: " + value);
//
        int x1 = 40;
        int y1 = 10;

//        x1 += y1;
//         System.out.println("Now x1 has value: " + x1);
////
//        x1 =+ y1;
//        System.out.println("Now x1 has value: " + x1);

        int x = 899;
        short y = 10;
//
    //    y = x;
//      x = y;
 //       System.out.println(x);

        Integer integerOne = new Integer(100);
        Integer integerTwo = new Integer(100);

//        System.out.println(integerOne == integerTwo);
//
//        System.out.println(integerOne.equals(integerTwo));
//
//        double a = 0.7;
//        double b = 0.9;
//        double c = a + 0.1;
//        double d = b - 0.1;
//
//        System.out.println(0.8 == 0.8);
//        System.out.println(c == d);
//
//        System.out.println("c = " + c);
//        System.out.println("d = " + d );

        int f = 10;
        AtomicInteger g = new AtomicInteger(10);

        valueTest(f,g);
//
        System.out.println("f = " + f);
        System.out.println("g = " + g);

    }
    private static void valueTest(int f, AtomicInteger g) {
        f = 20;
        g.set(20);
    }
}
