import java.util.*;

public class Main2 {
    public static void main(String[] args) {
//        Map<String,String> map = new Hashtable<>();

        List<User> users = new ArrayList<>();
        users.add(new User("ABD",30));
        users.add(new User("AHD",23));
        users.add(new User("AHD",33));
        users.add(new User("AHD",53));
        System.out.println(users);
        Collections.sort(users);
        System.out.println(users);

    }
}
