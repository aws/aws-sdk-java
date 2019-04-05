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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a change in state for a container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ContainerStateChange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerStateChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The exit code for the container, if the state change is a result of the container exiting.
     * </p>
     */
    private Integer exitCode;
    /**
     * <p>
     * Any network bindings associated with the container.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkBinding> networkBindings;
    /**
     * <p>
     * The reason for the state change.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The status of the container.
     * </p>
     */
    private String status;

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

    public ContainerStateChange withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The exit code for the container, if the state change is a result of the container exiting.
     * </p>
     * 
     * @param exitCode
     *        The exit code for the container, if the state change is a result of the container exiting.
     */

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * <p>
     * The exit code for the container, if the state change is a result of the container exiting.
     * </p>
     * 
     * @return The exit code for the container, if the state change is a result of the container exiting.
     */

    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * <p>
     * The exit code for the container, if the state change is a result of the container exiting.
     * </p>
     * 
     * @param exitCode
     *        The exit code for the container, if the state change is a result of the container exiting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerStateChange withExitCode(Integer exitCode) {
        setExitCode(exitCode);
        return this;
    }

    /**
     * <p>
     * Any network bindings associated with the container.
     * </p>
     * 
     * @return Any network bindings associated with the container.
     */

    public java.util.List<NetworkBinding> getNetworkBindings() {
        if (networkBindings == null) {
            networkBindings = new com.amazonaws.internal.SdkInternalList<NetworkBinding>();
        }
        return networkBindings;
    }

    /**
     * <p>
     * Any network bindings associated with the container.
     * </p>
     * 
     * @param networkBindings
     *        Any network bindings associated with the container.
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
     * Any network bindings associated with the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkBindings(java.util.Collection)} or {@link #withNetworkBindings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param networkBindings
     *        Any network bindings associated with the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerStateChange withNetworkBindings(NetworkBinding... networkBindings) {
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
     * Any network bindings associated with the container.
     * </p>
     * 
     * @param networkBindings
     *        Any network bindings associated with the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerStateChange withNetworkBindings(java.util.Collection<NetworkBinding> networkBindings) {
        setNetworkBindings(networkBindings);
        return this;
    }

    /**
     * <p>
     * The reason for the state change.
     * </p>
     * 
     * @param reason
     *        The reason for the state change.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the state change.
     * </p>
     * 
     * @return The reason for the state change.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the state change.
     * </p>
     * 
     * @param reason
     *        The reason for the state change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerStateChange withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The status of the container.
     * </p>
     * 
     * @param status
     *        The status of the container.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the container.
     * </p>
     * 
     * @return The status of the container.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the container.
     * </p>
     * 
     * @param status
     *        The status of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerStateChange withStatus(String status) {
        setStatus(status);
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
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getExitCode() != null)
            sb.append("ExitCode: ").append(getExitCode()).append(",");
        if (getNetworkBindings() != null)
            sb.append("NetworkBindings: ").append(getNetworkBindings()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerStateChange == false)
            return false;
        ContainerStateChange other = (ContainerStateChange) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getExitCode() == null ^ this.getExitCode() == null)
            return false;
        if (other.getExitCode() != null && other.getExitCode().equals(this.getExitCode()) == false)
            return false;
        if (other.getNetworkBindings() == null ^ this.getNetworkBindings() == null)
            return false;
        if (other.getNetworkBindings() != null && other.getNetworkBindings().equals(this.getNetworkBindings()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getExitCode() == null) ? 0 : getExitCode().hashCode());
        hashCode = prime * hashCode + ((getNetworkBindings() == null) ? 0 : getNetworkBindings().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ContainerStateChange clone() {
        try {
            return (ContainerStateChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ContainerStateChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
