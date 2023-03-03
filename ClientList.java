import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ClientList {
    private double value = 0;

    private static int size = ReadFromFile.countLinesOfFile();
    static Client[] clients = new Client[size - 1];

    public void higestValue() {
        System.out.println("Najbardziej wartosciowy klient to : ");
        for (Client client : clients) {
            if (client.getValue() > value) {
                value = client.getValue();
                System.out.print("\r" + client);
            }
        }
    }

    public void searchByCountry() {
        System.out.println("\nPodaj nazwe kraju z ktorego kliecni cie interesuja: ");
        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();
        System.out.println("Klienci z kraju " + search);
        for (Client country : clients) {
            if (Objects.equals(country.getCountry(), search)) {

                System.out.println(country);
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(clients);
    }
}
