import java.util.List;

public class Main5 {
    public static void main(String[] args) {

//       Utils.printArray(new String[]{"abd","hamza","Hamed"});
//        Utils.printArray(new Integer[]{1,2,15});
//
//
//        String name = Utils.get("Add");
//        Integer num = Utils.get(435345);
//        System.out.println(name);
//        System.out.println(num);
//
//



        Utils<String> names = new Utils<>();
        names.add("Hamza");
        names.add("ahmad");
        names.add("ibrahem");
        System.out.println(names.getNames());

    }

    public static <T extends Number> void getNum(T num)
    {
        System.out.println(num);
    }
    public static void getNum(List<? extends Payment> num)
    {
        System.out.println(num);
    }

}
