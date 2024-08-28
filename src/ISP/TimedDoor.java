package ISP;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TimedDoor implements Door{
    private boolean isLocked;
    private boolean isOpened;
    private static final int TIME_OUT = 100;

    public TimedDoor(Timer timer) {
        timer.register(TIME_OUT, this);
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
        this.isLocked = true;
    }

    public void proximityCallback() {
        throw new NotImplementedException();
    }
}

//Here you can see interface has more declared functions than the requirement