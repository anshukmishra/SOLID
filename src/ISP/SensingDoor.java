package ISP;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SensingDoor implements Door{
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

    public void timeOutCallback() {
        throw new NotImplementedException();
    }

    public void proximityCallback() {
        this.isOpened = true;
    }

}

//Here you can see interface has more declared functions than the requirement


