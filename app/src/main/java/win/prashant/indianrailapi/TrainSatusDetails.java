package win.prashant.indianrailapi;

public class TrainSatusDetails {
    private int trainnumber;
    private float trainlng;
    private float trainlat;
    private String code;

    public int getTrainnumber() {
        return trainnumber;
    }

    public void setTrainnumber(int trainnumber) {
        this.trainnumber = trainnumber;
    }

    public float getTrainlng() {
        return trainlng;
    }

    public void setTrainlng(float trainlng) {
        this.trainlng = trainlng;
    }

    public float getTrainlat() {
        return trainlat;
    }

    public void setTrainlat(float trainlat) {
        this.trainlat = trainlat;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
