package com.manojJM.userData.controller; // Task 16: Add a scheduled task

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task16_ScheduledTaskController {

    /* Task 16: Log "Application is running" every 5 minutes
	 * changes in ManojJmUserDataApplication.java File
	 */
    @Scheduled(fixedRate = 300000)
    public void logMessage() {
        System.out.println("Application is running");
    }
}
