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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/SubmitContainerStateChange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubmitContainerStateChangeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task that hosts the container.
     * </p>
     */
    private String task;
    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The status of the state change request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The exit code returned for the state change request.
     * </p>
     */
    private Integer exitCode;
    /**
     * <p>
     * The reason for the state change request.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The network bindings of the container.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkBinding> networkBindings;

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container.
     * </p>
     * 
     * @param cluster
     *        The short name or full ARN of the cluster that hosts the container.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container.
     * </p>
     * 
     * @return The short name or full ARN of the cluster that hosts the container.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container.
     * </p>
     * 
     * @param cluster
     *        The short name or full ARN of the cluster that hosts the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitContainerStateChangeRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task that hosts the container.
     * </p>
     * 
     * @param task
     *        The task ID or full Amazon Resource Name (ARN) of the task that hosts the container.
     */

    public void setTask(String task) {
        this.task = task;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task that hosts the container.
     * </p>
     * 
     * @return The task ID or full Amazon Resource Name (ARN) of the task that hosts the container.
     */

    public String getTask() {
        return this.task;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task that hosts the container.
     * </p>
     * 
     * @param task
     *        The task ID or full Amazon Resource Name (ARN) of the task that hosts the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitContainerStateChangeRequest withTask(String task) {
        setTask(task);
        return this;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param containerName
     *        The name of the container.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @return The name of the container.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param containerName
     *        The name of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitContainerStateChangeRequest withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The status of the state change request.
     * </p>
     * 
     * @param status
     *        The status of the state change request.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the state change request.
     * </p>
     * 
     * @return The status of the state change request.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the state change request.
     * </p>
     * 
     * @param status
     *        The status of the state change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitContainerStateChangeRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The exit code returned for the state change request.
     * </p>
     * 
     * @param exitCode
     *        The exit code returned for the state change request.
     */

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * <p>
     * The exit code returned for the state change request.
     * </p>
     * 
     * @return The exit code returned for the state change request.
     */

    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * <p>
     * The exit code returned for the state change request.
     * </p>
     * 
     * @param exitCode
     *        The exit code returned for the state change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitContainerStateChangeRequest withExitCode(Integer exitCode) {
        setExitCode(exitCode);
        return this;
    }

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     * 
     * @param reason
     *        The reason for the state change request.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     * 
     * @return The reason for the state change request.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     * 
     * @param reason
     *        The reason for the state change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitContainerStateChangeRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The network bindings of the container.
     * </p>
     * 
     * @return The network bindings of the container.
     */

    public java.util.List<NetworkBinding> getNetworkBindings() {
        if (networkBindings == null) {
            networkBindings = new com.amazonaws.internal.SdkInternalList<NetworkBinding>();
        }
        return networkBindings;
    }

    /**
     * <p>
     * The network bindings of the container.
     * </p>
     * 
     * @param networkBindings
     *        The network bindings of the container.
     */

    public void setNetworkBindings(java.util.Collection<NetworkBinding> networkBindings) {
        if (networkBindings == null) {
            this.networkBindings = null;
            return;
        }

        this.networkBindings = new com.amazonaws.internal.SdkInternalList<NetworkBinding>(networkBindings);
    }

    /**
     * <p>
     * The network bindings of the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkBindings(java.util.Collection)} or {@link #withNetworkBindings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param networkBindings
     *        The network bindings of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitContainerStateChangeRequest withNetworkBindings(NetworkBinding... networkBindings) {
        if (this.networkBindings == null) {
            setNetworkBindings(new com.amazonaws.internal.SdkInternalList<NetworkBinding>(networkBindings.length));
        }
        for (NetworkBinding ele : networkBindings) {
            this.networkBindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network bindings of the container.
     * </p>
     * 
     * @param networkBindings
     *        The network bindings of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitContainerStateChangeRequest withNetworkBindings(java.util.Collection<NetworkBinding> networkBindings) {
        setNetworkBindings(networkBindings);
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
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getExitCode() != null)
            sb.append("ExitCode: ").append(getExitCode()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getNetworkBindings() != null)
            sb.append("NetworkBindings: ").append(getNetworkBindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubmitContainerStateChangeRequest == false)
            return false;
        SubmitContainerStateChangeRequest other = (SubmitContainerStateChangeRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getExitCode() == null ^ this.getExitCode() == null)
            return false;
        if (other.getExitCode() != null && other.getExitCode().equals(this.getExitCode()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getNetworkBindings() == null ^ this.getNetworkBindings() == null)
            return false;
        if (other.getNetworkBindings() != null && other.getNetworkBindings().equals(this.getNetworkBindings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getExitCode() == null) ? 0 : getExitCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getNetworkBindings() == null) ? 0 : getNetworkBindings().hashCode());
        return hashCode;
    }

    @Override
    public SubmitContainerStateChangeRequest clone() {
        return (SubmitContainerStateChangeRequest) super.clone();
    }

}
