/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Employee
   =========================================================== */

// Class
class Employee
{

    String email = "newemployee@hotmail.com"; // Atribute email, (predetermined email).
    String address = "No registered address"; // Atribute address, (predetermined address).
    String status = "No registered marital status"; // Atribute marital status, (predetermined marital status).
    int number = 0; // Atribute number of employee, (predetermined number of employee).

    String checkEmail() // Method that checks the email of the employee.
    {
        return email; // Returs the variable.
    }
    String checkAddress() // Method that checks the address of the employee.
    {
        return address; // Returs the variable.
    }
    String checkStatus() // Method that checks the marital status of the employee.
    {
        return address; // Returs the variable.
    }

    void changeEmail(String newValueEmail) // Method that changes the email of the employee.
    {
        System.out.println("Old Email: " + email); // Prints the old email.
        email = newValueEmail; // The variable acquires a new value.
    }
    void changeAddress(String newValueAddress) // Method that changes the address of the employee.
    {
        System.out.println("Old Address: " + address); // Prints the old address.
        address = newValueAddress; // The variable acquires a new value.
    }
    void changeStatus(String newValueStatus) // Method that changes the marital status of the employee.
    {
        System.out.println("Old Marital Status: " + status); // Prints the old marital status.
        status = newValueStatus; // The variable acquires a new value.
    }
    void numberEmployee(int newNumber) // Method that asigns the number of employee to the employee.
    {
        number = newNumber; // The variable acquires a new value.
        System.out.println("\nEmployee Number: " + newNumber); // Prints the number of employee.
    }

    void printInformation() // Prints the new information of the employee.
    {
        System.out.println("\nNew Email: " + email + "\nNew Address: " + address + "\nNew Marital Status : " + status);
    }
}