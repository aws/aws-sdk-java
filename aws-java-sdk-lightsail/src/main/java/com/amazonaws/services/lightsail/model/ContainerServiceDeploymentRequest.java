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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ContainerServiceDeploymentRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerServiceDeploymentRequest implements Serializable, Cloneable, StructuredPojo {

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
    private EndpointRequest publicEndpoint;

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

    public ContainerServiceDeploymentRequest withContainers(java.util.Map<String, Container> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * Add a single Containers entry
     *
     * @see ContainerServiceDeploymentRequest#withContainers
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceDeploymentRequest addContainersEntry(String key, Container value) {
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

    public ContainerServiceDeploymentRequest clearContainersEntries() {
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

    public void setPublicEndpoint(EndpointRequest publicEndpoint) {
        this.publicEndpoint = publicEndpoint;
    }

    /**
     * <p>
     * An object that describes the endpoint of the deployment.
     * </p>
     * 
     * @return An object that describes the endpoint of the deployment.
     */

    public EndpointRequest getPublicEndpoint() {
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

    public ContainerServiceDeploymentRequest withPublicEndpoint(EndpointRequest publicEndpoint) {
        setPublicEndpoint(publicEndpoint);
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
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getPublicEndpoint() != null)
            sb.append("PublicEndpoint: ").append(getPublicEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerServiceDeploymentRequest == false)
            return false;
        ContainerServiceDeploymentRequest other = (ContainerServiceDeploymentRequest) obj;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getPublicEndpoint() == null ^ this.getPublicEndpoint() == null)
            return false;
        if (other.getPublicEndpoint() != null && other.getPublicEndpoint().equals(this.getPublicEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getPublicEndpoint() == null) ? 0 : getPublicEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public ContainerServiceDeploymentRequest clone() {
        try {
            return (ContainerServiceDeploymentRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ContainerServiceDeploymentRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
