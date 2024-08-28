package ISP;

public interface Door extends TimerClient, SensorClient{
    void lock();
    void unlock();
    void open();
    void close();
}