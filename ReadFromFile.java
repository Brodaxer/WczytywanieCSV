import java.io.*;
import java.util.Objects;

class ReadFromFile {

    static int lines = 0;
    private int count = 0;
    private String[] client;


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
    public ClientList crateList() {

        File myObj = new File("src/clients.csv");
        try (
                var fileReader = new FileReader(myObj);
                var reader = new BufferedReader(fileReader);
        ) {
            String line = null;
            while ((line = reader.readLine()) != null) {

                client = line.split(",");
                if (Objects.equals(client[0], "id")){
                    continue;
                }
                ClientList.clients[count] = readAndCreatClient();
                count++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ClientList();
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
