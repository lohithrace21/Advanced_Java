/*Develop a Java program to make a  Performance Test on  StringBuffer and StringBuilder for
 appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify 
your answer which one is better.*/

package stringoperation;

public class StringBufferVsStringBuilderTest {
	    public static void main(String[] args) {
	        int iterations = 10000;
	        String appendText = "AIET";

	        // Test StringBuffer
	        StringBuffer stringBuffer = new StringBuffer();
	        long startBuffer = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(appendText);
	        }

	        long endBuffer = System.nanoTime();
	        long timeBuffer = endBuffer - startBuffer;

	        // Test StringBuilder
	        StringBuilder stringBuilder = new StringBuilder();
	        long startBuilder = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(appendText);
	        }

	        long endBuilder = System.nanoTime();
	        long timeBuilder = endBuilder - startBuilder;

	        // Display results
	        System.out.println("Time taken by StringBuffer: " + timeBuffer / 1_000_000.0 + " ms");
	        System.out.println("Time taken by StringBuilder: " + timeBuilder / 1_000_000.0 + " ms");

	        // Justification
	        if (timeBuffer > timeBuilder) {
	            System.out.println("Result: StringBuilder is faster.");
	        } else {
	            System.out.println("Result: StringBuffer is faster.");
	        }
	    }
	}
