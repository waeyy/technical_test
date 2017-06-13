public class Locations {

    private String    advertiser_id;
    private double    latitude;
    private double    longitude;
    private double    horizontal_accuracy;
    private String    timestamp;

    /**
     * Public constructor
     *
     * @param advertiser_id String
     * @param latitude double
     * @param longitude double
     * @param horizontal_accuracy double
     * @param timestamp String
     */
    public Locations(String advertiser_id, double latitude, double longitude, double horizontal_accuracy, String timestamp) {

        this.advertiser_id = advertiser_id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.horizontal_accuracy = horizontal_accuracy;
        this.timestamp = timestamp;
    }

    /**
     * Setter
     *
     * @param advertiser_id String
     */
    public void setAdvertiser_id(String advertiser_id) {
        this.advertiser_id = advertiser_id;
    }

    /**
     * Setter
     *
     * @param latitude double
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Setter
     *
     * @param longitude double
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Setter
     *
     * @param horizontal_accuracy double
     */
    public void setHorizontal_accuracy(double horizontal_accuracy) {
        this.horizontal_accuracy = horizontal_accuracy;
    }

    /**
     * Setter
     *
     * @param timestamp String
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter
     *
     * @return String
     */
    public String getAdvertiser_id() {
        return advertiser_id;
    }

    /**
     * Getter
     *
     * @return double
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Getter
     *
     * @return double
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Getter
     *
     * @return double
     */
    public double getHorizontal_accuracy() {
        return horizontal_accuracy;
    }

    /**
     * Getter
     *
     * @return String
     */
    public String getTimestamp() {
        return timestamp;
    }
}
