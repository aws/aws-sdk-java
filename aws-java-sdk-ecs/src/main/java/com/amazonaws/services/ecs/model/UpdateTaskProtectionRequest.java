/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateTaskProtection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTaskProtectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist
     * in.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * A list of up to 10 task IDs or full ARN entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tasks;
    /**
     * <p>
     * Specify <code>true</code> to mark a task for protection and <code>false</code> to unset protection, making it
     * eligible for termination.
     * </p>
     */
    private Boolean protectionEnabled;
    /**
     * <p>
     * If you set <code>protectionEnabled</code> to <code>true</code>, you can specify the duration for task protection
     * in minutes. You can specify a value from 1 minute to up to 2,880 minutes (48 hours). During this time, your task
     * will not be terminated by scale-in events from Service Auto Scaling or deployments. After this time period
     * lapses, <code>protectionEnabled</code> will be reset to <code>false</code>.
     * </p>
     * <p>
     * If you don’t specify the time, then the task is automatically protected for 120 minutes (2 hours).
     * </p>
     */
    private Integer expiresInMinutes;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist
     * in.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets
     *        exist in.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist
     * in.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task
     *         sets exist in.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist
     * in.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets
     *        exist in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskProtectionRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * A list of up to 10 task IDs or full ARN entries.
     * </p>
     * 
     * @return A list of up to 10 task IDs or full ARN entries.
     */

    public java.util.List<String> getTasks() {
        if (tasks == null) {
            tasks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tasks;
    }

    /**
     * <p>
     * A list of up to 10 task IDs or full ARN entries.
     * </p>
     * 
     * @param tasks
     *        A list of up to 10 task IDs or full ARN entries.
     */

    public void setTasks(java.util.Collection<String> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new com.amazonaws.internal.SdkInternalList<String>(tasks);
    }

    /**
     * <p>
     * A list of up to 10 task IDs or full ARN entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        A list of up to 10 task IDs or full ARN entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskProtectionRequest withTasks(String... tasks) {
        if (this.tasks == null) {
            setTasks(new com.amazonaws.internal.SdkInternalList<String>(tasks.length));
        }
        for (String ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 10 task IDs or full ARN entries.
     * </p>
     * 
     * @param tasks
     *        A list of up to 10 task IDs or full ARN entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskProtectionRequest withTasks(java.util.Collection<String> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to mark a task for protection and <code>false</code> to unset protection, making it
     * eligible for termination.
     * </p>
     * 
     * @param protectionEnabled
     *        Specify <code>true</code> to mark a task for protection and <code>false</code> to unset protection, making
     *        it eligible for termination.
     */

    public void setProtectionEnabled(Boolean protectionEnabled) {
        this.protectionEnabled = protectionEnabled;
    }

    /**
     * <p>
     * Specify <code>true</code> to mark a task for protection and <code>false</code> to unset protection, making it
     * eligible for termination.
     * </p>
     * 
     * @return Specify <code>true</code> to mark a task for protection and <code>false</code> to unset protection,
     *         making it eligible for termination.
     */

    public Boolean getProtectionEnabled() {
        return this.protectionEnabled;
    }

    /**
     * <p>
     * Specify <code>true</code> to mark a task for protection and <code>false</code> to unset protection, making it
     * eligible for termination.
     * </p>
     * 
     * @param protectionEnabled
     *        Specify <code>true</code> to mark a task for protection and <code>false</code> to unset protection, making
     *        it eligible for termination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskProtectionRequest withProtectionEnabled(Boolean protectionEnabled) {
        setProtectionEnabled(protectionEnabled);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to mark a task for protection and <code>false</code> to unset protection, making it
     * eligible for termination.
     * </p>
     * 
     * @return Specify <code>true</code> to mark a task for protection and <code>false</code> to unset protection,
     *         making it eligible for termination.
     */

    public Boolean isProtectionEnabled() {
        return this.protectionEnabled;
    }

    /**
     * <p>
     * If you set <code>protectionEnabled</code> to <code>true</code>, you can specify the duration for task protection
     * in minutes. You can specify a value from 1 minute to up to 2,880 minutes (48 hours). During this time, your task
     * will not be terminated by scale-in events from Service Auto Scaling or deployments. After this time period
     * lapses, <code>protectionEnabled</code> will be reset to <code>false</code>.
     * </p>
     * <p>
     * If you don’t specify the time, then the task is automatically protected for 120 minutes (2 hours).
     * </p>
     * 
     * @param expiresInMinutes
     *        If you set <code>protectionEnabled</code> to <code>true</code>, you can specify the duration for task
     *        protection in minutes. You can specify a value from 1 minute to up to 2,880 minutes (48 hours). During
     *        this time, your task will not be terminated by scale-in events from Service Auto Scaling or deployments.
     *        After this time period lapses, <code>protectionEnabled</code> will be reset to <code>false</code>.</p>
     *        <p>
     *        If you don’t specify the time, then the task is automatically protected for 120 minutes (2 hours).
     */

    public void setExpiresInMinutes(Integer expiresInMinutes) {
        this.expiresInMinutes = expiresInMinutes;
    }

    /**
     * <p>
     * If you set <code>protectionEnabled</code> to <code>true</code>, you can specify the duration for task protection
     * in minutes. You can specify a value from 1 minute to up to 2,880 minutes (48 hours). During this time, your task
     * will not be terminated by scale-in events from Service Auto Scaling or deployments. After this time period
     * lapses, <code>protectionEnabled</code> will be reset to <code>false</code>.
     * </p>
     * <p>
     * If you don’t specify the time, then the task is automatically protected for 120 minutes (2 hours).
     * </p>
     * 
     * @return If you set <code>protectionEnabled</code> to <code>true</code>, you can specify the duration for task
     *         protection in minutes. You can specify a value from 1 minute to up to 2,880 minutes (48 hours). During
     *         this time, your task will not be terminated by scale-in events from Service Auto Scaling or deployments.
     *         After this time period lapses, <code>protectionEnabled</code> will be reset to <code>false</code>.</p>
     *         <p>
     *         If you don’t specify the time, then the task is automatically protected for 120 minutes (2 hours).
     */

    public Integer getExpiresInMinutes() {
        return this.expiresInMinutes;
    }

    /**
     * <p>
     * If you set <code>protectionEnabled</code> to <code>true</code>, you can specify the duration for task protection
     * in minutes. You can specify a value from 1 minute to up to 2,880 minutes (48 hours). During this time, your task
     * will not be terminated by scale-in events from Service Auto Scaling or deployments. After this time period
     * lapses, <code>protectionEnabled</code> will be reset to <code>false</code>.
     * </p>
     * <p>
     * If you don’t specify the time, then the task is automatically protected for 120 minutes (2 hours).
     * </p>
     * 
     * @param expiresInMinutes
     *        If you set <code>protectionEnabled</code> to <code>true</code>, you can specify the duration for task
     *        protection in minutes. You can specify a value from 1 minute to up to 2,880 minutes (48 hours). During
     *        this time, your task will not be terminated by scale-in events from Service Auto Scaling or deployments.
     *        After this time period lapses, <code>protectionEnabled</code> will be reset to <code>false</code>.</p>
     *        <p>
     *        If you don’t specify the time, then the task is automatically protected for 120 minutes (2 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskProtectionRequest withExpiresInMinutes(Integer expiresInMinutes) {
        setExpiresInMinutes(expiresInMinutes);
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getTasks() != null)
            sb.append("Tasks: ").append(getTasks()).append(",");
        if (getProtectionEnabled() != null)
            sb.append("ProtectionEnabled: ").append(getProtectionEnabled()).append(",");
        if (getExpiresInMinutes() != null)
            sb.append("ExpiresInMinutes: ").append(getExpiresInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTaskProtectionRequest == false)
            return false;
        UpdateTaskProtectionRequest other = (UpdateTaskProtectionRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
            return false;
        if (other.getProtectionEnabled() == null ^ this.getProtectionEnabled() == null)
            return false;
        if (other.getProtectionEnabled() != null && other.getProtectionEnabled().equals(this.getProtectionEnabled()) == false)
            return false;
        if (other.getExpiresInMinutes() == null ^ this.getExpiresInMinutes() == null)
            return false;
        if (other.getExpiresInMinutes() != null && other.getExpiresInMinutes().equals(this.getExpiresInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode + ((getProtectionEnabled() == null) ? 0 : getProtectionEnabled().hashCode());
        hashCode = prime * hashCode + ((getExpiresInMinutes() == null) ? 0 : getExpiresInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTaskProtectionRequest clone() {
        return (UpdateTaskProtectionRequest) super.clone();
    }

}
