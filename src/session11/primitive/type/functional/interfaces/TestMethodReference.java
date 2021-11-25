package session11.primitive.type.functional.interfaces;

/*
 *O único critério que deve ser respeitado para fazer uso  do method reference é quanto aos argumentos.
 * Ambos métodos devem ter o mesmo tipo de argumentos
 */
public class TestMethodReference {

    public void m2(){
        System.out.println("Method Reference");
    }

    public static void main(String[] args) {
        TestMethodReference testMethodReference = new TestMethodReference();
        Interf i = testMethodReference::m2;

        i.m1();
    }
}
