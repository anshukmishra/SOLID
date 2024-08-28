package ISP.refactored;

public class SensingDoor implements Door, SensorClient {
    private boolean isLocked;
    private boolean isOpened;

    public SensingDoor(Sensor sensor) {
        sensor.register(this);
    }

    public void lock() {
        this.isLocked = true;
    }

    public void unlock() {
        this.isLocked = false;
    }

    public void open() {
        if (!isLocked)
            this.isOpened = true;
    }

    public void close() {
        this.isOpened = false;
    }

    public void proximityCallback() {
        this.isOpened = true;
    }

}
