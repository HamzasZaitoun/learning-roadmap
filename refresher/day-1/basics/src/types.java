public class types {

    // can't be used as field varibale, or method prameter, or uninitilized vars!
   //     var hi =12;

    public static void show()
   {
       byte x=1;
       short y =2;
       int z =3;
       long c = 5;
       float q=3.45F;
       double d=342D;
       char a = 's';
       boolean r = true;
       Integer xx = Integer.valueOf(10);
       var b =19;
       var hi ="Hello There!!";

       System.out.println(x);



       double k = 9.78;
       int i = (int) d; // narrowing cast
   }
   public static void TypesDemo()
   {
       int x = 42;
       Integer y = x;       // autoboxing
       int z = y;           // unboxing
       System.out.println(x == z); // true
   }
}
