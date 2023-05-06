
public abstract class Instrument {
    private String name;
    private String brand;
    private double price;

    public Instrument(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return isOnSale() ? 0.85 * price : price;
    }

    public abstract String getType();

    public boolean isOnSale() {
        return false;
    }

    public double getEmployeePrice() {
        return 0.75 * price;
    }
}

public class Guitar extends Instrument {
    private int numStrings;

    public Guitar(String name, String brand, double price, int numStrings) {
        super(name, brand, price);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public String getType() {
        return "Guitar";
    }
}

public class Piano extends Instrument {
    private int numKeys;

    public Piano(String name, String brand, double price, int numKeys) {
        super(name, brand, price);
        this.numKeys = numKeys;
    }

    public int getNumKeys() {
        return numKeys;
    }

    @Override
    public String getType() {
        return "Piano";
    }

    @Override
    public double getEmployeePrice() {
        return super.getEmployeePrice() * 0.9;
    }
}

public class Trumpet extends Instrument {
    private String material;

    public Trumpet(String name, String brand, double price, String material) {
        super(name, brand, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String getType() {
        return "Trumpet";
    }

    @Override
    public boolean isOnSale() {
        return true;
    }
}
