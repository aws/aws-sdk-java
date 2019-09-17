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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Task object encapsulating task information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/Task" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Task implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Status of the task - Not Started, In-Progress, Complete.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Details of task status as notified by a migration tool. A tool might use this field to provide clarifying
     * information about the status that is unique to that tool or that explains an error state.
     * </p>
     */
    private String statusDetail;
    /**
     * <p>
     * Indication of the percentage completion of the task.
     * </p>
     */
    private Integer progressPercent;

    /**
     * <p>
     * Status of the task - Not Started, In-Progress, Complete.
     * </p>
     * 
     * @param status
     *        Status of the task - Not Started, In-Progress, Complete.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the task - Not Started, In-Progress, Complete.
     * </p>
     * 
     * @return Status of the task - Not Started, In-Progress, Complete.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the task - Not Started, In-Progress, Complete.
     * </p>
     * 
     * @param status
     *        Status of the task - Not Started, In-Progress, Complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Task withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the task - Not Started, In-Progress, Complete.
     * </p>
     * 
     * @param status
     *        Status of the task - Not Started, In-Progress, Complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Task withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Details of task status as notified by a migration tool. A tool might use this field to provide clarifying
     * information about the status that is unique to that tool or that explains an error state.
     * </p>
     * 
     * @param statusDetail
     *        Details of task status as notified by a migration tool. A tool might use this field to provide clarifying
     *        information about the status that is unique to that tool or that explains an error state.
     */

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    /**
     * <p>
     * Details of task status as notified by a migration tool. A tool might use this field to provide clarifying
     * information about the status that is unique to that tool or that explains an error state.
     * </p>
     * 
     * @return Details of task status as notified by a migration tool. A tool might use this field to provide clarifying
     *         information about the status that is unique to that tool or that explains an error state.
     */

    public String getStatusDetail() {
        return this.statusDetail;
    }

    /**
     * <p>
     * Details of task status as notified by a migration tool. A tool might use this field to provide clarifying
     * information about the status that is unique to that tool or that explains an error state.
     * </p>
     * 
     * @param statusDetail
     *        Details of task status as notified by a migration tool. A tool might use this field to provide clarifying
     *        information about the status that is unique to that tool or that explains an error state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withStatusDetail(String statusDetail) {
        setStatusDetail(statusDetail);
        return this;
    }

    /**
     * <p>
     * Indication of the percentage completion of the task.
     * </p>
     * 
     * @param progressPercent
     *        Indication of the percentage completion of the task.
     */

    public void setProgressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
    }

    /**
     * <p>
     * Indication of the percentage completion of the task.
     * </p>
     * 
     * @return Indication of the percentage completion of the task.
     */

    public Integer getProgressPercent() {
        return this.progressPercent;
    }

    /**
     * <p>
     * Indication of the percentage completion of the task.
     * </p>
     * 
     * @param progressPercent
     *        Indication of the percentage completion of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withProgressPercent(Integer progressPercent) {
        setProgressPercent(progressPercent);
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
        if (getStatusDetail() != null)
            sb.append("StatusDetail: ").append(getStatusDetail()).append(",");
        if (getProgressPercent() != null)
            sb.append("ProgressPercent: ").append(getProgressPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Task == false)
            return false;
        Task other = (Task) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetail() == null ^ this.getStatusDetail() == null)
            return false;
        if (other.getStatusDetail() != null && other.getStatusDetail().equals(this.getStatusDetail()) == false)
            return false;
        if (other.getProgressPercent() == null ^ this.getProgressPercent() == null)
            return false;
        if (other.getProgressPercent() != null && other.getProgressPercent().equals(this.getProgressPercent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetail() == null) ? 0 : getStatusDetail().hashCode());
        hashCode = prime * hashCode + ((getProgressPercent() == null) ? 0 : getProgressPercent().hashCode());
        return hashCode;
    }

    @Override
    public Task clone() {
        try {
            return (Task) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhub.model.transform.TaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
