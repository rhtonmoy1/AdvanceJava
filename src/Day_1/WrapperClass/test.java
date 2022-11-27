package Day_1.WrapperClass;

public class test {
    public static void main(String[] args) {
        int i = 32;
        float f = 32;
        double d = 64;
        long l = 64;
        char c = 'a'; // 16
        short s = 16;
        byte b = 8;
        boolean bl = true; //1

        //Autoboxing: Converting primitives into objects
        Integer intobj = i;
        Float floatobj = f;
        Double doubleobj = d;
        Long longobj = l;
        Character charobj = c;
        Short shortobj = s;
        Byte byteobj = b;
        Boolean boolobj = bl;

        //Printing Objects
        System.out.println("--Printing Object Values--");
        System.out.println("Integer object: "+intobj);
        System.out.println("Float object: "+floatobj);
        System.out.println("Double object: "+doubleobj);
        System.out.println("Long object: "+longobj);
        System.out.println("Character object: "+charobj);
        System.out.println("Short object: "+shortobj);
        System.out.println("Byte object: "+byteobj);
        System.out.println("Boolean object: "+boolobj);

        //Unboxing: Converting Objects to Primitives
        int intvalue=intobj;
        float floatvalue=floatobj;
        double doublevalue=doubleobj;
        long longvalue=longobj;
        char charvalue=charobj;
        short shortvalue=shortobj;
        byte bytevalue=byteobj;
        boolean boolvalue=boolobj;

        //Printing primitives
        System.out.println("---Printing primitive values---");
        System.out.println("int value: "+intvalue);
        System.out.println("float value: "+floatvalue);
        System.out.println("double value: "+doublevalue);
        System.out.println("long value: "+longvalue);
        System.out.println("char value: "+charvalue);
        System.out.println("short value: "+shortvalue);
        System.out.println("byte value: "+bytevalue);
        System.out.println("boolean value: "+boolvalue);

    }
}
