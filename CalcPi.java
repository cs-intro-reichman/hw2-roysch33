// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int givenNumber = Integer.parseInt(args[0]);
		// Calculate the approximation of pi/4:
		double sum = 0.0;
        for (int i = 0; i < givenNumber; i++) {
            // if i is even:
            if (i % 2 == 0) {
				// getting the number - we need to add 1 divided by the (number * 2) + 1 and adding it to the sum:
                sum += 1.0 / (2 * i + 1);
            }
			// if i is odd: 
			else {
				// getting the number - we need to substract 1 divided by the (number * 2) + 1 and substracting it to the sum:

                sum -= 1.0 / (2 * i + 1);
            }
        }

        // the sum converges to π / 4 - so we multiply by 4 to get the approximation of pi 
        double piApproximated = 4 * sum;

		// using Math.PI to get the pi output:
		System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + piApproximated);	}
}
