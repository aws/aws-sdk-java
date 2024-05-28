/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A workflow run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/RunListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The run's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The run's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The run's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The run's workflow ID.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The run's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The run's priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The run's storage capacity in gibibytes. For dynamic storage, after the run has completed, this value is the
     * maximum amount of storage used during the run.
     * </p>
     */
    private Integer storageCapacity;
    /**
     * <p>
     * When the run was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the run started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * When the run stopped.
     * </p>
     */
    private java.util.Date stopTime;
    /**
     * <p>
     * The run's storage type.
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * The run's ARN.
     * </p>
     * 
     * @param arn
     *        The run's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The run's ARN.
     * </p>
     * 
     * @return The run's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The run's ARN.
     * </p>
     * 
     * @param arn
     *        The run's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunListItem withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @param id
     *        The run's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @return The run's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @param id
     *        The run's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunListItem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @param status
     *        The run's status.
     * @see RunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @return The run's status.
     * @see RunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @param status
     *        The run's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunStatus
     */

    public RunListItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @param status
     *        The run's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunStatus
     */

    public RunListItem withStatus(RunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The run's workflow ID.
     * </p>
     * 
     * @param workflowId
     *        The run's workflow ID.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * The run's workflow ID.
     * </p>
     * 
     * @return The run's workflow ID.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * The run's workflow ID.
     * </p>
     * 
     * @param workflowId
     *        The run's workflow ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunListItem withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The run's name.
     * </p>
     * 
     * @param name
     *        The run's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The run's name.
     * </p>
     * 
     * @return The run's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The run's name.
     * </p>
     * 
     * @param name
     *        The run's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunListItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The run's priority.
     * </p>
     * 
     * @param priority
     *        The run's priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The run's priority.
     * </p>
     * 
     * @return The run's priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The run's priority.
     * </p>
     * 
     * @param priority
     *        The run's priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunListItem withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The run's storage capacity in gibibytes. For dynamic storage, after the run has completed, this value is the
     * maximum amount of storage used during the run.
     * </p>
     * 
     * @param storageCapacity
     *        The run's storage capacity in gibibytes. For dynamic storage, after the run has completed, this value is
     *        the maximum amount of storage used during the run.
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * The run's storage capacity in gibibytes. For dynamic storage, after the run has completed, this value is the
     * maximum amount of storage used during the run.
     * </p>
     * 
     * @return The run's storage capacity in gibibytes. For dynamic storage, after the run has completed, this value is
     *         the maximum amount of storage used during the run.
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * The run's storage capacity in gibibytes. For dynamic storage, after the run has completed, this value is the
     * maximum amount of storage used during the run.
     * </p>
     * 
     * @param storageCapacity
     *        The run's storage capacity in gibibytes. For dynamic storage, after the run has completed, this value is
     *        the maximum amount of storage used during the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunListItem withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * <p>
     * When the run was created.
     * </p>
     * 
     * @param creationTime
     *        When the run was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the run was created.
     * </p>
     * 
     * @return When the run was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the run was created.
     * </p>
     * 
     * @param creationTime
     *        When the run was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunListItem withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the run started.
     * </p>
     * 
     * @param startTime
     *        When the run started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * When the run started.
     * </p>
     * 
     * @return When the run started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * When the run started.
     * </p>
     * 
     * @param startTime
     *        When the run started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunListItem withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * When the run stopped.
     * </p>
     * 
     * @param stopTime
     *        When the run stopped.
     */

    public void setStopTime(java.util.Date stopTime) {
        this.stopTime = stopTime;
    }

    /**
     * <p>
     * When the run stopped.
     * </p>
     * 
     * @return When the run stopped.
     */

    public java.util.Date getStopTime() {
        return this.stopTime;
    }

    /**
     * <p>
     * When the run stopped.
     * </p>
     * 
     * @param stopTime
     *        When the run stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunListItem withStopTime(java.util.Date stopTime) {
        setStopTime(stopTime);
        return this;
    }

    /**
     * <p>
     * The run's storage type.
     * </p>
     * 
     * @param storageType
     *        The run's storage type.
     * @see StorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The run's storage type.
     * </p>
     * 
     * @return The run's storage type.
     * @see StorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The run's storage type.
     * </p>
     * 
     * @param storageType
     *        The run's storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public RunListItem withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The run's storage type.
     * </p>
     * 
     * @param storageType
     *        The run's storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public RunListItem withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: ").append(getStorageCapacity()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStopTime() != null)
            sb.append("StopTime: ").append(getStopTime()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunListItem == false)
            return false;
        RunListItem other = (RunListItem) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStopTime() == null ^ this.getStopTime() == null)
            return false;
        if (other.getStopTime() != null && other.getStopTime().equals(this.getStopTime()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStopTime() == null) ? 0 : getStopTime().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        return hashCode;
    }

    @Override
    public RunListItem clone() {
        try {
            return (RunListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.RunListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
