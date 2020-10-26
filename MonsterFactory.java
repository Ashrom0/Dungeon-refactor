public class MonsterFactory {
	//I created a factory method that is similar to the ShapeFactory and PizzaFactory methods from the last assignment.
	//Here the randomized numbers of 1 to 3 that would summon a certain monster is moved here
		
	public Monster createMonster(int choice)
	{
		if(choice < 1 || choice > 3)
			throw new IllegalArgumentException("Invalid");

		if(choice == 1)
			return new Ogre();
			
		else if (choice == 2)
			return new Gremlin();
		
		else if(choice == 3)
			return new Skeleton();
			
		return new Skeleton(); //Here is the default return that return a Skeleton 
	}
}
