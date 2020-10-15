public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics. 
    Dog newDog = new Dog("Darry","pit",186.3, "brown", true);
    Dog nextDog = new Dog("Raulf","golden retreiver",194.3, "red", true);
    Dog afterDog = new Dog("Carry","poodle",204.4, "yellow", false);
    System.out.println(newDog.getColor());
    System.out.println(newDog.getbreed());
    System.out.println(nextDog);
    System.out.println(afterDog);
   
  }
}