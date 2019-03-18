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
            LOGGER.log("StaticStack push test : Failure (Stack is full)!");
        });
        LOGGER.log("StaticStack push test : Success!");
    }

    @Test
    void pop() {
        StaticStack staticStack = new StaticStack(5);
        assertThrows(Exception.class, () -> {
            staticStack.pop();
            LOGGER.log("StaticStack pop test : Failure (Stack is empty)!");
        });
        LOGGER.log("StaticStack pop test : Success!");
    }

    @Test
    void peek() {
        StaticStack staticStack = new StaticStack(5);
        assertThrows(Exception.class, () -> {
            staticStack.peek();
            LOGGER.log("StaticStack peek test : Failure (Stack is empty)!");
        });
        LOGGER.log("StaticStack peek test : Success!");
    }
}


