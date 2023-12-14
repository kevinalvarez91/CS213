class Exercise_1 {
    public static void main(String[] args){

        double value = Double.parseDouble(args[0]);

        if (value > 0 )
        {
            System.out.println(value + " is positive");
        }
        else if (value < 0 )
        {
            System.out.println(value + " is negative");
        }
        else if (value == 0)
        {
            System.out.println(value + " is zero");
        }
    }



}