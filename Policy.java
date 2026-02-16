/**

 */
public class Policy {
    // Fields (attributes)
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height; // in inches
    private double weight; // in pounds
    
    /**
     * No-arg constructor - sets default values for all fields
     */
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0.0;
        this.weight = 0.0;
    }
    
    public Policy(String policyNumber, String providerName, String firstName,
                  String lastName, int age, String smokingStatus,
                  double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }
    
    // Getter methods (accessors)
    
    /**
     * @return The policy number
     */
    public String getPolicyNumber() {
        return policyNumber;
    }
    
    /**
     * @return The provider name
     */
    public String getProviderName() {
        return providerName;
    }
    
    /**
     * @return The policyholder's first name
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * @return The policyholder's last name
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * @return The policyholder's age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * @return The policyholder's smoking status
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }
    
    /**
     * @return The policyholder's height in inches
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * @return The policyholder's weight in pounds
     */
    public double getWeight() {
        return weight;
    }
    
    // Setter methods (mutators)
    
    /**
     * @param policyNumber The policy number to set
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    
    /**
     * @param providerName The provider name to set
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    
    /**
     * @param firstName The policyholder's first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * @param lastName The policyholder's last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * @param age The policyholder's age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * @param smokingStatus The policyholder's smoking status to set
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }
    
    /**
     * @param height The policyholder's height in inches to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * @param weight The policyholder's weight in pounds to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    /**
     * Calculates and returns the BMI of the policyholder
     * BMI = (Policyholder's Weight * 703) / (Policyholder's Height^2)
     * @return The calculated BMI
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }
    
    /**
     * Calculates and returns the price of the insurance policy
     * Base fee: $600
     * Age > 50: +$75
     * Smoker: +$100
     * BMI > 35: +(BMI - 35) * 20
     * @return The calculated policy price
     */
    public double calculatePolicyPrice() {
        double price = 600.0; // Base fee
        
        // Additional fee if over 50 years old
        if (age > 50) {
            price += 75.0;
        }
        
        // Additional fee if smoker
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100.0;
        }
        
        // Additional fee if BMI is over 35
        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }
        
        return price;
    }
}
