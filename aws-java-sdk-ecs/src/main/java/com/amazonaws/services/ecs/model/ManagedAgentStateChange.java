/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object representing a change in state for a managed agent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ManagedAgentStateChange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedAgentStateChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the container associated with the managed agent.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The name of the managed agent.
     * </p>
     */
    private String managedAgentName;
    /**
     * <p>
     * The status of the managed agent.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the status of the managed agent.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The name of the container associated with the managed agent.
     * </p>
     * 
     * @param containerName
     *        The name of the container associated with the managed agent.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container associated with the managed agent.
     * </p>
     * 
     * @return The name of the container associated with the managed agent.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container associated with the managed agent.
     * </p>
     * 
     * @param containerName
     *        The name of the container associated with the managed agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedAgentStateChange withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The name of the managed agent.
     * </p>
     * 
     * @param managedAgentName
     *        The name of the managed agent.
     * @see ManagedAgentName
     */

    public void setManagedAgentName(String managedAgentName) {
        this.managedAgentName = managedAgentName;
    }

    /**
     * <p>
     * The name of the managed agent.
     * </p>
     * 
     * @return The name of the managed agent.
     * @see ManagedAgentName
     */

    public String getManagedAgentName() {
        return this.managedAgentName;
    }

    /**
     * <p>
     * The name of the managed agent.
     * </p>
     * 
     * @param managedAgentName
     *        The name of the managed agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagedAgentName
     */

    public ManagedAgentStateChange withManagedAgentName(String managedAgentName) {
        setManagedAgentName(managedAgentName);
        return this;
    }

    /**
     * <p>
     * The name of the managed agent.
     * </p>
     * 
     * @param managedAgentName
     *        The name of the managed agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagedAgentName
     */

    public ManagedAgentStateChange withManagedAgentName(ManagedAgentName managedAgentName) {
        this.managedAgentName = managedAgentName.toString();
        return this;
    }

    /**
     * <p>
     * The status of the managed agent.
     * </p>
     * 
     * @param status
     *        The status of the managed agent.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the managed agent.
     * </p>
     * 
     * @return The status of the managed agent.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the managed agent.
     * </p>
     * 
     * @param status
     *        The status of the managed agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedAgentStateChange withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The reason for the status of the managed agent.
     * </p>
     * 
     * @param reason
     *        The reason for the status of the managed agent.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the status of the managed agent.
     * </p>
     * 
     * @return The reason for the status of the managed agent.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the status of the managed agent.
     * </p>
     * 
     * @param reason
     *        The reason for the status of the managed agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedAgentStateChange withReason(String reason) {
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
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getManagedAgentName() != null)
            sb.append("ManagedAgentName: ").append(getManagedAgentName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof ManagedAgentStateChange == false)
            return false;
        ManagedAgentStateChange other = (ManagedAgentStateChange) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getManagedAgentName() == null ^ this.getManagedAgentName() == null)
            return false;
        if (other.getManagedAgentName() != null && other.getManagedAgentName().equals(this.getManagedAgentName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getManagedAgentName() == null) ? 0 : getManagedAgentName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public ManagedAgentStateChange clone() {
        try {
            return (ManagedAgentStateChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ManagedAgentStateChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
