class Exercise_1{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);


        int i = 1;
        long result = 1;



        while (i <= n){
            result *= i;

            i++;

        }
        System.out.println(result);
    }




}