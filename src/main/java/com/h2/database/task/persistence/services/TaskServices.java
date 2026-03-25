package com.h2.database.task.persistence.services;


import com.h2.database.task.persistence.entity.Task;
import com.h2.database.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServices {
    @Autowired
    private TaskRepository repository;

    // LIST ALL TASKS
    public List<Task> getTasksAll(){
        return  repository.findAll();
    }

    // CREATE NEW TASK
    public Task createTask(Task task){
        if(task.getNombre() == null || task.getNombre().isEmpty()
        || task.getAreaTrabajo() == null || task.getAreaTrabajo().isEmpty()
        ){
            throw  new RuntimeException("Input All Values...");
        }
        return repository.save(task);
    }

}
