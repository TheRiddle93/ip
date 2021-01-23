package com.tjtanjin.ip;

import java.util.HashMap;

/**
 * Entry point for handling logic and execution of help command.
 */
public class HelpCommand {
    /**
     * List all available command usage and descriptions.
     * @param cmdInfo mapping of each command and their information
     */
    public static void execute(HashMap<String, String> cmdInfo) {
        Ui.showInfo("The available commands are as listed below:");
        for (String info : cmdInfo.values()) {
            Ui.showInfo(info);
        }
    }
}
