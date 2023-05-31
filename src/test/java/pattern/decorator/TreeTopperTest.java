package pattern.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTopperTest {
    private RealChristmasTree realChristmasTree;
    private ChristmasTree christmasTreeWithTreeTopper;

    @BeforeEach
    void setTreeTopper () {
        realChristmasTree = new RealChristmasTree();
        christmasTreeWithTreeTopper = new TreeTopper(realChristmasTree);
    }
    @DisplayName(value = "Constructor isn't null")
    @Test
    void shouldReturnNotNullIfConstructorIsNotNull () {
        assertNotNull(christmasTreeWithTreeTopper);
    }
    @DisplayName(value = "Method .decorate() is correct")
    @Test
    void shouldReturnEqualsIfMethodDecorateIsCorrect () {
        String test = "christmas tree with tree topper";
        String methodDecorate = christmasTreeWithTreeTopper.decorate();

        assertEquals(test, methodDecorate);
    }

}