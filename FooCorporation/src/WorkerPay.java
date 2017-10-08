
public class WorkerPay {
    public static void main(String[] args) {
        try {
            double employeeOnePay = calculatePay(7.50, 35);
            System.out.println("The payment for Employee One is : $" + employeeOnePay);   
        } catch (Error err) {
            System.out.println("Employee One Payment Error: " + err);
        }
        
        try {
            double employeeTwoPay = calculatePay(8.20, 47);
            System.out.println("The payment for Employee Two is : $" + employeeTwoPay);   
        } catch (Error err) {
            System.out.println("Employee Two Payment Error: " + err);
        }
        
        try {
            double employeeThreePay = calculatePay(10.00, 73);   
            System.out.println("The payment for Employee Three is : $" + employeeThreePay);
        } catch (Error err) {
            System.out.println("Employee Three Payment Error: " + err);
        }
    }
    
    public static double calculatePay(double basePay, int hoursWorked) {
        double pay = 0;
        
        if (basePay < 8.00) {
            throw new Error("State law requires a minimum wage of $8.00/hour.");
        }
        
        if (hoursWorked <= 40) {
            pay = basePay * hoursWorked;
        } else if (hoursWorked > 40 && hoursWorked < 60) {
            pay = basePay * 40 + basePay * 1.5 * (hoursWorked - 40);
        } else {
            throw new Error("Employee may not work more than 60 hours per week.");
        }
        
        return pay;
    }
}
