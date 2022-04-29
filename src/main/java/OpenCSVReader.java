import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.opencsv.CSVReader;
import java.util.List;

// Read CSV file into string array
public class OpenCSVReader {

        private static final String SAMPLE_CSV_FILE_PATH = "C:\\Users\\Renu\\IdeaProjects\\CSVReaderDemo\\src\\main\\resources\\users.csv";

        public static void main(String []args) throws IOException {
            try(
                    Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                    CSVReader openCsvReader = new CSVReader(reader);
            )
                {
                    // Reading records one by one in a string array
                String[] nextRecord;
                while((nextRecord = openCsvReader.readNext()) != null) {
                    System.out.println("Name: "+ nextRecord[0]);
                    System.out.println("Email: "+ nextRecord[1]);
                    System.out.println("Phone: "+ nextRecord[2]);
                    System.out.println("Country: "+ nextRecord[3]);


                    // Read all records at once into a List<String>
                    List<String[]> records = openCsvReader.readAll();
                    for (String[] record : records) {
                        System.out.println("Name: " + record[0]);
                        System.out.println("Email: " + record[1]);
                        System.out.println("Phone: " + record[2]);
                        System.out.println("Country: " + record[3]);
                        System.out.println("---------------------");
                    }
                }
        }
    }
}
