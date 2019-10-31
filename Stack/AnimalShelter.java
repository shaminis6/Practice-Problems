package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
	
	Queue<Dog> dogs=new LinkedList<>();
	Queue<Cat> cats=new LinkedList<>();
	
	class Animal
	{
		int order;
		String name;
	}
	
	class Dog extends Animal
	{
		
	}
	class Cat extends Animal
	{
		
	}
	
	int order=0;
	void enqueue(Animal a)
	{
		a.order=order;
		order++;
		
		if(a instanceof Dog)
		{
			dogs.add((Dog) a);
		}
		else
		{
			cats.add((Cat) a);
		}
		
	}
	
	Animal dequeueAny()
	{
		Dog dog=dogs.peek();
		Cat cat=cats.peek();
		
		if(dog.order>cat.order)
		{
			return dequeueDogs();
		}
		
		else
		{
			return dequeueCats();
		}
		
	}
	
	Dog dequeueDogs()
	{
		return dogs.poll();
	}
	
	Cat dequeueCats()
	{
		return cats.poll();
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalShelter as=new AnimalShelter();
		
		

	}

}
