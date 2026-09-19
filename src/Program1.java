public class Program1 {
    public static void main(String[] args) {
        // Imperative programming: a sequence of statements that changes state step by step.
        int score = 10;
        int bonus = 5;
        int total = score + bonus;

        // Java keywords: public, class, static, void, int, if, else, return, for, while, etc.
        // Java identifiers: Program1, main, score, bonus, total, result.
        System.out.println("Imperative style example:");
        System.out.println("Initial score: " + score);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total: " + total);

        demonstratePrimitiveTypes();
        demonstrateVariablesAndScope();
        demonstrateOperators();
        demonstrateTypeConversion();
        demonstrateOperatorPrecedence();
    }

    private static void demonstratePrimitiveTypes() {
        System.out.println("\nPrimitive types and literals:");

        byte tinyValue = 127;
        short mediumValue = 32000;
        int wholeNumber = 42;
        long largeNumber = 9876543210L;
        float decimalValue = 3.5f;
        double preciseValue = 3.14159265359d;
        char letter = 'J';
        boolean isJavaFun = true;

        System.out.println("byte: " + tinyValue);
        System.out.println("short: " + mediumValue);
        System.out.println("int: " + wholeNumber);
        System.out.println("long: " + largeNumber);
        System.out.println("float: " + decimalValue);
        System.out.println("double: " + preciseValue);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isJavaFun);
    }

    private static void demonstrateVariablesAndScope() {
        System.out.println("\nVariables and scope/lifetime:");

        int outerValue = 100;
        {
            int innerValue = 25;
            System.out.println("Inner block variable: " + innerValue);
            System.out.println("Outer value inside block: " + outerValue);
        }

        // innerValue is out of scope here.
        System.out.println("Outer value after block: " + outerValue);
    }

    private static void demonstrateOperators() {
        System.out.println("\nOperators:");

        int a = 10;
        int b = 3;

        System.out.println("Arithmetic: " + (a + b) + ", " + (a - b) + ", " + (a * b) + ", " + (a / b) + ", " + (a % b));
        System.out.println("Relational: " + (a > b) + ", " + (a == b) + ", " + (a != b));
        System.out.println("Logical: " + ((a > 5) && (b < 5)) + ", " + ((a < 5) || (b > 1)) + ", " + !(a == b));

        int bitmask = 0b1100;
        int shifted = bitmask << 1;
        int andResult = bitmask & 0b1010;
        int orResult = bitmask | 0b0011;

        System.out.println("Bitwise: " + shifted + ", " + andResult + ", " + orResult);

        int assigned = 5;
        assigned += 2;
        assigned *= 3;
        System.out.println("Assignment operator result: " + assigned);
    }

    private static void demonstrateTypeConversion() {
        System.out.println("\nType conversion and casting:");

        int integerValue = 100;
        double widenedValue = integerValue; // implicit widening conversion
        System.out.println("Widening conversion: int -> double: " + widenedValue);

        double decimalValue = 45.75;
        int narrowedValue = (int) decimalValue; // explicit narrowing cast
        System.out.println("Narrowing cast: double -> int: " + narrowedValue);

        byte small = 12;
        short converted = (short) (small + 100);
        System.out.println("Explicit cast after arithmetic: " + converted);
    }

    private static void demonstrateOperatorPrecedence() {
        System.out.println("\nOperator precedence:");

        int x = 10;
        int y = 5;
        int z = 2;

        int result = x + y * z;
        int resultWithParentheses = (x + y) * z;

        System.out.println("x + y * z = " + result);
        System.out.println("(x + y) * z = " + resultWithParentheses);

        boolean check = x > y && y > z || x == 10;
        System.out.println("Boolean expression example: " + check);
    }
}
