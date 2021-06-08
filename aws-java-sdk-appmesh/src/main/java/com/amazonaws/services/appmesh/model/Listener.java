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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a listener for a virtual node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/Listener" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Listener implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The connection pool information for the listener.
     * </p>
     */
    private VirtualNodeConnectionPool connectionPool;
    /**
     * <p>
     * The health check information for the listener.
     * </p>
     */
    private HealthCheckPolicy healthCheck;
    /**
     * <p>
     * The outlier detection information for the listener.
     * </p>
     */
    private OutlierDetection outlierDetection;
    /**
     * <p>
     * The port mapping information for the listener.
     * </p>
     */
    private PortMapping portMapping;
    /**
     * <p>
     * An object that represents timeouts for different protocols.
     * </p>
     */
    private ListenerTimeout timeout;
    /**
     * <p>
     * A reference to an object that represents the Transport Layer Security (TLS) properties for a listener.
     * </p>
     */
    private ListenerTls tls;

    /**
     * <p>
     * The connection pool information for the listener.
     * </p>
     * 
     * @param connectionPool
     *        The connection pool information for the listener.
     */

    public void setConnectionPool(VirtualNodeConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    /**
     * <p>
     * The connection pool information for the listener.
     * </p>
     * 
     * @return The connection pool information for the listener.
     */

    public VirtualNodeConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    /**
     * <p>
     * The connection pool information for the listener.
     * </p>
     * 
     * @param connectionPool
     *        The connection pool information for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withConnectionPool(VirtualNodeConnectionPool connectionPool) {
        setConnectionPool(connectionPool);
        return this;
    }

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
     * The outlier detection information for the listener.
     * </p>
     * 
     * @param outlierDetection
     *        The outlier detection information for the listener.
     */

    public void setOutlierDetection(OutlierDetection outlierDetection) {
        this.outlierDetection = outlierDetection;
    }

    /**
     * <p>
     * The outlier detection information for the listener.
     * </p>
     * 
     * @return The outlier detection information for the listener.
     */

    public OutlierDetection getOutlierDetection() {
        return this.outlierDetection;
    }

    /**
     * <p>
     * The outlier detection information for the listener.
     * </p>
     * 
     * @param outlierDetection
     *        The outlier detection information for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withOutlierDetection(OutlierDetection outlierDetection) {
        setOutlierDetection(outlierDetection);
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
     * <p>
     * An object that represents timeouts for different protocols.
     * </p>
     * 
     * @param timeout
     *        An object that represents timeouts for different protocols.
     */

    public void setTimeout(ListenerTimeout timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * An object that represents timeouts for different protocols.
     * </p>
     * 
     * @return An object that represents timeouts for different protocols.
     */

    public ListenerTimeout getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * An object that represents timeouts for different protocols.
     * </p>
     * 
     * @param timeout
     *        An object that represents timeouts for different protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withTimeout(ListenerTimeout timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * A reference to an object that represents the Transport Layer Security (TLS) properties for a listener.
     * </p>
     * 
     * @param tls
     *        A reference to an object that represents the Transport Layer Security (TLS) properties for a listener.
     */

    public void setTls(ListenerTls tls) {
        this.tls = tls;
    }

    /**
     * <p>
     * A reference to an object that represents the Transport Layer Security (TLS) properties for a listener.
     * </p>
     * 
     * @return A reference to an object that represents the Transport Layer Security (TLS) properties for a listener.
     */

    public ListenerTls getTls() {
        return this.tls;
    }

    /**
     * <p>
     * A reference to an object that represents the Transport Layer Security (TLS) properties for a listener.
     * </p>
     * 
     * @param tls
     *        A reference to an object that represents the Transport Layer Security (TLS) properties for a listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Listener withTls(ListenerTls tls) {
        setTls(tls);
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
        if (getConnectionPool() != null)
            sb.append("ConnectionPool: ").append(getConnectionPool()).append(",");
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck()).append(",");
        if (getOutlierDetection() != null)
            sb.append("OutlierDetection: ").append(getOutlierDetection()).append(",");
        if (getPortMapping() != null)
            sb.append("PortMapping: ").append(getPortMapping()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getTls() != null)
            sb.append("Tls: ").append(getTls());
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
        if (other.getConnectionPool() == null ^ this.getConnectionPool() == null)
            return false;
        if (other.getConnectionPool() != null && other.getConnectionPool().equals(this.getConnectionPool()) == false)
            return false;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        if (other.getOutlierDetection() == null ^ this.getOutlierDetection() == null)
            return false;
        if (other.getOutlierDetection() != null && other.getOutlierDetection().equals(this.getOutlierDetection()) == false)
            return false;
        if (other.getPortMapping() == null ^ this.getPortMapping() == null)
            return false;
        if (other.getPortMapping() != null && other.getPortMapping().equals(this.getPortMapping()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getTls() == null ^ this.getTls() == null)
            return false;
        if (other.getTls() != null && other.getTls().equals(this.getTls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionPool() == null) ? 0 : getConnectionPool().hashCode());
        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        hashCode = prime * hashCode + ((getOutlierDetection() == null) ? 0 : getOutlierDetection().hashCode());
        hashCode = prime * hashCode + ((getPortMapping() == null) ? 0 : getPortMapping().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getTls() == null) ? 0 : getTls().hashCode());
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
