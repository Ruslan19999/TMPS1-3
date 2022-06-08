	
public class Main {

	public static void main(String[] args) throws InterruptedException {



        
        Director director = new Director();
        HappyMealBuilder big_hmbuilder = new BigHappyMealBuilder();
        HappyMealBuilder small_hmbuilder = new SmallHappyMealBuilder();


        // Конструируем два продукта
        director.Construct(big_hmbuilder);
        HappyMeal hm1 = big_hmbuilder.GetProduct();
        hm1.Show();

        System.out.println(" ");
        System.out.println("--------------------------------------");
        System.out.println(" ");

        director.Construct(small_hmbuilder);
        HappyMeal hm2 = small_hmbuilder.GetProduct();
        hm2.Show();
     
	}

}
