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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a container deployment configuration of an Amazon Lightsail container service.
 * </p>
 * <p>
 * A deployment specifies the settings, such as the ports and launch command, of containers that are deployed to your
 * container service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ContainerServiceDeployment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerServiceDeployment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version number of the deployment.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * The state of the deployment.
     * </p>
     * <p>
     * A deployment can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Activating</code> - The deployment is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Active</code> - The deployment was successfully created, and it's currently running on the container
     * service. The container service can have only one deployment in an active state at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Inactive</code> - The deployment was previously successfully created, but it is not currently running on
     * the container service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The deployment failed. Use the <code>GetContainerLog</code> action to view the log events
     * for the containers in the deployment to try to determine the reason for the failure.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * An object that describes the configuration for the containers of the deployment.
     * </p>
     */
    private java.util.Map<String, Container> containers;
    /**
     * <p>
     * An object that describes the endpoint of the deployment.
     * </p>
     */
    private ContainerServiceEndpoint publicEndpoint;
    /**
     * <p>
     * The timestamp when the deployment was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The version number of the deployment.
     * </p>
     * 
     * @param version
     *        The version number of the deployment.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the deployment.
     * </p>
     * 
     * @return The version number of the deployment.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the deployment.
     * </p>
     * 
     * @param version
     *        The version number of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceDeployment withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * <p>
     * A deployment can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Activating</code> - The deployment is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Active</code> - The deployment was successfully created, and it's currently running on the container
     * service. The container service can have only one deployment in an active state at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Inactive</code> - The deployment was previously successfully created, but it is not currently running on
     * the container service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The deployment failed. Use the <code>GetContainerLog</code> action to view the log events
     * for the containers in the deployment to try to determine the reason for the failure.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the deployment.</p>
     *        <p>
     *        A deployment can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Activating</code> - The deployment is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Active</code> - The deployment was successfully created, and it's currently running on the container
     *        service. The container service can have only one deployment in an active state at a time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Inactive</code> - The deployment was previously successfully created, but it is not currently
     *        running on the container service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The deployment failed. Use the <code>GetContainerLog</code> action to view the log
     *        events for the containers in the deployment to try to determine the reason for the failure.
     *        </p>
     *        </li>
     * @see ContainerServiceDeploymentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * <p>
     * A deployment can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Activating</code> - The deployment is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Active</code> - The deployment was successfully created, and it's currently running on the container
     * service. The container service can have only one deployment in an active state at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Inactive</code> - The deployment was previously successfully created, but it is not currently running on
     * the container service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The deployment failed. Use the <code>GetContainerLog</code> action to view the log events
     * for the containers in the deployment to try to determine the reason for the failure.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the deployment.</p>
     *         <p>
     *         A deployment can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Activating</code> - The deployment is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Active</code> - The deployment was successfully created, and it's currently running on the
     *         container service. The container service can have only one deployment in an active state at a time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Inactive</code> - The deployment was previously successfully created, but it is not currently
     *         running on the container service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The deployment failed. Use the <code>GetContainerLog</code> action to view the log
     *         events for the containers in the deployment to try to determine the reason for the failure.
     *         </p>
     *         </li>
     * @see ContainerServiceDeploymentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * <p>
     * A deployment can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Activating</code> - The deployment is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Active</code> - The deployment was successfully created, and it's currently running on the container
     * service. The container service can have only one deployment in an active state at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Inactive</code> - The deployment was previously successfully created, but it is not currently running on
     * the container service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The deployment failed. Use the <code>GetContainerLog</code> action to view the log events
     * for the containers in the deployment to try to determine the reason for the failure.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the deployment.</p>
     *        <p>
     *        A deployment can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Activating</code> - The deployment is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Active</code> - The deployment was successfully created, and it's currently running on the container
     *        service. The container service can have only one deployment in an active state at a time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Inactive</code> - The deployment was previously successfully created, but it is not currently
     *        running on the container service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The deployment failed. Use the <code>GetContainerLog</code> action to view the log
     *        events for the containers in the deployment to try to determine the reason for the failure.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServiceDeploymentState
     */

    public ContainerServiceDeployment withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * <p>
     * A deployment can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Activating</code> - The deployment is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Active</code> - The deployment was successfully created, and it's currently running on the container
     * service. The container service can have only one deployment in an active state at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Inactive</code> - The deployment was previously successfully created, but it is not currently running on
     * the container service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The deployment failed. Use the <code>GetContainerLog</code> action to view the log events
     * for the containers in the deployment to try to determine the reason for the failure.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the deployment.</p>
     *        <p>
     *        A deployment can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Activating</code> - The deployment is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Active</code> - The deployment was successfully created, and it's currently running on the container
     *        service. The container service can have only one deployment in an active state at a time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Inactive</code> - The deployment was previously successfully created, but it is not currently
     *        running on the container service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The deployment failed. Use the <code>GetContainerLog</code> action to view the log
     *        events for the containers in the deployment to try to determine the reason for the failure.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServiceDeploymentState
     */

    public ContainerServiceDeployment withState(ContainerServiceDeploymentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * An object that describes the configuration for the containers of the deployment.
     * </p>
     * 
     * @return An object that describes the configuration for the containers of the deployment.
     */

    public java.util.Map<String, Container> getContainers() {
        return containers;
    }

    /**
     * <p>
     * An object that describes the configuration for the containers of the deployment.
     * </p>
     * 
     * @param containers
     *        An object that describes the configuration for the containers of the deployment.
     */

    public void setContainers(java.util.Map<String, Container> containers) {
        this.containers = containers;
    }

    /**
     * <p>
     * An object that describes the configuration for the containers of the deployment.
     * </p>
     * 
     * @param containers
     *        An object that describes the configuration for the containers of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceDeployment withContainers(java.util.Map<String, Container> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * Add a single Containers entry
     *
     * @see ContainerServiceDeployment#withContainers
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceDeployment addContainersEntry(String key, Container value) {
        if (null == this.containers) {
            this.containers = new java.util.HashMap<String, Container>();
        }
        if (this.containers.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.containers.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Containers.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceDeployment clearContainersEntries() {
        this.containers = null;
        return this;
    }

    /**
     * <p>
     * An object that describes the endpoint of the deployment.
     * </p>
     * 
     * @param publicEndpoint
     *        An object that describes the endpoint of the deployment.
     */

    public void setPublicEndpoint(ContainerServiceEndpoint publicEndpoint) {
        this.publicEndpoint = publicEndpoint;
    }

    /**
     * <p>
     * An object that describes the endpoint of the deployment.
     * </p>
     * 
     * @return An object that describes the endpoint of the deployment.
     */

    public ContainerServiceEndpoint getPublicEndpoint() {
        return this.publicEndpoint;
    }

    /**
     * <p>
     * An object that describes the endpoint of the deployment.
     * </p>
     * 
     * @param publicEndpoint
     *        An object that describes the endpoint of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceDeployment withPublicEndpoint(ContainerServiceEndpoint publicEndpoint) {
        setPublicEndpoint(publicEndpoint);
        return this;
    }

    /**
     * <p>
     * The timestamp when the deployment was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the deployment was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the deployment was created.
     * </p>
     * 
     * @return The timestamp when the deployment was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the deployment was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the deployment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceDeployment withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getPublicEndpoint() != null)
            sb.append("PublicEndpoint: ").append(getPublicEndpoint()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerServiceDeployment == false)
            return false;
        ContainerServiceDeployment other = (ContainerServiceDeployment) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getPublicEndpoint() == null ^ this.getPublicEndpoint() == null)
            return false;
        if (other.getPublicEndpoint() != null && other.getPublicEndpoint().equals(this.getPublicEndpoint()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getPublicEndpoint() == null) ? 0 : getPublicEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ContainerServiceDeployment clone() {
        try {
            return (ContainerServiceDeployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ContainerServiceDeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
