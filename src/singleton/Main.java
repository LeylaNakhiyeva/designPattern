package singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Singleton password= Singleton.getInstance("abcd12");
Singleton password1= Singleton.getInstance("snnb");
Singleton password2= Singleton.getInstance("d9uj");
        System.out.println(password.password);
        System.out.println(password1.password);
        System.out.println(password2.password);
    }
}