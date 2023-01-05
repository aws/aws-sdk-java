/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDataSetImportTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSetImportTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the task.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A summary of the status of the task.
     * </p>
     */
    private DataSetImportSummary summary;
    /**
     * <p>
     * The task identifier.
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param status
     *        The status of the task.
     * @see DataSetTaskLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @return The status of the task.
     * @see DataSetTaskLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param status
     *        The status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSetTaskLifecycle
     */

    public GetDataSetImportTaskResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param status
     *        The status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSetTaskLifecycle
     */

    public GetDataSetImportTaskResult withStatus(DataSetTaskLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A summary of the status of the task.
     * </p>
     * 
     * @param summary
     *        A summary of the status of the task.
     */

    public void setSummary(DataSetImportSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * A summary of the status of the task.
     * </p>
     * 
     * @return A summary of the status of the task.
     */

    public DataSetImportSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * A summary of the status of the task.
     * </p>
     * 
     * @param summary
     *        A summary of the status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSetImportTaskResult withSummary(DataSetImportSummary summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The task identifier.
     * </p>
     * 
     * @param taskId
     *        The task identifier.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The task identifier.
     * </p>
     * 
     * @return The task identifier.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The task identifier.
     * </p>
     * 
     * @param taskId
     *        The task identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSetImportTaskResult withTaskId(String taskId) {
        setTaskId(taskId);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataSetImportTaskResult == false)
            return false;
        GetDataSetImportTaskResult other = (GetDataSetImportTaskResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public GetDataSetImportTaskResult clone() {
        try {
            return (GetDataSetImportTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
