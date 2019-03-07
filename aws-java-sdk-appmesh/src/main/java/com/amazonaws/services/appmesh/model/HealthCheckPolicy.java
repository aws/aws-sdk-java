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
 * An object representing the health check policy for a virtual node's listener.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/HealthCheckPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheckPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of consecutive successful health checks that must occur before declaring listener healthy.
     * </p>
     */
    private Integer healthyThreshold;
    /**
     * <p>
     * The time period in milliseconds between each health check execution.
     * </p>
     */
    private Long intervalMillis;
    /**
     * <p>
     * The destination path for the health check request. This is required only if the specified protocol is HTTP. If
     * the protocol is TCP, this parameter is ignored.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The destination port for the health check request. This port must match the port defined in the
     * <a>PortMapping</a> for the listener.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The protocol for the health check request.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The amount of time to wait when receiving a response from the health check, in milliseconds.
     * </p>
     */
    private Long timeoutMillis;
    /**
     * <p>
     * The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy.
     * </p>
     */
    private Integer unhealthyThreshold;

    /**
     * <p>
     * The number of consecutive successful health checks that must occur before declaring listener healthy.
     * </p>
     * 
     * @param healthyThreshold
     *        The number of consecutive successful health checks that must occur before declaring listener healthy.
     */

    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive successful health checks that must occur before declaring listener healthy.
     * </p>
     * 
     * @return The number of consecutive successful health checks that must occur before declaring listener healthy.
     */

    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive successful health checks that must occur before declaring listener healthy.
     * </p>
     * 
     * @param healthyThreshold
     *        The number of consecutive successful health checks that must occur before declaring listener healthy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckPolicy withHealthyThreshold(Integer healthyThreshold) {
        setHealthyThreshold(healthyThreshold);
        return this;
    }

    /**
     * <p>
     * The time period in milliseconds between each health check execution.
     * </p>
     * 
     * @param intervalMillis
     *        The time period in milliseconds between each health check execution.
     */

    public void setIntervalMillis(Long intervalMillis) {
        this.intervalMillis = intervalMillis;
    }

    /**
     * <p>
     * The time period in milliseconds between each health check execution.
     * </p>
     * 
     * @return The time period in milliseconds between each health check execution.
     */

    public Long getIntervalMillis() {
        return this.intervalMillis;
    }

    /**
     * <p>
     * The time period in milliseconds between each health check execution.
     * </p>
     * 
     * @param intervalMillis
     *        The time period in milliseconds between each health check execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckPolicy withIntervalMillis(Long intervalMillis) {
        setIntervalMillis(intervalMillis);
        return this;
    }

    /**
     * <p>
     * The destination path for the health check request. This is required only if the specified protocol is HTTP. If
     * the protocol is TCP, this parameter is ignored.
     * </p>
     * 
     * @param path
     *        The destination path for the health check request. This is required only if the specified protocol is
     *        HTTP. If the protocol is TCP, this parameter is ignored.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The destination path for the health check request. This is required only if the specified protocol is HTTP. If
     * the protocol is TCP, this parameter is ignored.
     * </p>
     * 
     * @return The destination path for the health check request. This is required only if the specified protocol is
     *         HTTP. If the protocol is TCP, this parameter is ignored.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The destination path for the health check request. This is required only if the specified protocol is HTTP. If
     * the protocol is TCP, this parameter is ignored.
     * </p>
     * 
     * @param path
     *        The destination path for the health check request. This is required only if the specified protocol is
     *        HTTP. If the protocol is TCP, this parameter is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckPolicy withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The destination port for the health check request. This port must match the port defined in the
     * <a>PortMapping</a> for the listener.
     * </p>
     * 
     * @param port
     *        The destination port for the health check request. This port must match the port defined in the
     *        <a>PortMapping</a> for the listener.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The destination port for the health check request. This port must match the port defined in the
     * <a>PortMapping</a> for the listener.
     * </p>
     * 
     * @return The destination port for the health check request. This port must match the port defined in the
     *         <a>PortMapping</a> for the listener.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The destination port for the health check request. This port must match the port defined in the
     * <a>PortMapping</a> for the listener.
     * </p>
     * 
     * @param port
     *        The destination port for the health check request. This port must match the port defined in the
     *        <a>PortMapping</a> for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckPolicy withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The protocol for the health check request.
     * </p>
     * 
     * @param protocol
     *        The protocol for the health check request.
     * @see PortProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol for the health check request.
     * </p>
     * 
     * @return The protocol for the health check request.
     * @see PortProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol for the health check request.
     * </p>
     * 
     * @param protocol
     *        The protocol for the health check request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortProtocol
     */

    public HealthCheckPolicy withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol for the health check request.
     * </p>
     * 
     * @param protocol
     *        The protocol for the health check request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortProtocol
     */

    public HealthCheckPolicy withProtocol(PortProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The amount of time to wait when receiving a response from the health check, in milliseconds.
     * </p>
     * 
     * @param timeoutMillis
     *        The amount of time to wait when receiving a response from the health check, in milliseconds.
     */

    public void setTimeoutMillis(Long timeoutMillis) {
        this.timeoutMillis = timeoutMillis;
    }

    /**
     * <p>
     * The amount of time to wait when receiving a response from the health check, in milliseconds.
     * </p>
     * 
     * @return The amount of time to wait when receiving a response from the health check, in milliseconds.
     */

    public Long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    /**
     * <p>
     * The amount of time to wait when receiving a response from the health check, in milliseconds.
     * </p>
     * 
     * @param timeoutMillis
     *        The amount of time to wait when receiving a response from the health check, in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckPolicy withTimeoutMillis(Long timeoutMillis) {
        setTimeoutMillis(timeoutMillis);
        return this;
    }

    /**
     * <p>
     * The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy.
     * </p>
     * 
     * @param unhealthyThreshold
     *        The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy.
     */

    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy.
     * </p>
     * 
     * @return The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy.
     */

    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy.
     * </p>
     * 
     * @param unhealthyThreshold
     *        The number of consecutive failed health checks that must occur before declaring a virtual node unhealthy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckPolicy withUnhealthyThreshold(Integer unhealthyThreshold) {
        setUnhealthyThreshold(unhealthyThreshold);
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
        if (getHealthyThreshold() != null)
            sb.append("HealthyThreshold: ").append(getHealthyThreshold()).append(",");
        if (getIntervalMillis() != null)
            sb.append("IntervalMillis: ").append(getIntervalMillis()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getTimeoutMillis() != null)
            sb.append("TimeoutMillis: ").append(getTimeoutMillis()).append(",");
        if (getUnhealthyThreshold() != null)
            sb.append("UnhealthyThreshold: ").append(getUnhealthyThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheckPolicy == false)
            return false;
        HealthCheckPolicy other = (HealthCheckPolicy) obj;
        if (other.getHealthyThreshold() == null ^ this.getHealthyThreshold() == null)
            return false;
        if (other.getHealthyThreshold() != null && other.getHealthyThreshold().equals(this.getHealthyThreshold()) == false)
            return false;
        if (other.getIntervalMillis() == null ^ this.getIntervalMillis() == null)
            return false;
        if (other.getIntervalMillis() != null && other.getIntervalMillis().equals(this.getIntervalMillis()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getTimeoutMillis() == null ^ this.getTimeoutMillis() == null)
            return false;
        if (other.getTimeoutMillis() != null && other.getTimeoutMillis().equals(this.getTimeoutMillis()) == false)
            return false;
        if (other.getUnhealthyThreshold() == null ^ this.getUnhealthyThreshold() == null)
            return false;
        if (other.getUnhealthyThreshold() != null && other.getUnhealthyThreshold().equals(this.getUnhealthyThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthyThreshold() == null) ? 0 : getHealthyThreshold().hashCode());
        hashCode = prime * hashCode + ((getIntervalMillis() == null) ? 0 : getIntervalMillis().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getTimeoutMillis() == null) ? 0 : getTimeoutMillis().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyThreshold() == null) ? 0 : getUnhealthyThreshold().hashCode());
        return hashCode;
    }

    @Override
    public HealthCheckPolicy clone() {
        try {
            return (HealthCheckPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.HealthCheckPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
