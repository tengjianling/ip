package duke.command;

import duke.Duke;
import duke.storage.Storage;
import duke.task.Task;
import duke.tasklist.TaskList;
import duke.ui.Ui;

/**
 * Represents a user command that deletes a task from the task list.
 */
public class DeleteCommand extends Command {
    private String userInput;

    public DeleteCommand(String userInput) {
        this.userInput = userInput;
    }

    public boolean isExit() {
        return false;
    }

    /**
     * Checks for the number specified by the user, and deletes the task at that
     * number accordingly.
     *
     * @param tasks List of <code>Task</code> objects.
     * @param ui Ui object created by Duke.
     * @param storage Storage object created by Duke.
     */
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        String fileString = tasks.listToString();
        int taskNumber = Integer.parseInt(userInput.substring(7));
        Task curr = tasks.get(taskNumber - 1);
        String taskToBeDeleted = curr.taskToText();
        System.out.println("    Noted. I've removed this task:\n"
                + "        " + tasks.get(taskNumber - 1));
        tasks.remove(taskNumber - 1);
        System.out.println("    Now you have " + tasks.size() + " tasks in the list.");

        fileString = fileString.replace(taskToBeDeleted + "\n", "");

        // saves fileString to txt file
        Storage.save(Duke.FILENAME, fileString);
    }

    public String executeToString(TaskList tasks, Ui ui, Storage storage) {
        String fileString = tasks.listToString();

        String result = "";

        int taskNumber = Integer.parseInt(userInput.substring(7));
        Task curr = tasks.get(taskNumber - 1);
        String taskToBeDeleted = curr.taskToText();
        result = "    Noted. I've removed this task:\n"
                + "        " + tasks.get(taskNumber - 1);
        tasks.remove(taskNumber - 1);
        result += ("\n    Now you have " + tasks.size() + " tasks in the list.");

        fileString = fileString.replace(taskToBeDeleted + "\n", "");

        // saves fileString to txt file
        Storage.save(Duke.FILENAME, fileString);
        return result;
    }
}

