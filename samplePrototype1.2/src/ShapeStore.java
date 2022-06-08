import java.util.HashMap;
import java.util.Map;

public class ShapeStore {

	private static Map<String, Shape> shapeMap = new HashMap<String, Shape>();
    
    static
    {
    	shapeMap.put("circle", new CircleShape());
    	shapeMap.put("rectangle", new RectangleShape());
    }
      
    public static Shape getShape(String shapeName) throws CloneNotSupportedException
    {
        return (Shape) shapeMap.get(shapeName).clone();
    }

}
