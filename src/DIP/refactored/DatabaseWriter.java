package DIP.refactored;

public class DatabaseWriter implements Writer{
    MyDatabase database;
    DatabaseWriter(){
        MyDatabase database = new MyDatabase();
        this.database=database;
    }
    @Override
    public void write(String line) {
        database.write(line);
    }
}
