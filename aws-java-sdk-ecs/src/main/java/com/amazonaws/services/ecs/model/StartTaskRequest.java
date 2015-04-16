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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#startTask(StartTaskRequest) StartTask operation}.
 * <p>
 * Starts a new task from the specified task definition on the specified
 * container instance or instances. If you want to use the default Amazon
 * ECS scheduler to place your task, use <code>RunTask</code> instead.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> The list of container instances to start tasks on is
 * limited to 10.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#startTask(StartTaskRequest)
 */
public class StartTaskRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * you want to start your task on. If you do not specify a cluster, the
     * default cluster is assumed..
     */
    private String cluster;

    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition that you want to start.
     */
    private String taskDefinition;

    /**
     * A list of container overrides in JSON format that specify the name of
     * a container in the specified task definition and the command it should
     * run instead of its default. A total of 8192 characters are allowed for
     * overrides. This limit includes the JSON formatting characters of the
     * override structure.
     */
    private TaskOverride overrides;

    /**
     * The container instance UUIDs or full Amazon Resource Name (ARN)
     * entries for the container instances on which you would like to place
     * your task. <important> <p>The list of container instances to start
     * tasks on is limited to 10. </important>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> containerInstances;

    /**
     * 
     */
    private String startedBy;

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * you want to start your task on. If you do not specify a cluster, the
     * default cluster is assumed..
     *
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that
     *         you want to start your task on. If you do not specify a cluster, the
     *         default cluster is assumed..
     */
    public String getCluster() {
        return cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * you want to start your task on. If you do not specify a cluster, the
     * default cluster is assumed..
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         you want to start your task on. If you do not specify a cluster, the
     *         default cluster is assumed..
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * you want to start your task on. If you do not specify a cluster, the
     * default cluster is assumed..
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         you want to start your task on. If you do not specify a cluster, the
     *         default cluster is assumed..
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartTaskRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition that you want to start.
     *
     * @return The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition that you want to start.
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }
    
    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition that you want to start.
     *
     * @param taskDefinition The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition that you want to start.
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }
    
    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition that you want to start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskDefinition The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition that you want to start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartTaskRequest withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * A list of container overrides in JSON format that specify the name of
     * a container in the specified task definition and the command it should
     * run instead of its default. A total of 8192 characters are allowed for
     * overrides. This limit includes the JSON formatting characters of the
     * override structure.
     *
     * @return A list of container overrides in JSON format that specify the name of
     *         a container in the specified task definition and the command it should
     *         run instead of its default. A total of 8192 characters are allowed for
     *         overrides. This limit includes the JSON formatting characters of the
     *         override structure.
     */
    public TaskOverride getOverrides() {
        return overrides;
    }
    
    /**
     * A list of container overrides in JSON format that specify the name of
     * a container in the specified task definition and the command it should
     * run instead of its default. A total of 8192 characters are allowed for
     * overrides. This limit includes the JSON formatting characters of the
     * override structure.
     *
     * @param overrides A list of container overrides in JSON format that specify the name of
     *         a container in the specified task definition and the command it should
     *         run instead of its default. A total of 8192 characters are allowed for
     *         overrides. This limit includes the JSON formatting characters of the
     *         override structure.
     */
    public void setOverrides(TaskOverride overrides) {
        this.overrides = overrides;
    }
    
    /**
     * A list of container overrides in JSON format that specify the name of
     * a container in the specified task definition and the command it should
     * run instead of its default. A total of 8192 characters are allowed for
     * overrides. This limit includes the JSON formatting characters of the
     * override structure.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param overrides A list of container overrides in JSON format that specify the name of
     *         a container in the specified task definition and the command it should
     *         run instead of its default. A total of 8192 characters are allowed for
     *         overrides. This limit includes the JSON formatting characters of the
     *         override structure.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartTaskRequest withOverrides(TaskOverride overrides) {
        this.overrides = overrides;
        return this;
    }

    /**
     * The container instance UUIDs or full Amazon Resource Name (ARN)
     * entries for the container instances on which you would like to place
     * your task. <important> <p>The list of container instances to start
     * tasks on is limited to 10. </important>
     *
     * @return The container instance UUIDs or full Amazon Resource Name (ARN)
     *         entries for the container instances on which you would like to place
     *         your task. <important> <p>The list of container instances to start
     *         tasks on is limited to 10. </important>
     */
    public java.util.List<String> getContainerInstances() {
        if (containerInstances == null) {
              containerInstances = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              containerInstances.setAutoConstruct(true);
        }
        return containerInstances;
    }
    
    /**
     * The container instance UUIDs or full Amazon Resource Name (ARN)
     * entries for the container instances on which you would like to place
     * your task. <important> <p>The list of container instances to start
     * tasks on is limited to 10. </important>
     *
     * @param containerInstances The container instance UUIDs or full Amazon Resource Name (ARN)
     *         entries for the container instances on which you would like to place
     *         your task. <important> <p>The list of container instances to start
     *         tasks on is limited to 10. </important>
     */
    public void setContainerInstances(java.util.Collection<String> containerInstances) {
        if (containerInstances == null) {
            this.containerInstances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> containerInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(containerInstances.size());
        containerInstancesCopy.addAll(containerInstances);
        this.containerInstances = containerInstancesCopy;
    }
    
    /**
     * The container instance UUIDs or full Amazon Resource Name (ARN)
     * entries for the container instances on which you would like to place
     * your task. <important> <p>The list of container instances to start
     * tasks on is limited to 10. </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setContainerInstances(java.util.Collection)} or
     * {@link #withContainerInstances(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerInstances The container instance UUIDs or full Amazon Resource Name (ARN)
     *         entries for the container instances on which you would like to place
     *         your task. <important> <p>The list of container instances to start
     *         tasks on is limited to 10. </important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartTaskRequest withContainerInstances(String... containerInstances) {
        if (getContainerInstances() == null) setContainerInstances(new java.util.ArrayList<String>(containerInstances.length));
        for (String value : containerInstances) {
            getContainerInstances().add(value);
        }
        return this;
    }
    
    /**
     * The container instance UUIDs or full Amazon Resource Name (ARN)
     * entries for the container instances on which you would like to place
     * your task. <important> <p>The list of container instances to start
     * tasks on is limited to 10. </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerInstances The container instance UUIDs or full Amazon Resource Name (ARN)
     *         entries for the container instances on which you would like to place
     *         your task. <important> <p>The list of container instances to start
     *         tasks on is limited to 10. </important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartTaskRequest withContainerInstances(java.util.Collection<String> containerInstances) {
        if (containerInstances == null) {
            this.containerInstances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> containerInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(containerInstances.size());
            containerInstancesCopy.addAll(containerInstances);
            this.containerInstances = containerInstancesCopy;
        }

        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public String getStartedBy() {
        return startedBy;
    }
    
    /**
     * 
     *
     * @param startedBy 
     */
    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startedBy 
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartTaskRequest withStartedBy(String startedBy) {
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
        if (getCluster() != null) sb.append("Cluster: " + getCluster() + ",");
        if (getTaskDefinition() != null) sb.append("TaskDefinition: " + getTaskDefinition() + ",");
        if (getOverrides() != null) sb.append("Overrides: " + getOverrides() + ",");
        if (getContainerInstances() != null) sb.append("ContainerInstances: " + getContainerInstances() + ",");
        if (getStartedBy() != null) sb.append("StartedBy: " + getStartedBy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode()); 
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode()); 
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode()); 
        hashCode = prime * hashCode + ((getContainerInstances() == null) ? 0 : getContainerInstances().hashCode()); 
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StartTaskRequest == false) return false;
        StartTaskRequest other = (StartTaskRequest)obj;
        
        if (other.getCluster() == null ^ this.getCluster() == null) return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false) return false; 
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null) return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false) return false; 
        if (other.getOverrides() == null ^ this.getOverrides() == null) return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false) return false; 
        if (other.getContainerInstances() == null ^ this.getContainerInstances() == null) return false;
        if (other.getContainerInstances() != null && other.getContainerInstances().equals(this.getContainerInstances()) == false) return false; 
        if (other.getStartedBy() == null ^ this.getStartedBy() == null) return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false) return false; 
        return true;
    }
    
    @Override
    public StartTaskRequest clone() {
        
            return (StartTaskRequest) super.clone();
    }

}
    