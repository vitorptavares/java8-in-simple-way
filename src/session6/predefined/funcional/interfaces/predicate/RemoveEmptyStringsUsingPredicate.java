package session6.predefined.funcional.interfaces.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
PRogram to remove empty string from given list
 */
public class RemoveEmptyStringsUsingPredicate {

    String [] names = {"Dunga", "", "Ravi", "Vitor", "", null};

    Predicate<String> isNotEmpty = s ->s !=null &&  !s.isEmpty();

    public List<String> removeEmptyStringAndNullFromList(){
        List<String> auxNames = new ArrayList<>();
        for (int i = 0 ; i < names.length ; i++){
            if(isNotEmpty.test(names[i])){
                auxNames.add(names[i]);
            }
        }
        return auxNames;
    }

    public static void main(String[] args) {
        RemoveEmptyStringsUsingPredicate removeEmptyStringsUsingPredicate = new RemoveEmptyStringsUsingPredicate();
        List<String> strings = removeEmptyStringsUsingPredicate.removeEmptyStringAndNullFromList();
        System.out.println(strings);
    }
}
