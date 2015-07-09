/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * The details of an Amazon ECS service deployment.
 * </p>
 */
public class Deployment implements Serializable, Cloneable {

    /**
     * The ID of the deployment.
     */
    private String id;

    /**
     * The status of the deployment. Valid values are <code>PRIMARY</code>
     * (for the most recent deployment), <code>ACTIVE</code> (for previous
     * deployments that still have tasks running, but are being replaced with
     * the <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     * deployments that have been completely replaced).
     */
    private String status;

    /**
     * The most recent task definition that was specified for the service to
     * use.
     */
    private String taskDefinition;

    /**
     * The most recent desired count of tasks that was specified for the
     * service to deploy and/or maintain.
     */
    private Integer desiredCount;

    /**
     * The number of tasks in the deployment that are in the
     * <code>PENDING</code> status.
     */
    private Integer pendingCount;

    /**
     * The number of tasks in the deployment that are in the
     * <code>RUNNING</code> status.
     */
    private Integer runningCount;

    /**
     * The Unix time in seconds and milliseconds when the service was
     * created.
     */
    private java.util.Date createdAt;

    /**
     * The Unix time in seconds and milliseconds when the service was last
     * updated.
     */
    private java.util.Date updatedAt;

    /**
     * The ID of the deployment.
     *
     * @return The ID of the deployment.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the deployment.
     *
     * @param id The ID of the deployment.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The ID of the deployment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Deployment withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The status of the deployment. Valid values are <code>PRIMARY</code>
     * (for the most recent deployment), <code>ACTIVE</code> (for previous
     * deployments that still have tasks running, but are being replaced with
     * the <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     * deployments that have been completely replaced).
     *
     * @return The status of the deployment. Valid values are <code>PRIMARY</code>
     *         (for the most recent deployment), <code>ACTIVE</code> (for previous
     *         deployments that still have tasks running, but are being replaced with
     *         the <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     *         deployments that have been completely replaced).
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the deployment. Valid values are <code>PRIMARY</code>
     * (for the most recent deployment), <code>ACTIVE</code> (for previous
     * deployments that still have tasks running, but are being replaced with
     * the <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     * deployments that have been completely replaced).
     *
     * @param status The status of the deployment. Valid values are <code>PRIMARY</code>
     *         (for the most recent deployment), <code>ACTIVE</code> (for previous
     *         deployments that still have tasks running, but are being replaced with
     *         the <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     *         deployments that have been completely replaced).
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the deployment. Valid values are <code>PRIMARY</code>
     * (for the most recent deployment), <code>ACTIVE</code> (for previous
     * deployments that still have tasks running, but are being replaced with
     * the <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     * deployments that have been completely replaced).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the deployment. Valid values are <code>PRIMARY</code>
     *         (for the most recent deployment), <code>ACTIVE</code> (for previous
     *         deployments that still have tasks running, but are being replaced with
     *         the <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     *         deployments that have been completely replaced).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Deployment withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The most recent task definition that was specified for the service to
     * use.
     *
     * @return The most recent task definition that was specified for the service to
     *         use.
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }
    
    /**
     * The most recent task definition that was specified for the service to
     * use.
     *
     * @param taskDefinition The most recent task definition that was specified for the service to
     *         use.
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }
    
    /**
     * The most recent task definition that was specified for the service to
     * use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskDefinition The most recent task definition that was specified for the service to
     *         use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Deployment withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * The most recent desired count of tasks that was specified for the
     * service to deploy and/or maintain.
     *
     * @return The most recent desired count of tasks that was specified for the
     *         service to deploy and/or maintain.
     */
    public Integer getDesiredCount() {
        return desiredCount;
    }
    
