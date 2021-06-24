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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A port mapping for the container.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The port number on the container that is bound to the user-specified or automatically assigned host port.
     * </p>
     */
    private Integer containerPort;
    /**
     * <p>
     * The port number on the container instance to reserve for the container.
     * </p>
     */
    private Integer hostPort;
    /**
     * <p>
     * The protocol used for the port mapping. The default is <code>tcp</code>.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The port number on the container that is bound to the user-specified or automatically assigned host port.
     * </p>
     * 
     * @param containerPort
     *        The port number on the container that is bound to the user-specified or automatically assigned host port.
     */

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port number on the container that is bound to the user-specified or automatically assigned host port.
     * </p>
     * 
     * @return The port number on the container that is bound to the user-specified or automatically assigned host port.
     */

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * <p>
     * The port number on the container that is bound to the user-specified or automatically assigned host port.
     * </p>
     * 
     * @param containerPort
     *        The port number on the container that is bound to the user-specified or automatically assigned host port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails withContainerPort(Integer containerPort) {
        setContainerPort(containerPort);
        return this;
    }

    /**
     * <p>
     * The port number on the container instance to reserve for the container.
     * </p>
     * 
     * @param hostPort
     *        The port number on the container instance to reserve for the container.
     */

    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    /**
     * <p>
     * The port number on the container instance to reserve for the container.
     * </p>
     * 
     * @return The port number on the container instance to reserve for the container.
     */

    public Integer getHostPort() {
        return this.hostPort;
    }

    /**
     * <p>
     * The port number on the container instance to reserve for the container.
     * </p>
     * 
     * @param hostPort
     *        The port number on the container instance to reserve for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails withHostPort(Integer hostPort) {
        setHostPort(hostPort);
        return this;
    }

    /**
     * <p>
     * The protocol used for the port mapping. The default is <code>tcp</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the port mapping. The default is <code>tcp</code>.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used for the port mapping. The default is <code>tcp</code>.
     * </p>
     * 
     * @return The protocol used for the port mapping. The default is <code>tcp</code>.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used for the port mapping. The default is <code>tcp</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the port mapping. The default is <code>tcp</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails withProtocol(String protocol) {
        setProtocol(protocol);
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
        if (getContainerPort() != null)
            sb.append("ContainerPort: ").append(getContainerPort()).append(",");
        if (getHostPort() != null)
            sb.append("HostPort: ").append(getHostPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails == false)
            return false;
        AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails other = (AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails) obj;
        if (other.getContainerPort() == null ^ this.getContainerPort() == null)
            return false;
        if (other.getContainerPort() != null && other.getContainerPort().equals(this.getContainerPort()) == false)
            return false;
        if (other.getHostPort() == null ^ this.getHostPort() == null)
            return false;
        if (other.getHostPort() != null && other.getHostPort().equals(this.getHostPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        hashCode = prime * hashCode + ((getHostPort() == null) ? 0 : getHostPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails clone() {
        try {
            return (AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
