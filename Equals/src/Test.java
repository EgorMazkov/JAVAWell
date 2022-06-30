public class Test {
    public static void main(String[] args) {
//  animal1 ->       {1}
//  animal2 ->       {1}
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
//        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));

    }
}
 class Animal {
    private int id;

    public Animal(int id){
        this.id = id;
    }

    public boolean equals(Object obj){
        Animal otheranimal = (Animal) obj;
        return this.id == otheranimal.id;
    }
 }