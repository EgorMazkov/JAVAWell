public class Electrocar {
    private int id;

    public Electrocar(int id){
        this.id = id;
    }
    // вложенный нестатический класс
    private class Motor{
        public void StartMotor(){
            System.out.println("Motor " + id + " is starting ...");
        }
    }

    // статический вложенный класс
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charting ...");
        }
    }
    public void start(){
        Motor motor = new Motor();
        motor.StartMotor();
        final int x = 1;
        class SomeClass{
            public void SomeMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
        System.out.println("Electrocat " + id + " is starting ...");
    }
}
