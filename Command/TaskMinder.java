package com.designpattern.Command;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Eason Yang on 12/24/2015.
 */
public class TaskMinder extends Thread {
	private long sleepInterval;
	private Vector taskList;
	public TaskMinder(long sleepInterval, int maxTasks) {
		this.sleepInterval = sleepInterval;
		taskList = new Vector(maxTasks);
		start();
	}
	public void addTask(Task task, long repeatInterval) {
		long ri = (repeatInterval > 0) ? repeatInterval : 0;
		TaskEntry te = new TaskEntry(task, ri);
		taskList.addElement(te);
	}

	public Enumeration getTasks() {return taskList.elements();}
	public long getSleepInterval() {return sleepInterval;}
	public void setSleepInterval(long si) {
		this.sleepInterval = si;
	}
	public void run() {
		while (true) {
			try {
				sleep(sleepInterval);
				long now = System.currentTimeMillis();
				Enumeration e = taskList.elements();
				while (e.hasMoreElements()) {
					TaskEntry te = (TaskEntry) e.nextElement();
					if (te.getRepeatInterval() + te.getTimeLastDone() < now) {
						te.getTask().performTask();
						te.setTimeLastDone(now);
					}
				}
			} catch (Exception e) {
				System.out.println("Interrupted sleep: " + e);
			}
		}
	}
}

