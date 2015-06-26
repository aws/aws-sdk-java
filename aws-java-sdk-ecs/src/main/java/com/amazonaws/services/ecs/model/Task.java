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
 * 
 */
public class Task implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of the task.
     */
    private String taskArn;

    /**
     * The Amazon Resource Name (ARN) of the of the cluster that hosts the
     * task.
     */
    private String clusterArn;

    /**
     * The Amazon Resource Name (ARN) of the of the task definition that
     * creates the task.
     */
    private String taskDefinitionArn;

    /**
     * The Amazon Resource Name (ARN) of the container instances that host
     * the task.
     */
    private String containerInstanceArn;

    /**
     * One or more container overrides.
     */
    private TaskOverride overrides;

    /**
     * The last known status of the task.
     */
    private String lastStatus;

    /**
     * The desired status of the task.
     */
    private String desiredStatus;

    /**
     * The containers associated with the task.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Container> containers;

    /**
     * The tag specified when a task is started. If the task is started by an
     * Amazon ECS service, then the <code>startedBy</code> parameter contains
     * the deployment ID of the service that starts it.
     */
    private String startedBy;

    /**
     * The Amazon Resource Name (ARN) of the task.
     *
     * @return The Amazon Resource Name (ARN) of the task.
     */
    public String getTaskArn() {
        return taskArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the task.
     *
     * @param taskArn The Amazon Resource Name (ARN) of the task.
     */
    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskArn The Amazon Resource Name (ARN) of the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Task withTaskArn(String taskArn) {
        this.taskArn = taskArn;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the of the cluster that hosts the
     * task.
     *
     * @return The Amazon Resource Name (ARN) of the of the cluster that hosts the
     *         task.
     */
    public String getClusterArn() {
        return clusterArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the of the cluster that hosts the
     * task.
     *
     * @param clusterArn The Amazon Resource Name (ARN) of the of the cluster that hosts the
     *         task.
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the of the cluster that hosts the
     * task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterArn The Amazon Resource Name (ARN) of the of the cluster that hosts the
     *         task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Task withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the of the task definition that
     * creates the task.
     *
     * @return The Amazon Resource Name (ARN) of the of the task definition that
     *         creates the task.
     */
    public String getTaskDefinitionArn() {
        return taskDefinitionArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the of the task definition that
     * creates the task.
     *
     * @param taskDefinitionArn The Amazon Resource Name (ARN) of the of the task definition that
     *         creates the task.
     */
    public void setTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the of the task definition that
     * creates the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskDefinitionArn The Amazon Resource Name (ARN) of the of the task definition that
     *         creates the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Task withTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the container instances that host
     * the task.
     *
     * @return The Amazon Resource Name (ARN) of the container instances that host
     *         the task.
     */
    public String getContainerInstanceArn() {
        return containerInstanceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the container instances that host
     * the task.
     *
     * @param containerInstanceArn The Amazon Resource Name (ARN) of the container instances that host
     *         the task.
     */
    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the container instances that host
     * the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerInstanceArn The Amazon Resource Name (ARN) of the container instances that host
     *         the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Task withContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
        return this;
    }

    /**
     * One or more container overrides.
     *
     * @return One or more container overrides.
     */
    public TaskOverride getOverrides() {
        return overrides;
    }
    
    /**
     * One or more container overrides.
     *
     * @param overrides One or more container overrides.
     */
    public void setOverrides(TaskOverride overrides) {
        this.overrides = overrides;
    }
    
    /**
     * One or more container overrides.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param overrides One or more container overrides.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Task withOverrides(TaskOverride overrides) {
        this.overrides = overrides;
        return this;
    }

    /**
     * The last known status of the task.
     *
     * @return The last known status of the task.
     */
    public String getLastStatus() {
        return lastStatus;
    }
    
    /**
     * The last known status of the task.
     *
     * @param lastStatus The last known status of the task.
     */
    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }
    
    /**
     * The last known status of the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastStatus The last known status of the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Task withLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    /**
     * The desired status of the task.
     *
     * @return The desired status of the task.
     */
    public String getDesiredStatus() {
        return desiredStatus;
    }
    
    /**
     * The desired status of the task.
     *
     * @param desiredStatus The desired status of the task.
     */
    public void setDesiredStatus(String desiredStatus) {
        this.desiredStatus = desiredStatus;
    }
    
    /**
     * The desired status of the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredStatus The desired status of the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Task withDesiredStatus(String desiredStatus) {
        this.desiredStatus = desiredStatus;
        return this;
    }

    /**
     * The containers associated with the task.
     *
     * @return The containers associated with the task.
     */
    public java.util.List<Container> getContainers() {
        if (containers == null) {
              containers = new com.amazonaws.internal.ListWithAutoConstructFlag<Container>();
              containers.setAutoConstruct(true);
        }
        return containers;
    }
    
    /**
     * The containers associated with the task.
     *
     * @param containers The containers associated with the task.
     */
    public void setContainers(java.util.Collection<Container> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Container> containersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Container>(containers.size());
        containersCopy.addAll(containers);
        this.containers = containersCopy;
    }
    
    /**
     * The containers associated with the task.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setContainers(java.util.Collection)} or {@link
     * #withContainers(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containers The containers associated with the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Task withContainers(Container... containers) {
        if (getContainers() == null) setContainers(new java.util.ArrayList<Container>(containers.length));
        for (Container value : containers) {
            getContainers().add(value);
        }
        return this;
    }
    
    /**
     * The containers associated with the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containers The containers associated with the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Task withContainers(java.util.Collection<Container> containers) {
        if (containers == null) {
            this.containers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Container> containersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Container>(containers.size());
            containersCopy.addAll(containers);
            this.containers = containersCopy;
        }

        return this;
    }

    /**
     * The tag specified when a task is started. If the task is started by an
     * Amazon ECS service, then the <code>startedBy</code> parameter contains
     * the deployment ID of the service that starts it.
     *
     * @return The tag specified when a task is started. If the task is started by an
     *         Amazon ECS service, then the <code>startedBy</code> parameter contains
     *         the deployment ID of the service that starts it.
     */
    public String getStartedBy() {
        return startedBy;
    }
    
    /**
     * The tag specified when a task is started. If the task is started by an
     * Amazon ECS service, then the <code>startedBy</code> parameter contains
     * the deployment ID of the service that starts it.
     *
     * @param startedBy The tag specified when a task is started. If the task is started by an
     *         Amazon ECS service, then the <code>startedBy</code> parameter contains
     *         the deployment ID of the service that starts it.
     */
    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }
    
    /**
     * The tag specified when a task is started. If the task is started by an
     * Amazon ECS service, then the <code>startedBy</code> parameter contains
     * the deployment ID of the service that starts it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startedBy The tag specified when a task is started. If the task is started by an
     *         Amazon ECS service, then the <code>startedBy</code> parameter contains
     *         the deployment ID of the service that starts it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Task withStartedBy(String startedBy) {
        this.startedBy = startedBy;
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
        if (getTaskArn() != null) sb.append("TaskArn: " + getTaskArn() + ",");
        if (getClusterArn() != null) sb.append("ClusterArn: " + getClusterArn() + ",");
        if (getTaskDefinitionArn() != null) sb.append("TaskDefinitionArn: " + getTaskDefinitionArn() + ",");
        if (getContainerInstanceArn() != null) sb.append("ContainerInstanceArn: " + getContainerInstanceArn() + ",");
        if (getOverrides() != null) sb.append("Overrides: " + getOverrides() + ",");
        if (getLastStatus() != null) sb.append("LastStatus: " + getLastStatus() + ",");
        if (getDesiredStatus() != null) sb.append("DesiredStatus: " + getDesiredStatus() + ",");
        if (getContainers() != null) sb.append("Containers: " + getContainers() + ",");
        if (getStartedBy() != null) sb.append("StartedBy: " + getStartedBy() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Task == false) return false;
        Task other = (Task)obj;
        
        if (other.getTaskArn() == null ^ this.getTaskArn() == null) return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false) return false; 
        if (other.getClusterArn() == null ^ this.getClusterArn() == null) return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false) return false; 
        if (other.getTaskDefinitionArn() == null ^ this.getTaskDefinitionArn() == null) return false;
        if (other.getTaskDefinitionArn() != null && other.getTaskDefinitionArn().equals(this.getTaskDefinitionArn()) == false) return false; 
        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null) return false;
        if (other.getContainerInstanceArn() != null && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false) return false; 
        if (other.getOverrides() == null ^ this.getOverrides() == null) return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false) return false; 
        if (other.getLastStatus() == null ^ this.getLastStatus() == null) return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false) return false; 
        if (other.getDesiredStatus() == null ^ this.getDesiredStatus() == null) return false;
        if (other.getDesiredStatus() != null && other.getDesiredStatus().equals(this.getDesiredStatus()) == false) return false; 
        if (other.getContainers() == null ^ this.getContainers() == null) return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false) return false; 
        if (other.getStartedBy() == null ^ this.getStartedBy() == null) return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false) return false; 
        return true;
    }
    
    @Override
    public Task clone() {
        try {
            return (Task) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    