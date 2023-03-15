public class Main {
    //  Напишите программу, которая занимается учетом сотрудников и помогает кадрам и бухгалтерии автоматизировать процессы.
//    С помощью вашей программы бухгалтерия и отдел кадров смогут узнавать следующую информацию:
//1. Получить список всех сотрудников.
//2. Посчитать сумму затрат на зарплаты.
//3. Найти сотрудника с минимальной заплатой.
//4. Найти сотрудника с максимальной зарплатой.
//5. Подсчитать среднее значение зарплат.

// 1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
// 2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
//3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
// 4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
// 5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
// 6. По умолчанию все поля должны передавать через конструктор (кроме id) изаполняться в нем (включая id, который нужно получить из счетчика).
// 7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//  8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:

    // 1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
// 2. Посчитать сумму затрат на зарплаты в месяц.
// 3. Найти сотрудника с минимальной зарплатой.
// 4. Найти сотрудника с максимальной зарплатой.
// 5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
// 6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static void main(String[] args) {
        int allSalaries = 0;
        int averageEmployeeSalary = 0;
        int minSalaryId = 0;
        int maxSalaryId = 0;

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Vasya", 5000, 4);
        employees[1] = new Employee("Petya", 4000, 3);
        employees[2] = new Employee("Vadim", 6000, 2);
        employees[3] = new Employee("Victor", 4500, 1);
        employees[4] = new Employee("Kevin", 5500, 5);
        employees[5] = new Employee("Oscar", 5000, 1);
        employees[6] = new Employee("Valery", 6000, 5);
        employees[7] = new Employee("Alex", 5300, 2);
        employees[8] = new Employee("Mihail", 3000, 3);
        employees[9] = new Employee("Vova", 4200, 4);

        int minimalEmployeeSalary = employees[0].getSalary();
        int maximumEmployeeSalary = employees[0].getSalary();

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println();

        for (int i = 0; i < employees.length; i++) {
            allSalaries = allSalaries + employees[i].getSalary();
        }
        System.out.println("Сумма всех зарплат за месяц: " + allSalaries + "\n");

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
            if (employees[i].getPersonId() == maxSalaryId){
                System.out.println(employees[i].getFullName());
            }
            if (employees[i].getPersonId()==minSalaryId){
                System.out.println(employees[i].getFullName());
            }
        }

        System.out.println("Средняя зарплата " + (float) allSalaries/employees.length);
    }
}