    /**
     * The most recent desired count of tasks that was specified for the
     * service to deploy and/or maintain.
     *
     * @param desiredCount The most recent desired count of tasks that was specified for the
     *         service to deploy and/or maintain.
     */
    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }
    
    /**
     * The most recent desired count of tasks that was specified for the
     * service to deploy and/or maintain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCount The most recent desired count of tasks that was specified for the
     *         service to deploy and/or maintain.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Deployment withDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
        return this;
    }

    /**
     * The number of tasks in the deployment that are in the
     * <code>PENDING</code> status.
     *
     * @return The number of tasks in the deployment that are in the
     *         <code>PENDING</code> status.
     */
    public Integer getPendingCount() {
        return pendingCount;
    }
    
    /**
     * The number of tasks in the deployment that are in the
     * <code>PENDING</code> status.
     *
     * @param pendingCount The number of tasks in the deployment that are in the
     *         <code>PENDING</code> status.
     */
    public void setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
    }
    
    /**
     * The number of tasks in the deployment that are in the
     * <code>PENDING</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingCount The number of tasks in the deployment that are in the
     *         <code>PENDING</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Deployment withPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    /**
     * The number of tasks in the deployment that are in the
     * <code>RUNNING</code> status.
     *
     * @return The number of tasks in the deployment that are in the
     *         <code>RUNNING</code> status.
     */
    public Integer getRunningCount() {
        return runningCount;
    }
    
    /**
     * The number of tasks in the deployment that are in the
     * <code>RUNNING</code> status.
     *
     * @param runningCount The number of tasks in the deployment that are in the
     *         <code>RUNNING</code> status.
     */
    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }
    
    /**
     * The number of tasks in the deployment that are in the
     * <code>RUNNING</code> status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param runningCount The number of tasks in the deployment that are in the
     *         <code>RUNNING</code> status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Deployment withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * The Unix time in seconds and milliseconds when the service was
     * created.
     *
     * @return The Unix time in seconds and milliseconds when the service was
     *         created.
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    
    /**
     * The Unix time in seconds and milliseconds when the service was
     * created.
     *
     * @param createdAt The Unix time in seconds and milliseconds when the service was
     *         created.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * The Unix time in seconds and milliseconds when the service was
     * created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt The Unix time in seconds and milliseconds when the service was
     *         created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Deployment withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The Unix time in seconds and milliseconds when the service was last
     * updated.
     *
     * @return The Unix time in seconds and milliseconds when the service was last
     *         updated.
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    
    /**
     * The Unix time in seconds and milliseconds when the service was last
     * updated.
     *
     * @param updatedAt The Unix time in seconds and milliseconds when the service was last
     *         updated.
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    /**
     * The Unix time in seconds and milliseconds when the service was last
     * updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param updatedAt The Unix time in seconds and milliseconds when the service was last
     *         updated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Deployment withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getTaskDefinition() != null) sb.append("TaskDefinition: " + getTaskDefinition() + ",");
        if (getDesiredCount() != null) sb.append("DesiredCount: " + getDesiredCount() + ",");
        if (getPendingCount() != null) sb.append("PendingCount: " + getPendingCount() + ",");
        if (getRunningCount() != null) sb.append("RunningCount: " + getRunningCount() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getUpdatedAt() != null) sb.append("UpdatedAt: " + getUpdatedAt() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode()); 
        hashCode = prime * hashCode + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode()); 
        hashCode = prime * hashCode + ((getPendingCount() == null) ? 0 : getPendingCount().hashCode()); 
        hashCode = prime * hashCode + ((getRunningCount() == null) ? 0 : getRunningCount().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Deployment == false) return false;
        Deployment other = (Deployment)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null) return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false) return false; 
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null) return false;
        if (other.getDesiredCount() != null && other.getDesiredCount().equals(this.getDesiredCount()) == false) return false; 
        if (other.getPendingCount() == null ^ this.getPendingCount() == null) return false;
        if (other.getPendingCount() != null && other.getPendingCount().equals(this.getPendingCount()) == false) return false; 
        if (other.getRunningCount() == null ^ this.getRunningCount() == null) return false;
        if (other.getRunningCount() != null && other.getRunningCount().equals(this.getRunningCount()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null) return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false) return false; 
        return true;
    }
    
    @Override
    public Deployment clone() {
        try {
            return (Deployment) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    