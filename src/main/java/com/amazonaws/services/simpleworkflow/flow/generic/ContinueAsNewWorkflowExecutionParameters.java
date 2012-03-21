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


public class ContinueAsNewWorkflowExecutionParameters {
    private long executionStartToCloseTimeoutSeconds = FlowConstants.USE_REGISTERED_DEFAULTS;
    private String input;
    private List<String> tagList;
    private String taskList;
    private long taskStartToCloseTimeoutSeconds = FlowConstants.USE_REGISTERED_DEFAULTS;
    
    public ContinueAsNewWorkflowExecutionParameters() {
    }
    
    public long getExecutionStartToCloseTimeoutSeconds() {
        return executionStartToCloseTimeoutSeconds;
    }
    
    public void setExecutionStartToCloseTimeoutSeconds(long executionStartToCloseTimeoutSeconds) {
        this.executionStartToCloseTimeoutSeconds = executionStartToCloseTimeoutSeconds;
    }
    
    public ContinueAsNewWorkflowExecutionParameters withExecutionStartToCloseTimeoutSeconds(long executionStartToCloseTimeoutSeconds) {
        this.executionStartToCloseTimeoutSeconds = executionStartToCloseTimeoutSeconds;
        return this;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    public ContinueAsNewWorkflowExecutionParameters withInput(String input) {
        this.input = input;
        return this;
    } 

    public List<String> getTagList() {
        return tagList;
    }
    
    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }
    
    public ContinueAsNewWorkflowExecutionParameters withTagList(List<String> tagList) {
        this.tagList = tagList;
        return this;
    }

    public String getTaskList() {
        return taskList;
    }
    
    public void setTaskList(String taskList) {
        this.taskList = taskList;
    }
    
    public ContinueAsNewWorkflowExecutionParameters withTaskList(String taskList) {
        this.taskList = taskList;
        return this;
    }
    
    public long getTaskStartToCloseTimeoutSeconds() {
        return taskStartToCloseTimeoutSeconds;
    }
    
    public void setTaskStartToCloseTimeoutSeconds(long taskStartToCloseTimeoutSeconds) {
        this.taskStartToCloseTimeoutSeconds = taskStartToCloseTimeoutSeconds;
    }
    
    public ContinueAsNewWorkflowExecutionParameters withTaskStartToCloseTimeoutSeconds(long taskStartToCloseTimeoutSeconds) {
        this.taskStartToCloseTimeoutSeconds = taskStartToCloseTimeoutSeconds;
        return this;
    }

    public ContinueAsNewWorkflowExecutionParameters createContinueAsNewParametersFromOptions(StartWorkflowOptions options, 
            StartWorkflowOptions optionsOverride) {
        ContinueAsNewWorkflowExecutionParameters continueAsNewWorkflowExecutionParameters = this.clone();
        
        if (options != null) {
            Long executionStartToCloseTimeoutSeconds = options.getExecutionStartToCloseTimeoutSeconds();
            if (executionStartToCloseTimeoutSeconds != null) {
                continueAsNewWorkflowExecutionParameters.setExecutionStartToCloseTimeoutSeconds(executionStartToCloseTimeoutSeconds);
            }
            
            Long taskStartToCloseTimeoutSeconds = options.getTaskStartToCloseTimeoutSeconds();
            if (taskStartToCloseTimeoutSeconds != null) {
                continueAsNewWorkflowExecutionParameters.setTaskStartToCloseTimeoutSeconds(taskStartToCloseTimeoutSeconds);
            }
            
            List<String> tagList = options.getTagList();
            if (tagList != null) {
                continueAsNewWorkflowExecutionParameters.setTagList(tagList);
            }
            
            String taskList = options.getTaskList();
            if (taskList != null && !taskList.isEmpty()) { 
                continueAsNewWorkflowExecutionParameters.setTaskList(taskList);
            }
        }
        
        if (optionsOverride != null) {    
            Long executionStartToCloseTimeoutSeconds = optionsOverride.getExecutionStartToCloseTimeoutSeconds();
            if (executionStartToCloseTimeoutSeconds != null) {
                continueAsNewWorkflowExecutionParameters.setExecutionStartToCloseTimeoutSeconds(executionStartToCloseTimeoutSeconds);
            }
            
            Long taskStartToCloseTimeoutSeconds = optionsOverride.getTaskStartToCloseTimeoutSeconds();
            if (taskStartToCloseTimeoutSeconds != null) {
                continueAsNewWorkflowExecutionParameters.setTaskStartToCloseTimeoutSeconds(taskStartToCloseTimeoutSeconds);
            }
            
            List<String> tagList = optionsOverride.getTagList();
            if (tagList != null) {
                continueAsNewWorkflowExecutionParameters.setTagList(tagList);
            }
            
            String taskList = optionsOverride.getTaskList();
            if (taskList != null && !taskList.isEmpty()) { 
                continueAsNewWorkflowExecutionParameters.setTaskList(taskList);
            }
        }
        
        return continueAsNewWorkflowExecutionParameters;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("Input: " + input + ", ");
        sb.append("ExecutionStartToCloseTimeout: " + executionStartToCloseTimeoutSeconds + ", ");
        sb.append("TaskStartToCloseTimeout: " + taskStartToCloseTimeoutSeconds + ", ");
        sb.append("TagList: " + tagList + ", ");
        sb.append("TaskList: " + taskList);
        sb.append("}");
        return sb.toString();
    }
    
    public ContinueAsNewWorkflowExecutionParameters clone() {
        ContinueAsNewWorkflowExecutionParameters result = new ContinueAsNewWorkflowExecutionParameters();
        result.setExecutionStartToCloseTimeoutSeconds(executionStartToCloseTimeoutSeconds);
        result.setInput(input);
        result.setTagList(tagList);
        result.setTaskList(taskList);
        result.setTaskStartToCloseTimeoutSeconds(taskStartToCloseTimeoutSeconds);
        return result;
    }

}
