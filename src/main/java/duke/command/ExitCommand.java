package duke.command;

import duke.storage.Storage;
import duke.tasklist.TaskList;
import duke.ui.Ui;
import javafx.application.Platform;

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
     * Prints the template for exiting the Duke program.
     *
     * @param tasks List of <code>Task</code> objects.
     * @param ui Ui object created by Duke.
     * @param storage Storage object created by Duke.
     */
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        System.out.println("    Bye. Hope to see you again soon!\n");
    }

    public String executeToString(TaskList tasks, Ui ui, Storage storage) {
        return "    Bye. Hope to see you again soon!\n";
    }
}

