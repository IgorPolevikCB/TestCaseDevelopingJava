import java.util.*;

public class Main {

    public static void main(String[] args) {

        int userArrayLength, count, countElement, el  = 0;

        Scanner arrayLength= new Scanner(System.in);
        Scanner element = new Scanner(System.in);

        System.out.println("Enter the value of array length: ");
        userArrayLength = arrayLength.nextInt();

        int[] testArray = new int[userArrayLength];
        System.out.println("The length of your array is: " + testArray.length
                           + "\nInsert elements into the array:");

        for(count = 0; count < userArrayLength; count++) {
            testArray[count] = element.nextInt();
            System.out.println("The element " + testArray[count] + " was inserted at location: " + count);
        }

        System.out.println("\nYou're got array:");
        for(count = 0; count < userArrayLength; count++) {
            System.out.println("The element at index [" + count +"] is have: " + testArray[count]);
        }
        List<Integer> list = new ArrayList<>();

        for(count = 0; count < userArrayLength; count++) {
            list.add(count,testArray[count]);
        }

        //for list check:
        //System.out.println(Arrays.toString(list.toArray()) + "\n" + countElement);

        for(count = 0; count < userArrayLength; count++) {
            el = testArray[count];
            countElement = Collections.frequency(list,el);
            System.out.println("The frequency of: " + el + ", equals to: " + countElement);
        }
    }
}
