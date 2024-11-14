public class TimeCalc {
    public static void main(String[] args) {
        // naming all the args:
        // using the charAt command for getting the hours and minutes:
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        // using the given equations for getting the total minutes, total hours, new hours and new minutes:
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60 ;
        int newHours = totalHours % 24 ;
        int newminutes = totalMinutes - (totalHours * 60);
        // if hours is less then 10 we need to add a 0 before:
        if (newHours < 10) {
			// if minues is less then 10 we need to add a 0 before:
			if (newminutes < 10) {
				// using print command to add 0 to the output:
                System.out.print(0);
				System.out.print(newHours + ":" + 0);
                System.out.print(newminutes);
			}
			else {
                System.out.print(0);
				System.out.print(newHours + ":" + newminutes);
			};
        }
        else {
            if (newminutes < 10) {
                System.out.print(newHours + ":" + 0);
				System.out.print(newminutes);
			}
			else {
                // using println command when not adding 0 to the output:
				System.out.println(newHours + ":" + newminutes );
			};
        }
    }
}
