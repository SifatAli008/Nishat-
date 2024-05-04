import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SumValuesFromFile {

    public static void main(String[] args) {
        // Specify the input and output file paths
        String inputFilePath = "Input.txt";
        String outputFilePath = "Output.txt";

        try {
            // Create a Scanner to read from the input file
            Scanner inputScanner = new Scanner(new File(inputFilePath));

            // Create a PrintWriter to write to the output file
            PrintWriter outputWriter = new PrintWriter(outputFilePath);

            // Process each line in the input file
            while (inputScanner.hasNextLine()) {
                // Read the current line
                String line = inputScanner.nextLine();

                // Calculate the sum of numeric values in the line
                int sum = 0;
                Scanner lineScanner = new Scanner(line);
                while (lineScanner.hasNext()) {
                    if (lineScanner.hasNextInt()) {
                        sum += lineScanner.nextInt();
                    } else {
                        lineScanner.next(); // Skip non-integer tokens
                    }
                }

                // Write the sum to the output file
                outputWriter.println(sum);

                // Close the line scanner
                lineScanner.close();
            }

            // Close the input scanner and output writer
            inputScanner.close();
            outputWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
