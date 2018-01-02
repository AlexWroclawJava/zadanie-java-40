import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class WeatherTest {

    public static void main(String[] args) throws Exception {

        WeatherApi weatherApi = new WeatherApi();

        List<String> cities = CitiesReader.load();
        List<WeatherInfo> weatherInfos = new ArrayList<>();

        System.out.println("Aktualna pogoda dla miast: ");
        for (String city : cities) {
            String description = weatherApi.getDescription(city);
            int temperature = weatherApi.getTemperature(city);

            WeatherInfo weatherInfo = new WeatherInfo(city, description, temperature);
            weatherInfos.add(weatherInfo);
            String odczyt = city + ": "+  weatherApi.getDescription(city) + ", temperatura: " + weatherApi.getTemperature(city);
            System.out.println(odczyt);
        }

        CSVWriter csvWriter = new CSVWriter();
        csvWriter.write(weatherInfos);
    }

}
