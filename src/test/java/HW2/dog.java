package HW2;

public class dog {
    byte age;
    String name;
    boolean isMale;

    public void printDogData(){
        System.out.println(name + " is" + age + " years old");

        if (this.isMale){
            System.out.println("Sex of " + name + " is Male");
        }else {
            System.out.println("Sex of " + age + "is female");

        }
    }
}
