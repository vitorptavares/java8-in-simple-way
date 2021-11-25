package session6.predefined.funcional.interfaces.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthenticationUsingPredicate {

    Predicate<User> p = user -> user.username.equals("vitor") && user.pwd.equals("java");
    Scanner sc = new Scanner(System.in);
    public void validate(){
        System.out.println("Enter username");
        String username = sc.next();
        System.out.println("Enter password");
        String password = sc.next();

        User user = new User(username, password);

        if(p.test(user)){
            System.out.println("Valid user");
        }else
            System.out.println("Invalid user");


    }

    class User{
        String username;
        String pwd;

        User(String username, String pwd){
        this.username = username;
        this.pwd = pwd;
        }
    }

    public static void main(String[] args) {
        UserAuthenticationUsingPredicate userAuthenticationUsingPredicate = new UserAuthenticationUsingPredicate();
        userAuthenticationUsingPredicate.validate();
    }
}
