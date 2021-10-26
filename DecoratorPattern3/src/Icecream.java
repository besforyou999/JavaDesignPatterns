//abstract component class
public abstract class Icecream {
    String description = "Unknown";

    public String getDescription() { return description;}

    public abstract double cost();
    public abstract double calories();
}
