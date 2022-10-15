/**
 * @author Raman Bohdan
 * @version 1.0
 * @since 26.09.2022
 */

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /* task 1*/
        System.out.println("Task 1");
        InitializedVariable initialized = new InitializedVariable();
        System.out.println(initialized.a);
        System.out.println(initialized.c);

        /* task 2*/
        System.out.println("Task 2");
        System.out.println(PrintHelloWorld.getText("Hello World"));
        System.out.println(new Date() + "\n");

        /* task 8*/
        System.out.println("Task 8");
        OnlyOneInstanceClass oneInstanceClass = new OnlyOneInstanceClass();
        OnlyOneInstanceClass oneInstanceClass1 = new OnlyOneInstanceClass();
        OnlyOneInstanceClass.NUMBER = 10;
        System.out.println(OnlyOneInstanceClass.NUMBER);

        /* task 9*/
        System.out.println("Task 9");
        AutoboxingForPrimitiveAndWrapperTypes primitiveAndWrapper = new AutoboxingForPrimitiveAndWrapperTypes();
        primitiveAndWrapper.aByte = -127;
        primitiveAndWrapper.aByteType = primitiveAndWrapper.aByte;
        primitiveAndWrapper.aShort = 1000;
        primitiveAndWrapper.aShortType = primitiveAndWrapper.aShort;
        primitiveAndWrapper.anInt = -320007687;
        primitiveAndWrapper.integer = primitiveAndWrapper.anInt;
        primitiveAndWrapper.aLong = 1280009999;
        primitiveAndWrapper.aLongType = primitiveAndWrapper.aLong;
        primitiveAndWrapper.aDouble = 100.11;
        primitiveAndWrapper.aDoubleType = primitiveAndWrapper.aDouble;
        primitiveAndWrapper.aFloat = 234234.f;
        primitiveAndWrapper.aFloatType = primitiveAndWrapper.aFloat;
        primitiveAndWrapper.aChar = 'B';
        primitiveAndWrapper.aCharType = primitiveAndWrapper.aChar;
        primitiveAndWrapper.aBoolean = true;
        primitiveAndWrapper.aBooleanType = true;

        System.out.println(initialized.a);
        System.out.println(initialized.c);
        System.out.println(primitiveAndWrapper.aByteType + "; " + primitiveAndWrapper.aShortType + "; " +
                primitiveAndWrapper.integer + "; " + primitiveAndWrapper.aLongType + "; " +
                primitiveAndWrapper.aDoubleType + "; " + primitiveAndWrapper.aFloatType + "; " +
                primitiveAndWrapper.aCharType + primitiveAndWrapper.aBooleanType + "; " +
                primitiveAndWrapper.aBoolean);
    }
}
