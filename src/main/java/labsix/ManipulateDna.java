package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/** A javadoc comment for your reading pleasure.
  * Info is the same as the assignment.
  **/

public class ManipulateDna {

  /** Here's a concept:
    * These are kind of unnecessary.
    **/

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Till Lattke " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dnainput = scanner.nextLine();
    String dnaoriginal = dnainput.toUpperCase();
    System.out.println("The DNA string worked with will be: " + dnaoriginal);
    // Step Two: Compute the complement of the DNA String
    String dnac = dnainput.replace('a', 'T').replace('t', 'A').replace('g', 'C').replace('c', 'G');
    System.out.println("The complementary string is: " + dnac);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random randomgen = new Random();
    int randGene = randomgen.nextInt(4);
    char addition = dnac.charAt(randGene);
    String dnaadd = (addition + "" + dnac);
    System.out.println("Inserting " + addition + " at position 0 gives "
        + dnaadd); 
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int replacedef = randomgen.nextInt(4);
    char removable = dnaadd.charAt(replacedef);
    // Test: String dnasub = dnaadd.replace(removable, 'P');
    String seg1 = dnaadd.substring(0, replacedef);
    String seg2 = dnaadd.substring((replacedef + 1), 5);
    String dnasub = (seg1 + "" + seg2);
    System.out.println("Deleting position " + replacedef + " gives "
        + dnasub);
    // Change a rand position in the DNA String to a randomly chosen DNA letter
    int randomgenereplacement = randomgen.nextInt(4);
    int rdeff = randomgen.nextInt(4);
    char randomreplacement = dnaoriginal.charAt(randomgenereplacement);
    String dnamutie = dnasub.replace((dnasub.charAt(rdeff)), randomreplacement);
    System.out.println("Replacing position " + rdeff + " with "
        + randomgenereplacement + " gives " + dnamutie);
    // Step Six: Display a final thankyou message
    System.out.println("Thanks for using ManipulateDNA. \nHave a day.");
  }

}
