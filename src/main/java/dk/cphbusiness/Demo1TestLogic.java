package dk.cphbusiness;

/**
 * Purpose: Show how to write systematic unit tests
 *
 * @author: Thomas Hartmann
 */
public class Demo1TestLogic {
    // method with a simple logic to test
    public int add(int a, int b) {
        return a + b;
    }
    // method with 2 branches to test
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int max2(int a, int b) {
        return a > b ? a : b;
    }

    // method with 3 branches to test
    public String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else {
            return "C";
        }
    }

    // method with String input to test if protocol is followed
    public String getRequestResource(String request){
        // Request should be on the form: GET /index.html HTTP/1.1
        String[] parts = request.split("\n");
        if(parts.length != 3) {
            throw new IllegalArgumentException("Illegal request");
        }
        if(!parts[0].startsWith("GET") || !parts[0].startsWith("POST")) {
            throw new IllegalArgumentException("Illegal request: Must be GET or POST");
        }
        if(!parts[2].startsWith("HTTP/1.1")) {
            throw new IllegalArgumentException("Illegal request: Must be HTTP/1.1");
        }
        return parts[1];
    }

}
