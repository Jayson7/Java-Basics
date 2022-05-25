public class Main {

  public static void main(String[] args) {
    // System.out.println("Hello World");
    // System.out.println(32 + 67);
    // this is a single line comment
    /*
this is a multi-line comment 
*/

    // primitive data types
    // int, double, float, char, boolean, long, short, byte
    // int myInt = 5;
    // double myDouble = 5.5;
    // float myFloat = 5.5f;
    // char myChar = 'a';
    // boolean myBoolean = true;
    // long myLong = 5L;
    // short myShort = 5;
    // byte myByte = 5;
    // print all variables
    // System.out.println(myInt);
    // System.out.println(myDouble);
    // System.out.println(myFloat);
    // System.out.println(myChar);
    // System.out.println(myBoolean);
    // System.out.println(myLong);
    // System.out.println(myShort);
    // System.out.println(myByte);

    // converting from one type to another

    // int to double
    // double myDouble2 = myInt;
    // System.out.println(myDouble2);
    // short to int
    // int myInt2 = myShort;
    // System.out.println(myInt2);
    // double to int
    // int myInt3 = (int) myDouble;
    // System.out.println(myInt3);
    // **********************************
    // basic calculation
    // int a = 567;
    // int b = 345;
    // System.out.println("a = " + a);
    // System.out.println("b = " + b);
    // System.out.println("************");
    // System.out.println("Addition of a and b = " + a + b);
    // System.out.println("************");
    // // multiplication
    // System.out.println("Addition of a and b = " + a * b);
    // // division
    // System.out.println("Multiplication of a and b = " + a / b);
    // // type casting
    // System.out.println("Multiplication of a and b = " + (double) a / b);
  // this variable cannot be overwritten by the next line
  // final int myFinal = 5;
  // myFinal = 6; wont work
  // use plus to join two variables, this rule works for strings only 
  // String s = "street";
  // String l = "light";
  // System.out.println(s + l);
  // double can also be called float 
  // System.out.println((float) 34.4);

/*
Non-Primitive Data Types
Non-primitive data types are called reference types because they refer to objects.

The main difference between primitive and non-primitive data types are:

Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type has always a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
The size of a primitive type depends on the data type, while non-primitive types have all the same size.
Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. 
*/

// Java Type Casting
// Type casting is when you assign a value of one primitive data type to another type.


// Widening Casting
// Widening casting is done automatically when passing a smaller size type to a larger size type:

//  System.out.println(myInt);      // Outputs 9
//     System.out.println(myDouble);   // Outputs 9.0


// Narrowing Casting
// Narrowing casting must be done manually by placing the type in parentheses in front of the value:
// System.out.println(myDouble);   // Outputs 9.78
//     System.out.println(myInt);      // Outputs 9


// String firstName = "John ";
// String lastName = "Doe";
// System.out.println(firstName.concat(lastName));



  }
}
