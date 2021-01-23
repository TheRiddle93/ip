package com.tjtanjin.ip;

/**
 * Entry point for handling logic and execution of list command.
 */
public class ListCommand {
    /**
     * List all tasks entered by user.
     */
    public static void execute() {
        TaskList.showAllTasks();
    }
}
