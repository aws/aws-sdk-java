/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes a bundle task.
 * </p>
 */
public class BundleTask implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance associated with this bundle task.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The ID of the bundle task.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The state of the task.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The time this task started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time of the most recent update for the task.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The Amazon S3 storage locations.
     * </p>
     */
    private Storage storage;
    /**
     * <p>
     * The level of task completion, as a percent (for example, 20%).
     * </p>
     */
    private String progress;
    /**
     * <p>
     * If the task fails, a description of the error.
     * </p>
     */
    private BundleTaskError bundleTaskError;

    /**
     * <p>
     * The ID of the instance associated with this bundle task.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance associated with this bundle task.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance associated with this bundle task.
     * </p>
     * 
     * @return The ID of the instance associated with this bundle task.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance associated with this bundle task.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance associated with this bundle task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleTask withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The ID of the bundle task.
     * </p>
     * 
     * @param bundleId
     *        The ID of the bundle task.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The ID of the bundle task.
     * </p>
     * 
     * @return The ID of the bundle task.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The ID of the bundle task.
     * </p>
     * 
     * @param bundleId
     *        The ID of the bundle task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleTask withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The state of the task.
     * </p>
     * 
     * @param state
     *        The state of the task.
     * @see BundleTaskState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the task.
     * </p>
     * 
     * @return The state of the task.
     * @see BundleTaskState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the task.
     * </p>
     * 
     * @param state
     *        The state of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BundleTaskState
     */

    public BundleTask withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the task.
     * </p>
     * 
     * @param state
     *        The state of the task.
     * @see BundleTaskState
     */

    public void setState(BundleTaskState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the task.
     * </p>
     * 
     * @param state
     *        The state of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BundleTaskState
     */

    public BundleTask withState(BundleTaskState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The time this task started.
     * </p>
     * 
     * @param startTime
     *        The time this task started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time this task started.
     * </p>
     * 
     * @return The time this task started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time this task started.
     * </p>
     * 
     * @param startTime
     *        The time this task started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleTask withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time of the most recent update for the task.
     * </p>
     * 
     * @param updateTime
     *        The time of the most recent update for the task.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time of the most recent update for the task.
     * </p>
     * 
     * @return The time of the most recent update for the task.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time of the most recent update for the task.
     * </p>
     * 
     * @param updateTime
     *        The time of the most recent update for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleTask withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 storage locations.
     * </p>
     * 
     * @param storage
     *        The Amazon S3 storage locations.
     */

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    /**
     * <p>
     * The Amazon S3 storage locations.
     * </p>
     * 
     * @return The Amazon S3 storage locations.
     */

    public Storage getStorage() {
        return this.storage;
    }

    /**
     * <p>
     * The Amazon S3 storage locations.
     * </p>
     * 
     * @param storage
     *        The Amazon S3 storage locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleTask withStorage(Storage storage) {
        setStorage(storage);
        return this;
    }

    /**
     * <p>
     * The level of task completion, as a percent (for example, 20%).
     * </p>
     * 
     * @param progress
     *        The level of task completion, as a percent (for example, 20%).
     */

    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The level of task completion, as a percent (for example, 20%).
     * </p>
     * 
     * @return The level of task completion, as a percent (for example, 20%).
     */

    public String getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The level of task completion, as a percent (for example, 20%).
     * </p>
     * 
     * @param progress
     *        The level of task completion, as a percent (for example, 20%).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleTask withProgress(String progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * If the task fails, a description of the error.
     * </p>
     * 
     * @param bundleTaskError
     *        If the task fails, a description of the error.
     */

    public void setBundleTaskError(BundleTaskError bundleTaskError) {
        this.bundleTaskError = bundleTaskError;
    }

    /**
     * <p>
     * If the task fails, a description of the error.
     * </p>
     * 
     * @return If the task fails, a description of the error.
     */

    public BundleTaskError getBundleTaskError() {
        return this.bundleTaskError;
    }

    /**
     * <p>
     * If the task fails, a description of the error.
     * </p>
     * 
     * @param bundleTaskError
     *        If the task fails, a description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleTask withBundleTaskError(BundleTaskError bundleTaskError) {
        setBundleTaskError(bundleTaskError);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getBundleId() != null)
            sb.append("BundleId: " + getBundleId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: " + getUpdateTime() + ",");
        if (getStorage() != null)
            sb.append("Storage: " + getStorage() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getBundleTaskError() != null)
            sb.append("BundleTaskError: " + getBundleTaskError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BundleTask == false)
            return false;
        BundleTask other = (BundleTask) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getStorage() == null ^ this.getStorage() == null)
            return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getBundleTaskError() == null ^ this.getBundleTaskError() == null)
            return false;
        if (other.getBundleTaskError() != null && other.getBundleTaskError().equals(this.getBundleTaskError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getBundleTaskError() == null) ? 0 : getBundleTaskError().hashCode());
        return hashCode;
    }

    @Override
    public BundleTask clone() {
        try {
            return (BundleTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
