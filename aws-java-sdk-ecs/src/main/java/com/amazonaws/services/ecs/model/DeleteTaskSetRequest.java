/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeleteTaskSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTaskSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists
     * in to delete.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that hosts the task set to delete.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The task set ID or full Amazon Resource Name (ARN) of the task set to delete.
     * </p>
     */
    private String taskSet;
    /**
     * <p>
     * If <code>true</code>, this allows you to delete a task set even if it hasn't been scaled down to zero.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists
     * in to delete.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set
     *        exists in to delete.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists
     * in to delete.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set
     *         exists in to delete.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists
     * in to delete.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set
     *        exists in to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTaskSetRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that hosts the task set to delete.
     * </p>
     * 
     * @param service
     *        The short name or full Amazon Resource Name (ARN) of the service that hosts the task set to delete.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that hosts the task set to delete.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the service that hosts the task set to delete.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that hosts the task set to delete.
     * </p>
     * 
     * @param service
     *        The short name or full Amazon Resource Name (ARN) of the service that hosts the task set to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTaskSetRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The task set ID or full Amazon Resource Name (ARN) of the task set to delete.
     * </p>
     * 
     * @param taskSet
     *        The task set ID or full Amazon Resource Name (ARN) of the task set to delete.
     */

    public void setTaskSet(String taskSet) {
        this.taskSet = taskSet;
    }

    /**
     * <p>
     * The task set ID or full Amazon Resource Name (ARN) of the task set to delete.
     * </p>
     * 
     * @return The task set ID or full Amazon Resource Name (ARN) of the task set to delete.
     */

    public String getTaskSet() {
        return this.taskSet;
    }

    /**
     * <p>
     * The task set ID or full Amazon Resource Name (ARN) of the task set to delete.
     * </p>
     * 
     * @param taskSet
     *        The task set ID or full Amazon Resource Name (ARN) of the task set to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTaskSetRequest withTaskSet(String taskSet) {
        setTaskSet(taskSet);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this allows you to delete a task set even if it hasn't been scaled down to zero.
     * </p>
     * 
     * @param force
     *        If <code>true</code>, this allows you to delete a task set even if it hasn't been scaled down to zero.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * If <code>true</code>, this allows you to delete a task set even if it hasn't been scaled down to zero.
     * </p>
     * 
     * @return If <code>true</code>, this allows you to delete a task set even if it hasn't been scaled down to zero.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * If <code>true</code>, this allows you to delete a task set even if it hasn't been scaled down to zero.
     * </p>
     * 
     * @param force
     *        If <code>true</code>, this allows you to delete a task set even if it hasn't been scaled down to zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTaskSetRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this allows you to delete a task set even if it hasn't been scaled down to zero.
     * </p>
     * 
     * @return If <code>true</code>, this allows you to delete a task set even if it hasn't been scaled down to zero.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getTaskSet() != null)
            sb.append("TaskSet: ").append(getTaskSet()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTaskSetRequest == false)
            return false;
        DeleteTaskSetRequest other = (DeleteTaskSetRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getTaskSet() == null ^ this.getTaskSet() == null)
            return false;
        if (other.getTaskSet() != null && other.getTaskSet().equals(this.getTaskSet()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getTaskSet() == null) ? 0 : getTaskSet().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTaskSetRequest clone() {
        return (DeleteTaskSetRequest) super.clone();
    }

}
