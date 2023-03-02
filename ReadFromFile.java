import java.io.*;

class ReadFromFile {
    private String[] client ;
    static int lines = 0;
    private int count = 0;
    public static Client[] clientsFromString = new Client[lines];
    public static int  countLinesOfFile() {

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
    public void readList() {

        File myObj = new File("src/clients.csv");
        try (
                var fileReader = new FileReader(myObj);
                var reader = new BufferedReader(fileReader);
        ) {
            while (reader.readLine() != null) {
                String line = reader.readLine();
                String [] client = line.split(",");
                clientsFromString[count] = readAndCreatClient();
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private Client readAndCreatClient (){
        int id = Integer.parseInt(client[0]);
        String firstName = client[1];
        String lastName = client[2];
        String country = client[3];
        double value =Double.parseDouble(client[4]);
        return new Client(id,firstName,lastName,country,value);
    }
}
