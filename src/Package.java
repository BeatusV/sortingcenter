/**
 * Created by peter on 2-10-17.
 */
public abstract class Package {
    private String packageType;
    private double cost;

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
