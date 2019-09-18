package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<>();

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExit(String dir, Room room) 
    {
        exits.put(dir, room);
    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public String getExitDesc(){
    	StringBuffer sb = new StringBuffer();
    	for( String dir : exits.keySet() ){
    		sb.append(dir);
    		sb.append(' ');
    	}
    	return sb.toString();
//    	String ret = "";
//    	if( northExit != null )
//    		ret += "north ";
//    	if( eastExit != null )
//    		ret += "east ";
//    	if( southExit != null )
//    		ret += "south ";
//    	if( westExit != null )
//    		ret += "west ";
//    	return ret;
    }
    
    public Room getExit(String direction){
    	 Room ret = exits.get(direction);
         return ret;
    }
}
