package pattern.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarlandTest {

    private RealChristmasTree realChristmasTree;
    private ChristmasTree christmasTreeWithGarlands;

    @BeforeEach
    void setGarland () {
        realChristmasTree = new RealChristmasTree();
        christmasTreeWithGarlands = new Garland(realChristmasTree);
    }
    @DisplayName(value = "Constructor isn't null")
    @Test
    void shouldReturnNotNullIfConstructorIsNotNull () {
        assertNotNull(christmasTreeWithGarlands);
    }
    @DisplayName(value = "Method .decorate() is correct")
    @Test
    void shouldReturnEqualsIfMethodDecorateIsCorrect () {
        String test = "christmas tree with garlands";
        String methodDecorate = christmasTreeWithGarlands.decorate();

        assertEquals(test, methodDecorate);
    }

}