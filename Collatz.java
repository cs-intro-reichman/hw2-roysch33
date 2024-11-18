// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int highestSeed = Integer.parseInt(args[0]);
		String mode = args[1];
		int startingSeed = 1;
		int numberOfSteps = 0;
		if (mode.equals("v")){
			for (int i = 0; i < highestSeed; i++ ){
				System.out.print(startingSeed + " " );
				numberOfSteps ++;
				int localSeed = startingSeed;
				if (localSeed == 1){
					// If the current number is even, divide it by 2; otherwise, multiply it by 3 and add 1;
					if (localSeed % 2 == 0 ){
						localSeed = localSeed / 2;
						System.out.print(startingSeed + " " );
						numberOfSteps ++;
					}
					else {
						localSeed = localSeed * 3 + 1;
						System.out.print(localSeed + " " );
						numberOfSteps ++;
					}
				}
				while (localSeed != 1) {
					if (localSeed % 2 == 0 ){
						localSeed = localSeed / 2;
						System.out.print(localSeed + " " );
						numberOfSteps ++;
					}
					else {
						localSeed = localSeed * 3 + 1;
						System.out.print(localSeed + " " );
						numberOfSteps ++;
					}
				}
				System.out.println("(" + numberOfSteps + ")" ); 
				startingSeed ++;
				numberOfSteps = 0;
			}
			System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
		}
		if (mode.equals("c")){
			System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
		}
	}
}
