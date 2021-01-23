import java.time.LocalDate;

/**
 * Entry point for handling logic and execution of done command.
 */
public class DoneCommand {

    /**
     * Forwards the mark task as done operation to TaskList.
     * @param index of task to mark as done
     */
    public static void execute(int index) {
        Task task = TaskList.tasks.get(index);
        TaskList.markTaskDone(index);
        String taskName = task.getTaskName();
        String taskType = task.getType().toUpperCase();
        LocalDate taskDate = task.getDate();
        Storage.saveTask(index, "DONE", taskName, "complete", taskType, taskDate);
    }
}