// enum can be inside and outside of the class .
enum animal{
    DOG, CAT , TIGER, MOUSE
}
public class Main {
    public static void main(String[] args) {

        for (animal element:animal.values()
             ) {

            System.out.println(element);

        }
        
    }
}
