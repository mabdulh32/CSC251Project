/**
 * The Policy class represents an insurance policy.
 * It stores information about the policy and the policyholder,
 * and provides methods to calculate BMI and policy price.
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
    
    /**
     * Constructor that initializes all fields with the provided values.
     *
     * @param policyNumber  the policy number
     * @param providerName  the name of the insurance provider
     * @param firstName     the policyholder's first name
     * @param lastName      the policyholder's last name
     * @param age           the policyholder's age
     * @param smokingStatus the policyholder's smoking status ("smoker" or "non-smoker")
     * @param height        the policyholder's height in inches
     * @param weight        the policyholder's weight in pounds
     */
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
     * Returns the policy number.
     *
     * @return the policy number
     */
    public String getPolicyNumber() {
        return policyNumber;
    }
    
    /**
     * Returns the provider name.
     *
     * @return the name of the insurance provider
     */
    public String getProviderName() {
        return providerName;
    }
    
    /**
     * Returns the policyholder's first name.
     *
     * @return the policyholder's first name
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Returns the policyholder's last name.
     *
     * @return the policyholder's last name
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Returns the policyholder's age.
     *
     * @return the policyholder's age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Returns the policyholder's smoking status.
     *
     * @return the policyholder's smoking status ("smoker" or "non-smoker")
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }
    
    /**
     * Returns the policyholder's height.
     *
     * @return the policyholder's height in inches
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Returns the policyholder's weight.
     *
     * @return the policyholder's weight in pounds
     */
    public double getWeight() {
        return weight;
    }
    
    // Setter methods (mutators)
    
    /**
     * Sets the policy number.
     *
     * @param policyNumber the policy number to set
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    
    /**
     * Sets the provider name.
     *
     * @param providerName the provider name to set
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    
    /**
     * Sets the policyholder's first name.
     *
     * @param firstName the policyholder's first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * Sets the policyholder's last name.
     *
     * @param lastName the policyholder's last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Sets the policyholder's age.
     *
     * @param age the policyholder's age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Sets the policyholder's smoking status.
     *
     * @param smokingStatus the policyholder's smoking status to set ("smoker" or "non-smoker")
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }
    
    /**
     * Sets the policyholder's height.
     *
     * @param height the policyholder's height in inches to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Sets the policyholder's weight.
     *
     * @param weight the policyholder's weight in pounds to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    /**
     * Calculates and returns the BMI of the policyholder.
     * BMI = (Policyholder's Weight * 703) / (Policyholder's Height^2)
     *
     * @return the calculated BMI
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }
    
    /**
     * Calculates and returns the price of the insurance policy.
     * Base fee: $600
     * Age greater than 50: +$75
     * Smoker: +$100
     * BMI greater than 35: +(BMI - 35) * $20
     *
     * @return the calculated policy price
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
