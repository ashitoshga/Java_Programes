package generic;
import java.util.*;

public class CollectionExamples {

	public static void main(String[] args) {
		
		//Sets---Hashvalues
		//Set is an Interface and Hashset, Treeset and Linkedset classes implements it
		//objects are stored using Hashcodes, while LinkedList they are stored as index
		
		//Hashset
		//can store, String, Integer
		//cannot store Duplicates, and has no particular Insertion order
		//Extremely fast compared to Treeset, Linkedset
		
		Set<String> names = new HashSet<>();
		names.add("Ashitosh");
		names.add("Tejaswi");
		names.add("Yadnyaa");
		names.add("Nisha");
		names.add("Aniket");
		names.add("Payal");
		names.add("Aarav");
		System.out.println("size of set is"+" "+names.size());
		System.out.println(names);
		System.out.println(names.contains("Aarav"));
		System.out.println(names.contains("Arav"));
		names.remove("Aarav");
		//to remove all obj use clear()
		
		
		Iterator itr = names.iterator();
		//Using For each to iterate through each obj in the set
		for(String str:names)
		{
			System.out.println("For each obj"+" "+str);
		}
		//Using Lambda function
		names.forEach(System.out::println);
		
		//another way to iterate through each obj in the set
		while(itr.hasNext())
		{
			System.out.println("iterating using next()"+" "+itr.next());
		}
		
		//Treeset- Similar to Hashset except it stores obj in natural order(alphabeticallY)
		//extremely slower
		//Set treeset = new TreeSet<>();
		//treeset.addAll(names);
		
		//OR instead of using addall, directly pass collection object into constructor
		Set treeset = new TreeSet<>(names);
		//treeset.addAll(names);
		System.out.println("Treeset items"+" "+treeset);
		
		//LinkedList- Similar to Hashset except it maintains the Insertion order
		//slower than Hashset
		Set linkedset = new LinkedHashSet<>();
		linkedset.addAll(names);
		System.out.println("LinkedHashset items"+" "+linkedset);
		
		
		//ArrayList
		
		List<String> arrList = new ArrayList<>();
		arrList.addAll(names);
		
		System.out.println("ArrayList items"+" "+arrList);
		System.out.println("Second item from the ArrayList"+" "+arrList.get(1));
		arrList.remove(1);
		System.out.println("ArrayList items after removal of 2nd item"+" "+arrList);
		
		
		//Maps--Key-Value pairs
		//In diamond bracket<> put key-value relation like String to Integer
		//it cannot accepts primitive datatypes
		//insertion order is not followed
		
		System.out.println("******Map*******");
		HashMap<String, Integer> hs = new HashMap<>();
		hs.put("John", 1111);		
		hs.put("Marry", 2222);
		hs.put("Tom", 3333);
		hs.put("Rick", 4444);
		
		//get values and check if they are present
		System.out.println("To get a single value from a key"+" "+hs.get("Marry"));
		System.out.println("To check if a key is present"+" "+hs.containsKey("Marry"));
		System.out.println("To check if a value is present"+" "+hs.containsValue(2222));
		
		//put method replaces value if already exists
		hs.put("John", 1234);
		System.out.println("HashMap values after PUT are"+" "+hs);
		
		//putIfAbsent--put new item if not already exists
		hs.putIfAbsent("New", 5555);
		//if key already present then it will not replace its value
		hs.putIfAbsent("John", 6666);
		System.out.println("HashMap values after putIfAbsent are"+" "+hs);
		
		//replace--it only replaces values of keys if they exists, while PUT creates it
		hs.replace("Ashitosh", 5555);
		System.out.println("HashMap values after Relace are"+" "+hs);
		//no output for Ashitosh
	}

}
