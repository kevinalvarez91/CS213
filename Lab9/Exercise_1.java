
//main
class Exercise_1 {
public static void main(String[] args) {

if (args.length != 1 )
{
    System.out.println("Invalid Input");
    return;
}

int input = Integer.parseInt(args[0]);

Seconds s1 = new Seconds(input);

s1.print_Time();

}

}



//class seconds
class Seconds {
private int input;
//constructor
public Seconds (int input)
{
    this.input = input;
}
//getter
public int getSeconds()
{
    return input;
}
//function to print time 
public void print_Time()
{

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




 System.out.println(year1 + " years, " + day4 + " days, " + hour2 + " hours, " + minutes3 + " minutes, " + remender3 + " seconds");
}

}