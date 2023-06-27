package setter_getter_methods_prog;

public class Dog_name_Breed {
private String name;
private String breed;
public Dog_name_Breed(String name, String breed) {
	this.name=name;
	this.breed=breed;
}

public String getName() {
	return name;
}
public String getBreed() {
	return breed;
}

public void setName(String name) {
	this.name=name;
}
public void setBreed(String breed) {
	this.breed=breed;
}
public void printN_B() {
	System.out.println("Dog name: "+name+" DogBreed : "+breed);
}
	public static void main(String[] args) {
		
		Dog_name_Breed dg =new Dog_name_Breed("mani", "nattu nai");
		Dog_name_Breed dg1= new Dog_name_Breed("thi", "veri nai");
		dg.printN_B();
		dg1.printN_B();
		System.out.println("\n");
		dg.setBreed("nalla nai");
		dg1.setName("second check");
		dg.printN_B();
		dg1.printN_B();
	}

}
