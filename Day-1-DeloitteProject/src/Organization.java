public class Organization {
    public static void main(String[] args) {
        {
            Employee[] employees = new Employee[3];  //array

            employees[0] = new Employee(1, "Jhon", 100000);
            employees[1] = new Employee(2, "bob", 4500000);
            employees[2] = new Employee(3, "Alice", 500000);

            //for loops

            //for-each loop
            /*
            for(declearation:expression){
                //code
            }
             */
            for(int i=0; i< employees.length;i++)
                employees[i].displayInfo();

            double totalSalary = 0;
            for (Employee emp : employees) {
                totalSalary = totalSalary + emp.getSalary();
            }
            System.out.println(totalSalary);
        }
    }
}
