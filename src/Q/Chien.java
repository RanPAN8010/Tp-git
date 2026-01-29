package Q;
import java.util.List;

public class Chien extends Animal {
	private String breed; 
	public Chien(List<int[]> color, boolean isCarnivore, String breed) {

        super(color, isCarnivore); 
        this.breed = breed;
    }
	public void bark() {
        System.out.println("I CAN WANG AND I LIKE CAT");
    }
	public void sleep() {
        System.out.println("je dors");
    }
}
