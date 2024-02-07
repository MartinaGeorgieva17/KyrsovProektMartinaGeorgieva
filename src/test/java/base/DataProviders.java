package base;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.openqa.selenium.devtools.v85.io.IO;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DataProviders {
    @DataProvider(name = "items list")  // Data provider for items list
    public Object[][] getItems(){
        return new Object[][]{
                {"fleece-jacket"},
                {"onesie"}
        };
    }

    @DataProvider(name = "wrongUsers") // Data provider for wrong users
    public Object[][] readWrongUsers(){
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/wrongUsers.csv"));
            // Read data from CSV file
            List<String[]> csvData = csvReader.readAll(); //Reads all data from the CSV file and stores it in a list of string arrays.
            Object[][] csvDataObj = new Object[csvData.size()][2];
            //initializes a two-dimensional object array to hold the CSV data.
            // Each row represents a set of parameters for a test case, and each column represents a parameter.

            // Convert CSV data to Object array
            for(int i = 0; i < csvData.size(); i++){
                csvDataObj[i] = csvData.get(i);
            }

            return csvDataObj;

        } catch (IOException e) {
            System.out.println(e);
            return null;
            // Handle IOException: If an IOException occurs during the file reading process,
            // it is caught here. The exception is printed to the console for debugging purposes,
            // and null is returned as the result of the data provider method.

            // Handle CsvException
        } catch (CsvException e) {
            System.out.println(e); // Print the CsvException to the console
            return null; // Return null in case of CsvException
        }
    }
}
