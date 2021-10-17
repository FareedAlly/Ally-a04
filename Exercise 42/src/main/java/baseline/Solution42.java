/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Fareed Ally
 */

package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution42
{
    public List<String> readInput(String input) throws IOException
    {
        String temp;

        // Use a filereader to read the file
        FileReader reader = new FileReader(input);

        // Use a filereader to read the file
        BufferedReader readerTwo = new BufferedReader(reader);

        // Create a list
        List<String> info = new ArrayList<>();

        // Use while loop to go through each line and assign it to a string
        while((temp = readerTwo.readLine()) != null)
        {
            // Add those to the list
            String [] lines = temp.split(",");

            String firstName = lines[0];
            String lastName = lines[1];
            String salary = lines[2];

            info.add(firstName);
            info.add(lastName);
            info.add(salary);
        }

        reader.close();

        // Return list
        return info;
    }

    private void output(List<String> info, String outFile) throws IOException
    {
        int i = 0;

        // Use filewriter to write to the output file
        FileWriter writer = new FileWriter(outFile);

        PrintWriter print = new PrintWriter(writer);

        // Print the static header for table
        print.println("Last      First     Salary");
        print.println("--------------------------");

        // Go through the list and print contents
        for(String out : info)
        {
            print.printf("%-10s", out);

            i++;

            if(i%3 == 0)
            {
                print.println();
            }
        }

        // Close filewriter
        writer.close();

        print.flush();
        print.close();
    }

    public static void main(String[] args) throws IOException {
        Solution42 main = new Solution42();

        // Call readInput function and assign the result to a list
        List<String> info = main.readInput("data/exercise42_input.txt");

        // Call output function and create an outFile with the results
        main.output(info, "data/exercise42_output.txt");

        BufferedReader br = new BufferedReader(new FileReader("data/exercise42_output.txt"));

        String line;

        while ((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
    }

}
