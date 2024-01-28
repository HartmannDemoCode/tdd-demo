package dk.cphbusiness;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo1TestLogicTest {

    @Test
    @DisplayName("Test add method")
    void add() {
        // Arrange (See README.md for explanation)
        Demo1TestLogic logic = new Demo1TestLogic();
        int first = 2;
        int second = 3;

        // Act
        int result = logic.add(first, second);
        int expected = 5;

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test max method with a > b")
    void max() {
        // Arrange (See README.md for explanation)
        Demo1TestLogic logic = new Demo1TestLogic();
        int a = 5;
        int b = 3;

        // Act
        int result = logic.max(a, b);
        int expected = a;

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test max method with a < b")
    void max2() {
        // Arrange (See README.md for explanation)
        Demo1TestLogic logic = new Demo1TestLogic();
        int b = 5;
        int a = 3;

        // Act
        int result = logic.max(a, b);
        int expected = b;

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test max method with a = b")
    void max3() {
        // Arrange (See README.md for explanation)
        Demo1TestLogic logic = new Demo1TestLogic();
        int b = 4;
        int a = 4;

        // Act
        int result = logic.max(a, b);
        int expected = 4;

        // Assert
        assertEquals(expected, result);
    }


    @Test
    void getGrade() {
        // Arrange (See README.md for explanation)
        Demo1TestLogic logic = new Demo1TestLogic();

        int[] boundaryValues = {70, 80, 81, 89, 90, 91, /* add more values as needed */};

        // Act and Assert in a loop
        for (int score : boundaryValues) {
            // Act
            String result = logic.getGrade(score);

            // Assert
            switch(score) {
                case 70:
                    assertEquals("C", result);
                    break;
                case 80:
                    assertEquals("B", result);
                    break;
                case 81:
                case 89:
                    assertEquals("B", result);
                    break;
                case 90:
                case 91:
                    assertEquals("A", result);
                    break;
                default:
                    assertEquals("C", result);
            }
        }
    }
}