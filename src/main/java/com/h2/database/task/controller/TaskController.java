package com.h2.database.task.controller;


import com.h2.database.task.persistence.entity.Task;
import com.h2.database.task.persistence.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    TaskServices services;

    // LIST OF ALL TASKS
    @GetMapping("")
    public List<Task> listAllTasks(){
        return services.getTasksAll();
    }

    //CREATE NEW TASK
    @PostMapping("")
    public Task createTask(@RequestBody Task task){
        return services.createTask(task);
    }

}
