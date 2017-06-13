import java.io.FileWriter;
import java.util.List;

public class CSVUtil {

    private FileWriter      writer;
    private static CSVUtil  instance;

    private CSVUtil() throws Exception {

        String csvFile = "tmp/data.csv";
        writer = new FileWriter(csvFile);

        System.out.println("\n-- data.csv created");
    }

    public static CSVUtil getInstance() throws Exception {

        return instance = new CSVUtil();
    }

    public void write(List<Locations> locations) throws Exception {

        String fileHeader = "advertiser_id,latitude,longitude,horizontal_accuracy,timestamp";
        writer.append(fileHeader.toString() + "\n\n");

        for (Locations l: locations) {

            writer.append(l.getAdvertiser_id());
            writer.append(",");
            writer.append("" + l.getLatitude() + "");
            writer.append(",");
            writer.append("" + l.getLongitude() + "");
            writer.append(",");
            writer.append("" + l.getHorizontal_accuracy() + "");
            writer.append(",");
            writer.append(l.getTimestamp());
            writer.append("\n");
        }

        System.out.println("\n-- " + locations.size() + " lines writed in data.csv");

        writer.flush();
        writer.close();
    }
}