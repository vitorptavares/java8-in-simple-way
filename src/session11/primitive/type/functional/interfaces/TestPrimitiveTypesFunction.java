package session11.primitive.type.functional.interfaces;

import java.util.function.IntFunction;

public class TestPrimitiveTypesFunction {

    public static void main(String[] args) {

        int [] integers = {1,2,3,4,5,6,7};
        
        IntFunction f = integer -> integer * 100;


        for (int i :
                integers) {
            System.out.println(f.apply(i));
        }
    }
}
