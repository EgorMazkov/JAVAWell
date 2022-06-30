import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Biba");
        Person person2 = new Person(2, "Boba");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
