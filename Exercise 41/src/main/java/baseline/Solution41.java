/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Fareed Ally
 */

package baseline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Solution41
{
    public List<String> readNames(String input) throws IOException
    {
        List<String> names = new ArrayList<>();

        // Open input file
        try(Scanner inFile = new Scanner(Paths.get(input)))
        {
            while (inFile.hasNext()) {
                // Add the first and last names to a list
                names.add(inFile.next() + " " + inFile.next() + "\r");
            }
        }

        // Return list
        return names;
    }

    private void sort(List<String> names)
    {
        try {
            // Compare two names at a time alphabetically
            for (int i = 0; i < names.size(); i++) {
                for (int j = 0; j < names.size()-i-1; j++) {
                    // If second name is earlier than first, swap them
                    if (names.get(j).compareTo(names.get(j + 1)) > 0) {
                        // Keep doing this until every name is sorted
                        Collections.swap(names, j, j + 1);
                    }
                }

            }
        } catch(IndexOutOfBoundsException indexOutOfBoundsException)
        {
            System.out.println("Error try again.");
        }
    }

    private String output(List<String> names)
    {
        StringBuilder sortedNames = new StringBuilder();

        // Call sort function on list
        sort(names);

        // Add the static print statements using stringbuilder
        sortedNames.append("Total of ").append(names.size()).append(" names\r-----------------\r");

        // Send the newly ordered names to the list
        for(String temp : names)
        {
            sortedNames.append(temp);
        }

        // Return String
        return sortedNames.toString();
    }

    private void sendOutputToFile(String output) throws IOException
    {
        // Open output file
        try (Formatter outFile = new Formatter("data/exercise41_output.txt")) {
            // Print output string to output file
            outFile.format(output);
        }
    }

    public static void main(String[] args) throws IOException
    {
        Solution41 main = new Solution41();

        // Create list of names from input file
        List<String>names = main.readNames("data/exercise41_input.txt");

        // Create output string by calling the functions
        String out = main.output(names);

        // Print output string to output file
        main.sendOutputToFile(out);

    }

}
