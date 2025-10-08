//********************************************************************
//  Commission.java
//
//  Represents an hourly employee who also earns a sales commission.
//********************************************************************
package studi_kasus1;
public class Commission extends Hourly {

    private double totalSales;       // Total sales made by the employee
    private double commissionRate;   // The commission percentage

    /**
     * Constructor: Sets up the employee with the specified information.
     */
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commissionRate) {
        // Call the parent constructor from the Hourly class
        super(eName, eAddress, ePhone, socSecNumber, rate);

        // Set the commission rate
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }

    /**
     * Adds the specified amount to the total sales.
     */
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    /**
     * Computes and returns the pay for this employee, which includes
     * the regular hourly pay plus commission on sales.
     * Overrides the pay() method in the Hourly class.
     */
    @Override
    public double pay() {
        // Calculate hourly pay by calling the parent's pay() method
        double hourlyPayment = super.pay(); // This also resets hoursWorked to 0

        // Calculate commission
        double commissionPayment = totalSales * commissionRate;

        // Reset total sales to 0 for the next pay period
        totalSales = 0;

        return hourlyPayment + commissionPayment;
    }

    /**
     * Returns information about this employee as a string, including
     * information from the parent class.
     */
    @Override
    public String toString() {
        // Get the string from the parent (Hourly) class
        String result = super.toString();

        // Add the total sales information
        result += "\nTotal Sales: " + totalSales;

        return result;
    }
}