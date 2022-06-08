
public class People implements Observer{

	private String name;
	private int price;
	
	Notifier notifierl;
	
	  public People(Notifier notifier){ 
	        this.notifierl = notifier;
	        notifier.addObserver(this); 
	    }
	    
	    @Override
	    public void update(String name,int price) {
	        this.name = name;
	        this.price = price;
	       
	        show();
	    }
	    
	    
	    public void show(){
	        System.out.println("Name = " + name + ", Price = " + price );
	    } 
}
