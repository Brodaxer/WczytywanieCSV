import java.util.Arrays;
import java.util.Objects;


public class ClientList {
    private static int size = ReadFromFile.countLinesOfFile();
    static Client[] clients = new Client[size - 1];

    public Client higestValue() {
        double value = 0;
        for (Client client : clients) {
            if (client.getValue() > value) {
                value = client.getValue();
            }
        }
        for (Client client : clients){
            if (client.getValue()==value){
                return client;
            }
        }return null;
    }

    public String searchByCountry(String search) {
        StringBuilder list = new StringBuilder();
        for (Client country : clients) {
            if (Objects.equals(country.getCountry(), search)) {
                list.append(country).append("\n");
            }
        }return list.toString();
    }

    @Override
    public String toString() {
        return Arrays.toString(clients);
    }
}
