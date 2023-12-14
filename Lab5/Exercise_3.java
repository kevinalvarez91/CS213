class Exercise_3
{

public static void main(String[] args)
{

    int input1 = Integer.parseInt(args[0]);
    int input2 = Integer.parseInt(args[1]);
    int input3 = Integer.parseInt(args[2]);

    int biggest = largerst(input1, input2, input3);
    System.out.println("The greatest: " + biggest);

}



public static int largerst(int a, int b, int c)
{
    int largest = a;

    if (b > largest)
    {
        largest = b;
    }
    if ( c > largest)
    {
        largest = c;
    }


    return largest;
}



}