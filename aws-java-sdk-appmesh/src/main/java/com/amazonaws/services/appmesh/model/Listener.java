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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a listener for a virtual node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/Listener" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Listener implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The health check information for the listener.
     * </p>
     */
    private HealthCheckPolicy healthCheck;
    /**
     * <p>
     * The port mapping information for the listener.
     * </p>
     */
    private PortMapping portMapping;

    /**
     * <p>
     * The health check information for the listener.
     * </p>
     * 
     * @param healthCheck
     *        The health check information for the listener.
     */

    public void setHealthCheck(HealthCheckPolicy healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * The health check information for the listener.
     * </p>
     * 
     * @return The health check information for the listener.
     */

    public HealthCheckPolicy getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * The health check information for the listener.
     * </p>
     * 
     * @param healthCheck
     *        The health check information for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withHealthCheck(HealthCheckPolicy healthCheck) {
        setHealthCheck(healthCheck);
        return this;
    }

    /**
     * <p>
     * The port mapping information for the listener.
     * </p>
     * 
     * @param portMapping
     *        The port mapping information for the listener.
     */

    public void setPortMapping(PortMapping portMapping) {
        this.portMapping = portMapping;
    }

    /**
     * <p>
     * The port mapping information for the listener.
     * </p>
     * 
     * @return The port mapping information for the listener.
     */

    public PortMapping getPortMapping() {
        return this.portMapping;
    }

    /**
     * <p>
     * The port mapping information for the listener.
     * </p>
     * 
     * @param portMapping
     *        The port mapping information for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withPortMapping(PortMapping portMapping) {
        setPortMapping(portMapping);
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
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck()).append(",");
        if (getPortMapping() != null)
            sb.append("PortMapping: ").append(getPortMapping());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Listener == false)
            return false;
        Listener other = (Listener) obj;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        if (other.getPortMapping() == null ^ this.getPortMapping() == null)
            return false;
        if (other.getPortMapping() != null && other.getPortMapping().equals(this.getPortMapping()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        hashCode = prime * hashCode + ((getPortMapping() == null) ? 0 : getPortMapping().hashCode());
        return hashCode;
    }

    @Override
    public Listener clone() {
        try {
            return (Listener) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.ListenerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
