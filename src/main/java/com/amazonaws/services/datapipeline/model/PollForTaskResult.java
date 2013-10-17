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
 * Contains the output from the PollForTask action.
 * </p>
 */
public class PollForTaskResult implements Serializable {

    /**
     * An instance of <a>PollForTaskResult</a>, which contains an instance of
     * <a>TaskObject</a>. The returned object contains all the information
     * needed to complete the task that is being assigned to the task runner.
     * One of the fields returned in this object is taskId, which contains an
     * identifier for the task being assigned. The calling task runner uses
     * taskId in subsequent calls to <a>ReportTaskProgress</a> and
     * <a>SetTaskStatus</a>.
     */
    private TaskObject taskObject;

    /**
     * An instance of <a>PollForTaskResult</a>, which contains an instance of
     * <a>TaskObject</a>. The returned object contains all the information
     * needed to complete the task that is being assigned to the task runner.
     * One of the fields returned in this object is taskId, which contains an
     * identifier for the task being assigned. The calling task runner uses
     * taskId in subsequent calls to <a>ReportTaskProgress</a> and
     * <a>SetTaskStatus</a>.
     *
     * @return An instance of <a>PollForTaskResult</a>, which contains an instance of
     *         <a>TaskObject</a>. The returned object contains all the information
     *         needed to complete the task that is being assigned to the task runner.
     *         One of the fields returned in this object is taskId, which contains an
     *         identifier for the task being assigned. The calling task runner uses
     *         taskId in subsequent calls to <a>ReportTaskProgress</a> and
     *         <a>SetTaskStatus</a>.
     */
    public TaskObject getTaskObject() {
        return taskObject;
    }
    
    /**
     * An instance of <a>PollForTaskResult</a>, which contains an instance of
     * <a>TaskObject</a>. The returned object contains all the information
     * needed to complete the task that is being assigned to the task runner.
     * One of the fields returned in this object is taskId, which contains an
     * identifier for the task being assigned. The calling task runner uses
     * taskId in subsequent calls to <a>ReportTaskProgress</a> and
     * <a>SetTaskStatus</a>.
     *
     * @param taskObject An instance of <a>PollForTaskResult</a>, which contains an instance of
     *         <a>TaskObject</a>. The returned object contains all the information
     *         needed to complete the task that is being assigned to the task runner.
     *         One of the fields returned in this object is taskId, which contains an
     *         identifier for the task being assigned. The calling task runner uses
     *         taskId in subsequent calls to <a>ReportTaskProgress</a> and
     *         <a>SetTaskStatus</a>.
     */
    public void setTaskObject(TaskObject taskObject) {
        this.taskObject = taskObject;
    }
    
    /**
     * An instance of <a>PollForTaskResult</a>, which contains an instance of
     * <a>TaskObject</a>. The returned object contains all the information
     * needed to complete the task that is being assigned to the task runner.
     * One of the fields returned in this object is taskId, which contains an
     * identifier for the task being assigned. The calling task runner uses
     * taskId in subsequent calls to <a>ReportTaskProgress</a> and
     * <a>SetTaskStatus</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskObject An instance of <a>PollForTaskResult</a>, which contains an instance of
     *         <a>TaskObject</a>. The returned object contains all the information
     *         needed to complete the task that is being assigned to the task runner.
     *         One of the fields returned in this object is taskId, which contains an
     *         identifier for the task being assigned. The calling task runner uses
     *         taskId in subsequent calls to <a>ReportTaskProgress</a> and
     *         <a>SetTaskStatus</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PollForTaskResult withTaskObject(TaskObject taskObject) {
        this.taskObject = taskObject;
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
        if (getTaskObject() != null) sb.append("TaskObject: " + getTaskObject() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskObject() == null) ? 0 : getTaskObject().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PollForTaskResult == false) return false;
        PollForTaskResult other = (PollForTaskResult)obj;
        
        if (other.getTaskObject() == null ^ this.getTaskObject() == null) return false;
        if (other.getTaskObject() != null && other.getTaskObject().equals(this.getTaskObject()) == false) return false; 
        return true;
    }
    
}
    