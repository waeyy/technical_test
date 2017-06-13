import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        MysqlConnect db = MysqlConnect.getInstance();

        List<Locations> locations = new ArrayList<>();

        try {

            ResultSet result = db.query("SELECT * FROM location WHERE stimestamp >= '2017-05-1 00:00:00' AND stimestamp <= '2017-05-1 23:59:59'");
            ResultSetMetaData resultMeta = result.getMetaData();

            while(result.next()){

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String date  = dateFormat.format(result.getTimestamp("stimestamp"));

                locations.add(new Locations(result.getString("advertiser_id"), result.getDouble("latitude"), result.getDouble("longitude"), result.getDouble("horizontal_accuracy"), date));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("\n**********************************");

        CSVUtil csv = CSVUtil.getInstance();
        csv.write(locations);

        System.out.println("\n**********************************");

    }
}
