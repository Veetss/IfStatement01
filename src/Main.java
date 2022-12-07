public class Main {
    public static void main(String[] args) {
        String myName = "Vittoria";

        if(myName.length() <= 10){
            System.out.println("Vittoria is my name and is long " + myName.length() + " letter!");
        }else{
            System.out.println("Error 404 brain not found.");
        }

        if(myName.length() % 2 == 0){
            System.out.println("The number of letter in my name is even!");
        }else{
            System.out.println("The number of letter in my name is odd!");
        }
    }
}