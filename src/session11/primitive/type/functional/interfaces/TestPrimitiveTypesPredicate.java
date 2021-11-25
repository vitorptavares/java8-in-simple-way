package session11.primitive.type.functional.interfaces;

import java.util.function.IntPredicate;

public class TestPrimitiveTypesPredicate {
    public static void main(String[] args) {

        int [] integers = {2,3,4,5,6,7,8,9,10};
        IntPredicate f = (i) -> i % 2==0;

        for (int i :
                integers) {
            if(f.test(i)){
                System.out.println(i);
            }
        }



    }
}
