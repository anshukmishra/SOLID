import srp.*;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(3200, 112000, "Ansh", "XYZ", "Jamui", "India", 11, new int[]{10, 15, 20});
        System.out.println(employee.toHtml());
    }
}