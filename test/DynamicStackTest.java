import com.codecool.gaborkallos.logger.Logger;
import com.codecool.gaborkallos.stack.DynamicStack;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class DynamicStackTest {

    private static Logger LOGGER;
    private static DynamicStack testDynamicStack;

    @BeforeAll
    static void init() {
        LOGGER = new Logger();
        testDynamicStack = new DynamicStack();

    }

    @Test
    void pop() {
        assertThrows(Exception.class, () -> {
            testDynamicStack.pop();
            LOGGER.log("DynamicStack pop test : Failure (Stack is full)!");
        });
        LOGGER.log("DynamicStack pop Test : Success!");
    }

    @Test
    void peek() {
        assertThrows(Exception.class, () -> {
            testDynamicStack.peek();
            LOGGER.log("DynamicStack peek test : Failure (Stack is empty)!");
        });
        LOGGER.log("DynamicStack peek test : Success!");
    }

}
