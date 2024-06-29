public class NumberToDayOfWeek {

public static String getDayOfWeek(int day){
    switch(day){
        case 1:
        return "Monday";
        case 2: 
        return "Tuesday";
        case 3:
        return "Wednesday";
        case 4:
        return "Thursday";
        case 5:
        return "Friday";
        case 6:
        return "Saturday";
        case 7:
        return "Sunday";
         default:
         return "Invalid Day";
    } 
}

public static void main(String[] args){
    int[] days = {1,2,3,4,5,6,7,8,0};

    for (int day:days){
        String dayOfWeek = getDayOfWeek(day);
        System.out.println("Day number: " + day + "-> Day of the week:" + dayOfWeek);
    }
}
}