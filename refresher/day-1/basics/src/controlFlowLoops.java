public class controlFlowLoops {
    public static void control()
    {

        // if-else
        int age = 18;
        if (age < 18) {
            System.out.println("Minor");
        } else if (age == 18) {
            System.out.println("Just became an adult!");
        } else {
            System.out.println("Adult");
        }

        // classic switch
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day");
        }



        // enhanced switch (Java 14+)
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid";
        };
        System.out.println(result);

    }



    public static void loops()
    {

        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // while loop
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // do while
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        // break/continue
        for (int ik = 1; ik <= 10; ik++) {
            if (ik == 5) break;      // exits loop completely
            if (ik % 2 == 0) continue; // skips even numbers
            System.out.println(ik);
        }


        // nested loop

        for (int ioo = 1; ioo <= 3; ioo++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(ioo * j + " ");
            }
            System.out.println();
        }

        // foreach loop
        int[] nums = {1, 2, 3};
        for (int n : nums) {
            System.out.println(n);
        }

    }
}
