import java.util.List;

abstract class Animal {
    private boolean alive;
    private Location location;
    private int age;
    private Field field;

    public Animal(Field field, Location location) {
        this.alive = true;
        this.age = 0;
        this.field = field;
        setLocation(location);
    }

    public boolean isAlive() {
        return alive;
    }

    public void setDead() {
        this.alive = false;
        
        if (location != null){
            field.clear(location);
            location = null;
            field = null;
        }
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        if (this.location != null){
        
        field.place(null, this.location);
        
        }
        
        field.place(this, location);
        
        this.location = location;
    }
    
    public Field getField(){
        return field;
    }

    public abstract void act(List<Animal> newAnimals);
}
