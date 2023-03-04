import java.util.Arrays;
import java.util.Objects;


public class ClientList {
    private static int size = ReadFromFile.countLinesOfFile();
    static Client[] clients = new Client[size - 1];

    public Client higestValue() {
        Client clientWithHigestValue = new Client(0,"","","",0);
        for (Client client : clients) {
            if (client.getValue() > clientWithHigestValue.getValue()) {
                clientWithHigestValue = client;
            }
        }
        return clientWithHigestValue;
    }


    public String searchByCountry(String search) {
        boolean a = false;
        StringBuilder list = new StringBuilder();
        for (Client country : clients) {
            if (Objects.equals(country.getCountry(), search)) {
                list.append(country).append("\n");
                a = true;
            }
        }
        if (!a) {
            list = new StringBuilder("Brak klintow");
        }
        return list.toString();
    }

    @Override
    public String toString() {
        return Arrays.toString(clients);
    }
}
