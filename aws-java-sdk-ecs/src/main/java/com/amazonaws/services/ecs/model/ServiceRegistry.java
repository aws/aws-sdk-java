/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Details of the service registry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ServiceRegistry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceRegistry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Service Registry. The currently supported service registry is Amazon Route
     * 53 Auto Naming Service. For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html">Service</a>.
     * </p>
     */
    private String registryArn;
    /**
     * <p>
     * The port value used if your Service Discovery service specified an SRV record.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Service Registry. The currently supported service registry is Amazon Route
     * 53 Auto Naming Service. For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html">Service</a>.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the Service Registry. The currently supported service registry is Amazon
     *        Route 53 Auto Naming Service. For more information, see <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html">Service</a>.
     */

    public void setRegistryArn(String registryArn) {
        this.registryArn = registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Service Registry. The currently supported service registry is Amazon Route
     * 53 Auto Naming Service. For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html">Service</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Service Registry. The currently supported service registry is
     *         Amazon Route 53 Auto Naming Service. For more information, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html">Service</a>.
     */

    public String getRegistryArn() {
        return this.registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Service Registry. The currently supported service registry is Amazon Route
     * 53 Auto Naming Service. For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html">Service</a>.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the Service Registry. The currently supported service registry is Amazon
     *        Route 53 Auto Naming Service. For more information, see <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html">Service</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceRegistry withRegistryArn(String registryArn) {
        setRegistryArn(registryArn);
        return this;
    }

    /**
     * <p>
     * The port value used if your Service Discovery service specified an SRV record.
     * </p>
     * 
     * @param port
     *        The port value used if your Service Discovery service specified an SRV record.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port value used if your Service Discovery service specified an SRV record.
     * </p>
     * 
     * @return The port value used if your Service Discovery service specified an SRV record.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port value used if your Service Discovery service specified an SRV record.
     * </p>
     * 
     * @param port
     *        The port value used if your Service Discovery service specified an SRV record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceRegistry withPort(Integer port) {
        setPort(port);
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
        if (getRegistryArn() != null)
            sb.append("RegistryArn: ").append(getRegistryArn()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceRegistry == false)
            return false;
        ServiceRegistry other = (ServiceRegistry) obj;
        if (other.getRegistryArn() == null ^ this.getRegistryArn() == null)
            return false;
        if (other.getRegistryArn() != null && other.getRegistryArn().equals(this.getRegistryArn()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryArn() == null) ? 0 : getRegistryArn().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public ServiceRegistry clone() {
        try {
            return (ServiceRegistry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ServiceRegistryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
