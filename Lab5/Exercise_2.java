class Exercise_2{

    public static void main(String[] args)
    {
        int number = Integer.parseInt(args[0]);

        days(number);

    }

    public static int  days(int input)
    {
        if (input == 2)
        {
            System.out.println("Monday");
        }
        else if (input == 3)
        {
            System.out.println("Tuesday");
        }
        else if (input == 4)
        {
            System.out.println("Wenesday");
        }
        else if (input == 5)
        {
            System.out.println("Thursday");
        }
        else if (input == 6)
        {
            System.out.println("Friday");
        }
        else if (input == 7)
        {
            System.out.println("Saturday");
        }
        else if (input == 1)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Incorrect number of days.");
        }


        return input;
        
    }


}