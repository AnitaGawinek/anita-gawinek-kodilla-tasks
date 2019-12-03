package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TaskMapperTest {

    @InjectMocks
    private TaskMapper taskMapper;

    @Test
    public void testMapToTask() {
        // Given
        TaskDto taskDto = new TaskDto(1L, "Test title", "Test content");

        // When
        Task mappedTask = taskMapper.mapToTask(taskDto);

        // Then
        assertEquals(1L, mappedTask.getId(), 0.001);
        assertEquals("Test title", mappedTask.getTitle());
        assertEquals("Test content", mappedTask.getContent());
    }

    @Test
    public void testMapToTaskDto() {
        // Given
        Task task = new Task(1L, "Test title", "Test content");

        // When
        TaskDto mappedTaskDto = taskMapper.mapToTaskDto(task);

        // Then
        assertEquals(1L, mappedTaskDto.getId(), 0.001);
        assertEquals("Test title", mappedTaskDto.getTitle());
        assertEquals("Test content", mappedTaskDto.getContent());
    }

    @Test
    public void testMapToTaskDtoList() {
        // Given
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task(1L, "Test title", "Test content"));

        // When
        List<TaskDto> mappedList = taskMapper.mapToTaskDtoList(taskList);

        // Then
        assertEquals(1, mappedList.size());
    }
}