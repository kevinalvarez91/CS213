class Exercise_1{

     public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        

        double [] logarithm = new double[100];

        for (int j = 1; j <= n && j <= 100; j++)
        {
            logarithm[j - 1] = Math.log(j);
        }

        for (int i = 0; i < logarithm.length; i++)
        {
            if (i < n)
            {
                System.out.println(logarithm[i]);
            }
            else{
                break;
            }
        }


    }


}