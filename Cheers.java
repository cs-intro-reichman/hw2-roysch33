// Prints a crowd cheering output.

//import java.util.ArrayList;

public class Cheers {
        public static void main(String[] args) {
                // naming the args and converting all the letter to uppercase:
                String name = (args[0].toUpperCase());
                int numberOfTimes = Integer.parseInt(args[1]);
                // setting a boolean so we can determ if its in the letter list:
                boolean didIAddedIt = false;
                // the given letter list we need to compare:
                String lettersList = "AEFHILMNORSX";

                // making a loop of the given name so we can compare each letter:
                for (int i = 0; i < name.length(); i++ ){
                        // making a loop for the given letterList:
                        for (int a = 0; a < lettersList.length(); a++) {
                                char letter = name.charAt(i);
                                char specialLetter = lettersList.charAt(a);
                                // if the letters are the same - we can change the boolean to true and println:
                                if (letter == specialLetter){
                                        didIAddedIt = true;
                                        System.out.println("Give me an " + letter + ": " +  letter + "!" );
                                       
                                }
                        }
                        // if the letter in the name wasn't in the nameList:
                        if (didIAddedIt == false){
                                System.out.println("Give me a " + name.charAt(i) + ": " +  name.charAt(i) + "!" );
                        }
                        // converting the boolean back to false for a new loop:
                        didIAddedIt = false;
                        
                }
                System.out.println("What does that spell?");
                // making a loop of the given number of times we want to print the name and printing the name:
                for (int i = 0; i < numberOfTimes; i++ ){
                        System.out.println(name + "!!!");
                }
        }
 }