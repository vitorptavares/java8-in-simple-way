package session11.primitive.type.functional.interfaces;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/*
Em situacoes onde a parametro e o argumento de uma Function (somente em function) são do mesmo tipo, eu posso substituir
A Function pelo UnaryOperator.
Existe o UnaryOperator para primitivos tambem. Ex: IntUnaryOperator
 */
public class TestUnaryOperator {

    public static void main(String[] args) {

        Integer [] integers = {1,2,3,4,5,6,7,8};
        UnaryOperator<Integer> u = i -> i*i;

        for (Integer i :
                integers) {
            System.out.println(u.apply(i));
        }
    }
}
