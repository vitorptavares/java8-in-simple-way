package session6.predefined.funcional.interfaces.predicate;

import java.util.function.Predicate;

/*
 * PRogram to display names start with K by using predicate
 */
public class DisplayNamesUsingPredicate {

    String [] names = {"Sunny", "Kajad", "Mallika", "Katrina", "Karena"};

    Predicate<String> startWithK = s ->
            s.startsWith("K");

    public void displayNamesWithK(String s){
        if(startWithK.test(s))
        System.out.println(s);
    }

    public static void main(String[] args) {

        DisplayNamesUsingPredicate displayNamesUsingPredicate = new DisplayNamesUsingPredicate();
        for (String name :
                displayNamesUsingPredicate.names) {
            displayNamesUsingPredicate.displayNamesWithK(name);
        }
    }


}
