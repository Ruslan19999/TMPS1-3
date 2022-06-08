
 abstract class Shape implements Cloneable{

	 protected String shapeName;
     
	    abstract void addshape();
	      
	    public Object clone() throws CloneNotSupportedException
	    {
	        Object clone = super.clone();
	      
	        return clone;
	    }
	   
}
