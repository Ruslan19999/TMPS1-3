package sampleSingleton;

public class Main {

	public static void main(String[] args) {

       
        
        System.out.println(Shop.getShop());
        System.out.println(Shop.getShop());
        System.out.println(Shop.getShop());




        System.out.println("-------------------------------------------------------------------");

        

        Shop a = Shop.getShop().addShop("A","a");
        Shop b = Shop.getShop().addShop("B","b");
        Shop c = Shop.getShop().addShop("C","c");

        Shop aa = Shop.getShop().addShop("A","a");
        Shop.getShop().showe();

     
        System.out.println("-------------------------------------------------------------------");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        System.out.println("-------------------------------------------------------------------");

        
      
        
        
	}

}
