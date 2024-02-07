package HomeworkFive;

public class Parrot extends Pet {
    // Additional instance variables for Parrot
    private String favoritePhrase;
    private boolean canFly;

    // Constructor for Parrot
    public Parrot(String name, String species, String favoritePhrase, boolean canFly) {
        super(name, species);
        this.favoritePhrase = favoritePhrase;
        this.canFly = canFly;
    }

    // Getter and setter for favoritePhrase
    public String getFavoritePhrase() {
        return favoritePhrase;
    }

    public void setFavoritePhrase(String favoritePhrase) {
        // You can add validation logic here if needed
        this.favoritePhrase = favoritePhrase;
    }

    // Getter and setter for canFly
    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        // You can add validation logic here if needed
        this.canFly = canFly;
    }

    // Method for the parrot to speak
    public void speak() {
        System.out.println(getName() + " says: \"" + favoritePhrase + "\"");
    }

    // Method for the parrot to fly
    public void fly() {
        if (canFly) {
            System.out.println(getName() + " is flying!");
        } else {
            System.out.println(getName() + " cannot fly.");
        }
    }

    // Example usage
    public static void main(String[] args) {
        // Creating an instance of Parrot
        Parrot myParrot = new Parrot("Golden", "Parrot", "Hi, i'm Gold - the Parrot!", true);

        // Accessing attributes of the Parrot class
        System.out.println(myParrot.getName());                // Output: Polly
        System.out.println(myParrot.getSpecies());             // Output: Parrot
        System.out.println(myParrot.getFavoritePhrase());      // Output: Hello, world!
        System.out.println(myParrot.canFly());                 // Output: true

        // Using methods of the Parrot class
        myParrot.speak();                                      // Output: Polly says: "Hello, world!"
        myParrot.fly();                                        // Output: Polly is flying!
    }
}

