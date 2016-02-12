
class HelloWorld {
	
	// toString for every object
	// referenced data type
	// immutable


	public static String reverseString(String original) {
		if (original.length() < 2) {
			return original;
		}
		return reverseString(original.substring(1)) + original.charAt(0);
		// elloh
		// ("ello") + 'h'
		// "llo" + 'e' + 'h'
		// "lo" + 'l' + 'e' + 'h'
	}

	public static void main(String[] args) {

		// Literal --> String pool (Heap -- perm space)
		String s = "Hello World";

		// New operator --> Heap
		String t = new String("Hello World");

		// Making a string:
		// ----------------

		// Concatenate
		String h = "Hello ";
		String w = "World";
		System.out.println(h.concat(w));
		System.out.println(h + w + "s");

		// Formating
		String d = String.format("Steve has %d cats", 5);
		// %d --> integer
		// %s --> String
		// %f --> floats
		System.out.println(d);

		// Substrings
		System.out.println(h + d.substring(5));


		// String instance methods

		// Length
		String hiThere = "Hi there";
		System.out.println(hiThere.length());

		// charAt
		System.out.println(hiThere.charAt(3));

		// indexOf
		System.out.println(hiThere.indexOf('e'));
		System.out.println(hiThere.indexOf('e', 6));
		System.out.println(hiThere.lastIndexOf('e'));

		// toUpperCase()
		System.out.println(hiThere.toUpperCase());
		System.out.println(hiThere);
		// pointer hiThere --> "hi there"
		// hiThere = "hello";
		// pointer hiTHere (address) --> "hello"
		// "hi there" --> System.out.println(hiThere);

		// toLowerCase()
		System.out.println(hiThere.toLowerCase());

		// replace
		String hiThereReplaced = hiThere.replace('e', 'z');
		System.out.println(hiThereReplaced);
		System.out.println(hiThere);


		// How to Reverse a String in Java?

		String reverse = "hello";

		// 1. Library Method
		StringBuilder sB = new StringBuilder(reverse).reverse();
		System.out.println(sB);


		String original = "hello";

		// 2. Iterative
		String re = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			re = re + original.charAt(i);
			// "" + o
			// "o" + l
			// "ol" + l
			// ... "olleh"
		}
		System.out.println(re);

		// 3. Recursion
		System.out.println(reverseString(original));













		
	}

}