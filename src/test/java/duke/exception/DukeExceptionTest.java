package duke.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import duke.task.Task;

public class DukeExceptionTest {
    @Test
    public void testExpectedException() {
        Assertions.assertThrows(DukeException.class, () -> {
            Task t = new Task("asdfg");
            t.validate();
        });
    }
}
