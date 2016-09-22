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
 * A Docker container that is part of a task.
 * </p>
 */
public class Container implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     */
    private String containerArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The last known status of the container.
     * </p>
     */
    private String lastStatus;
    /**
     * <p>
     * The exit code returned from the container.
     * </p>
     */
    private Integer exitCode;
    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional detail about a running or stopped
     * container.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The network bindings associated with the container.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkBinding> networkBindings;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     * 
     * @param containerArn
     *        The Amazon Resource Name (ARN) of the container.
     */

    public void setContainerArn(String containerArn) {
        this.containerArn = containerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container.
     */

    public String getContainerArn() {
        return this.containerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     * 
     * @param containerArn
     *        The Amazon Resource Name (ARN) of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withContainerArn(String containerArn) {
        setContainerArn(containerArn);
        return this;
    }

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

    public Container withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param name
     *        The name of the container.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @return The name of the container.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param name
     *        The name of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The last known status of the container.
     * </p>
     * 
     * @param lastStatus
     *        The last known status of the container.
     */

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * The last known status of the container.
     * </p>
     * 
     * @return The last known status of the container.
     */

    public String getLastStatus() {
        return this.lastStatus;
    }

    /**
     * <p>
     * The last known status of the container.
     * </p>
     * 
     * @param lastStatus
     *        The last known status of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withLastStatus(String lastStatus) {
        setLastStatus(lastStatus);
        return this;
    }

    /**
     * <p>
     * The exit code returned from the container.
     * </p>
     * 
     * @param exitCode
     *        The exit code returned from the container.
     */

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * <p>
     * The exit code returned from the container.
     * </p>
     * 
     * @return The exit code returned from the container.
     */

    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * <p>
     * The exit code returned from the container.
     * </p>
     * 
     * @param exitCode
     *        The exit code returned from the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withExitCode(Integer exitCode) {
        setExitCode(exitCode);
        return this;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional detail about a running or stopped
     * container.
     * </p>
     * 
     * @param reason
     *        A short (255 max characters) human-readable string to provide additional detail about a running or stopped
     *        container.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional detail about a running or stopped
     * container.
     * </p>
     * 
     * @return A short (255 max characters) human-readable string to provide additional detail about a running or
     *         stopped container.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional detail about a running or stopped
     * container.
     * </p>
     * 
     * @param reason
     *        A short (255 max characters) human-readable string to provide additional detail about a running or stopped
     *        container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The network bindings associated with the container.
     * </p>
     * 
     * @return The network bindings associated with the container.
     */

    public java.util.List<NetworkBinding> getNetworkBindings() {
        if (networkBindings == null) {
            networkBindings = new com.amazonaws.internal.SdkInternalList<NetworkBinding>();
        }
        return networkBindings;
    }

    /**
     * <p>
     * The network bindings associated with the container.
     * </p>
     * 
     * @param networkBindings
     *        The network bindings associated with the container.
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
     * The network bindings associated with the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkBindings(java.util.Collection)} or {@link #withNetworkBindings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param networkBindings
     *        The network bindings associated with the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withNetworkBindings(NetworkBinding... networkBindings) {
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
     * The network bindings associated with the container.
     * </p>
     * 
     * @param networkBindings
     *        The network bindings associated with the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withNetworkBindings(java.util.Collection<NetworkBinding> networkBindings) {
        setNetworkBindings(networkBindings);
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
        if (getContainerArn() != null)
            sb.append("ContainerArn: " + getContainerArn() + ",");
        if (getTaskArn() != null)
            sb.append("TaskArn: " + getTaskArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getLastStatus() != null)
            sb.append("LastStatus: " + getLastStatus() + ",");
        if (getExitCode() != null)
            sb.append("ExitCode: " + getExitCode() + ",");
        if (getReason() != null)
            sb.append("Reason: " + getReason() + ",");
        if (getNetworkBindings() != null)
            sb.append("NetworkBindings: " + getNetworkBindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Container == false)
            return false;
        Container other = (Container) obj;
        if (other.getContainerArn() == null ^ this.getContainerArn() == null)
            return false;
        if (other.getContainerArn() != null && other.getContainerArn().equals(this.getContainerArn()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false)
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

        hashCode = prime * hashCode + ((getContainerArn() == null) ? 0 : getContainerArn().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        hashCode = prime * hashCode + ((getExitCode() == null) ? 0 : getExitCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getNetworkBindings() == null) ? 0 : getNetworkBindings().hashCode());
        return hashCode;
    }

    @Override
    public Container clone() {
        try {
            return (Container) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
