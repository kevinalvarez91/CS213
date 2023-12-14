class Exercise_3{
public static void main(String[] args)
{

    float fahrenheit, result;
    fahrenheit = 98.6f;


    result = (5.0f/9.0f) * (fahrenheit-32.0f);

    System.out.println(result);
    
}
}

/*Question 3
 * The highest operator is () parenthases. Multiplication would have a
 * higher precedence compared to addition. And we can explicit set the order
 * of operations by simply adding (), around things that we want to be done
 * first compared to others. 
 */