package pattern.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleLightsTest {

    private RealChristmasTree realChristmasTree;
    private ChristmasTree christmasTreeWithBubbleLights;

    @BeforeEach
    void setBubbleLights() {
        realChristmasTree = new RealChristmasTree();
        christmasTreeWithBubbleLights = new BubbleLights(realChristmasTree);
    }

    @DisplayName(value = "Constructor isn't null")
    @Test
    void shouldReturnNotNullIfConstructorIsNotNull () {
        assertNotNull(christmasTreeWithBubbleLights);
    }

    @DisplayName(value = "Method .decorate() is correct")
    @Test
    void shouldReturnEqualsIfMethodDecorateIsCorrect () {
        String test = "christmas tree with bubble lights";
        String decorateMethod = christmasTreeWithBubbleLights.decorate();

        assertEquals(test, decorateMethod);
    }

}