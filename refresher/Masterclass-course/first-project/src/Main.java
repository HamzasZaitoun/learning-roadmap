import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args)  {



//        Login login = new Login();

//        Player player = new Player("Hamza","10%",100);
//        player.printDetails();


//        try {
//            FileInputStream file = new FileInputStream("email.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter username: ");
//        String username=scanner.next();
//        System.out.println("password: ");
//        String password = scanner.next();
////        logiValidation(username,password);


//        User2 user = new User2("Hamza","Hamza@gail.com","079252525",new String[]{"Amman, Jordan","Salalah, Oman"} );
//        System.out.println(user);

//        int[] arr1 = new int[4];
////        int arr2[] = new int[10];
//        arr1[0]=12;
//
//        System.out.println(Arrays.toString(arr1));


//        String text = "Java Mastery Academy";

//
//        Student s1=new Student("Hamza");
//        Student s2=new Student("Hazem");
//        Student s3=new Student("Hakeem");
//
//        StudentGroup group = new StudentGroup(Arrays.asList(s1,s2,s3));
//
//        for(Student student : group)
//        {
//            System.out.println(student.getName());
//        }


//        List<String> arrayList = new ArrayList<String>();
//
//        System.out.println(arrayList.size());

//        LinkedList<String> names = new LinkedList<>();
//        names.add("Hamza");
//        names.add("Hamza");
//        names.add("Hamza");
//        names.add("Hamza");
//        names.add("Hamza");
//        names.add("Hamza");
//        names.add("Hamza");
//        names.add("Hamza");
//        names.add("Hamza");
//        System.out.println(names.get(3));



//        Queue<Integer> pages = new PriorityQueue<>(Collections.reverseOrder());
//        pages.offer(10);
//        pages.offer(13);
//        pages.offer(9);
//        pages.offer(88);
//        System.out.println(pages);

//
//        SortedSet<String> names = new TreeSet<>();
//        names.add("Abd");
//        names.add("Hamzz");
//        names.add("Hamzz");
//        names.add("ASD");
//        var x = names.last();
//        System.out.println(names);


//
//        Map<String,String> map = new Hashtable<>();
//        SortedMap<String,String> map = new TreeMap<>();
//        map.put("username","admin");
//        map.put("password","password");
//        map.put("address","Amman");
//        System.out.println(map);
//        map.put("username","admin2");
//        map.remove("address");
//        System.out.println(map);
//        boolean hasUsername=map.containsKey("username");
//        boolean hasAdderss=map.containsKey("address");
//        System.out.println("has user name: {"+hasUsername + "} has address: {" + hasAdderss +"} ");


    }
    public static void logiValidation(String name, String password) throws userLoginCustomException
    {
        if(!name.equals("admin")||!password.equals("123"))
        {
//            System.out.println("username or password are not valid!");
            throw new userLoginCustomException("user name or password are not correct",ErrorCodes.USERNAME_PASSWORD_ERROR_CODE);
//            return;
        }
        System.out.println("welcome back");
    }
}