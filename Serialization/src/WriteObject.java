import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {
                new Person(1, "Biba"),
                new Person(2, "Boba"),
                new Person(3, "Mike"),
        };
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(people.length);
            for(Person person : people){
                oos.writeObject(person);
            }
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
