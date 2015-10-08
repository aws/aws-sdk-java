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
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#updateService(UpdateServiceRequest) UpdateService operation}.
 * <p>
 * Modify the desired count or task definition used in a service.
 * </p>
 * <p>
 * You can add to or subtract from the number of instantiations of a task
 * definition in a service by specifying the cluster that the service is
 * running in and a new <code>desiredCount</code> parameter.
 * </p>
 * <p>
 * You can use <code>UpdateService</code> to modify your task definition
 * and deploy a new version of your service, one task at a time. If you
 * modify the task definition with <code>UpdateService</code> , Amazon
 * ECS spawns a task with the new version of the task definition and then
 * stops an old task after the new version is running. Because
 * <code>UpdateService</code> starts a new version of the task before
 * stopping an old version, your cluster must have capacity to support
 * one more instantiation of the task when <code>UpdateService</code> is
 * run. If your cluster cannot support another instantiation of the task
 * used in your service, you can reduce the desired count of your service
 * by one before modifying the task definition.
 * </p>
 * <p>
 * When UpdateService replaces a task during an update, the equivalent of
 * <code>docker stop</code> is issued to the containers running in the
 * task. This results in a <code>SIGTERM</code> and a 30-second timeout,
 * after which <code>SIGKILL</code> is sent and the containers are
 * forcibly stopped. If the container handles the <code>SIGTERM</code>
 * gracefully and exits within 30 seconds from receiving it, no
 * <code>SIGKILL</code> is sent.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#updateService(UpdateServiceRequest)
 */
public class UpdateServiceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your service is running on. If you do not specify a cluster, the
     * default cluster is assumed.
     */
    private String cluster;

    /**
     * The name of the service to update.
     */
    private String service;

    /**
     * The number of instantiations of the task to place and keep running in
     * your service.
     */
    private Integer desiredCount;

    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition to run in your service. If a <code>revision</code>
     * is not specified, the latest <code>ACTIVE</code> revision is used. If
     * you modify the task definition with <code>UpdateService</code>, Amazon
     * ECS spawns a task with the new version of the task definition and then
     * stops an old task after the new version is running.
     */
    private String taskDefinition;

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your service is running on. If you do not specify a cluster, the
     * default cluster is assumed.
     *
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that
     *         your service is running on. If you do not specify a cluster, the
     *         default cluster is assumed.
     */
    public String getCluster() {
        return cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your service is running on. If you do not specify a cluster, the
     * default cluster is assumed.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         your service is running on. If you do not specify a cluster, the
     *         default cluster is assumed.
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your service is running on. If you do not specify a cluster, the
     * default cluster is assumed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         your service is running on. If you do not specify a cluster, the
     *         default cluster is assumed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateServiceRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * The name of the service to update.
     *
     * @return The name of the service to update.
     */
    public String getService() {
        return service;
    }
    
    /**
     * The name of the service to update.
     *
     * @param service The name of the service to update.
     */
    public void setService(String service) {
        this.service = service;
    }
    
    /**
     * The name of the service to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param service The name of the service to update.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateServiceRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * The number of instantiations of the task to place and keep running in
     * your service.
     *
     * @return The number of instantiations of the task to place and keep running in
     *         your service.
     */
    public Integer getDesiredCount() {
        return desiredCount;
    }
    
    /**
     * The number of instantiations of the task to place and keep running in
     * your service.
     *
     * @param desiredCount The number of instantiations of the task to place and keep running in
     *         your service.
     */
    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }
    
    /**
     * The number of instantiations of the task to place and keep running in
     * your service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCount The number of instantiations of the task to place and keep running in
     *         your service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateServiceRequest withDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
        return this;
    }

    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition to run in your service. If a <code>revision</code>
     * is not specified, the latest <code>ACTIVE</code> revision is used. If
     * you modify the task definition with <code>UpdateService</code>, Amazon
     * ECS spawns a task with the new version of the task definition and then
     * stops an old task after the new version is running.
     *
     * @return The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition to run in your service. If a <code>revision</code>
     *         is not specified, the latest <code>ACTIVE</code> revision is used. If
     *         you modify the task definition with <code>UpdateService</code>, Amazon
     *         ECS spawns a task with the new version of the task definition and then
     *         stops an old task after the new version is running.
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }
    
    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition to run in your service. If a <code>revision</code>
     * is not specified, the latest <code>ACTIVE</code> revision is used. If
     * you modify the task definition with <code>UpdateService</code>, Amazon
     * ECS spawns a task with the new version of the task definition and then
     * stops an old task after the new version is running.
     *
     * @param taskDefinition The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition to run in your service. If a <code>revision</code>
     *         is not specified, the latest <code>ACTIVE</code> revision is used. If
     *         you modify the task definition with <code>UpdateService</code>, Amazon
     *         ECS spawns a task with the new version of the task definition and then
     *         stops an old task after the new version is running.
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }
    
    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition to run in your service. If a <code>revision</code>
     * is not specified, the latest <code>ACTIVE</code> revision is used. If
     * you modify the task definition with <code>UpdateService</code>, Amazon
     * ECS spawns a task with the new version of the task definition and then
     * stops an old task after the new version is running.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskDefinition The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition to run in your service. If a <code>revision</code>
     *         is not specified, the latest <code>ACTIVE</code> revision is used. If
     *         you modify the task definition with <code>UpdateService</code>, Amazon
     *         ECS spawns a task with the new version of the task definition and then
     *         stops an old task after the new version is running.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateServiceRequest withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
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
        if (getService() != null) sb.append("Service: " + getService() + ",");
        if (getDesiredCount() != null) sb.append("DesiredCount: " + getDesiredCount() + ",");
        if (getTaskDefinition() != null) sb.append("TaskDefinition: " + getTaskDefinition() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode()); 
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode()); 
        hashCode = prime * hashCode + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode()); 
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateServiceRequest == false) return false;
        UpdateServiceRequest other = (UpdateServiceRequest)obj;
        
        if (other.getCluster() == null ^ this.getCluster() == null) return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false) return false; 
        if (other.getService() == null ^ this.getService() == null) return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false) return false; 
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null) return false;
        if (other.getDesiredCount() != null && other.getDesiredCount().equals(this.getDesiredCount()) == false) return false; 
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null) return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateServiceRequest clone() {
        
            return (UpdateServiceRequest) super.clone();
    }

}
    