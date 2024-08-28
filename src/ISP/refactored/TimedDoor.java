package ISP.refactored;

public class TimedDoor implements Door, TimerClient {
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
}