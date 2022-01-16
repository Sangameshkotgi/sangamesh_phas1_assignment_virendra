package innerClass;

class Car {
	 String carName;
	    String carType;

	    // assign values using constructor
	    public Car (String name, String type) {
	        carName = name;
	        carType = type;
	    }

	    // private method
	    private String getCarName() {
	        return carName;
	    }

	void outerMethod() {
		System.out.println("inside outermethod");
	    class Engine {
	        String engineType;
	        
	        void setEngine() {

	           // Accessing the carType property of Car
	            if(carType.equals("4WD")){

	                // Invoking method getCarName() of Car
	                if(getCarName().equals("Crysler")) {
	                    engineType = "Smaller";
	                } else {
	                    engineType = "Bigger";
	                }

	            }else{
	                engineType = "Bigger";
	            }
	        }
	        
	        String getEngineType(){
	            return engineType;
	        }
	    }
Engine engine = new Engine();
engine.setEngine();
System.out.println("Engine type of 8WD="+ engine.getEngineType());

Engine c2engine = new Engine();
c2engine.setEngine();
System.out.println("Engine type of 4WD="+ c2engine.getEngineType());
	}





	public static void main(String[] args) {
		
		Car car1=new Car("mazda", "8wd");
		car1.outerMethod();
		Car car2=new Car("crysler", "4wd");
		car2.outerMethod();
		

	}

}

