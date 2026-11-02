public class GradeTest {
    public static void main(String[] args) {
        String result = Grade.calculate(85);

        if (result.equals("A")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.exit(1);
        }
    }
}