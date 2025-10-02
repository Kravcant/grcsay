/**
 * The Dog class represents a Dog and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 * 
 * Dog by Tony Monroe. See license file for more details.
 */
class Dog implements Animal {

  /**
   * Returns the ASCII art representation of the Dog.
   *
   * @return A string containing the ASCII art of the Dog.
   */
  @Override
  public String getAnimalArt() {
      return
      "        \\   .\n" +
      "         \\  ..^____/\n" +
      "            `-. ___ )\n" +
      "              ||   ||\n"; 
  }

  /**
   * Returns the name of the animal ("Dog").
   * This method overrides the toString method to return the name of the Dog.
   *
   * @return The string "Dog" representing the name of the animal.
   */
  @Override
  public String toString() {
    return "Dog";
  }
}
