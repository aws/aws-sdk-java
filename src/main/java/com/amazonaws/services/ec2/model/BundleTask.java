/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents a task to bundle an EC2 Windows instance into a new image.
 * </p>
 */
public class BundleTask {

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
     *
     * @return The state of this task.
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of this task.
     *
     * @param state The state of this task.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of this task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The state of this task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BundleTask withState(String state) {
        this.state = state;
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
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("BundleId: " + bundleId + ", ");
        sb.append("State: " + state + ", ");
        sb.append("StartTime: " + startTime + ", ");
        sb.append("UpdateTime: " + updateTime + ", ");
        sb.append("Storage: " + storage + ", ");
        sb.append("Progress: " + progress + ", ");
        sb.append("BundleTaskError: " + bundleTaskError + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    