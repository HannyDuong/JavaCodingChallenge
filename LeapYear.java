public class LeapYear {
    public static int findLeapYear(String str){
        int nextLeapY = 0;
        String [] dates = str.split("/+");
        int year = Integer.parseInt(dates[2]);
        if(checkLeapYear(year)){
            nextLeapY = year + 4;
            if(checkLeapYear(nextLeapY)){
                return nextLeapY;
            }
            else{
                nextLeapY = nextLeapY + 4;
            }  
        }
        
        nextLeapY = caleNextLeap(year);
        if(checkLeapYear(nextLeapY)){
            return nextLeapY;  
        }
        nextLeapY = caleNextLeap(nextLeapY);
    return nextLeapY;
    }

    private static int caleNextLeap(int calYear){
        int leapY = 0;
        if(calYear % 4 == 3){
            leapY = calYear + 1;
            return leapY;
        }
        else if(calYear % 4 == 1){
            leapY = calYear + 3;
            return leapY;
        }
        leapY = calYear + calYear % 4;
        return leapY;
    }


    private static boolean checkLeapYear(int year){
        if((year % 4 == 0 && year % 100 !=0 )|| year % 400 == 0){
            return true;
        }
        else
        return false;


    }
    public static void main(String [] args){
        String input = "02/29/2028";
        int answer = findLeapYear(input);
        System.out.println("The next Leap Year is " +answer);

    }
}
