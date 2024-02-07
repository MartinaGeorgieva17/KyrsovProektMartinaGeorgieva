package Homeworkfivetest;

public class Pet {
    //Attributes
    private String name;
    private String species;

    //Constructor
    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    //Method to get information about the pet
    public String getInfo() {
        return name + " is a" + species;
    }

    //Getter for the name attribute
    public String getName() {
        return name;
    }

    //Getter for the species attribute
    public String getSpecies() {
        return species;
    }

    //Setter for the name attribute
    public void setName(String name) {
        this.name = name;
    }
//Setter for the species attribute
    public void setSpecies(String species) {
        this.species = species;
    }

    //Example usage
    public static void main(String[] args) {
        //Creating an instance of the Pet Class
        Pet myPet = new Pet("Golden", " Dog");

        //Accessing the attributes of the pet
        System.out.println(myPet.getName());
        System.out.println(myPet.getSpecies());

        //Using a method of the pet class
        String petInfo = myPet.getInfo();
        System.out.println(petInfo);
    }
}
