public class CalculatorTest {
 
    public static void main(String[] args) {
 
        Calculator calculator = new Calculator();
 
        boolean allTestsPassed = true;
 
        // Test 1
        int result1 = calculator.add(2, 3);
 
        if (result1 == 5) {
        	System.out.println("Test 1 PASSED");
        } else {
        	System.out.println("Test 1 FAILED");
        	allTestsPassed = false;
        }
 
        // Test 2
        int result2 = calculator.subtract(10, 4);
 
        if (result2 == 6) {
        	System.out.println("Test 2 PASSED");
        } else {
        	System.out.println("Test 2 FAILED");
        	allTestsPassed = false;
        }
 
        // Tell GitHub Actions whether the tests passed
        if (allTestsPassed) {
        	System.out.println("ALL TESTS PASSED");
        } else {
        	System.out.println("SOME TESTS FAILED");
        	System.exit(1);
        }
    }
}
