package Practicals;

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening) - happens automatically
        int intValue = 10;
        long longValue = intValue; // int is implicitly cast to long

        float floatValue = 20.5f;
        double doubleValue = floatValue; // float is implicitly cast to double

        System.out.println("Implicit Casting:");
        System.out.println("int to long: " + longValue);
        System.out.println("float to double: " + doubleValue);
    }
}


public class ExplicitTypeCasting {
    public static void main(String[] args) {
        // Explicit casting (narrowing) - requires manual intervention
        double doubleValue = 30.75;
        int intValue = (int) doubleValue; // double is explicitly cast to int

        long longValue = 123456789012345L;
        int intValueFromLong = (int) longValue; // long is explicitly cast to int

        System.out.println("Explicit Casting:");
        System.out.println("double to int: " + intValue);
        System.out.println("long to int: " + intValueFromLong);
    }
}

