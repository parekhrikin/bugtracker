package com.finalproject.bugtracker.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.finalproject.bugtracker.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.finalproject.bugtracker.service.TaskService;

import java.util.List;

@RestController
@RequestMapping(value = "/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/taskList/{taskCode}")
    public List<TaskListModel> getTaskList(@PathVariable String taskCode) {
        return taskService.getTaskList(taskCode);
    }

}
