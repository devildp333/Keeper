package com.keeper.managers.impl;

import com.keeper.entity.dto.TaskDTO;
import com.keeper.entity.Task;
import com.keeper.entity.User;
import com.keeper.managers.ITaskDtoManager;
import com.keeper.service.impl.TaskRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by Alexandr Vasiliev on 30.03.2017.
 *
 * @author Alexandr Vasiliev
 *
 */

@Service
public class TaskDtoDaoManager implements ITaskDtoManager {

    @Autowired
    private TaskRepoService repoService;

    //<editor-fold desc="Dao&Dto">

    @Override
    public Task parseDtoToDao(TaskDTO dtoMode) {
        return null;
    }

    @Override
    public TaskDTO parseDaoToDto(Task daoModel) {
        return null;
    }

    @Override
    public List<Task> parseDtoToDao(List<TaskDTO> dtoModelList) {
        return null;
    }

    @Override
    public List<TaskDTO> parseDaoToDto(List<Task> daoModelList) {
        return null;
    }
    //</editor-fold>

    //<editor-fold desc="Operations">

    @Override
    public TaskDTO addTask(Task TaskDTO) {
        return null;
    }

    @Override
    public TaskDTO getTask(Long id) {
        return null;
    }

    @Override
    public List<TaskDTO> getTask(User user) {
        return null;
    }

    @Override
    public List<TaskDTO> getTask(String theme) {
        return null;
    }

    @Override
    public List<TaskDTO> getTask(Set<String> tags) {
        return null;
    }

    @Override
    public List<TaskDTO> getAllTasks() {
        return null;
    }

    @Override
    public TaskDTO updateTask(TaskDTO task) {
        return null;
    }

    @Override
    public void removeTask(Long id) {

    }

    @Override
    public TaskDTO removeTask(TaskDTO task) {
        return null;
    }


    //</editor-fold>
}
