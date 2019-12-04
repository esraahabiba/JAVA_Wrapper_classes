/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclasses;

/**
 *
 * @author gt
 */
public class WrapperClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer i2 = new Integer(10); // integer with value 10 and i2 is referance to this value
        byte b = i2.byteValue();
        String s = Integer.toHexString(10); // if use i2.toHexString will make complilation error as toHexString is static method
        System.out.println(b);
        MyClass myReferance;  //myReferance is referance in the future refere to object of type MyClass (there is no memory allocation)
        myReferance = new MyClass(); // now allocation done after calling a default constructor to create an object and still myReferance is referance to object of type MyClass
        String str1; // no allocation but referance in future
        str1 = new String("hello"); //allocation and reference
        String str2 = str1;  // str1 and str2 are 2 references refer to hello string object
        str1 = null; // now object not a garbage as str2 refer to it 
        str2 = null; // now can say that hello string object under a garbage collector of java
        MyClass myReferance2 = new MyClass(); // reference and allocation
        myReferance2 = null; // under garbage collector 
        myReferance2.print(); // no compilation error but runtime error (nullPointerException)

    }

}
