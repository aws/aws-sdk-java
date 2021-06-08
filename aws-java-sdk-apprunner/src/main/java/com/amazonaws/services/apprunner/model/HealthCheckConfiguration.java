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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the settings for the health check that AWS App Runner performs to monitor the health of a service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/HealthCheckConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheckConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP protocol that App Runner uses to perform health checks for your service.
     * </p>
     * <p>
     * If you set <code>Protocol</code> to <code>HTTP</code>, App Runner sends health check requests to the HTTP path
     * specified by <code>Path</code>.
     * </p>
     * <p>
     * Default: <code>TCP</code>
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The URL that health check requests are sent to.
     * </p>
     * <p>
     * <code>Path</code> is only applicable when you set <code>Protocol</code> to <code>HTTP</code>.
     * </p>
     * <p>
     * Default: <code>"/"</code>
     * </p>
     */
    private String path;
    /**
     * <p>
     * The time interval, in seconds, between health checks.
     * </p>
     * <p>
     * Default: <code>5</code>
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The time, in seconds, to wait for a health check response before deciding it failed.
     * </p>
     * <p>
     * Default: <code>2</code>
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The number of consecutive checks that must succeed before App Runner decides that the service is healthy.
     * </p>
     * <p>
     * Default: <code>3</code>
     * </p>
     */
    private Integer healthyThreshold;
    /**
     * <p>
     * The number of consecutive checks that must fail before App Runner decides that the service is unhealthy.
     * </p>
     * <p>
     * Default: <code>3</code>
     * </p>
     */
    private Integer unhealthyThreshold;

    /**
     * <p>
     * The IP protocol that App Runner uses to perform health checks for your service.
     * </p>
     * <p>
     * If you set <code>Protocol</code> to <code>HTTP</code>, App Runner sends health check requests to the HTTP path
     * specified by <code>Path</code>.
     * </p>
     * <p>
     * Default: <code>TCP</code>
     * </p>
     * 
     * @param protocol
     *        The IP protocol that App Runner uses to perform health checks for your service.</p>
     *        <p>
     *        If you set <code>Protocol</code> to <code>HTTP</code>, App Runner sends health check requests to the HTTP
     *        path specified by <code>Path</code>.
     *        </p>
     *        <p>
     *        Default: <code>TCP</code>
     * @see HealthCheckProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The IP protocol that App Runner uses to perform health checks for your service.
     * </p>
     * <p>
     * If you set <code>Protocol</code> to <code>HTTP</code>, App Runner sends health check requests to the HTTP path
     * specified by <code>Path</code>.
     * </p>
     * <p>
     * Default: <code>TCP</code>
     * </p>
     * 
     * @return The IP protocol that App Runner uses to perform health checks for your service.</p>
     *         <p>
     *         If you set <code>Protocol</code> to <code>HTTP</code>, App Runner sends health check requests to the HTTP
     *         path specified by <code>Path</code>.
     *         </p>
     *         <p>
     *         Default: <code>TCP</code>
     * @see HealthCheckProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The IP protocol that App Runner uses to perform health checks for your service.
     * </p>
     * <p>
     * If you set <code>Protocol</code> to <code>HTTP</code>, App Runner sends health check requests to the HTTP path
     * specified by <code>Path</code>.
     * </p>
     * <p>
     * Default: <code>TCP</code>
     * </p>
     * 
     * @param protocol
     *        The IP protocol that App Runner uses to perform health checks for your service.</p>
     *        <p>
     *        If you set <code>Protocol</code> to <code>HTTP</code>, App Runner sends health check requests to the HTTP
     *        path specified by <code>Path</code>.
     *        </p>
     *        <p>
     *        Default: <code>TCP</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckProtocol
     */

    public HealthCheckConfiguration withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The IP protocol that App Runner uses to perform health checks for your service.
     * </p>
     * <p>
     * If you set <code>Protocol</code> to <code>HTTP</code>, App Runner sends health check requests to the HTTP path
     * specified by <code>Path</code>.
     * </p>
     * <p>
     * Default: <code>TCP</code>
     * </p>
     * 
     * @param protocol
     *        The IP protocol that App Runner uses to perform health checks for your service.</p>
     *        <p>
     *        If you set <code>Protocol</code> to <code>HTTP</code>, App Runner sends health check requests to the HTTP
     *        path specified by <code>Path</code>.
     *        </p>
     *        <p>
     *        Default: <code>TCP</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckProtocol
     */

    public HealthCheckConfiguration withProtocol(HealthCheckProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The URL that health check requests are sent to.
     * </p>
     * <p>
     * <code>Path</code> is only applicable when you set <code>Protocol</code> to <code>HTTP</code>.
     * </p>
     * <p>
     * Default: <code>"/"</code>
     * </p>
     * 
     * @param path
     *        The URL that health check requests are sent to.</p>
     *        <p>
     *        <code>Path</code> is only applicable when you set <code>Protocol</code> to <code>HTTP</code>.
     *        </p>
     *        <p>
     *        Default: <code>"/"</code>
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The URL that health check requests are sent to.
     * </p>
     * <p>
     * <code>Path</code> is only applicable when you set <code>Protocol</code> to <code>HTTP</code>.
     * </p>
     * <p>
     * Default: <code>"/"</code>
     * </p>
     * 
     * @return The URL that health check requests are sent to.</p>
     *         <p>
     *         <code>Path</code> is only applicable when you set <code>Protocol</code> to <code>HTTP</code>.
     *         </p>
     *         <p>
     *         Default: <code>"/"</code>
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The URL that health check requests are sent to.
     * </p>
     * <p>
     * <code>Path</code> is only applicable when you set <code>Protocol</code> to <code>HTTP</code>.
     * </p>
     * <p>
     * Default: <code>"/"</code>
     * </p>
     * 
     * @param path
     *        The URL that health check requests are sent to.</p>
     *        <p>
     *        <code>Path</code> is only applicable when you set <code>Protocol</code> to <code>HTTP</code>.
     *        </p>
     *        <p>
     *        Default: <code>"/"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfiguration withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The time interval, in seconds, between health checks.
     * </p>
     * <p>
     * Default: <code>5</code>
     * </p>
     * 
     * @param interval
     *        The time interval, in seconds, between health checks.</p>
     *        <p>
     *        Default: <code>5</code>
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The time interval, in seconds, between health checks.
     * </p>
     * <p>
     * Default: <code>5</code>
     * </p>
     * 
     * @return The time interval, in seconds, between health checks.</p>
     *         <p>
     *         Default: <code>5</code>
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The time interval, in seconds, between health checks.
     * </p>
     * <p>
     * Default: <code>5</code>
     * </p>
     * 
     * @param interval
     *        The time interval, in seconds, between health checks.</p>
     *        <p>
     *        Default: <code>5</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfiguration withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The time, in seconds, to wait for a health check response before deciding it failed.
     * </p>
     * <p>
     * Default: <code>2</code>
     * </p>
     * 
     * @param timeout
     *        The time, in seconds, to wait for a health check response before deciding it failed.</p>
     *        <p>
     *        Default: <code>2</code>
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The time, in seconds, to wait for a health check response before deciding it failed.
     * </p>
     * <p>
     * Default: <code>2</code>
     * </p>
     * 
     * @return The time, in seconds, to wait for a health check response before deciding it failed.</p>
     *         <p>
     *         Default: <code>2</code>
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The time, in seconds, to wait for a health check response before deciding it failed.
     * </p>
     * <p>
     * Default: <code>2</code>
     * </p>
     * 
     * @param timeout
     *        The time, in seconds, to wait for a health check response before deciding it failed.</p>
     *        <p>
     *        Default: <code>2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfiguration withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The number of consecutive checks that must succeed before App Runner decides that the service is healthy.
     * </p>
     * <p>
     * Default: <code>3</code>
     * </p>
     * 
     * @param healthyThreshold
     *        The number of consecutive checks that must succeed before App Runner decides that the service is
     *        healthy.</p>
     *        <p>
     *        Default: <code>3</code>
     */

    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive checks that must succeed before App Runner decides that the service is healthy.
     * </p>
     * <p>
     * Default: <code>3</code>
     * </p>
     * 
     * @return The number of consecutive checks that must succeed before App Runner decides that the service is
     *         healthy.</p>
     *         <p>
     *         Default: <code>3</code>
     */

    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive checks that must succeed before App Runner decides that the service is healthy.
     * </p>
     * <p>
     * Default: <code>3</code>
     * </p>
     * 
     * @param healthyThreshold
     *        The number of consecutive checks that must succeed before App Runner decides that the service is
     *        healthy.</p>
     *        <p>
     *        Default: <code>3</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfiguration withHealthyThreshold(Integer healthyThreshold) {
        setHealthyThreshold(healthyThreshold);
        return this;
    }

    /**
     * <p>
     * The number of consecutive checks that must fail before App Runner decides that the service is unhealthy.
     * </p>
     * <p>
     * Default: <code>3</code>
     * </p>
     * 
     * @param unhealthyThreshold
     *        The number of consecutive checks that must fail before App Runner decides that the service is
     *        unhealthy.</p>
     *        <p>
     *        Default: <code>3</code>
     */

    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive checks that must fail before App Runner decides that the service is unhealthy.
     * </p>
     * <p>
     * Default: <code>3</code>
     * </p>
     * 
     * @return The number of consecutive checks that must fail before App Runner decides that the service is
     *         unhealthy.</p>
     *         <p>
     *         Default: <code>3</code>
     */

    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive checks that must fail before App Runner decides that the service is unhealthy.
     * </p>
     * <p>
     * Default: <code>3</code>
     * </p>
     * 
     * @param unhealthyThreshold
     *        The number of consecutive checks that must fail before App Runner decides that the service is
     *        unhealthy.</p>
     *        <p>
     *        Default: <code>3</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfiguration withUnhealthyThreshold(Integer unhealthyThreshold) {
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
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getHealthyThreshold() != null)
            sb.append("HealthyThreshold: ").append(getHealthyThreshold()).append(",");
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

        if (obj instanceof HealthCheckConfiguration == false)
            return false;
        HealthCheckConfiguration other = (HealthCheckConfiguration) obj;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getHealthyThreshold() == null ^ this.getHealthyThreshold() == null)
            return false;
        if (other.getHealthyThreshold() != null && other.getHealthyThreshold().equals(this.getHealthyThreshold()) == false)
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

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getHealthyThreshold() == null) ? 0 : getHealthyThreshold().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyThreshold() == null) ? 0 : getUnhealthyThreshold().hashCode());
        return hashCode;
    }

    @Override
    public HealthCheckConfiguration clone() {
        try {
            return (HealthCheckConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.HealthCheckConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
