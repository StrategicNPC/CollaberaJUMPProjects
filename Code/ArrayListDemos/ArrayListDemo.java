/* William Clark
*/
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

        // ArrayLists contain objects, they can't contain primitive data types like int or booleans
        // to make an ArrayList that contains primitive data types, you can use their equivilent Wrapper Classes
        ArrayList<Boolean> divisByThree = new ArrayList<Boolean>();
        ArrayList<Integer> modThree = new ArrayList<Integer>();

        // You can use loops to add or access members of an ArrayList similar to an Array
        for (Integer i = 0; i <= 25; i++){
            if ((i % 3) == 0){
                divisByThree.add(true);
            }else{
                divisByThree.add(false);
            }
            modThree.add(i % 3);
        }

        // Give me a Number (between 0 and 25) and we'll check if it's divisable by 3!

        
        // Printing an ArrayList looks like this:
        System.out.println(divisByThree);

        // You can also sort an ArrayList:
        System.out.println(modThree);   //List before we sort it

        Collections.sort(modThree);     //Sorting the list

        System.out.println(modThree);   //List after we sorted it
        }
    }