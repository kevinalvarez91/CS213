class Exercise_2 {
    public static void main (String [] args ){

    String string1 = args[0];
    String string2 = args[1];
    
    if (equal(string1, string2))
    {
        System.out.println(string1+ " and "+string2+ " are the same");
    }
    else 
    {
        System.out.println(string1+ " and "+string2+ " are NOT the same");
    }
    }


    public static boolean equal(String string1, String string2)
    {   //make sure length is equal, not necessary since we assume length will be same
        if (string1.length() != string2.length())
        {
            return false;
        }
        //make sure that the chars of each string are the same
        //just increment up to the string length testing each char
        for (int i = 0; i < string1.length(); i++)
        {
            if (string1.charAt(i) != string2.charAt(i))
            {
                return false;
            }
        }


        return true;
    }



}