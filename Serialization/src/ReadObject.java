import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCount = ois.readInt();
			Person[] people = new Person[personCount];
			for (int i = 0; i < personCount; i++) {
				people[i] = (Person) ois.readObject();
			}
            System.out.println(Arrays.toString(people));
            ois.close();
    }
}
