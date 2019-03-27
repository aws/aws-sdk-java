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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/StopTask" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to stop. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task to stop.
     * </p>
     */
    private String task;
    /**
     * <p>
     * An optional message specified when a task is stopped. For example, if you are using a custom scheduler, you can
     * use this parameter to specify the reason for stopping the task here, and the message appears in subsequent
     * <a>DescribeTasks</a> API operations on this task. Up to 255 characters are allowed in this message.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to stop. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to stop. If you do
     *        not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to stop. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to stop. If you do
     *         not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to stop. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task to stop. If you do
     *        not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopTaskRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task to stop.
     * </p>
     * 
     * @param task
     *        The task ID or full Amazon Resource Name (ARN) of the task to stop.
     */

    public void setTask(String task) {
        this.task = task;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task to stop.
     * </p>
     * 
     * @return The task ID or full Amazon Resource Name (ARN) of the task to stop.
     */

    public String getTask() {
        return this.task;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task to stop.
     * </p>
     * 
     * @param task
     *        The task ID or full Amazon Resource Name (ARN) of the task to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopTaskRequest withTask(String task) {
        setTask(task);
        return this;
    }

    /**
     * <p>
     * An optional message specified when a task is stopped. For example, if you are using a custom scheduler, you can
     * use this parameter to specify the reason for stopping the task here, and the message appears in subsequent
     * <a>DescribeTasks</a> API operations on this task. Up to 255 characters are allowed in this message.
     * </p>
     * 
     * @param reason
     *        An optional message specified when a task is stopped. For example, if you are using a custom scheduler,
     *        you can use this parameter to specify the reason for stopping the task here, and the message appears in
     *        subsequent <a>DescribeTasks</a> API operations on this task. Up to 255 characters are allowed in this
     *        message.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * An optional message specified when a task is stopped. For example, if you are using a custom scheduler, you can
     * use this parameter to specify the reason for stopping the task here, and the message appears in subsequent
     * <a>DescribeTasks</a> API operations on this task. Up to 255 characters are allowed in this message.
     * </p>
     * 
     * @return An optional message specified when a task is stopped. For example, if you are using a custom scheduler,
     *         you can use this parameter to specify the reason for stopping the task here, and the message appears in
     *         subsequent <a>DescribeTasks</a> API operations on this task. Up to 255 characters are allowed in this
     *         message.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * An optional message specified when a task is stopped. For example, if you are using a custom scheduler, you can
     * use this parameter to specify the reason for stopping the task here, and the message appears in subsequent
     * <a>DescribeTasks</a> API operations on this task. Up to 255 characters are allowed in this message.
     * </p>
     * 
     * @param reason
     *        An optional message specified when a task is stopped. For example, if you are using a custom scheduler,
     *        you can use this parameter to specify the reason for stopping the task here, and the message appears in
     *        subsequent <a>DescribeTasks</a> API operations on this task. Up to 255 characters are allowed in this
     *        message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopTaskRequest withReason(String reason) {
        setReason(reason);
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
        if (getTask() != null)
            sb.append("Task: ").append(getTask()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopTaskRequest == false)
            return false;
        StopTaskRequest other = (StopTaskRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public StopTaskRequest clone() {
        return (StopTaskRequest) super.clone();
    }

}
