/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.generic;

import java.util.List;

import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;


public class StartChildWorkflowExecutionParameters implements Cloneable {
    private String control;
    private long executionStartToCloseTimeoutSeconds = FlowConstants.USE_REGISTERED_DEFAULTS;
    private String input;
    private List<String> tagList;
    private String taskList;
    private long taskStartToCloseTimeoutSeconds = FlowConstants.USE_REGISTERED_DEFAULTS;
    private String workflowId;
    private WorkflowType workflowType;
    
    public StartChildWorkflowExecutionParameters() {
    }
    
    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }
    
    public StartChildWorkflowExecutionParameters withControl(String control) {
        this.control = control;
        return this;
    }
    
    public long getExecutionStartToCloseTimeoutSeconds() {
        return executionStartToCloseTimeoutSeconds;
    }
    
    public void setExecutionStartToCloseTimeoutSeconds(long executionStartToCloseTimeoutSeconds) {
        this.executionStartToCloseTimeoutSeconds = executionStartToCloseTimeoutSeconds;
    }
    
    public StartChildWorkflowExecutionParameters withExecutionStartToCloseTimeoutSeconds(long executionStartToCloseTimeoutSeconds) {
        this.executionStartToCloseTimeoutSeconds = executionStartToCloseTimeoutSeconds;
        return this;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    public StartChildWorkflowExecutionParameters withInput(String input) {
        this.input = input;
        return this;
    } 

    public List<String> getTagList() {
        return tagList;
    }
    
    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }
    
    public StartChildWorkflowExecutionParameters withTagList(List<String> tagList) {
        this.tagList = tagList;
        return this;
    }

    public String getTaskList() {
        return taskList;
    }
    
    public void setTaskList(String taskList) {
        this.taskList = taskList;
    }
    
    public StartChildWorkflowExecutionParameters withTaskList(String taskList) {
        this.taskList = taskList;
        return this;
    }
    
    public long getTaskStartToCloseTimeoutSeconds() {
        return taskStartToCloseTimeoutSeconds;
    }
    
    public void setTaskStartToCloseTimeoutSeconds(long taskStartToCloseTimeoutSeconds) {
        this.taskStartToCloseTimeoutSeconds = taskStartToCloseTimeoutSeconds;
    }
    
    public StartChildWorkflowExecutionParameters withTaskStartToCloseTimeoutSeconds(long taskStartToCloseTimeoutSeconds) {
        this.taskStartToCloseTimeoutSeconds = taskStartToCloseTimeoutSeconds;
        return this;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }
    
    public StartChildWorkflowExecutionParameters withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    
    public WorkflowType getWorkflowType() {
        return workflowType;
    }
    
    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }
    
    public StartChildWorkflowExecutionParameters withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
        return this;
    }
    
    public StartChildWorkflowExecutionParameters createStartChildWorkflowExecutionParametersFromOptions(StartWorkflowOptions options, 
            StartWorkflowOptions optionsOverride) {
        StartChildWorkflowExecutionParameters startChildWorkflowExecutionParameters = this.clone();
        
        if (options != null) {
            Long executionStartToCloseTimeoutSeconds = options.getExecutionStartToCloseTimeoutSeconds();
            if (executionStartToCloseTimeoutSeconds != null) {
                startChildWorkflowExecutionParameters.setExecutionStartToCloseTimeoutSeconds(executionStartToCloseTimeoutSeconds);
            }
            
            Long taskStartToCloseTimeoutSeconds = options.getTaskStartToCloseTimeoutSeconds();
            if (taskStartToCloseTimeoutSeconds != null) {
                startChildWorkflowExecutionParameters.setTaskStartToCloseTimeoutSeconds(taskStartToCloseTimeoutSeconds);
            }
            
            List<String> tagList = options.getTagList();
            if (tagList != null) {
                startChildWorkflowExecutionParameters.setTagList(tagList);
            }
            
            String taskList = options.getTaskList();
            if (taskList != null && !taskList.isEmpty()) { 
                startChildWorkflowExecutionParameters.setTaskList(taskList);
            }
        }
        
        if (optionsOverride != null) {    
            Long executionStartToCloseTimeoutSeconds = optionsOverride.getExecutionStartToCloseTimeoutSeconds();
            if (executionStartToCloseTimeoutSeconds != null) {
                startChildWorkflowExecutionParameters.setExecutionStartToCloseTimeoutSeconds(executionStartToCloseTimeoutSeconds);
            }
            
            Long taskStartToCloseTimeoutSeconds = optionsOverride.getTaskStartToCloseTimeoutSeconds();
            if (taskStartToCloseTimeoutSeconds != null) {
                startChildWorkflowExecutionParameters.setTaskStartToCloseTimeoutSeconds(taskStartToCloseTimeoutSeconds);
            }
            
            List<String> tagList = optionsOverride.getTagList();
            if (tagList != null) {
                startChildWorkflowExecutionParameters.setTagList(tagList);
            }
            
            String taskList = optionsOverride.getTaskList();
            if (taskList != null && !taskList.isEmpty()) { 
                startChildWorkflowExecutionParameters.setTaskList(taskList);
            }
        }
        
        return startChildWorkflowExecutionParameters;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("WorkflowType: " + workflowType + ", ");
        sb.append("WorkflowId: " + workflowId + ", ");
        sb.append("Input: " + input + ", ");
        sb.append("Control: " + control + ", ");
        sb.append("ExecutionStartToCloseTimeout: " + executionStartToCloseTimeoutSeconds + ", ");
        sb.append("TaskStartToCloseTimeout: " + taskStartToCloseTimeoutSeconds + ", ");
        sb.append("TagList: " + tagList + ", ");
        sb.append("TaskList: " + taskList);
        sb.append("}");
        return sb.toString();
    }
    
    public StartChildWorkflowExecutionParameters clone() {
        StartChildWorkflowExecutionParameters result = new StartChildWorkflowExecutionParameters();
        result.setControl(control);
        result.setExecutionStartToCloseTimeoutSeconds(executionStartToCloseTimeoutSeconds);
        result.setInput(input);
        result.setTagList(tagList);
        result.setTaskList(taskList);
        result.setTaskStartToCloseTimeoutSeconds(taskStartToCloseTimeoutSeconds);
        result.setWorkflowId(workflowId);
        result.setWorkflowType(workflowType);
        return result;
    }

}
