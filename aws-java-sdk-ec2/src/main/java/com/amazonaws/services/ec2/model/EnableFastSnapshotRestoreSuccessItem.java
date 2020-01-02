/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes fast snapshot restores that were successfully enabled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EnableFastSnapshotRestoreSuccessItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableFastSnapshotRestoreSuccessItem implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The Availability Zone.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The state of fast snapshot restores.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason for the state transition. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Client.UserInitiated</code> - The state successfully transitioned to <code>enabling</code> or
     * <code>disabling</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiated - Lifecycle state transition</code> - The state successfully transitioned to
     * <code>optimizing</code>, <code>enabled</code>, or <code>disabled</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String stateTransitionReason;
    /**
     * <p>
     * The ID of the AWS account that owns the snapshot.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The alias of the snapshot owner.
     * </p>
     */
    private String ownerAlias;
    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>enabling</code> state.
     * </p>
     */
    private java.util.Date enablingTime;
    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>optimizing</code> state.
     * </p>
     */
    private java.util.Date optimizingTime;
    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>enabled</code> state.
     * </p>
     */
    private java.util.Date enabledTime;
    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>disabling</code> state.
     * </p>
     */
    private java.util.Date disablingTime;
    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>disabled</code> state.
     * </p>
     */
    private java.util.Date disabledTime;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastSnapshotRestoreSuccessItem withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @return The Availability Zone.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastSnapshotRestoreSuccessItem withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The state of fast snapshot restores.
     * </p>
     * 
     * @param state
     *        The state of fast snapshot restores.
     * @see FastSnapshotRestoreStateCode
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of fast snapshot restores.
     * </p>
     * 
     * @return The state of fast snapshot restores.
     * @see FastSnapshotRestoreStateCode
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of fast snapshot restores.
     * </p>
     * 
     * @param state
     *        The state of fast snapshot restores.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FastSnapshotRestoreStateCode
     */

    public EnableFastSnapshotRestoreSuccessItem withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of fast snapshot restores.
     * </p>
     * 
     * @param state
     *        The state of fast snapshot restores.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FastSnapshotRestoreStateCode
     */

    public EnableFastSnapshotRestoreSuccessItem withState(FastSnapshotRestoreStateCode state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the state transition. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Client.UserInitiated</code> - The state successfully transitioned to <code>enabling</code> or
     * <code>disabling</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiated - Lifecycle state transition</code> - The state successfully transitioned to
     * <code>optimizing</code>, <code>enabled</code>, or <code>disabled</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stateTransitionReason
     *        The reason for the state transition. The possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Client.UserInitiated</code> - The state successfully transitioned to <code>enabling</code> or
     *        <code>disabling</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.UserInitiated - Lifecycle state transition</code> - The state successfully transitioned to
     *        <code>optimizing</code>, <code>enabled</code>, or <code>disabled</code>.
     *        </p>
     *        </li>
     */

    public void setStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
    }

    /**
     * <p>
     * The reason for the state transition. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Client.UserInitiated</code> - The state successfully transitioned to <code>enabling</code> or
     * <code>disabling</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiated - Lifecycle state transition</code> - The state successfully transitioned to
     * <code>optimizing</code>, <code>enabled</code>, or <code>disabled</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The reason for the state transition. The possible values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Client.UserInitiated</code> - The state successfully transitioned to <code>enabling</code> or
     *         <code>disabling</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.UserInitiated - Lifecycle state transition</code> - The state successfully transitioned to
     *         <code>optimizing</code>, <code>enabled</code>, or <code>disabled</code>.
     *         </p>
     *         </li>
     */

    public String getStateTransitionReason() {
        return this.stateTransitionReason;
    }

    /**
     * <p>
     * The reason for the state transition. The possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Client.UserInitiated</code> - The state successfully transitioned to <code>enabling</code> or
     * <code>disabling</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiated - Lifecycle state transition</code> - The state successfully transitioned to
     * <code>optimizing</code>, <code>enabled</code>, or <code>disabled</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stateTransitionReason
     *        The reason for the state transition. The possible values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Client.UserInitiated</code> - The state successfully transitioned to <code>enabling</code> or
     *        <code>disabling</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.UserInitiated - Lifecycle state transition</code> - The state successfully transitioned to
     *        <code>optimizing</code>, <code>enabled</code>, or <code>disabled</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastSnapshotRestoreSuccessItem withStateTransitionReason(String stateTransitionReason) {
        setStateTransitionReason(stateTransitionReason);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the snapshot.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the snapshot.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the snapshot.
     * </p>
     * 
     * @return The ID of the AWS account that owns the snapshot.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the snapshot.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastSnapshotRestoreSuccessItem withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The alias of the snapshot owner.
     * </p>
     * 
     * @param ownerAlias
     *        The alias of the snapshot owner.
     */

    public void setOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
    }

    /**
     * <p>
     * The alias of the snapshot owner.
     * </p>
     * 
     * @return The alias of the snapshot owner.
     */

    public String getOwnerAlias() {
        return this.ownerAlias;
    }

    /**
     * <p>
     * The alias of the snapshot owner.
     * </p>
     * 
     * @param ownerAlias
     *        The alias of the snapshot owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastSnapshotRestoreSuccessItem withOwnerAlias(String ownerAlias) {
        setOwnerAlias(ownerAlias);
        return this;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>enabling</code> state.
     * </p>
     * 
     * @param enablingTime
     *        The time at which fast snapshot restores entered the <code>enabling</code> state.
     */

    public void setEnablingTime(java.util.Date enablingTime) {
        this.enablingTime = enablingTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>enabling</code> state.
     * </p>
     * 
     * @return The time at which fast snapshot restores entered the <code>enabling</code> state.
     */

    public java.util.Date getEnablingTime() {
        return this.enablingTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>enabling</code> state.
     * </p>
     * 
     * @param enablingTime
     *        The time at which fast snapshot restores entered the <code>enabling</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastSnapshotRestoreSuccessItem withEnablingTime(java.util.Date enablingTime) {
        setEnablingTime(enablingTime);
        return this;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>optimizing</code> state.
     * </p>
     * 
     * @param optimizingTime
     *        The time at which fast snapshot restores entered the <code>optimizing</code> state.
     */

    public void setOptimizingTime(java.util.Date optimizingTime) {
        this.optimizingTime = optimizingTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>optimizing</code> state.
     * </p>
     * 
     * @return The time at which fast snapshot restores entered the <code>optimizing</code> state.
     */

    public java.util.Date getOptimizingTime() {
        return this.optimizingTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>optimizing</code> state.
     * </p>
     * 
     * @param optimizingTime
     *        The time at which fast snapshot restores entered the <code>optimizing</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastSnapshotRestoreSuccessItem withOptimizingTime(java.util.Date optimizingTime) {
        setOptimizingTime(optimizingTime);
        return this;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>enabled</code> state.
     * </p>
     * 
     * @param enabledTime
     *        The time at which fast snapshot restores entered the <code>enabled</code> state.
     */

    public void setEnabledTime(java.util.Date enabledTime) {
        this.enabledTime = enabledTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>enabled</code> state.
     * </p>
     * 
     * @return The time at which fast snapshot restores entered the <code>enabled</code> state.
     */

    public java.util.Date getEnabledTime() {
        return this.enabledTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>enabled</code> state.
     * </p>
     * 
     * @param enabledTime
     *        The time at which fast snapshot restores entered the <code>enabled</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastSnapshotRestoreSuccessItem withEnabledTime(java.util.Date enabledTime) {
        setEnabledTime(enabledTime);
        return this;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>disabling</code> state.
     * </p>
     * 
     * @param disablingTime
     *        The time at which fast snapshot restores entered the <code>disabling</code> state.
     */

    public void setDisablingTime(java.util.Date disablingTime) {
        this.disablingTime = disablingTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>disabling</code> state.
     * </p>
     * 
     * @return The time at which fast snapshot restores entered the <code>disabling</code> state.
     */

    public java.util.Date getDisablingTime() {
        return this.disablingTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>disabling</code> state.
     * </p>
     * 
     * @param disablingTime
     *        The time at which fast snapshot restores entered the <code>disabling</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastSnapshotRestoreSuccessItem withDisablingTime(java.util.Date disablingTime) {
        setDisablingTime(disablingTime);
        return this;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>disabled</code> state.
     * </p>
     * 
     * @param disabledTime
     *        The time at which fast snapshot restores entered the <code>disabled</code> state.
     */

    public void setDisabledTime(java.util.Date disabledTime) {
        this.disabledTime = disabledTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>disabled</code> state.
     * </p>
     * 
     * @return The time at which fast snapshot restores entered the <code>disabled</code> state.
     */

    public java.util.Date getDisabledTime() {
        return this.disabledTime;
    }

    /**
     * <p>
     * The time at which fast snapshot restores entered the <code>disabled</code> state.
     * </p>
     * 
     * @param disabledTime
     *        The time at which fast snapshot restores entered the <code>disabled</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableFastSnapshotRestoreSuccessItem withDisabledTime(java.util.Date disabledTime) {
        setDisabledTime(disabledTime);
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateTransitionReason() != null)
            sb.append("StateTransitionReason: ").append(getStateTransitionReason()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getOwnerAlias() != null)
            sb.append("OwnerAlias: ").append(getOwnerAlias()).append(",");
        if (getEnablingTime() != null)
            sb.append("EnablingTime: ").append(getEnablingTime()).append(",");
        if (getOptimizingTime() != null)
            sb.append("OptimizingTime: ").append(getOptimizingTime()).append(",");
        if (getEnabledTime() != null)
            sb.append("EnabledTime: ").append(getEnabledTime()).append(",");
        if (getDisablingTime() != null)
            sb.append("DisablingTime: ").append(getDisablingTime()).append(",");
        if (getDisabledTime() != null)
            sb.append("DisabledTime: ").append(getDisabledTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableFastSnapshotRestoreSuccessItem == false)
            return false;
        EnableFastSnapshotRestoreSuccessItem other = (EnableFastSnapshotRestoreSuccessItem) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateTransitionReason() == null ^ this.getStateTransitionReason() == null)
            return false;
        if (other.getStateTransitionReason() != null && other.getStateTransitionReason().equals(this.getStateTransitionReason()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getOwnerAlias() == null ^ this.getOwnerAlias() == null)
            return false;
        if (other.getOwnerAlias() != null && other.getOwnerAlias().equals(this.getOwnerAlias()) == false)
            return false;
        if (other.getEnablingTime() == null ^ this.getEnablingTime() == null)
            return false;
        if (other.getEnablingTime() != null && other.getEnablingTime().equals(this.getEnablingTime()) == false)
            return false;
        if (other.getOptimizingTime() == null ^ this.getOptimizingTime() == null)
            return false;
        if (other.getOptimizingTime() != null && other.getOptimizingTime().equals(this.getOptimizingTime()) == false)
            return false;
        if (other.getEnabledTime() == null ^ this.getEnabledTime() == null)
            return false;
        if (other.getEnabledTime() != null && other.getEnabledTime().equals(this.getEnabledTime()) == false)
            return false;
        if (other.getDisablingTime() == null ^ this.getDisablingTime() == null)
            return false;
        if (other.getDisablingTime() != null && other.getDisablingTime().equals(this.getDisablingTime()) == false)
            return false;
        if (other.getDisabledTime() == null ^ this.getDisabledTime() == null)
            return false;
        if (other.getDisabledTime() != null && other.getDisabledTime().equals(this.getDisabledTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateTransitionReason() == null) ? 0 : getStateTransitionReason().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAlias() == null) ? 0 : getOwnerAlias().hashCode());
        hashCode = prime * hashCode + ((getEnablingTime() == null) ? 0 : getEnablingTime().hashCode());
        hashCode = prime * hashCode + ((getOptimizingTime() == null) ? 0 : getOptimizingTime().hashCode());
        hashCode = prime * hashCode + ((getEnabledTime() == null) ? 0 : getEnabledTime().hashCode());
        hashCode = prime * hashCode + ((getDisablingTime() == null) ? 0 : getDisablingTime().hashCode());
        hashCode = prime * hashCode + ((getDisabledTime() == null) ? 0 : getDisabledTime().hashCode());
        return hashCode;
    }

    @Override
    public EnableFastSnapshotRestoreSuccessItem clone() {
        try {
            return (EnableFastSnapshotRestoreSuccessItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
