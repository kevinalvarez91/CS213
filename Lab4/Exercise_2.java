class Exercise_2 {
    
    
    public static double surfaceArea(double radius, double height) {
        double surfaceArea, pi;
        pi = 3.14159;

        surfaceArea = (2.0*pi*radius)*(radius+height);

        return surfaceArea;


    }

    public static void main(String[] args) {

        double radius = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        System.out.println(surfaceArea(radius, height));
    }


}