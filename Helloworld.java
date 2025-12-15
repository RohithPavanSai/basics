/**
 * HelloWorld class - A simple program demonstrating Java basics
 */
class HelloWorld {
    
    private static final String GREETING = "Helllllllllllllllllllllllllllllllllllllllllo, World!";
    
    public static void main(String[] args) {
        printGreeting();
        printProgramInfo();
        demonstrateLooping();
    }
    
    /**
     * Prints the greeting message
     */
    private static void printGreeting() {
        System.out.println(GREETING);
    }
    
    /**
     * Prints program information
     */
    private static void printProgramInfo() {
        System.out.println("\n--- Program Information ---");
        System.out.println("Program Name: HelloWorld");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Operating System: " + System.getProperty("os.name"));
    }
    
    /**
     * Demonstrates a simple loop
     */
    private static void demonstrateLooping() {
        System.out.println("\n--- Counting Loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}
