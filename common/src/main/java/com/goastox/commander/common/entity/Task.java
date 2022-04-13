package com.goastox.commander.common.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Task {

//    private int seq;

    private long taskId;
    private String taskType;

    private String referenceTaskName;

    private Map<String, Object> inputData = new HashMap<>();
    private Map<String, Object> outputData = new HashMap<>();

    private String condition;
    private int retryCount;

    private String subWorkflowId;


}