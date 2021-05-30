
public class Test {

	public static void main(String[] args) {
		MyHashTable HT = new MyHashTable();
		
		HT.add(1, "Imlen");
		HT.add(2, "Kyojin");
		HT.add(3, "Full");
		System.out.print(HT.get(1));
		System.out.print(" ");
		System.out.print(HT.get(2));
		System.out.print(" ");
		System.out.println(HT.get(3));
		
		HT.remove(3);
		System.out.println(HT.get(3));

	}

}
