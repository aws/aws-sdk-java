/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the output of PollForTask.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/PollForTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PollForTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The information needed to complete the task that is being assigned to the task runner. One of the fields returned
     * in this object is <code>taskId</code>, which contains an identifier for the task being assigned. The calling task
     * runner uses <code>taskId</code> in subsequent calls to <a>ReportTaskProgress</a> and <a>SetTaskStatus</a>.
     * </p>
     */
    private TaskObject taskObject;

    /**
     * <p>
     * The information needed to complete the task that is being assigned to the task runner. One of the fields returned
     * in this object is <code>taskId</code>, which contains an identifier for the task being assigned. The calling task
     * runner uses <code>taskId</code> in subsequent calls to <a>ReportTaskProgress</a> and <a>SetTaskStatus</a>.
     * </p>
     * 
     * @param taskObject
     *        The information needed to complete the task that is being assigned to the task runner. One of the fields
     *        returned in this object is <code>taskId</code>, which contains an identifier for the task being assigned.
     *        The calling task runner uses <code>taskId</code> in subsequent calls to <a>ReportTaskProgress</a> and
     *        <a>SetTaskStatus</a>.
     */

    public void setTaskObject(TaskObject taskObject) {
        this.taskObject = taskObject;
    }

    /**
     * <p>
     * The information needed to complete the task that is being assigned to the task runner. One of the fields returned
     * in this object is <code>taskId</code>, which contains an identifier for the task being assigned. The calling task
     * runner uses <code>taskId</code> in subsequent calls to <a>ReportTaskProgress</a> and <a>SetTaskStatus</a>.
     * </p>
     * 
     * @return The information needed to complete the task that is being assigned to the task runner. One of the fields
     *         returned in this object is <code>taskId</code>, which contains an identifier for the task being assigned.
     *         The calling task runner uses <code>taskId</code> in subsequent calls to <a>ReportTaskProgress</a> and
     *         <a>SetTaskStatus</a>.
     */

    public TaskObject getTaskObject() {
        return this.taskObject;
    }

    /**
     * <p>
     * The information needed to complete the task that is being assigned to the task runner. One of the fields returned
     * in this object is <code>taskId</code>, which contains an identifier for the task being assigned. The calling task
     * runner uses <code>taskId</code> in subsequent calls to <a>ReportTaskProgress</a> and <a>SetTaskStatus</a>.
     * </p>
     * 
     * @param taskObject
     *        The information needed to complete the task that is being assigned to the task runner. One of the fields
     *        returned in this object is <code>taskId</code>, which contains an identifier for the task being assigned.
     *        The calling task runner uses <code>taskId</code> in subsequent calls to <a>ReportTaskProgress</a> and
     *        <a>SetTaskStatus</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PollForTaskResult withTaskObject(TaskObject taskObject) {
        setTaskObject(taskObject);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTaskObject() != null)
            sb.append("TaskObject: ").append(getTaskObject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PollForTaskResult == false)
            return false;
        PollForTaskResult other = (PollForTaskResult) obj;
        if (other.getTaskObject() == null ^ this.getTaskObject() == null)
            return false;
        if (other.getTaskObject() != null && other.getTaskObject().equals(this.getTaskObject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskObject() == null) ? 0 : getTaskObject().hashCode());
        return hashCode;
    }

    @Override
    public PollForTaskResult clone() {
        try {
            return (PollForTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
