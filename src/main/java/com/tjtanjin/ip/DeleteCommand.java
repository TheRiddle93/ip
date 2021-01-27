package com.tjtanjin.ip;

/**
 * Entry point for handling logic and execution of delete command.
 */
public class DeleteCommand {

    private final TaskHandler taskHandler;

    /**
     * Constructor for DeleteCommand.
     * @param taskHandler provides access for command to modify tasks
     */
    public DeleteCommand(TaskHandler taskHandler) {
        this.taskHandler = taskHandler;
    }

    /**
     * Forwards the delete task operation to TaskHandler.
     * @param index of task to delete
     * @return string response after operation is done
     */
    public String execute(int index) {
        return taskHandler.deleteTask(index);
    }
}
