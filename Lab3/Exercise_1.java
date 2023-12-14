class Exercise_1{
    public static void main(String[] args)
    {
        double pi = 3.14159;
        double surface_area, radius, height;
        radius = Double.parseDouble(args[0]);
        height = Double.parseDouble(args[1]);
        surface_area = (2.0*pi*radius)*(radius+height);

        System.out.println(surface_area);



    }

}

/*
 * jave Excerise_1.java 3.1 2.4 
 * Output: 107.128219
 * 
 * 
 */