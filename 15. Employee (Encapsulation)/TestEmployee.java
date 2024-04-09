/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Employee (Encapsulation)
   =========================================================== */

// Class
class TestEmployee
{
    public static void main(String[] args) // Main
    {

        Employee employee1 = new Employee(); // Creates an employee object.
        employee1.numberEmployee(1); // Method for asigning a number to the employee.
        employee1.checkEmail(); // Method for cheking the email.
        employee1.checkAddress(); // Method for cheking the address.
        employee1.checkStatus(); // Method for cheking the marital status.
        employee1.changeEmail("employee1@hotmail.com"); // Method for changing the email.
        employee1.changeAddress("Mapple North Street #47, Hendersonville"); // Method for changing the address.
        employee1.changeStatus("Married"); // Method for changing the marital status.
        employee1.printInformation(); // Prints the new information.


        Employee employee2 = new Employee(); // Creates an employee object.
        employee2.numberEmployee(2); // Method for asigning a number to the employee.
        employee2.checkEmail(); // Method for cheking the email.
        employee2.checkAddress(); // Method for cheking the address.
        employee2.checkStatus(); // Method for cheking the marital status.
        employee2.changeEmail("employee2@hotmail.com"); // Method for changing the email.
        employee2.changeAddress("Green Road #21, Hendersonville"); // Method for changing the address.
        employee2.changeStatus("Single"); // Method for changing the marital status.
        employee2.printInformation(); // Prints the new information.

        Employee employee3 = new Employee(); // Creates an employee object.
        employee3.numberEmployee(3); // Method for asigning a number to the employee.
        employee3.checkEmail(); // Method for cheking the email.
        employee3.checkAddress(); // Method for cheking the address.
        employee3.checkStatus(); // Method for cheking the marital status.
        employee3.changeEmail("employee3@hotmail.com"); // Method for changing the email.
        employee3.changeAddress("Wilson Street #32, Hendersonville"); // Method for changing the address.
        employee3.changeStatus("Married"); // Method for changing the marital status.
        employee3.printInformation(); // Prints the new information.
    }
}