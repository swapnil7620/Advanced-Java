package Application;



import java.util.Arrays;

import Model.Car;
import Model.Engine;
import Model.Gear;

public class App {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine("Honda", 500, 1.4);
		
		Engine engine2= new Engine();
		engine2.setEngManufature("Tesla");
		engine2.setEngineHP(700);
		engine2.setEngineLiter(2.5);
		
		Gear gear = new Gear("Tata",5,"Auto");
		
		Gear gear2 = new Gear();
		gear2.setGearManufacture("Mahindra");
		gear2.setGearMode(4);
		gear2.setGeartype("Manual");
		
		
		Car car = new Car("Thar", "Tata", 20.50000, 4, engine2, gear);
		
		Car car2 = new Car("Scorpio", "Mahindra", 13.500000, 7, engine, gear2);
		
		
		System.out.println(car);
		System.out.println(car2);	
//		System.out.print(Arrays.toString(new Car[] {car}));
		
		Car[] cararray = {car};
		Car[] cararray2 = {car2};

		for (Car car3 : cararray) {
//			System.out.println(car3);
		}
		for (Car car4 : cararray2) {
//			System.out.println(car4);
			
		}
	}

}
