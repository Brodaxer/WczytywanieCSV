import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ClientList test = new ClientList();
        ReadFromFile test1 = new ReadFromFile();
        test1.crateList();
        System.out.print("Najbardziej wartosciowy klient to : ");
        System.out.println(test.higestValue());
        System.out.println("Podaj nazwe kraju z ktorego kliecni cie interesuja: ");
        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();
        System.out.println("Klienci z kraju " + search);
        test.searchByCountry(search);
//        test.run();
    }
}
