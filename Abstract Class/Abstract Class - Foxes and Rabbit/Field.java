import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Field {
    private Object[][] field;
    int depth, width;

    public Field(int depth, int width) {
        field = new Object[depth][width];
        this.depth = depth;
        this.width = width;
    }

    public void clear(Location location){
        field[location.getRow()][location.getColumn()] = null;
    }
    
    public void place(Object object, Location location){
        field[location.getRow()][location.getColumn()] = object;
    }
    
    public Object getObjectAt(Location location){
        return field[location.getRow()][location.getColumn()];
    }
    
    public Location freeAdjacentLocation(Location location){
        List<Location> free = new ArrayList<>();
        List<Location> adjacent = adjacentLocations(location);
        for (Location loc : adjacent) {
            if (getObjectAt(loc) == null) {
                free.add(loc);
            }
        }
        Random random = new Random();
        return free.get(random.nextInt(free.size()));
    }

    public List<Location> adjacentLocations(Location location) {
        List<Location> locations = new ArrayList<>();
        int row = location.getRow();
        int column = location.getColumn();
        if (row > 0) locations.add(new Location(row - 1, column));
        if (row < depth - 1) locations.add(new Location(row + 1, column));
        if (column > 0) locations.add(new Location(row, column - 1));
        if (column < width - 1) locations.add(new Location(row, column + 1));
        return locations;
    }
    
}
