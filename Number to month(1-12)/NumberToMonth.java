

public class NumberToMonth {
    public static String getMonthName(int month){
        switch (month) {
            case 1:
            return "January";
            case 2:
            return "Febuary";
            case 3:
            return "March";
            case 4:
            return "April";
            case 5:
            return "May";
            case 6:
            return "June";
            case 7:
            return "July";
            case 8:
            return "August";
            case 9:
            return "September";
            case 10:
            return "October";
            case 11:
            return"November";
            case 12:
            return "December";
        
            default:
                return "Invalid month";
        }
    }

    public static int getDaysInMonth(int month, int year){
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
            return 30;
            case 2:
            if((year % 4 == 0 && year % 100 !=0)||(year % 400 == 0)) {
                return 29;
            }  else{
                return 28;
            }  
             default:
                return -1;
        }
    }

    public static void main(String[] args) {
        int[] months = {1, 2, 4, 6, 11, 13};
        int year = 2024;

        for (int month : months) {
            String monthName = getMonthName(month);
            int days = getDaysInMonth(month, year);

            if (days != -1) {
                System.out.println("Month: " + monthName + " -> Days: " + days);
            } else {
                System.out.println("Invalid month: " + month);
            }
        }
    }

    }
    
