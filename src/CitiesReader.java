import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CitiesReader {

    public static List<String> load() throws IOException {
        File file = new File("C:\\IdeaProjects\\zadanie-java-40\\src\\cities.txt");
        Scanner scanner = new Scanner(file);
        List<String> weatherInfo = new ArrayList<>();
        while (scanner.hasNextLine()) {
            weatherInfo.add(scanner.nextLine());
        }
        return weatherInfo;
    }


    public String write(String zmienna) throws IOException {


        FileWriter fileWriter = new FileWriter("C:\\IdeaProjects\\zadanie-java-40\\src\\cities2.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);

        Scanner scanner = new Scanner(System.in);
        List<String> weatherInfo2 = new ArrayList<>();
        String zapis = scanner.nextLine();
        while (scanner.hasNextLine()) {
            weatherInfo2.add(scanner.nextLine());
            writer.write(scanner.nextLine());
        } return zapis;

    }
}



