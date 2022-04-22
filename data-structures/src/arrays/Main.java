package arrays;

public class Main {
	
	public static void main(String[] args) {
		Array<Integer> array = new Array<>(2);
		array.insert(30);
		array.insert(10);
		array.sort();
		array.print();
	}

}
