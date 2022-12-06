package main; /**
 * @author Raman Bohdan
 * @version 1.0
 * @since 26.09.2022
 */

import task_1.InitializedVariable;
import task_2.PrintHelloWorld;
import task_8.OnlyOneInstanceClass;
import task_9.AutoboxingForPrimitiveAndWrapperTypes;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /* task 1*/
        System.out.println("Task 1");
        InitializedVariable initialized = new InitializedVariable();
        System.out.println(initialized.getA());
        System.out.println(initialized.getC());

        /* task 2*/
        System.out.println("Task 2");
        System.out.println(PrintHelloWorld.getText("Hello World"));
        System.out.println(new Date() + "\n");

        /* task 8*/
        System.out.println("Task 8");
        OnlyOneInstanceClass oneInstanceClass = new OnlyOneInstanceClass();
        OnlyOneInstanceClass oneInstanceClass1 = new OnlyOneInstanceClass();
        oneInstanceClass.setInstance(1);
        oneInstanceClass.setInstanceName("First instance");
        oneInstanceClass1.setInstance(2);
        oneInstanceClass1.setInstanceName("Second instance");
        OnlyOneInstanceClass.number = 10;
        System.out.println(OnlyOneInstanceClass.number);
        System.out.println("Number: " + oneInstanceClass.getInstance() + ". Name: " + oneInstanceClass.getInstanceName());
        System.out.println("Number: " + oneInstanceClass1.getInstance() + ". Name: " + oneInstanceClass1.getInstanceName() + "\n");

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

        System.out.println(primitiveAndWrapper.aByteType + "; " + primitiveAndWrapper.aShortType + "; " +
                primitiveAndWrapper.integer + "; " + primitiveAndWrapper.aLongType + "; " +
                primitiveAndWrapper.aDoubleType + "; " + primitiveAndWrapper.aFloatType + "; " +
                primitiveAndWrapper.aCharType + primitiveAndWrapper.aBooleanType + "; " +
                primitiveAndWrapper.aBoolean);
    }
}
