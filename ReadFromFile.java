import java.io.*;

class ReadFromFile {

    public static int countLinesOfFile() {
        int lines = 0;
        File myObj = new File("src/clients.csv");
        try (
                var fileReader = new FileReader(myObj);
                var reader = new BufferedReader(fileReader);
        ) {
            while (reader.readLine() != null) {
                lines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
