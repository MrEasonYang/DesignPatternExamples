package com.designpattern.Command;

/**
 * Created by Eason Yang on 12/24/2015.
 */
public class TestTaskMinder {
    public static void main(String args[]) {
        TaskMinder tm1 = new TaskMinder(500, 100);

        FortuneTask fortuneTask1 = new FortuneTask();

        tm1.addTask(fortuneTask1, 3000);

        TaskMinder tm2 = new TaskMinder(500, 100);

        FortuneTask fortuneTask2 = new FortuneTask();

        tm2.addTask(fortuneTask2, 3000);

    }
}
