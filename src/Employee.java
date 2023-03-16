public class Employee {
    private String fullName;
    private int salary;
    private static int personIdInc = 0;
    private int personId;
    private int departmentId;

    public Employee(String fullName, int salary, int departmentId) {
        this.fullName = fullName;
        this.salary = salary;
        this.departmentId = departmentId;
        this.personId = personIdInc++;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getDepartmentId() {
        return this.departmentId;
    }

    public void setFullName() {
        this.fullName = fullName;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public void setDepartmentId() {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee {" + "Id сотрудника = " + personId + ", ФИО сотрудника = " + fullName  + ", зарплата сотрудника= " + salary + ", отдел сотрудника = " + departmentId + '}';
    }

    public int getPersonId() {
        return this.personId;
    }
}

