package srp.refactored;

class LeaveInfo{
    private static int TOTAL_LEAVES_ALLOWED = 30;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int yearsInOrg;
    private int[] leavesLeftPreviously;

    LeaveInfo(){
        leavesTaken=0;
        totalLeaveAllowed = TOTAL_LEAVES_ALLOWED;
        yearsInOrg = 0;
        leavesLeftPreviously = new int[0];
    }

    LeaveInfo(int leavesTaken, int[] leavesLeftPreviously){
        this.leavesTaken=leavesTaken;
        totalLeaveAllowed = TOTAL_LEAVES_ALLOWED;
        this.yearsInOrg = leavesLeftPreviously.length;
        this.leavesLeftPreviously = leavesLeftPreviously;
    }

    LeaveInfo(int leavesTaken, int[] leavesLeftPreviously, int totalLeaveAllowed){
        this.leavesTaken=leavesTaken;
        this.totalLeaveAllowed = totalLeaveAllowed;
        this.yearsInOrg = leavesLeftPreviously.length;
        this.leavesLeftPreviously = leavesLeftPreviously;
    }

    public static int getTotalLeavesAllowed() {
        return TOTAL_LEAVES_ALLOWED;
    }

    public static void setTotalLeavesAllowed(int totalLeavesAllowed) {
        TOTAL_LEAVES_ALLOWED = totalLeavesAllowed;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }

    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }

    public void setTotalLeaveAllowed(int totalLeaveAllowed) {
        this.totalLeaveAllowed = totalLeaveAllowed;
    }

    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public void setYearsInOrg(int yearsInOrg) {
        this.yearsInOrg = yearsInOrg;
    }

    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }

    public void setLeavesLeftPreviously(int[] leavesLeftPreviously) {
        this.leavesLeftPreviously = leavesLeftPreviously;
    }
};

class Address{
    private String addressStreet;
    private String addressCity;
    private String addressCountry;

    Address() {
        addressCountry = "India(Default)";
        addressCity = "Bihar(Default)";
    }

    Address(String addressStreet,String addressCity,String addressCountry){
        this.addressCountry=addressCountry;
        this.addressCity=addressCity;
        this.addressStreet=addressStreet;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }
};

class OutputFormat{
    public String toHtml(RefactoredEmployee emp) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + emp.getEmpId() + "'>" +
                "<span>" + emp.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (emp.getLeaveInfo().getTotalLeaveAllowed()  - emp.getLeaveInfo().getLeavesTaken()) + "</span>";
        str += "<span>" + Math.round(emp.getMonthlySalary() * 12) + "</span>";
        if (emp.getManager() != null) str += "<span>" + emp.getManager() + "</span>";
        else str += "<span>None</span>";

        str += "<span>" + emp.getLeaveInfo().getLeavesTaken() + "</span>";
        return str + "</div> </div>";
    }
}

public class RefactoredEmployee {
    private int empId;
    private LeaveInfo leaveInfo;
    private double monthlySalary;
    private String name;
    private Address address;
    private String manager;

    public RefactoredEmployee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.setLeaveInfo(new LeaveInfo(leavesTaken, leavesLeftPreviously));
        this.setAddress(new Address(addressStreet, addressCity, addressCountry));
        this.setEmpId(empId);
        this.setMonthlySalary(monthlySalary);
        this.setName(name);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public LeaveInfo getLeaveInfo() {
        return leaveInfo;
    }

    public void setLeaveInfo(LeaveInfo leaveInfo) {
        this.leaveInfo = leaveInfo;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }


    public static void main(String []args){
        RefactoredEmployee rEmployee = new RefactoredEmployee(3200, 112000, "Ansh", "XYZ", "Jamui", "India", 11, new int[]{10, 15, 20});
        OutputFormat outputFormat = new OutputFormat();
        String out = outputFormat.toHtml(rEmployee);
        System.out.println(out);
    }
};
