/*
    1. Constructors with two parameters, label and weight. It should also be
    possible to create a Package by providing only the label; in that case, weight
    should default to 0.0.
    2. getLabel() — returns the package label.
    3. getWeight() — returns the package weight.
    4. setWeight(double weight) — changes the weight only if the new weight is
    greater than or equal to 0.
    5. shippingCost() — returns the shipping cost as a double.
    ○ If the weight is less than or equal to 5, the cost is $5.00.
    ○ Otherwise, the cost is $5.00 + $1.50 for each pound above 5.
    6. toString() — returns a String in the form mentioned in the output example
 */

public class Package {
    public String getLabel() {
        return label;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        if (weight >= 0)
            this.weight = weight;
    }

    public double shippingCost(){
        if (weight <= 5)
            return 5;
        return 5 + 1.5 * (weight - 5);
    }

    public String toString(){
        // Books weighs 4.0 pound(s)
        return label + " weights " + weight + " pound(s)";
    }

    String label;
    double weight;

    public Package(String label){
        this.label = label;
        this.weight = 0.0;
    }

    public Package(String label, double weight){
        this.label = label;
        this.weight = weight;
    }
}
