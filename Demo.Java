import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws IOException {

        // Open the file
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);

        // ArrayList to hold all Policy objects
        ArrayList<Policy> policies = new ArrayList<Policy>();

        // Read all policies from the file
        while (inputFile.hasNext()) {
            String policyNumber  = inputFile.nextLine();
            String providerName  = inputFile.nextLine();
            String firstName     = inputFile.nextLine();
            String lastName      = inputFile.nextLine();
            int age              = Integer.parseInt(inputFile.nextLine());
            String smokingStatus = inputFile.nextLine();
            double height        = Double.parseDouble(inputFile.nextLine());
            double weight        = Double.parseDouble(inputFile.nextLine());

            // Skip blank line between records (if there is one)
            if (inputFile.hasNextLine()) {
                inputFile.nextLine();
            }

            // Create a Policy object and add it to the ArrayList
            Policy policy = new Policy(policyNumber, providerName, firstName,
                                       lastName, age, smokingStatus, height, weight);
            policies.add(policy);
        }

        inputFile.close();

        // Counters for smokers and non-smokers
        int smokerCount    = 0;
        int nonSmokerCount = 0;

        // Iterate over the ArrayList and display each policy's information
        for (Policy p : policies) {
            System.out.println("Policy Number: " + p.getPolicyNumber());
            System.out.println();
            System.out.println("Provider Name: " + p.getProviderName());
            System.out.println();
            System.out.println("Policyholder's First Name: " + p.getFirstName());
            System.out.println();
            System.out.println("Policyholder's Last Name: " + p.getLastName());
            System.out.println();
            System.out.println("Policyholder's Age: " + p.getAge());
            System.out.println();
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + p.getSmokingStatus());
            System.out.println();
            System.out.printf("Policyholder's Height: %.1f inches%n", p.getHeight());
            System.out.println();
            System.out.printf("Policyholder's Weight: %.1f pounds%n", p.getWeight());
            System.out.println();
            System.out.printf("Policyholder's BMI: %.2f%n", p.calculateBMI());
            System.out.println();
            System.out.printf("Policy Price: $%.2f%n", p.calculatePolicyPrice());
            System.out.println();
            System.out.println();

            // Tally smokers and non-smokers
            if (p.getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        // Display smoker/non-smoker counts
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}

