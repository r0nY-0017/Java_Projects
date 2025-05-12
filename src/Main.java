import java.util.*;
public class Main {
    public static void main(String[] args) {
       ArrayList<String> name = new ArrayList<String>();
       Scanner input  = new Scanner(System.in);
       
       
       //Adding Elements Using For-loop
        for(int i=0; i<5; i++){
            String x = input.next();
            name.add(x);
        }
        
       name.add("Hello World"); //Addition 
       name.set(3,"GoodBye World"); //Replace
       name.remove(0); //Delete
       //name.clear(); //Delete All
       
        
       //Printing Elements Using For-Loop
        for(int i=0; i<name.size(); i++){
            System.out.println(name.get(i));
        }
       
    }       
}
