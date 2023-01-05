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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a data set import task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DataSetImportTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSetImportTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the data set import task.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A summary of the data set import task.
     * </p>
     */
    private DataSetImportSummary summary;
    /**
     * <p>
     * The identifier of the data set import task.
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * The status of the data set import task.
     * </p>
     * 
     * @param status
     *        The status of the data set import task.
     * @see DataSetTaskLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data set import task.
     * </p>
     * 
     * @return The status of the data set import task.
     * @see DataSetTaskLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data set import task.
     * </p>
     * 
     * @param status
     *        The status of the data set import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSetTaskLifecycle
     */

    public DataSetImportTask withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the data set import task.
     * </p>
     * 
     * @param status
     *        The status of the data set import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSetTaskLifecycle
     */

    public DataSetImportTask withStatus(DataSetTaskLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A summary of the data set import task.
     * </p>
     * 
     * @param summary
     *        A summary of the data set import task.
     */

    public void setSummary(DataSetImportSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * A summary of the data set import task.
     * </p>
     * 
     * @return A summary of the data set import task.
     */

    public DataSetImportSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * A summary of the data set import task.
     * </p>
     * 
     * @param summary
     *        A summary of the data set import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetImportTask withSummary(DataSetImportSummary summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The identifier of the data set import task.
     * </p>
     * 
     * @param taskId
     *        The identifier of the data set import task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The identifier of the data set import task.
     * </p>
     * 
     * @return The identifier of the data set import task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The identifier of the data set import task.
     * </p>
     * 
     * @param taskId
     *        The identifier of the data set import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetImportTask withTaskId(String taskId) {
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

        if (obj instanceof DataSetImportTask == false)
            return false;
        DataSetImportTask other = (DataSetImportTask) obj;
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
    public DataSetImportTask clone() {
        try {
            return (DataSetImportTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.DataSetImportTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
