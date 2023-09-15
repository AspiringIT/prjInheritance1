public class Employee {
    private String EmployeeName= "Not Assigned";
    private String EmployeeNumber = "XXX-L";
    //xxx = number from 0-9 for each x and L = letter from a-m depending on hire date e.g. January = a, December = m
    private String HireDate= "Not Assigned";

    public void setEmployeeName(String name) {
        EmployeeName = name;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeNumber(String number){
        EmployeeNumber = number;
    }

    public String getEmployeeNumber() {
        return EmployeeNumber;
    }

    public void setHireDate(String hireDate) {
        HireDate = hireDate;
    }

    public String getHireDate() {
        return HireDate;
    }
}
