class Exercise_1{


    public static int addnum(int a, int b)
    {
        return a + b;
    }
    public static int overload(int a, int b, int c)
    {
       return a + b + c;
    }



    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int sumAB = addnum(a, b);
        int sumABC = overload(a, b, c);

        System.out.println(sumAB);
        System.out.println(sumABC);

    }




}