package com.test.Session3;

 class Test1 {

    public String concat1(String s1) { //String is an Immutable Class the object can't be altered
        String s2 = s1 + "Systems";
        System.out.println("String is " + s2);
        return s2;
    }

    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s3) {
        s3.append("Systems");
    }

    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s4) {
        s4.append("Systems");
    }

}
public class  StringBuilderExample{
    public static void main(String[] args) {

        String s1="Maveric";
       new  Test1().concat1(s1);

        StringBuilder s3= new StringBuilder("Maveric");
        Test1.concat2(s3);
        System.out.println("StringBuilder is "+s3);


        StringBuffer s4 = new StringBuffer("Maveric");
        Test1.concat3(s4);
        System.out.println("StringBuffer is "+s4);
        System.out.println("StringBuffer is "+s4.reverse());

    }
}
