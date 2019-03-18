import com.codecool.gaborkallos.logger.Logger;
import com.codecool.gaborkallos.stack.StaticStack;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StaticStackTest {

    public static Logger LOGGER;
    public static StaticStack testStaticStack;

    @BeforeAll
    static void init() {
        LOGGER = new Logger();
        testStaticStack = new StaticStack(5);
        for (int i = 0; i < 5; i++) {
            try {
                testStaticStack.push(String.valueOf(i));
            } catch (Exception e) {
                LOGGER.log(e.getMessage());
            }
        }
    }

    @Test
    void push() {
        assertThrows(Exception.class, () -> {
            testStaticStack.push('O');
            LOGGER.log("Push test : Failure (Stack is full)!");
        });
        LOGGER.log("Push test : Success!");
    }

    @Test
    void pop() {
        StaticStack staticStack = new StaticStack(5);
        assertThrows(Exception.class, () -> {
            staticStack.pop();
            LOGGER.log("Pop test : Failure (Stack is empty)!");
        });
        LOGGER.log("Pop test : Success!");
    }

    @Test
    void peek() {
        StaticStack staticStack = new StaticStack(5);
        assertThrows(Exception.class, () -> {
            staticStack.peek();
            LOGGER.log("Peek test : Failure (Stack is empty)!");
        });
        LOGGER.log("Peek test : Success!");
    }
}


