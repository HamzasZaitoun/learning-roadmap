public class bigo {

    // big o (1)
    public void log(int[] numbers)
    {
        System.out.println(numbers[0]); // o(1)
    }

    /// ///////////////////////////////////////////////////////////////
    ///
    ///
    ///
    //  big o(n)   linear
    public void log2(int[] numbers, String[] names)
    {

        for (int i=0; i<numbers.length;i++)
        {
            System.out.println(numbers[i]); // o(n)
        }

        // big O(n+m) --> big o (n)
        for (int i=0; i<names.length;i++)
        {
            System.out.println(names[i]); // o(m)
        }

    }
    /// ///////////////////////////////////////////////////////////////
    ///
    ///
    ///
    // big o(n^2)   quadratic
    public void log3(int[] numbers)
    {
        for (int i=0; i<numbers.length;i++)  // o(n)
        {                                    // *
            for (int j=0; j<numbers.length;j++) // o(n)
            {
                System.out.println("S");
            }
        }
    }
    ///  ///////////////////////
    ///
    ///
    ///
    // space complexity
    public void greet(String[] names)
    {

        // o(1)
        for (int i = 0; i < names.length ; i++) {
            System.out.println("Hi");
        }

        // o(n)
        String[] copy =new String[names.length];


    }



}
