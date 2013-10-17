/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;


/**
 * <p>
 * Contains information about a pipeline task that is assigned to a task runner.
 * </p>
 */
public class TaskObject implements Serializable {

    /**
     * An internal identifier for the task. This ID is passed to the
     * <a>SetTaskStatus</a> and <a>ReportTaskProgress</a> actions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String taskId;

    /**
     * Identifier of the pipeline that provided the task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * Identifier of the pipeline task attempt object. AWS Data Pipeline uses
     * this value to track how many times a task is attempted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String attemptId;

    /**
     * Connection information for the location where the task runner will
     * publish the output of the task.
     */
    private java.util.Map<String,PipelineObject> objects;

    /**
     * An internal identifier for the task. This ID is passed to the
     * <a>SetTaskStatus</a> and <a>ReportTaskProgress</a> actions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return An internal identifier for the task. This ID is passed to the
     *         <a>SetTaskStatus</a> and <a>ReportTaskProgress</a> actions.
     */
    public String getTaskId() {
        return taskId;
    }
    
    /**
     * An internal identifier for the task. This ID is passed to the
     * <a>SetTaskStatus</a> and <a>ReportTaskProgress</a> actions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param taskId An internal identifier for the task. This ID is passed to the
     *         <a>SetTaskStatus</a> and <a>ReportTaskProgress</a> actions.
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
    
    /**
     * An internal identifier for the task. This ID is passed to the
     * <a>SetTaskStatus</a> and <a>ReportTaskProgress</a> actions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param taskId An internal identifier for the task. This ID is passed to the
     *         <a>SetTaskStatus</a> and <a>ReportTaskProgress</a> actions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TaskObject withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Identifier of the pipeline that provided the task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Identifier of the pipeline that provided the task.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * Identifier of the pipeline that provided the task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId Identifier of the pipeline that provided the task.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * Identifier of the pipeline that provided the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId Identifier of the pipeline that provided the task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TaskObject withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * Identifier of the pipeline task attempt object. AWS Data Pipeline uses
     * this value to track how many times a task is attempted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Identifier of the pipeline task attempt object. AWS Data Pipeline uses
     *         this value to track how many times a task is attempted.
     */
    public String getAttemptId() {
        return attemptId;
    }
    
    /**
     * Identifier of the pipeline task attempt object. AWS Data Pipeline uses
     * this value to track how many times a task is attempted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param attemptId Identifier of the pipeline task attempt object. AWS Data Pipeline uses
     *         this value to track how many times a task is attempted.
     */
    public void setAttemptId(String attemptId) {
        this.attemptId = attemptId;
    }
    
    /**
     * Identifier of the pipeline task attempt object. AWS Data Pipeline uses
     * this value to track how many times a task is attempted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param attemptId Identifier of the pipeline task attempt object. AWS Data Pipeline uses
     *         this value to track how many times a task is attempted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TaskObject withAttemptId(String attemptId) {
        this.attemptId = attemptId;
        return this;
    }

    /**
     * Connection information for the location where the task runner will
     * publish the output of the task.
     *
     * @return Connection information for the location where the task runner will
     *         publish the output of the task.
     */
    public java.util.Map<String,PipelineObject> getObjects() {
        
        if (objects == null) {
            objects = new java.util.HashMap<String,PipelineObject>();
        }
        return objects;
    }
    
    /**
     * Connection information for the location where the task runner will
     * publish the output of the task.
     *
     * @param objects Connection information for the location where the task runner will
     *         publish the output of the task.
     */
    public void setObjects(java.util.Map<String,PipelineObject> objects) {
        this.objects = objects;
    }
    
    /**
     * Connection information for the location where the task runner will
     * publish the output of the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param objects Connection information for the location where the task runner will
     *         publish the output of the task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TaskObject withObjects(java.util.Map<String,PipelineObject> objects) {
        setObjects(objects);
        return this;
    }

    /**
     * Connection information for the location where the task runner will
     * publish the output of the task.
     * <p>
     * The method adds a new key-value pair into Objects parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Objects.
     * @param value The corresponding value of the entry to be added into Objects.
     */
	public TaskObject addObjectsEntry(String key, PipelineObject value) {
		if (null == this.objects) {
			this.objects = new java.util.HashMap<String,PipelineObject>();
		}
		if (this.objects.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.objects.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Objects.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public TaskObject clearObjectsEntries() {
		this.objects = null;
		return this;
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
        if (getTaskId() != null) sb.append("TaskId: " + getTaskId() + ",");
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() + ",");
        if (getAttemptId() != null) sb.append("AttemptId: " + getAttemptId() + ",");
        if (getObjects() != null) sb.append("Objects: " + getObjects() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode()); 
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((getAttemptId() == null) ? 0 : getAttemptId().hashCode()); 
        hashCode = prime * hashCode + ((getObjects() == null) ? 0 : getObjects().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TaskObject == false) return false;
        TaskObject other = (TaskObject)obj;
        
        if (other.getTaskId() == null ^ this.getTaskId() == null) return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false) return false; 
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.getAttemptId() == null ^ this.getAttemptId() == null) return false;
        if (other.getAttemptId() != null && other.getAttemptId().equals(this.getAttemptId()) == false) return false; 
        if (other.getObjects() == null ^ this.getObjects() == null) return false;
        if (other.getObjects() != null && other.getObjects().equals(this.getObjects()) == false) return false; 
        return true;
    }
    
}
    