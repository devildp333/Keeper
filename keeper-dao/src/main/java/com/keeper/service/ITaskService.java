package com.keeper.service;

/*
 * Created by GoodforGod on 23.03.2017.
 *
 * Updated by AlexVasil on 30.03.2017.
 *
 */

import com.keeper.entity.Task;
import com.keeper.entity.User;

import java.util.List;
import java.util.Set;

public interface ITaskService {
    Task addTask(Task task);

    Task getTask(Long id);
    List<Task> getTask(String theme);
    List<Task> getTask(Set<String> tags);

    List<Task> getUserTask(Long userId);
    List<Task> getUserTask(String email, String phone);

    List<Task> getAllTasks();

    Task updateTask(Task task);

    void removeTask(Long id);
    Task removeTask(Task task);
}
