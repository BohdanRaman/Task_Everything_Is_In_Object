public class Main {
    public static void main(String[] args) {
        /* task 2*/
        HelloWorldTask2 helloWorld = new HelloWorldTask2();

        /* task 1*/
        IntAndChatNotInitializedTask1 initialized = new IntAndChatNotInitializedTask1();
        initialized.a = 100;
        initialized.c = 'R';

        /* task 9*/
        PrimitiveAndWrapperTask9 primitiveAndWrapper = new PrimitiveAndWrapperTask9();
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

        /* I don't understand, what I need doing in this task, task 8*/
        SomethingClassTask8 sct = new SomethingClassTask8();
        SomethingClassTask8 sct1 = new SomethingClassTask8();
        SomethingClassTask8 sct2 = new SomethingClassTask8();
        SomethingClassTask8 sct3 = new SomethingClassTask8();



        System.out.println(helloWorld.s);
        System.out.println(initialized.a);
        System.out.println(initialized.c);
        System.out.println(primitiveAndWrapper.aByteType + "; " + primitiveAndWrapper.aShortType + "; " +
                primitiveAndWrapper.integer + "; " + primitiveAndWrapper.aLongType + "; " +
                primitiveAndWrapper.aDoubleType + "; " + primitiveAndWrapper.aFloatType + "; " +
                primitiveAndWrapper.aCharType + primitiveAndWrapper.aBooleanType + "; " +
                primitiveAndWrapper.aBoolean);
    }
}
