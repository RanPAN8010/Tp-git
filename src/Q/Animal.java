package Q;
import java.util.List;
import java.util.ArrayList;
public class Animal {

	private List<int[]> color;
    private boolean isCarnivore;
    public Animal(List<int[]> color, boolean isCarnivore) {
        this.color = color;
        this.isCarnivore = isCarnivore;
    }
    @Override
    public String toString() {
        return "Color: " + color + ", Carnivore: " + isCarnivore;
    }

}
