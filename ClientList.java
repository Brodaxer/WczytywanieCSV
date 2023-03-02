import java.util.Arrays;

public class ClientList {

    private int size = ReadFromFile.countLinesOfFile();
    private Client[] clients = new Client[size];
    private int count = 0;
    public void addClient( ){
        do {
            clients[count] = ReadFromFile.clientsFromString[count];
            count++;
        }while (count<size);

    }

    @Override
    public String toString() {
        return  Arrays.toString(clients);
    }
}
