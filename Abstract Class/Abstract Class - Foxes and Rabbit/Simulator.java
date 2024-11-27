import java.util.ArrayList;
import java.util.List;

public class Simulator {
    private Field field;
    private List<Animal> animals;
    int depth, width;

    public Simulator(int depth, int width) {
        field = new Field(depth, width);
        animals = new ArrayList<>();
        this.depth = depth;
        this.width = width;
        populate();
    }

    public void simulate(int steps) {
        for (int step = 0; step < steps; step++) {
            List<Animal> newAnimals = new ArrayList<>();
            boolean rabbitIsAlive = false;
            for (Animal animal : animals) {
                animal.act(newAnimals);
                
                for (int x = 0; x < depth; x++){
                    for (int y = 0; y < width; y++){
                        Location temp = new Location(x,y);
                        if(field.getObjectAt(temp) instanceof Rabbit){
                            System.out.print("R ");
                            rabbitIsAlive = true;
                        }
                        
                        else if(field.getObjectAt(temp) instanceof Fox){
                            System.out.print("F ");
                        }
                        
                        else {
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                }
                
                System.out.println();
                
                
            }
            if (!rabbitIsAlive){
                break;
            }
            
            animals.addAll(newAnimals);
        }
    }

    private void populate() {
        Location loc = new Location(depth - 1, width - 1);
        Location loc2 = new Location(0, 0);
        
        Rabbit rabbit = new Rabbit(field, loc);
        Fox fox = new Fox(field, loc2);
        
        animals.add(rabbit);
        animals.add(fox);
        
        field.place(rabbit, loc);
        field.place(fox, loc2);
    }
}

