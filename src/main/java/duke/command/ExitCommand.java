package duke.command;

import duke.storage.Storage;
import duke.tasklist.TaskList;
import duke.ui.Ui;

/**
 * Represents a user command to exit the Duke program.
 */
public class ExitCommand extends Command {
    private String userInput;

    public ExitCommand(String userInput) {
        this.userInput = userInput;
    }

    public boolean isExit() {
        return true;
    }

    /**
     * Exits the Duke program.
     *
     * @param tasks List of <code>Task</code> objects.
     * @param ui Ui object created by Duke.
     * @param storage Storage object created by Duke.
     * @return Empty string
     */
    public String executeToString(TaskList tasks, Ui ui, Storage storage) {
        return "";
    }
}

