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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Details on a task in a cluster.
 * </p>
 */
public class Task implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the task.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task definition that creates the task.
     * </p>
     */
    private String taskDefinitionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instances that host the task.
     * </p>
     */
    private String containerInstanceArn;
    /**
     * <p>
     * One or more container overrides.
     * </p>
     */
    private TaskOverride overrides;
    /**
     * <p>
     * The last known status of the task.
     * </p>
     */
    private String lastStatus;
    /**
     * <p>
     * The desired status of the task.
     * </p>
     */
    private String desiredStatus;
    /**
     * <p>
     * The containers associated with the task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Container> containers;
    /**
     * <p>
     * The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     * <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event, the
     * version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch events, you can
     * compare the version of a task reported by the Amazon ECS APIs with the version reported in CloudWatch events for
     * the task (inside the <code>detail</code> object) to verify that the version in your event stream is current.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * The reason the task was stopped.
     * </p>
     */
    private String stoppedReason;
    /**
     * <p>
     * The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp for when the task was started (the task transitioned from the <code>PENDING</code> state to
     * the <code>RUNNING</code> state).
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code> state to
     * the <code>STOPPED</code> state).
     * </p>
     */
    private java.util.Date stoppedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the task.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster that hosts the task.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cluster that hosts the task.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the task.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster that hosts the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task definition that creates the task.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The Amazon Resource Name (ARN) of the task definition that creates the task.
     */

    public void setTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task definition that creates the task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task definition that creates the task.
     */

    public String getTaskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task definition that creates the task.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The Amazon Resource Name (ARN) of the task definition that creates the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withTaskDefinitionArn(String taskDefinitionArn) {
        setTaskDefinitionArn(taskDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instances that host the task.
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instances that host the task.
     */

    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instances that host the task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container instances that host the task.
     */

    public String getContainerInstanceArn() {
        return this.containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instances that host the task.
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instances that host the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withContainerInstanceArn(String containerInstanceArn) {
        setContainerInstanceArn(containerInstanceArn);
        return this;
    }

    /**
     * <p>
     * One or more container overrides.
     * </p>
     * 
     * @param overrides
     *        One or more container overrides.
     */

    public void setOverrides(TaskOverride overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * One or more container overrides.
     * </p>
     * 
     * @return One or more container overrides.
     */

    public TaskOverride getOverrides() {
        return this.overrides;
    }

    /**
     * <p>
     * One or more container overrides.
     * </p>
     * 
     * @param overrides
     *        One or more container overrides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withOverrides(TaskOverride overrides) {
        setOverrides(overrides);
        return this;
    }

    /**
     * <p>
     * The last known status of the task.
     * </p>
     * 
     * @param lastStatus
     *        The last known status of the task.
     */

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * The last known status of the task.
     * </p>
     * 
     * @return The last known status of the task.
     */

    public String getLastStatus() {
        return this.lastStatus;
    }

    /**
     * <p>
     * The last known status of the task.
     * </p>
     * 
     * @param lastStatus
     *        The last known status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withLastStatus(String lastStatus) {
        setLastStatus(lastStatus);
        return this;
    }

    /**
     * <p>
     * The desired status of the task.
     * </p>
     * 
     * @param desiredStatus
     *        The desired status of the task.
     */

    public void setDesiredStatus(String desiredStatus) {
        this.desiredStatus = desiredStatus;
    }

    /**
     * <p>
     * The desired status of the task.
     * </p>
     * 
     * @return The desired status of the task.
     */

    public String getDesiredStatus() {
        return this.desiredStatus;
    }

    /**
     * <p>
     * The desired status of the task.
     * </p>
     * 
     * @param desiredStatus
     *        The desired status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withDesiredStatus(String desiredStatus) {
        setDesiredStatus(desiredStatus);
        return this;
    }

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     * 
     * @return The containers associated with the task.
     */

    public java.util.List<Container> getContainers() {
        if (containers == null) {
            containers = new com.amazonaws.internal.SdkInternalList<Container>();
        }
        return containers;
    }

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     * 
     * @param containers
     *        The containers associated with the task.
     */

    public void setContainers(java.util.Collection<Container> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new com.amazonaws.internal.SdkInternalList<Container>(containers);
    }

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        The containers associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withContainers(Container... containers) {
        if (this.containers == null) {
            setContainers(new com.amazonaws.internal.SdkInternalList<Container>(containers.length));
        }
        for (Container ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     * 
     * @param containers
     *        The containers associated with the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withContainers(java.util.Collection<Container> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     * <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     * </p>
     * 
     * @param startedBy
     *        The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     *        <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     * <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     * </p>
     * 
     * @return The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     *         <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     * <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     * </p>
     * 
     * @param startedBy
     *        The tag specified when a task is started. If the task is started by an Amazon ECS service, then the
     *        <code>startedBy</code> parameter contains the deployment ID of the service that starts it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event, the
     * version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch events, you can
     * compare the version of a task reported by the Amazon ECS APIs with the version reported in CloudWatch events for
     * the task (inside the <code>detail</code> object) to verify that the version in your event stream is current.
     * </p>
     * 
     * @param version
     *        The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event,
     *        the version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch
     *        events, you can compare the version of a task reported by the Amazon ECS APIs with the version reported in
     *        CloudWatch events for the task (inside the <code>detail</code> object) to verify that the version in your
     *        event stream is current.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event, the
     * version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch events, you can
     * compare the version of a task reported by the Amazon ECS APIs with the version reported in CloudWatch events for
     * the task (inside the <code>detail</code> object) to verify that the version in your event stream is current.
     * </p>
     * 
     * @return The version counter for the task. Every time a task experiences a change that triggers a CloudWatch
     *         event, the version counter is incremented. If you are replicating your Amazon ECS task state with
     *         CloudWatch events, you can compare the version of a task reported by the Amazon ECS APIs with the version
     *         reported in CloudWatch events for the task (inside the <code>detail</code> object) to verify that the
     *         version in your event stream is current.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event, the
     * version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch events, you can
     * compare the version of a task reported by the Amazon ECS APIs with the version reported in CloudWatch events for
     * the task (inside the <code>detail</code> object) to verify that the version in your event stream is current.
     * </p>
     * 
     * @param version
     *        The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event,
     *        the version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch
     *        events, you can compare the version of a task reported by the Amazon ECS APIs with the version reported in
     *        CloudWatch events for the task (inside the <code>detail</code> object) to verify that the version in your
     *        event stream is current.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The reason the task was stopped.
     * </p>
     * 
     * @param stoppedReason
     *        The reason the task was stopped.
     */

    public void setStoppedReason(String stoppedReason) {
        this.stoppedReason = stoppedReason;
    }

    /**
     * <p>
     * The reason the task was stopped.
     * </p>
     * 
     * @return The reason the task was stopped.
     */

    public String getStoppedReason() {
        return this.stoppedReason;
    }

    /**
     * <p>
     * The reason the task was stopped.
     * </p>
     * 
     * @param stoppedReason
     *        The reason the task was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withStoppedReason(String stoppedReason) {
        setStoppedReason(stoppedReason);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     * </p>
     * 
     * @return The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for when the task was created (the task entered the <code>PENDING</code> state).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was started (the task transitioned from the <code>PENDING</code> state to
     * the <code>RUNNING</code> state).
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp for when the task was started (the task transitioned from the <code>PENDING</code>
     *        state to the <code>RUNNING</code> state).
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was started (the task transitioned from the <code>PENDING</code> state to
     * the <code>RUNNING</code> state).
     * </p>
     * 
     * @return The Unix timestamp for when the task was started (the task transitioned from the <code>PENDING</code>
     *         state to the <code>RUNNING</code> state).
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was started (the task transitioned from the <code>PENDING</code> state to
     * the <code>RUNNING</code> state).
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp for when the task was started (the task transitioned from the <code>PENDING</code>
     *        state to the <code>RUNNING</code> state).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code> state to
     * the <code>STOPPED</code> state).
     * </p>
     * 
     * @param stoppedAt
     *        The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code>
     *        state to the <code>STOPPED</code> state).
     */

    public void setStoppedAt(java.util.Date stoppedAt) {
        this.stoppedAt = stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code> state to
     * the <code>STOPPED</code> state).
     * </p>
     * 
     * @return The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code>
     *         state to the <code>STOPPED</code> state).
     */

    public java.util.Date getStoppedAt() {
        return this.stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code> state to
     * the <code>STOPPED</code> state).
     * </p>
     * 
     * @param stoppedAt
     *        The Unix timestamp for when the task was stopped (the task transitioned from the <code>RUNNING</code>
     *        state to the <code>STOPPED</code> state).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Task withStoppedAt(java.util.Date stoppedAt) {
        setStoppedAt(stoppedAt);
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
        if (getTaskArn() != null)
            sb.append("TaskArn: " + getTaskArn() + ",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: " + getClusterArn() + ",");
        if (getTaskDefinitionArn() != null)
            sb.append("TaskDefinitionArn: " + getTaskDefinitionArn() + ",");
        if (getContainerInstanceArn() != null)
            sb.append("ContainerInstanceArn: " + getContainerInstanceArn() + ",");
        if (getOverrides() != null)
            sb.append("Overrides: " + getOverrides() + ",");
        if (getLastStatus() != null)
            sb.append("LastStatus: " + getLastStatus() + ",");
        if (getDesiredStatus() != null)
            sb.append("DesiredStatus: " + getDesiredStatus() + ",");
        if (getContainers() != null)
            sb.append("Containers: " + getContainers() + ",");
        if (getStartedBy() != null)
            sb.append("StartedBy: " + getStartedBy() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getStoppedReason() != null)
            sb.append("StoppedReason: " + getStoppedReason() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getStartedAt() != null)
            sb.append("StartedAt: " + getStartedAt() + ",");
        if (getStoppedAt() != null)
            sb.append("StoppedAt: " + getStoppedAt());
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
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getTaskDefinitionArn() == null ^ this.getTaskDefinitionArn() == null)
            return false;
        if (other.getTaskDefinitionArn() != null && other.getTaskDefinitionArn().equals(this.getTaskDefinitionArn()) == false)
            return false;
        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null)
            return false;
        if (other.getContainerInstanceArn() != null && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false)
            return false;
        if (other.getDesiredStatus() == null ^ this.getDesiredStatus() == null)
            return false;
        if (other.getDesiredStatus() != null && other.getDesiredStatus().equals(this.getDesiredStatus()) == false)
            return false;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStoppedReason() == null ^ this.getStoppedReason() == null)
            return false;
        if (other.getStoppedReason() != null && other.getStoppedReason().equals(this.getStoppedReason()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStoppedAt() == null ^ this.getStoppedAt() == null)
            return false;
        if (other.getStoppedAt() != null && other.getStoppedAt().equals(this.getStoppedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinitionArn() == null) ? 0 : getTaskDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getContainerInstanceArn() == null) ? 0 : getContainerInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        hashCode = prime * hashCode + ((getDesiredStatus() == null) ? 0 : getDesiredStatus().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStoppedReason() == null) ? 0 : getStoppedReason().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStoppedAt() == null) ? 0 : getStoppedAt().hashCode());
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
}
