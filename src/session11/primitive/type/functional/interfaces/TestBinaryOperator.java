package session11.primitive.type.functional.interfaces;

import java.util.function.BinaryOperator;
/*
Quando a BiFunction tem dois argumentos do mesmo tipo e o retorno do mesmo tipo dos argumentos nos podemos substituir a BiFcuntion
pelo BinaryOperator. No binary operator so precisa definiar uma vez o Type
Existe o binary operator tambem para os tipos primitivos
 */
public class TestBinaryOperator {

    public static void main(String[] args) {

        BinaryOperator<String> s = (s1, s2) -> s1 + s2;

        System.out.println(s.apply("Vitor", "Tavares"));
    }
}
