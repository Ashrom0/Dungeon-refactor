public class HeroFactory {
	
	//I created a factory method that is similar to the ShapeFactory and PizzaFactory methods from the last assignment.
	//Here the option to select your choice of class is moved here
	
	public Hero createHero(int choice)
	{
		if(choice < 1 || choice > 3)
			throw new IllegalArgumentException("Invalid choice");

		if(choice == 1)
			return new Warrior();
		
		else if (choice == 2)
			return new Sorceress();
		
		else if(choice == 3)
			return new Thief();
		
		return null;
	}
}
