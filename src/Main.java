public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        int allSalaries = 0;
        int minSalaryId = 0;
        int maxSalaryId = 0;

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

        int minimalEmployeeSalary = employees[0].getSalary();
        int maximumEmployeeSalary = employees[0].getSalary();

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println();

        for (int i = 0; i < employees.length; i++) {
            allSalaries = allSalaries + employees[i].getSalary();
        }
        System.out.println("Сумма всех затрат за месяц: " + allSalaries);
        System.out.println();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minimalEmployeeSalary) {
                minimalEmployeeSalary = employees[i].getSalary();
                minSalaryId = employees[i].getPersonId();
            }
            if (employees[i].getSalary() > maximumEmployeeSalary) {
                maximumEmployeeSalary = employees[i].getSalary();
                maxSalaryId = employees[i].getPersonId();
            }
        }

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getPersonId() == maxSalaryId) {
                System.out.println("Максимальная зарплата у " + employees[i].getFullName());
            }
            if (employees[i].getPersonId() == minSalaryId) {
                System.out.println("Минимальная зарплата у " + employees[i].getFullName());
            }
        }
        System.out.println("Средняя зарплата " + (float) allSalaries / employees.length);

        System.out.println();

        for (int i = 0; i<employees.length;i++){
            System.out.println(employees[i].getFullName());
        }

    }
}