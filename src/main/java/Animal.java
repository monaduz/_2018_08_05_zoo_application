public abstract class Animal {
    private double weight;
    private boolean isAlive;

    public Animal(double weight, boolean isAlive) {
        this.weight = weight;
        this.isAlive = isAlive;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

}
