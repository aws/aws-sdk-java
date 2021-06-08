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
 * Describes the public endpoint configuration of a deployment of an Amazon Lightsail container service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ContainerServiceEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerServiceEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the container entry of the deployment that the endpoint configuration applies to.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The port of the specified container to which traffic is forwarded to.
     * </p>
     */
    private Integer containerPort;
    /**
     * <p>
     * An object that describes the health check configuration of the container.
     * </p>
     */
    private ContainerServiceHealthCheckConfig healthCheck;

    /**
     * <p>
     * The name of the container entry of the deployment that the endpoint configuration applies to.
     * </p>
     * 
     * @param containerName
     *        The name of the container entry of the deployment that the endpoint configuration applies to.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container entry of the deployment that the endpoint configuration applies to.
     * </p>
     * 
     * @return The name of the container entry of the deployment that the endpoint configuration applies to.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container entry of the deployment that the endpoint configuration applies to.
     * </p>
     * 
     * @param containerName
     *        The name of the container entry of the deployment that the endpoint configuration applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceEndpoint withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The port of the specified container to which traffic is forwarded to.
     * </p>
     * 
     * @param containerPort
     *        The port of the specified container to which traffic is forwarded to.
     */

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port of the specified container to which traffic is forwarded to.
     * </p>
     * 
     * @return The port of the specified container to which traffic is forwarded to.
     */

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * <p>
     * The port of the specified container to which traffic is forwarded to.
     * </p>
     * 
     * @param containerPort
     *        The port of the specified container to which traffic is forwarded to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceEndpoint withContainerPort(Integer containerPort) {
        setContainerPort(containerPort);
        return this;
    }

    /**
     * <p>
     * An object that describes the health check configuration of the container.
     * </p>
     * 
     * @param healthCheck
     *        An object that describes the health check configuration of the container.
     */

    public void setHealthCheck(ContainerServiceHealthCheckConfig healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * An object that describes the health check configuration of the container.
     * </p>
     * 
     * @return An object that describes the health check configuration of the container.
     */

    public ContainerServiceHealthCheckConfig getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * An object that describes the health check configuration of the container.
     * </p>
     * 
     * @param healthCheck
     *        An object that describes the health check configuration of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceEndpoint withHealthCheck(ContainerServiceHealthCheckConfig healthCheck) {
        setHealthCheck(healthCheck);
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
        if (getContainerPort() != null)
            sb.append("ContainerPort: ").append(getContainerPort()).append(",");
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerServiceEndpoint == false)
            return false;
        ContainerServiceEndpoint other = (ContainerServiceEndpoint) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getContainerPort() == null ^ this.getContainerPort() == null)
            return false;
        if (other.getContainerPort() != null && other.getContainerPort().equals(this.getContainerPort()) == false)
            return false;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        return hashCode;
    }

    @Override
    public ContainerServiceEndpoint clone() {
        try {
            return (ContainerServiceEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ContainerServiceEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
