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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * Represents a task to bundle an EC2 Windows instance into a new image.
 * </p>
 */
public class BundleTask implements Serializable {

    /**
     * Instance associated with this bundle task.
     */
    private String instanceId;

    /**
     * Unique identifier for this task.
     */
    private String bundleId;

    /**
     * The state of this task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, waiting-for-shutdown, bundling, storing, cancelling, complete, failed
     */
    private String state;

    /**
     * The time this task started.
     */
    private java.util.Date startTime;

    /**
     * The time of the most recent update for the task.
     */
    private java.util.Date updateTime;

    /**
     * Amazon S3 storage locations.
     */
    private Storage storage;

    /**
     * The level of task completion, in percent (e.g., 20%).
     */
    private String progress;

    /**
     * If the task fails, a description of the error.
     */
    private BundleTaskError bundleTaskError;

    /**
     * Instance associated with this bundle task.
     *
     * @return Instance associated with this bundle task.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * Instance associated with this bundle task.
     *
     * @param instanceId Instance associated with this bundle task.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * Instance associated with this bundle task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId Instance associated with this bundle task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BundleTask withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Unique identifier for this task.
     *
     * @return Unique identifier for this task.
     */
    public String getBundleId() {
        return bundleId;
    }
    
    /**
     * Unique identifier for this task.
     *
     * @param bundleId Unique identifier for this task.
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }
    
    /**
     * Unique identifier for this task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundleId Unique identifier for this task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BundleTask withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * The state of this task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, waiting-for-shutdown, bundling, storing, cancelling, complete, failed
     *
     * @return The state of this task.
     *
     * @see BundleTaskState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of this task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, waiting-for-shutdown, bundling, storing, cancelling, complete, failed
     *
     * @param state The state of this task.
     *
     * @see BundleTaskState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of this task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, waiting-for-shutdown, bundling, storing, cancelling, complete, failed
     *
     * @param state The state of this task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see BundleTaskState
     */
    public BundleTask withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of this task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, waiting-for-shutdown, bundling, storing, cancelling, complete, failed
     *
     * @param state The state of this task.
     *
     * @see BundleTaskState
     */
    public void setState(BundleTaskState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of this task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, waiting-for-shutdown, bundling, storing, cancelling, complete, failed
     *
     * @param state The state of this task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see BundleTaskState
     */
    public BundleTask withState(BundleTaskState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The time this task started.
     *
     * @return The time this task started.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The time this task started.
     *
     * @param startTime The time this task started.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The time this task started.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The time this task started.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BundleTask withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The time of the most recent update for the task.
     *
     * @return The time of the most recent update for the task.
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }
    
    /**
     * The time of the most recent update for the task.
     *
     * @param updateTime The time of the most recent update for the task.
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }
    
    /**
     * The time of the most recent update for the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param updateTime The time of the most recent update for the task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BundleTask withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Amazon S3 storage locations.
     *
     * @return Amazon S3 storage locations.
     */
    public Storage getStorage() {
        return storage;
    }
    
    /**
     * Amazon S3 storage locations.
     *
     * @param storage Amazon S3 storage locations.
     */
    public void setStorage(Storage storage) {
        this.storage = storage;
    }
    
    /**
     * Amazon S3 storage locations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storage Amazon S3 storage locations.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BundleTask withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    /**
     * The level of task completion, in percent (e.g., 20%).
     *
     * @return The level of task completion, in percent (e.g., 20%).
     */
    public String getProgress() {
        return progress;
    }
    
    /**
     * The level of task completion, in percent (e.g., 20%).
     *
     * @param progress The level of task completion, in percent (e.g., 20%).
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }
    
    /**
     * The level of task completion, in percent (e.g., 20%).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progress The level of task completion, in percent (e.g., 20%).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BundleTask withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * If the task fails, a description of the error.
     *
     * @return If the task fails, a description of the error.
     */
    public BundleTaskError getBundleTaskError() {
        return bundleTaskError;
    }
    
    /**
     * If the task fails, a description of the error.
     *
     * @param bundleTaskError If the task fails, a description of the error.
     */
    public void setBundleTaskError(BundleTaskError bundleTaskError) {
        this.bundleTaskError = bundleTaskError;
    }
    
    /**
     * If the task fails, a description of the error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundleTaskError If the task fails, a description of the error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BundleTask withBundleTaskError(BundleTaskError bundleTaskError) {
        this.bundleTaskError = bundleTaskError;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getBundleId() != null) sb.append("BundleId: " + getBundleId() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getUpdateTime() != null) sb.append("UpdateTime: " + getUpdateTime() + ",");
        if (getStorage() != null) sb.append("Storage: " + getStorage() + ",");
        if (getProgress() != null) sb.append("Progress: " + getProgress() + ",");
        if (getBundleTaskError() != null) sb.append("BundleTaskError: " + getBundleTaskError() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BundleTask == false) return false;
        BundleTask other = (BundleTask)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getBundleId() == null ^ this.getBundleId() == null) return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null) return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false) return false; 
        if (other.getStorage() == null ^ this.getStorage() == null) return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false) return false; 
        if (other.getProgress() == null ^ this.getProgress() == null) return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false) return false; 
        if (other.getBundleTaskError() == null ^ this.getBundleTaskError() == null) return false;
        if (other.getBundleTaskError() != null && other.getBundleTaskError().equals(this.getBundleTaskError()) == false) return false; 
        return true;
    }
    
}
    