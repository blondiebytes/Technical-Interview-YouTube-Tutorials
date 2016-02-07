
// Technical Screening 

public class FizzBuzz {

	// 1 to 100
		// if mult 3: Fizz
		// if mult 5: Buzz
		// if mult 3 & 5: FizzBuzz
		// otherwise print the number

	public static void main(String[] args) {
		

		// Good Q: Is this inclusive?
		// Bad Q: What is for-loop?

		for (int i = 1; i < 100; i++) {
			// i is mult 3?
			// i  / 3 is a whole number --> no remainder 
			// mod
		//	if (i % 3 == 0) {
		//		System.out.println("Fizz");
		//	} else if (i % 5 == 0) {
		//		System.out.println("Buzz");
		//	} else if (i % 3 == 0 && i % 5 == 0) {
		//		System.out.println("FizzBuzz");
		//		} else {
		//		System.out.println(i);
		//	}

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}

			// String s = condition ? whatHappensIfTrue : whatHappensIfFalse



		}

	}


}