public class Main {
    public static void main(String[] args) {
        // Your job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Petar", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.12);
        bank.addCustomer("Adelaide", "Tim", 220.23);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.12);

        bank.addCustomerTransaction("Adelaide", "Petar", 44.22);
        bank.addCustomerTransaction("Adelaide", "Petar", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        //invalid data
        if(!bank.addCustomer("Melbourne", "Brian", 5.35)) {
            System.out.println("Error Melbourne branch doesn't exist.");
        }

        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists.");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 53.23)) {
            System.out.println("Customer doesn't exist at branch.");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.23)) {
            System.out.println("Customer Tim already exist.");
        }
    }
}
