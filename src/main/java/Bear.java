import java.util.Date;

public abstract class Bear extends Animal {
    private Date lastMeal;

    public Bear(double weight, boolean isAlive) {
        super( weight, isAlive );
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

}
