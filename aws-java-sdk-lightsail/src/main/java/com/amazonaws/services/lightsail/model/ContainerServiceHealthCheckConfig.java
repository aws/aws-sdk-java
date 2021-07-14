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
 * Describes the health check configuration of an Amazon Lightsail container service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ContainerServiceHealthCheckConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerServiceHealthCheckConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of consecutive health checks successes required before moving the container to the
     * <code>Healthy</code> state. The default value is <code>2</code>.
     * </p>
     */
    private Integer healthyThreshold;
    /**
     * <p>
     * The number of consecutive health check failures required before moving the container to the
     * <code>Unhealthy</code> state. The default value is <code>2</code>.
     * </p>
     */
    private Integer unhealthyThreshold;
    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed health check. You can specify between 2
     * and 60 seconds. The default value is <code>2</code>.
     * </p>
     */
    private Integer timeoutSeconds;
    /**
     * <p>
     * The approximate interval, in seconds, between health checks of an individual container. You can specify between 5
     * and 300 seconds. The default value is <code>5</code>.
     * </p>
     */
    private Integer intervalSeconds;
    /**
     * <p>
     * The path on the container on which to perform the health check. The default value is <code>/</code>.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The HTTP codes to use when checking for a successful response from a container. You can specify values between
     * <code>200</code> and <code>499</code>. You can specify multiple values (for example, <code>200,202</code>) or a
     * range of values (for example, <code>200-299</code>).
     * </p>
     */
    private String successCodes;

    /**
     * <p>
     * The number of consecutive health checks successes required before moving the container to the
     * <code>Healthy</code> state. The default value is <code>2</code>.
     * </p>
     * 
     * @param healthyThreshold
     *        The number of consecutive health checks successes required before moving the container to the
     *        <code>Healthy</code> state. The default value is <code>2</code>.
     */

    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before moving the container to the
     * <code>Healthy</code> state. The default value is <code>2</code>.
     * </p>
     * 
     * @return The number of consecutive health checks successes required before moving the container to the
     *         <code>Healthy</code> state. The default value is <code>2</code>.
     */

    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before moving the container to the
     * <code>Healthy</code> state. The default value is <code>2</code>.
     * </p>
     * 
     * @param healthyThreshold
     *        The number of consecutive health checks successes required before moving the container to the
     *        <code>Healthy</code> state. The default value is <code>2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceHealthCheckConfig withHealthyThreshold(Integer healthyThreshold) {
        setHealthyThreshold(healthyThreshold);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before moving the container to the
     * <code>Unhealthy</code> state. The default value is <code>2</code>.
     * </p>
     * 
     * @param unhealthyThreshold
     *        The number of consecutive health check failures required before moving the container to the
     *        <code>Unhealthy</code> state. The default value is <code>2</code>.
     */

    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before moving the container to the
     * <code>Unhealthy</code> state. The default value is <code>2</code>.
     * </p>
     * 
     * @return The number of consecutive health check failures required before moving the container to the
     *         <code>Unhealthy</code> state. The default value is <code>2</code>.
     */

    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before moving the container to the
     * <code>Unhealthy</code> state. The default value is <code>2</code>.
     * </p>
     * 
     * @param unhealthyThreshold
     *        The number of consecutive health check failures required before moving the container to the
     *        <code>Unhealthy</code> state. The default value is <code>2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceHealthCheckConfig withUnhealthyThreshold(Integer unhealthyThreshold) {
        setUnhealthyThreshold(unhealthyThreshold);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed health check. You can specify between 2
     * and 60 seconds. The default value is <code>2</code>.
     * </p>
     * 
     * @param timeoutSeconds
     *        The amount of time, in seconds, during which no response means a failed health check. You can specify
     *        between 2 and 60 seconds. The default value is <code>2</code>.
     */

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed health check. You can specify between 2
     * and 60 seconds. The default value is <code>2</code>.
     * </p>
     * 
     * @return The amount of time, in seconds, during which no response means a failed health check. You can specify
     *         between 2 and 60 seconds. The default value is <code>2</code>.
     */

    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed health check. You can specify between 2
     * and 60 seconds. The default value is <code>2</code>.
     * </p>
     * 
     * @param timeoutSeconds
     *        The amount of time, in seconds, during which no response means a failed health check. You can specify
     *        between 2 and 60 seconds. The default value is <code>2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceHealthCheckConfig withTimeoutSeconds(Integer timeoutSeconds) {
        setTimeoutSeconds(timeoutSeconds);
        return this;
    }

    /**
     * <p>
     * The approximate interval, in seconds, between health checks of an individual container. You can specify between 5
     * and 300 seconds. The default value is <code>5</code>.
     * </p>
     * 
     * @param intervalSeconds
     *        The approximate interval, in seconds, between health checks of an individual container. You can specify
     *        between 5 and 300 seconds. The default value is <code>5</code>.
     */

    public void setIntervalSeconds(Integer intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
    }

    /**
     * <p>
     * The approximate interval, in seconds, between health checks of an individual container. You can specify between 5
     * and 300 seconds. The default value is <code>5</code>.
     * </p>
     * 
     * @return The approximate interval, in seconds, between health checks of an individual container. You can specify
     *         between 5 and 300 seconds. The default value is <code>5</code>.
     */

    public Integer getIntervalSeconds() {
        return this.intervalSeconds;
    }

    /**
     * <p>
     * The approximate interval, in seconds, between health checks of an individual container. You can specify between 5
     * and 300 seconds. The default value is <code>5</code>.
     * </p>
     * 
     * @param intervalSeconds
     *        The approximate interval, in seconds, between health checks of an individual container. You can specify
     *        between 5 and 300 seconds. The default value is <code>5</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceHealthCheckConfig withIntervalSeconds(Integer intervalSeconds) {
        setIntervalSeconds(intervalSeconds);
        return this;
    }

    /**
     * <p>
     * The path on the container on which to perform the health check. The default value is <code>/</code>.
     * </p>
     * 
     * @param path
     *        The path on the container on which to perform the health check. The default value is <code>/</code>.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path on the container on which to perform the health check. The default value is <code>/</code>.
     * </p>
     * 
     * @return The path on the container on which to perform the health check. The default value is <code>/</code>.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path on the container on which to perform the health check. The default value is <code>/</code>.
     * </p>
     * 
     * @param path
     *        The path on the container on which to perform the health check. The default value is <code>/</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceHealthCheckConfig withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The HTTP codes to use when checking for a successful response from a container. You can specify values between
     * <code>200</code> and <code>499</code>. You can specify multiple values (for example, <code>200,202</code>) or a
     * range of values (for example, <code>200-299</code>).
     * </p>
     * 
     * @param successCodes
     *        The HTTP codes to use when checking for a successful response from a container. You can specify values
     *        between <code>200</code> and <code>499</code>. You can specify multiple values (for example,
     *        <code>200,202</code>) or a range of values (for example, <code>200-299</code>).
     */

    public void setSuccessCodes(String successCodes) {
        this.successCodes = successCodes;
    }

    /**
     * <p>
     * The HTTP codes to use when checking for a successful response from a container. You can specify values between
     * <code>200</code> and <code>499</code>. You can specify multiple values (for example, <code>200,202</code>) or a
     * range of values (for example, <code>200-299</code>).
     * </p>
     * 
     * @return The HTTP codes to use when checking for a successful response from a container. You can specify values
     *         between <code>200</code> and <code>499</code>. You can specify multiple values (for example,
     *         <code>200,202</code>) or a range of values (for example, <code>200-299</code>).
     */

    public String getSuccessCodes() {
        return this.successCodes;
    }

    /**
     * <p>
     * The HTTP codes to use when checking for a successful response from a container. You can specify values between
     * <code>200</code> and <code>499</code>. You can specify multiple values (for example, <code>200,202</code>) or a
     * range of values (for example, <code>200-299</code>).
     * </p>
     * 
     * @param successCodes
     *        The HTTP codes to use when checking for a successful response from a container. You can specify values
     *        between <code>200</code> and <code>499</code>. You can specify multiple values (for example,
     *        <code>200,202</code>) or a range of values (for example, <code>200-299</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceHealthCheckConfig withSuccessCodes(String successCodes) {
        setSuccessCodes(successCodes);
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
        if (getUnhealthyThreshold() != null)
            sb.append("UnhealthyThreshold: ").append(getUnhealthyThreshold()).append(",");
        if (getTimeoutSeconds() != null)
            sb.append("TimeoutSeconds: ").append(getTimeoutSeconds()).append(",");
        if (getIntervalSeconds() != null)
            sb.append("IntervalSeconds: ").append(getIntervalSeconds()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getSuccessCodes() != null)
            sb.append("SuccessCodes: ").append(getSuccessCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerServiceHealthCheckConfig == false)
            return false;
        ContainerServiceHealthCheckConfig other = (ContainerServiceHealthCheckConfig) obj;
        if (other.getHealthyThreshold() == null ^ this.getHealthyThreshold() == null)
            return false;
        if (other.getHealthyThreshold() != null && other.getHealthyThreshold().equals(this.getHealthyThreshold()) == false)
            return false;
        if (other.getUnhealthyThreshold() == null ^ this.getUnhealthyThreshold() == null)
            return false;
        if (other.getUnhealthyThreshold() != null && other.getUnhealthyThreshold().equals(this.getUnhealthyThreshold()) == false)
            return false;
        if (other.getTimeoutSeconds() == null ^ this.getTimeoutSeconds() == null)
            return false;
        if (other.getTimeoutSeconds() != null && other.getTimeoutSeconds().equals(this.getTimeoutSeconds()) == false)
            return false;
        if (other.getIntervalSeconds() == null ^ this.getIntervalSeconds() == null)
            return false;
        if (other.getIntervalSeconds() != null && other.getIntervalSeconds().equals(this.getIntervalSeconds()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getSuccessCodes() == null ^ this.getSuccessCodes() == null)
            return false;
        if (other.getSuccessCodes() != null && other.getSuccessCodes().equals(this.getSuccessCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthyThreshold() == null) ? 0 : getHealthyThreshold().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyThreshold() == null) ? 0 : getUnhealthyThreshold().hashCode());
        hashCode = prime * hashCode + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getIntervalSeconds() == null) ? 0 : getIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getSuccessCodes() == null) ? 0 : getSuccessCodes().hashCode());
        return hashCode;
    }

    @Override
    public ContainerServiceHealthCheckConfig clone() {
        try {
            return (ContainerServiceHealthCheckConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ContainerServiceHealthCheckConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
