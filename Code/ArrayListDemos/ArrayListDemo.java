/* William Clark and Roy Nunez */
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
        // Just like Arrays if you try an access an index that the ArrayList doesn't have you'll crash!
        System.out.println(divisByThree.get(23));
        System.out.println(divisByThree.get(13));
        System.out.println(divisByThree.get(7));
        System.out.println(divisByThree.get(21));
        
        // Printing an ArrayList looks like this:
        System.out.println(divisByThree);
        System.out.println();

        // You can also sort an ArrayList:
        System.out.println(modThree);   //List before we sort it

        Collections.sort(modThree);     //Sorting the list

        System.out.println(modThree);   //List after we sorted it

        // Because ArrayLists have no set size, they objects in memory are not stored next to each other
        // instead references to where each instance is stored in memory
        }
    }

    //Create a loop that deletes every element if the element before it is less than it