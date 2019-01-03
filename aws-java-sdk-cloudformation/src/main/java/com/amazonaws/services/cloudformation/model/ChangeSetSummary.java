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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The <code>ChangeSetSummary</code> structure describes a change set, its status, and the stack with which it's
 * associated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ChangeSetSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeSetSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the stack with which the change set is associated.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The name of the stack with which the change set is associated.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The ID of the change set.
     * </p>
     */
    private String changeSetId;
    /**
     * <p>
     * The name of the change set.
     * </p>
     */
    private String changeSetName;
    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can execute the change set. If you can’t
     * execute the change set, the status indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still creating it or in an <code>OBSOLETE</code>
     * state because the stack was already updated.
     * </p>
     */
    private String executionStatus;
    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     * <code>FAILED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A description of the change set's status. For example, if your change set is in the <code>FAILED</code> state,
     * AWS CloudFormation shows the error message.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Descriptive information about the change set.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the stack with which the change set is associated.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack with which the change set is associated.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the stack with which the change set is associated.
     * </p>
     * 
     * @return The ID of the stack with which the change set is associated.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The ID of the stack with which the change set is associated.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack with which the change set is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummary withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The name of the stack with which the change set is associated.
     * </p>
     * 
     * @param stackName
     *        The name of the stack with which the change set is associated.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack with which the change set is associated.
     * </p>
     * 
     * @return The name of the stack with which the change set is associated.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name of the stack with which the change set is associated.
     * </p>
     * 
     * @param stackName
     *        The name of the stack with which the change set is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummary withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The ID of the change set.
     * </p>
     * 
     * @param changeSetId
     *        The ID of the change set.
     */

    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * The ID of the change set.
     * </p>
     * 
     * @return The ID of the change set.
     */

    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * <p>
     * The ID of the change set.
     * </p>
     * 
     * @param changeSetId
     *        The ID of the change set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummary withChangeSetId(String changeSetId) {
        setChangeSetId(changeSetId);
        return this;
    }

    /**
     * <p>
     * The name of the change set.
     * </p>
     * 
     * @param changeSetName
     *        The name of the change set.
     */

    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The name of the change set.
     * </p>
     * 
     * @return The name of the change set.
     */

    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * <p>
     * The name of the change set.
     * </p>
     * 
     * @param changeSetName
     *        The name of the change set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummary withChangeSetName(String changeSetName) {
        setChangeSetName(changeSetName);
        return this;
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can execute the change set. If you can’t
     * execute the change set, the status indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still creating it or in an <code>OBSOLETE</code>
     * state because the stack was already updated.
     * </p>
     * 
     * @param executionStatus
     *        If the change set execution status is <code>AVAILABLE</code>, you can execute the change set. If you can’t
     *        execute the change set, the status indicates why. For example, a change set might be in an
     *        <code>UNAVAILABLE</code> state because AWS CloudFormation is still creating it or in an
     *        <code>OBSOLETE</code> state because the stack was already updated.
     * @see ExecutionStatus
     */

    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can execute the change set. If you can’t
     * execute the change set, the status indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still creating it or in an <code>OBSOLETE</code>
     * state because the stack was already updated.
     * </p>
     * 
     * @return If the change set execution status is <code>AVAILABLE</code>, you can execute the change set. If you
     *         can’t execute the change set, the status indicates why. For example, a change set might be in an
     *         <code>UNAVAILABLE</code> state because AWS CloudFormation is still creating it or in an
     *         <code>OBSOLETE</code> state because the stack was already updated.
     * @see ExecutionStatus
     */

    public String getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can execute the change set. If you can’t
     * execute the change set, the status indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still creating it or in an <code>OBSOLETE</code>
     * state because the stack was already updated.
     * </p>
     * 
     * @param executionStatus
     *        If the change set execution status is <code>AVAILABLE</code>, you can execute the change set. If you can’t
     *        execute the change set, the status indicates why. For example, a change set might be in an
     *        <code>UNAVAILABLE</code> state because AWS CloudFormation is still creating it or in an
     *        <code>OBSOLETE</code> state because the stack was already updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ChangeSetSummary withExecutionStatus(String executionStatus) {
        setExecutionStatus(executionStatus);
        return this;
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can execute the change set. If you can’t
     * execute the change set, the status indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still creating it or in an <code>OBSOLETE</code>
     * state because the stack was already updated.
     * </p>
     * 
     * @param executionStatus
     *        If the change set execution status is <code>AVAILABLE</code>, you can execute the change set. If you can’t
     *        execute the change set, the status indicates why. For example, a change set might be in an
     *        <code>UNAVAILABLE</code> state because AWS CloudFormation is still creating it or in an
     *        <code>OBSOLETE</code> state because the stack was already updated.
     * @see ExecutionStatus
     */

    public void setExecutionStatus(ExecutionStatus executionStatus) {
        withExecutionStatus(executionStatus);
    }

    /**
     * <p>
     * If the change set execution status is <code>AVAILABLE</code>, you can execute the change set. If you can’t
     * execute the change set, the status indicates why. For example, a change set might be in an
     * <code>UNAVAILABLE</code> state because AWS CloudFormation is still creating it or in an <code>OBSOLETE</code>
     * state because the stack was already updated.
     * </p>
     * 
     * @param executionStatus
     *        If the change set execution status is <code>AVAILABLE</code>, you can execute the change set. If you can’t
     *        execute the change set, the status indicates why. For example, a change set might be in an
     *        <code>UNAVAILABLE</code> state because AWS CloudFormation is still creating it or in an
     *        <code>OBSOLETE</code> state because the stack was already updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ChangeSetSummary withExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     * <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The state of the change set, such as <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     *        <code>FAILED</code>.
     * @see ChangeSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     * <code>FAILED</code>.
     * </p>
     * 
     * @return The state of the change set, such as <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     *         <code>FAILED</code>.
     * @see ChangeSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     * <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The state of the change set, such as <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeSetStatus
     */

    public ChangeSetSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     * <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The state of the change set, such as <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     *        <code>FAILED</code>.
     * @see ChangeSetStatus
     */

    public void setStatus(ChangeSetStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     * <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The state of the change set, such as <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeSetStatus
     */

    public ChangeSetSummary withStatus(ChangeSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the change set's status. For example, if your change set is in the <code>FAILED</code> state,
     * AWS CloudFormation shows the error message.
     * </p>
     * 
     * @param statusReason
     *        A description of the change set's status. For example, if your change set is in the <code>FAILED</code>
     *        state, AWS CloudFormation shows the error message.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * A description of the change set's status. For example, if your change set is in the <code>FAILED</code> state,
     * AWS CloudFormation shows the error message.
     * </p>
     * 
     * @return A description of the change set's status. For example, if your change set is in the <code>FAILED</code>
     *         state, AWS CloudFormation shows the error message.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * A description of the change set's status. For example, if your change set is in the <code>FAILED</code> state,
     * AWS CloudFormation shows the error message.
     * </p>
     * 
     * @param statusReason
     *        A description of the change set's status. For example, if your change set is in the <code>FAILED</code>
     *        state, AWS CloudFormation shows the error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     * 
     * @param creationTime
     *        The start time when the change set was created, in UTC.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     * 
     * @return The start time when the change set was created, in UTC.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     * 
     * @param creationTime
     *        The start time when the change set was created, in UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Descriptive information about the change set.
     * </p>
     * 
     * @param description
     *        Descriptive information about the change set.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Descriptive information about the change set.
     * </p>
     * 
     * @return Descriptive information about the change set.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Descriptive information about the change set.
     * </p>
     * 
     * @param description
     *        Descriptive information about the change set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeSetSummary withDescription(String description) {
        setDescription(description);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: ").append(getChangeSetId()).append(",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: ").append(getChangeSetName()).append(",");
        if (getExecutionStatus() != null)
            sb.append("ExecutionStatus: ").append(getExecutionStatus()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeSetSummary == false)
            return false;
        ChangeSetSummary other = (ChangeSetSummary) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getExecutionStatus() == null ^ this.getExecutionStatus() == null)
            return false;
        if (other.getExecutionStatus() != null && other.getExecutionStatus().equals(this.getExecutionStatus()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime * hashCode + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getExecutionStatus() == null) ? 0 : getExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ChangeSetSummary clone() {
        try {
            return (ChangeSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
