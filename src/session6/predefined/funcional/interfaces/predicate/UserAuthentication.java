package session6.predefined.funcional.interfaces.predicate;

import java.util.function.Predicate;

public interface UserAuthentication<T>{

    void display(Predicate<T> predicate);
}
