public class Main {
    private static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public static int printAllSalaryEmployees(Employee[] employees) {
        int allSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            allSalaries = allSalaries + employees[i].getSalary();
        }
        return allSalaries;
    }
    public static Employee findPerson(Employee[] employees, String condition){
        Employee person  = employees[0];
        int employeeSalary = employees[0].getSalary();


        for (int i = 0; i < employees.length; i++) {
            if (condition.equals("min") && (employees[i].getSalary() < employeeSalary)) {
                employeeSalary = employees[i].getSalary();
                person = employees[i];
            }
            if (condition.equals("max") && (employees[i].getSalary() > employeeSalary)) {
                employeeSalary = employees[i].getSalary();
                person = employees[i];
            }
        }
        return person;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];


        employees[0] = new Employee("Громов Рубен Рудольфович", 70000, 4);
        employees[1] = new Employee("Ковалёв Бенедикт Вячеславович", 80000, 3);
        employees[2] = new Employee("Полдолин Вадим Аркадьевич", 900000, 2);
        employees[3] = new Employee("Осипов Витольд Вячеславович", 50000, 1);
        employees[4] = new Employee("Пахомов Клемент Сергеевич", 55000, 5);
        employees[5] = new Employee("Маркова Ника Феликсовна", 50000, 1);
        employees[6] = new Employee("Кошелева Нинна Мэлсовна", 60000, 5);
        employees[7] = new Employee("Емельянова Лили Владимировна", 53000, 2);
        employees[8] = new Employee("Суханова Дэнна Тимуровна", 60000, 3);
        employees[9] = new Employee("Иванова Лунара Михайловна", 52000, 4);




        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println();

        System.out.println( "Сумма всех затрат "+ printAllSalaryEmployees(employees));

        System.out.println();

        System.out.println(findPerson(employees,"max"));
        System.out.println(findPerson(employees,"min"));

        System.out.println("Средняя зарплата " + (float) printAllSalaryEmployees(employees) / employees.length);

        System.out.println();

        printAllEmployees(employees);

    }
}
