public class GenericArray <T>{
    private T[] myArray;
    private int size;
    public GenericArray(int size){
        myArray = (T[]) new Object[size];
        this.size = size;
    }

    //Get value at specified index
    public T get(int index){
        return myArray[index];
    }

    //Set value to specified index
    public void set(int index, T value){
        myArray[index] = value;
    }

    //gets the size of the array
    public int size(){
        size = myArray.length;
        return size;
    }

    //checks if array is empty or not
    public boolean isEmpty(){
        if(myArray.length == 0){
            return true;
        }
        else return false;
    }
}
