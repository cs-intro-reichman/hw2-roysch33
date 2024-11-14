// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    // Replace this comment with your code
		int timesRandom = Integer.parseInt(args[0]);
		int lessThenHalf = 0;
		int moreThenHalf = 0;

		for (int i = 0; i < timesRandom; i++ ){
			double randomNumber = (Math.random() );
			if (randomNumber > 0.5){
				moreThenHalf++; 
			}
			else {
				lessThenHalf++;
			}
		}
		System.out.println("> 0.5: " + moreThenHalf + " times" );
		System.out.println("<= 0.5: " + lessThenHalf + " times" );
	}
}
