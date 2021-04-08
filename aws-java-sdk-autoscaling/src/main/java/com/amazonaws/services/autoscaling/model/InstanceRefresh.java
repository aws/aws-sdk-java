/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an instance refresh for an Auto Scaling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/InstanceRefresh" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceRefresh implements Serializable, Cloneable {

    /**
     * <p>
     * The instance refresh ID.
     * </p>
     */
    private String instanceRefreshId;
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The current status for the instance refresh operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can troubleshoot using the status reason and the
     * scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled. Cancellation does not roll back any
     * replacements that have already been completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Provides more details about the current status of the instance refresh.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The date and time at which the instance refresh began.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time at which the instance refresh ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The percentage of the instance refresh that is complete. For each instance replacement, Amazon EC2 Auto Scaling
     * tracks the instance's health status and warm-up time. When the instance's health status changes to healthy and
     * the specified warm-up time passes, the instance is considered updated and added to the percentage complete.
     * </p>
     */
    private Integer percentageComplete;
    /**
     * <p>
     * The number of instances remaining to update before the instance refresh is complete.
     * </p>
     */
    private Integer instancesToUpdate;
    /**
     * <p>
     * Additional progress details for an Auto Scaling group that has a warm pool.
     * </p>
     */
    private InstanceRefreshProgressDetails progressDetails;

    /**
     * <p>
     * The instance refresh ID.
     * </p>
     * 
     * @param instanceRefreshId
     *        The instance refresh ID.
     */

    public void setInstanceRefreshId(String instanceRefreshId) {
        this.instanceRefreshId = instanceRefreshId;
    }

    /**
     * <p>
     * The instance refresh ID.
     * </p>
     * 
     * @return The instance refresh ID.
     */

    public String getInstanceRefreshId() {
        return this.instanceRefreshId;
    }

    /**
     * <p>
     * The instance refresh ID.
     * </p>
     * 
     * @param instanceRefreshId
     *        The instance refresh ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRefresh withInstanceRefreshId(String instanceRefreshId) {
        setInstanceRefreshId(instanceRefreshId);
        return this;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRefresh withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The current status for the instance refresh operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can troubleshoot using the status reason and the
     * scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled. Cancellation does not roll back any
     * replacements that have already been completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status for the instance refresh operation:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Pending</code> - The request was created, but the operation has not started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Successful</code> - The operation completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The operation failed to complete. You can troubleshoot using the status reason and
     *        the scaling activities.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Cancelling</code> - An ongoing operation is being cancelled. Cancellation does not roll back any
     *        replacements that have already been completed, but it prevents new replacements from being started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Cancelled</code> - The operation is cancelled.
     *        </p>
     *        </li>
     * @see InstanceRefreshStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status for the instance refresh operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can troubleshoot using the status reason and the
     * scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled. Cancellation does not roll back any
     * replacements that have already been completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status for the instance refresh operation:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Pending</code> - The request was created, but the operation has not started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InProgress</code> - The operation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Successful</code> - The operation completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The operation failed to complete. You can troubleshoot using the status reason and
     *         the scaling activities.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Cancelling</code> - An ongoing operation is being cancelled. Cancellation does not roll back any
     *         replacements that have already been completed, but it prevents new replacements from being started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Cancelled</code> - The operation is cancelled.
     *         </p>
     *         </li>
     * @see InstanceRefreshStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status for the instance refresh operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can troubleshoot using the status reason and the
     * scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled. Cancellation does not roll back any
     * replacements that have already been completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status for the instance refresh operation:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Pending</code> - The request was created, but the operation has not started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Successful</code> - The operation completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The operation failed to complete. You can troubleshoot using the status reason and
     *        the scaling activities.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Cancelling</code> - An ongoing operation is being cancelled. Cancellation does not roll back any
     *        replacements that have already been completed, but it prevents new replacements from being started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Cancelled</code> - The operation is cancelled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceRefreshStatus
     */

    public InstanceRefresh withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status for the instance refresh operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can troubleshoot using the status reason and the
     * scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled. Cancellation does not roll back any
     * replacements that have already been completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status for the instance refresh operation:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Pending</code> - The request was created, but the operation has not started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Successful</code> - The operation completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The operation failed to complete. You can troubleshoot using the status reason and
     *        the scaling activities.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Cancelling</code> - An ongoing operation is being cancelled. Cancellation does not roll back any
     *        replacements that have already been completed, but it prevents new replacements from being started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Cancelled</code> - The operation is cancelled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceRefreshStatus
     */

    public InstanceRefresh withStatus(InstanceRefreshStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Provides more details about the current status of the instance refresh.
     * </p>
     * 
     * @param statusReason
     *        Provides more details about the current status of the instance refresh.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Provides more details about the current status of the instance refresh.
     * </p>
     * 
     * @return Provides more details about the current status of the instance refresh.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Provides more details about the current status of the instance refresh.
     * </p>
     * 
     * @param statusReason
     *        Provides more details about the current status of the instance refresh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRefresh withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The date and time at which the instance refresh began.
     * </p>
     * 
     * @param startTime
     *        The date and time at which the instance refresh began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time at which the instance refresh began.
     * </p>
     * 
     * @return The date and time at which the instance refresh began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time at which the instance refresh began.
     * </p>
     * 
     * @param startTime
     *        The date and time at which the instance refresh began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRefresh withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time at which the instance refresh ended.
     * </p>
     * 
     * @param endTime
     *        The date and time at which the instance refresh ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time at which the instance refresh ended.
     * </p>
     * 
     * @return The date and time at which the instance refresh ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time at which the instance refresh ended.
     * </p>
     * 
     * @param endTime
     *        The date and time at which the instance refresh ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRefresh withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The percentage of the instance refresh that is complete. For each instance replacement, Amazon EC2 Auto Scaling
     * tracks the instance's health status and warm-up time. When the instance's health status changes to healthy and
     * the specified warm-up time passes, the instance is considered updated and added to the percentage complete.
     * </p>
     * 
     * @param percentageComplete
     *        The percentage of the instance refresh that is complete. For each instance replacement, Amazon EC2 Auto
     *        Scaling tracks the instance's health status and warm-up time. When the instance's health status changes to
     *        healthy and the specified warm-up time passes, the instance is considered updated and added to the
     *        percentage complete.
     */

    public void setPercentageComplete(Integer percentageComplete) {
        this.percentageComplete = percentageComplete;
    }

    /**
     * <p>
     * The percentage of the instance refresh that is complete. For each instance replacement, Amazon EC2 Auto Scaling
     * tracks the instance's health status and warm-up time. When the instance's health status changes to healthy and
     * the specified warm-up time passes, the instance is considered updated and added to the percentage complete.
     * </p>
     * 
     * @return The percentage of the instance refresh that is complete. For each instance replacement, Amazon EC2 Auto
     *         Scaling tracks the instance's health status and warm-up time. When the instance's health status changes
     *         to healthy and the specified warm-up time passes, the instance is considered updated and added to the
     *         percentage complete.
     */

    public Integer getPercentageComplete() {
        return this.percentageComplete;
    }

    /**
     * <p>
     * The percentage of the instance refresh that is complete. For each instance replacement, Amazon EC2 Auto Scaling
     * tracks the instance's health status and warm-up time. When the instance's health status changes to healthy and
     * the specified warm-up time passes, the instance is considered updated and added to the percentage complete.
     * </p>
     * 
     * @param percentageComplete
     *        The percentage of the instance refresh that is complete. For each instance replacement, Amazon EC2 Auto
     *        Scaling tracks the instance's health status and warm-up time. When the instance's health status changes to
     *        healthy and the specified warm-up time passes, the instance is considered updated and added to the
     *        percentage complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRefresh withPercentageComplete(Integer percentageComplete) {
        setPercentageComplete(percentageComplete);
        return this;
    }

    /**
     * <p>
     * The number of instances remaining to update before the instance refresh is complete.
     * </p>
     * 
     * @param instancesToUpdate
     *        The number of instances remaining to update before the instance refresh is complete.
     */

    public void setInstancesToUpdate(Integer instancesToUpdate) {
        this.instancesToUpdate = instancesToUpdate;
    }

    /**
     * <p>
     * The number of instances remaining to update before the instance refresh is complete.
     * </p>
     * 
     * @return The number of instances remaining to update before the instance refresh is complete.
     */

    public Integer getInstancesToUpdate() {
        return this.instancesToUpdate;
    }

    /**
     * <p>
     * The number of instances remaining to update before the instance refresh is complete.
     * </p>
     * 
     * @param instancesToUpdate
     *        The number of instances remaining to update before the instance refresh is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRefresh withInstancesToUpdate(Integer instancesToUpdate) {
        setInstancesToUpdate(instancesToUpdate);
        return this;
    }

    /**
     * <p>
     * Additional progress details for an Auto Scaling group that has a warm pool.
     * </p>
     * 
     * @param progressDetails
     *        Additional progress details for an Auto Scaling group that has a warm pool.
     */

    public void setProgressDetails(InstanceRefreshProgressDetails progressDetails) {
        this.progressDetails = progressDetails;
    }

    /**
     * <p>
     * Additional progress details for an Auto Scaling group that has a warm pool.
     * </p>
     * 
     * @return Additional progress details for an Auto Scaling group that has a warm pool.
     */

    public InstanceRefreshProgressDetails getProgressDetails() {
        return this.progressDetails;
    }

    /**
     * <p>
     * Additional progress details for an Auto Scaling group that has a warm pool.
     * </p>
     * 
     * @param progressDetails
     *        Additional progress details for an Auto Scaling group that has a warm pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRefresh withProgressDetails(InstanceRefreshProgressDetails progressDetails) {
        setProgressDetails(progressDetails);
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
        if (getInstanceRefreshId() != null)
            sb.append("InstanceRefreshId: ").append(getInstanceRefreshId()).append(",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getPercentageComplete() != null)
            sb.append("PercentageComplete: ").append(getPercentageComplete()).append(",");
        if (getInstancesToUpdate() != null)
            sb.append("InstancesToUpdate: ").append(getInstancesToUpdate()).append(",");
        if (getProgressDetails() != null)
            sb.append("ProgressDetails: ").append(getProgressDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceRefresh == false)
            return false;
        InstanceRefresh other = (InstanceRefresh) obj;
        if (other.getInstanceRefreshId() == null ^ this.getInstanceRefreshId() == null)
            return false;
        if (other.getInstanceRefreshId() != null && other.getInstanceRefreshId().equals(this.getInstanceRefreshId()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getPercentageComplete() == null ^ this.getPercentageComplete() == null)
            return false;
        if (other.getPercentageComplete() != null && other.getPercentageComplete().equals(this.getPercentageComplete()) == false)
            return false;
        if (other.getInstancesToUpdate() == null ^ this.getInstancesToUpdate() == null)
            return false;
        if (other.getInstancesToUpdate() != null && other.getInstancesToUpdate().equals(this.getInstancesToUpdate()) == false)
            return false;
        if (other.getProgressDetails() == null ^ this.getProgressDetails() == null)
            return false;
        if (other.getProgressDetails() != null && other.getProgressDetails().equals(this.getProgressDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceRefreshId() == null) ? 0 : getInstanceRefreshId().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPercentageComplete() == null) ? 0 : getPercentageComplete().hashCode());
        hashCode = prime * hashCode + ((getInstancesToUpdate() == null) ? 0 : getInstancesToUpdate().hashCode());
        hashCode = prime * hashCode + ((getProgressDetails() == null) ? 0 : getProgressDetails().hashCode());
        return hashCode;
    }

    @Override
    public InstanceRefresh clone() {
        try {
            return (InstanceRefresh) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
