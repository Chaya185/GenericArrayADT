public class ArrayDemo {
    public static void main(String[] args) {
        //call the methods that demonstrate the functionality of the GenericArray class
        intDemo();
        stringDemo();
    }

    public static void intDemo(){
        GenericArray<Integer> intArray = new GenericArray<>(6);

        //set the values of the array elements
        intArray.set(0, 5);
        intArray.set(1, 10);
        intArray.set(2, 15);
        intArray.set(3, 20);
        intArray.set(4, 25);
        intArray.set(5, 30);

        displayElements(intArray);

        //reset values of the array elements
        intArray.set(1, 100);
        intArray.set(3, 200);
        intArray.set(5, 300);
        
        displayElements(intArray);

        //check if the array is empty or not
        System.out.println("The array is empty: " + intArray.isEmpty());

        //get the size of the array
        int size = intArray.size();
        System.out.println("The size of the array is " + size + "\n");
    }

    public static void displayElements(GenericArray<Integer> intArray){
        //get the values of elements
        System.out.println("The second element is: " + intArray.get(1));
        System.out.println("The fourth element is: " + intArray.get(3));
        System.out.println("The sixth element is: " + intArray.get(5) + "\n");
    }

    public static void stringDemo(){
        //generic instance to store strings
        GenericArray<String> stringArray = new GenericArray<>(3);

        //set the values of the array elements
        stringArray.set(0, "Apples");
        stringArray.set(1, "Bananas");
        stringArray.set(2, "Pears");

        //display elements
        System.out.println("The first element is: " + stringArray.get(0));
        System.out.println("The third element is: " + stringArray.get(2) + "\n");

        stringArray.set(2, "Cherries");
        System.out.println("The third element is now: " + stringArray.get(2) + "\n");

        //check if the array is empty or not
        System.out.println("The array is empty: " + stringArray.isEmpty());

        //get the size of the array
        int size = stringArray.size();
        System.out.println("The size of the array is " + size);
    }
}
