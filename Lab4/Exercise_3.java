class Exercise_3 {
//52342345


    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]); // Replace with your input value

        //2
        int minutes1 = input / 60;
        int remender1 = input % 60;
        //3
        int hour1 = input / 3600;
        int remender2 = input % 3600;
        int minutes2 = remender2 / 60;
        //4
        int day1 = input / 86400;
        int remender3 = input % 86400;
        int hour2 = remender3 / 3600;
        remender3 %= 3600;
        int minutes3 = remender3 / 60;
        remender3 %= 60;
        //5
        int year1 = input / 31556952;
        int remender4 = input % 31556952;
        int day4 = remender4 / 86400;




        printTime(input);
        printTime(minutes1, remender1);
        printTime(hour1, minutes2, remender1);
        printTime(day1, hour2, minutes3, remender3);
        printTime(year1, day4, hour2, minutes3, remender3);
        /*printTime(hours, minutes, seconds);
        printTime(days, hours, minutes, seconds);
        printTime(years, days, hours, minutes, seconds);*/
    }

    public static void printTime(int seconds) {
        System.out.println(seconds + " seconds");
    }

    public static void printTime(int minutes, int seconds) {
        System.out.println(minutes + " minutes, " + seconds + " seconds");
    }

    public static void printTime(int hours, int minutes, int seconds) {
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }

    public static void printTime(int days, int hours, int minutes, int seconds) {
        System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }

    public static void printTime(int years, int days, int hours, int minutes, int seconds) {
        System.out.println(years + " years, " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }

}