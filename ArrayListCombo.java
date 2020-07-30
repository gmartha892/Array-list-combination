import java.util.ArrayList;
import java.util.Scanner ;

public class ArrayListCombo {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
//create array
ArrayList <Integer> array = new ArrayList<>();

//ask for values for the array
System.out.println("Enter the elements for the first array: ");
int max = 5;
for(int i=0; i < max; i++) {
array.add(scan.nextInt());
}

//create 2nd array
ArrayList <Integer>array1 = new ArrayList<>();
System.out.println("Enter the elements for the second array: ");
for(int i=0; i < max; i++) {
array1.add(scan.nextInt());
}
//create combined list
ArrayList <Integer>combined = new ArrayList<>();
combined.addAll(array);
combined.addAll(array1);

//displaying the elements
for(Integer ints :combined) {
System.out.println(ints);
}

}
}