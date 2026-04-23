package lab8;

import java.util.HashMap;

public class Zoo {
	public static void main(String[] args) {
		new Zoo();
	}

	HashMap<String, Integer> animalMap = new HashMap<>();
	String[] originalAnimals = { "Zebra", "Lion", "Buffalo" };
	String[] newAnimals = { "Zebra", "Gazelle", "Buffalo", "Zebra" };

	public Zoo() {
		addAnimals2(originalAnimals);
		addAnimals2(newAnimals);
		displayAnimals();
		//display each animal and its count
		//for each animal in animalmap
		//display the animal and it value
	}

	private void displayAnimals() {
		for (String key : animalMap.keySet()) {
			System.out.printf("%-10s %d\n", key, animalMap.get(key));
		}
	}

	void addAnimals(String[] animals) {
		for (String animal : animals) {
			int count = 1;
			if (animalMap.containsKey(animal))
				count = animalMap.get(animal) + 1;
			animalMap.put(animal, count);
			//add animals to animalmap
			//for each animal in animals
			// check if name exists - increase the value (integer count)
			//else set value count to 1
		}
	}

	void addAnimals2(String[] animals) {
		for (String animal : animals) {
			animalMap.put(animal, animalMap.getOrDefault(animal, 0) + 1);
		}
	}
}