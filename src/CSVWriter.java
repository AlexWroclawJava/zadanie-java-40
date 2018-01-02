import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {

    void write(List<WeatherInfo> weatherInfos) throws IOException{

        FileWriter fileWriter = new FileWriter("C:\\IdeaProjects\\zadanie-java-40\\src\\cities2.txt");
        BufferedWriter bfw = new BufferedWriter(fileWriter);

        for (WeatherInfo weatherInfo : weatherInfos) {
            bfw.write(weatherInfo.toCSV());
            bfw.write("\n");
        }
        bfw.close();
    }
}
