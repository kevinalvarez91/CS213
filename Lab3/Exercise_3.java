class Exercise_3{

    public static void main(String[] args){


    int input = Integer.parseInt(args[0]);

    int secondspermin = 60;
    int secondsperhr = 3600;
    int secondperday = 86400;
    int secondsperyear = 31536000;



    int years = input / secondsperyear;
    int remandor = input % secondsperyear;

    int days = remandor / secondperday;
    remandor %= secondperday;

    int hours = remandor / secondsperhr;
    remandor %= secondsperhr;

    int minutes = remandor / secondspermin;
    remandor %= secondspermin;


    int seconds = remandor;

        


    System.out.println(years + " years, " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");



    }
}
/*
 * java Excersise_3.java 52342345
 * 1 years, 240 days, 19 hours, 32 minutes, 25 seconds
 */