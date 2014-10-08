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

import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public class StartWorkflowExecutionParameters {

    private String workflowId;
    
    private WorkflowType workflowType;
    
    private String taskList;
    
    private String input;
    
    private long executionStartToCloseTimeoutSeconds = FlowConstants.USE_REGISTERED_DEFAULTS;
    
    private long taskStartToCloseTimeoutSeconds = FlowConstants.USE_REGISTERED_DEFAULTS;
    
    private java.util.List<String> tagList;
    
    /**
     * Returns the value of the WorkflowId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The value of the WorkflowId property for this object.
     */
    public String getWorkflowId() {
        return workflowId;
    }
    
    /**
     * Sets the value of the WorkflowId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param workflowId The new value for the WorkflowId property for this object.
     */
    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }
    
    /**
     * Sets the value of the WorkflowId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param workflowId The new value for the WorkflowId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StartWorkflowExecutionParameters withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    
    
    /**
     * Returns the value of the WorkflowType property for this object.
     *
     * @return The value of the WorkflowType property for this object.
     */
    public WorkflowType getWorkflowType() {
        return workflowType;
    }
    
    /**
     * Sets the value of the WorkflowType property for this object.
     *
     * @param workflowType The new value for the WorkflowType property for this object.
     */
    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }
    
    /**
     * Sets the value of the WorkflowType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowType The new value for the WorkflowType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StartWorkflowExecutionParameters withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
        return this;
    }
    
    
    /**
     * Returns the value of the TaskList property for this object.
     *
     * @return The value of the TaskList property for this object.
     */
    public String getTaskList() {
        return taskList;
    }
    
    /**
     * Sets the value of the TaskList property for this object.
     *
     * @param taskList The new value for the TaskList property for this object.
     */
    public void setTaskList(String taskList) {
        this.taskList = taskList;
    }
    
    /**
     * Sets the value of the TaskList property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskList The new value for the TaskList property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StartWorkflowExecutionParameters withTaskList(String taskList) {
        this.taskList = taskList;
        return this;
    }
    
    
    /**
     * Returns the value of the Input property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100000<br/>
     *
     * @return The value of the Input property for this object.
     */
    public String getInput() {
        return input;
    }
    
    /**
     * Sets the value of the Input property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100000<br/>
     *
     * @param input The new value for the Input property for this object.
     */
    public void setInput(String input) {
        this.input = input;
    }
    
    /**
     * Sets the value of the Input property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100000<br/>
     *
     * @param input The new value for the Input property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StartWorkflowExecutionParameters withInput(String input) {
        this.input = input;
        return this;
    }
    
    
    /**
     * Returns the value of the StartToCloseTimeout property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The value of the StartToCloseTimeout property for this object.
     */
    public long getExecutionStartToCloseTimeout() {
        return executionStartToCloseTimeoutSeconds;
    }
    
    /**
     * Sets the value of the StartToCloseTimeout property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param startToCloseTimeout The new value for the StartToCloseTimeout property for this object.
     */
    public void setExecutionStartToCloseTimeoutSeconds(long executionStartToCloseTimeoutSeconds) {
        this.executionStartToCloseTimeoutSeconds = executionStartToCloseTimeoutSeconds;
    }
    
    /**
     * Sets the value of the StartToCloseTimeout property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param startToCloseTimeout The new value for the StartToCloseTimeout property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StartWorkflowExecutionParameters withExecutionStartToCloseTimeoutSeconds(long executionStartToCloseTimeoutSeconds) {
        this.executionStartToCloseTimeoutSeconds = executionStartToCloseTimeoutSeconds;
        return this;
    }
    
    public long getTaskStartToCloseTimeoutSeconds() {
        return taskStartToCloseTimeoutSeconds;
    }
    
    public void setTaskStartToCloseTimeoutSeconds(long taskStartToCloseTimeoutSeconds) {
        this.taskStartToCloseTimeoutSeconds = taskStartToCloseTimeoutSeconds;
    }
    
    public StartWorkflowExecutionParameters withTaskStartToCloseTimeoutSeconds(long taskStartToCloseTimeoutSeconds) {
        this.taskStartToCloseTimeoutSeconds = taskStartToCloseTimeoutSeconds;
        return this;
    }
    
    /**
     * Returns the value of the TagList property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The value of the TagList property for this object.
     */
    public java.util.List<String> getTagList() {
        if (tagList == null) {
            tagList = new java.util.ArrayList<String>();
        }
        return tagList;
    }
    
    /**
     * Sets the value of the TagList property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The new value for the TagList property for this object.
     */
    public void setTagList(java.util.Collection<String> tagList) {
        java.util.List<String> tagListCopy = new java.util.ArrayList<String>();
        if (tagList != null) {
            tagListCopy.addAll(tagList);
        }
        this.tagList = tagListCopy;
    }
    
    /**
     * Sets the value of the TagList property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The new value for the TagList property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StartWorkflowExecutionParameters withTagList(String... tagList) {
        for (String value : tagList) {
            getTagList().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the TagList property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The new value for the TagList property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StartWorkflowExecutionParameters withTagList(java.util.Collection<String> tagList) {
        java.util.List<String> tagListCopy = new java.util.ArrayList<String>();
        if (tagList != null) {
            tagListCopy.addAll(tagList);
        }
        this.tagList = tagListCopy;

        return this;
    }
    
    public StartWorkflowExecutionParameters createStartWorkflowExecutionParametersFromOptions(StartWorkflowOptions options, 
    		StartWorkflowOptions optionsOverride) {
    	StartWorkflowExecutionParameters parameters = this.clone();
    	
    	if (options != null) {
    		Long executionStartToCloseTimeout = options.getExecutionStartToCloseTimeoutSeconds();
    		if (executionStartToCloseTimeout != null) {
    			parameters.setExecutionStartToCloseTimeoutSeconds(executionStartToCloseTimeout);
    		}
    		
    		Long taskStartToCloseTimeout = options.getTaskStartToCloseTimeoutSeconds();
            if (taskStartToCloseTimeout != null) {
                parameters.setTaskStartToCloseTimeoutSeconds(taskStartToCloseTimeout);
            }
    		
    		java.util.Collection<String> tagList = options.getTagList();
    		if (tagList != null) {
    			parameters.setTagList(tagList);
    		}
    		
    		String taskList = options.getTaskList();
    		if (taskList != null && !taskList.isEmpty()) { 
    			parameters.setTaskList(taskList);
    		}
    	}
    	
    	if (optionsOverride != null) {
    	    Long executionStartToCloseTimeout = optionsOverride.getExecutionStartToCloseTimeoutSeconds();
            if (executionStartToCloseTimeout != null) {
                parameters.setExecutionStartToCloseTimeoutSeconds(executionStartToCloseTimeout);
            }
            
            Long taskStartToCloseTimeout = optionsOverride.getTaskStartToCloseTimeoutSeconds();
            if (taskStartToCloseTimeout != null) {
                parameters.setTaskStartToCloseTimeoutSeconds(taskStartToCloseTimeout);
            }
            
    		java.util.Collection<String> tagList = optionsOverride.getTagList();
    		if (tagList != null) {
    			parameters.setTagList(tagList);
    		}
    		
    		String taskList = optionsOverride.getTaskList();
    		if (taskList != null && !taskList.isEmpty()) { 
    			parameters.setTaskList(taskList);
    		}
    	}
    	
    	return parameters;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("WorkflowId: " + workflowId + ", ");
        sb.append("WorkflowType: " + workflowType + ", ");
        sb.append("TaskList: " + taskList + ", ");
        sb.append("Input: " + input + ", ");
        sb.append("StartToCloseTimeout: " + executionStartToCloseTimeoutSeconds + ", ");
        sb.append("TagList: " + tagList + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    public StartWorkflowExecutionParameters clone() {
    	StartWorkflowExecutionParameters result = new StartWorkflowExecutionParameters();
        result.setInput(input);
        result.setExecutionStartToCloseTimeoutSeconds(executionStartToCloseTimeoutSeconds);
        result.setTaskStartToCloseTimeoutSeconds(taskStartToCloseTimeoutSeconds);
        result.setTagList(tagList);
        result.setTaskList(taskList);
        result.setWorkflowId(workflowId);
        result.setWorkflowType(workflowType);
        return result;
    }

}
    