/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the health check configuration of a target group. Health check configurations aren't used for target groups
 * of type <code>LAMBDA</code> or <code>ALB</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/HealthCheckConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheckConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether health checking is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target. The range is 5–300
     * seconds. The default is 30 seconds.
     * </p>
     */
    private Integer healthCheckIntervalSeconds;
    /**
     * <p>
     * The amount of time, in seconds, to wait before reporting a target as unhealthy. The range is 1–120 seconds. The
     * default is 5 seconds.
     * </p>
     */
    private Integer healthCheckTimeoutSeconds;
    /**
     * <p>
     * The number of consecutive successful health checks required before considering an unhealthy target healthy. The
     * range is 2–10. The default is 5.
     * </p>
     */
    private Integer healthyThresholdCount;
    /**
     * <p>
     * The codes to use when checking for a successful response from a target.
     * </p>
     */
    private Matcher matcher;
    /**
     * <p>
     * The destination for health checks on the targets. If the protocol version is <code>HTTP/1.1</code> or
     * <code>HTTP/2</code>, specify a valid URI (for example, <code>/path?query</code>). The default path is
     * <code>/</code>. Health checks are not supported if the protocol version is <code>gRPC</code>, however, you can
     * choose <code>HTTP/1.1</code> or <code>HTTP/2</code> and specify a valid URI.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The port used when performing health checks on targets. The default setting is the port that a target receives
     * traffic on.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The protocol used when performing health checks on targets. The possible protocols are <code>HTTP</code> and
     * <code>HTTPS</code>. The default is <code>HTTP</code>.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The protocol version used when performing health checks on targets. The possible protocol versions are
     * <code>HTTP1</code> and <code>HTTP2</code>.
     * </p>
     */
    private String protocolVersion;
    /**
     * <p>
     * The number of consecutive failed health checks required before considering a target unhealthy. The range is 2–10.
     * The default is 2.
     * </p>
     */
    private Integer unhealthyThresholdCount;

    /**
     * <p>
     * Indicates whether health checking is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether health checking is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether health checking is enabled.
     * </p>
     * 
     * @return Indicates whether health checking is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether health checking is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether health checking is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether health checking is enabled.
     * </p>
     * 
     * @return Indicates whether health checking is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target. The range is 5–300
     * seconds. The default is 30 seconds.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The approximate amount of time, in seconds, between health checks of an individual target. The range is
     *        5–300 seconds. The default is 30 seconds.
     */

    public void setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target. The range is 5–300
     * seconds. The default is 30 seconds.
     * </p>
     * 
     * @return The approximate amount of time, in seconds, between health checks of an individual target. The range is
     *         5–300 seconds. The default is 30 seconds.
     */

    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target. The range is 5–300
     * seconds. The default is 30 seconds.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The approximate amount of time, in seconds, between health checks of an individual target. The range is
     *        5–300 seconds. The default is 30 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        setHealthCheckIntervalSeconds(healthCheckIntervalSeconds);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait before reporting a target as unhealthy. The range is 1–120 seconds. The
     * default is 5 seconds.
     * </p>
     * 
     * @param healthCheckTimeoutSeconds
     *        The amount of time, in seconds, to wait before reporting a target as unhealthy. The range is 1–120
     *        seconds. The default is 5 seconds.
     */

    public void setHealthCheckTimeoutSeconds(Integer healthCheckTimeoutSeconds) {
        this.healthCheckTimeoutSeconds = healthCheckTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait before reporting a target as unhealthy. The range is 1–120 seconds. The
     * default is 5 seconds.
     * </p>
     * 
     * @return The amount of time, in seconds, to wait before reporting a target as unhealthy. The range is 1–120
     *         seconds. The default is 5 seconds.
     */

    public Integer getHealthCheckTimeoutSeconds() {
        return this.healthCheckTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait before reporting a target as unhealthy. The range is 1–120 seconds. The
     * default is 5 seconds.
     * </p>
     * 
     * @param healthCheckTimeoutSeconds
     *        The amount of time, in seconds, to wait before reporting a target as unhealthy. The range is 1–120
     *        seconds. The default is 5 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withHealthCheckTimeoutSeconds(Integer healthCheckTimeoutSeconds) {
        setHealthCheckTimeoutSeconds(healthCheckTimeoutSeconds);
        return this;
    }

    /**
     * <p>
     * The number of consecutive successful health checks required before considering an unhealthy target healthy. The
     * range is 2–10. The default is 5.
     * </p>
     * 
     * @param healthyThresholdCount
     *        The number of consecutive successful health checks required before considering an unhealthy target
     *        healthy. The range is 2–10. The default is 5.
     */

    public void setHealthyThresholdCount(Integer healthyThresholdCount) {
        this.healthyThresholdCount = healthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive successful health checks required before considering an unhealthy target healthy. The
     * range is 2–10. The default is 5.
     * </p>
     * 
     * @return The number of consecutive successful health checks required before considering an unhealthy target
     *         healthy. The range is 2–10. The default is 5.
     */

    public Integer getHealthyThresholdCount() {
        return this.healthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive successful health checks required before considering an unhealthy target healthy. The
     * range is 2–10. The default is 5.
     * </p>
     * 
     * @param healthyThresholdCount
     *        The number of consecutive successful health checks required before considering an unhealthy target
     *        healthy. The range is 2–10. The default is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withHealthyThresholdCount(Integer healthyThresholdCount) {
        setHealthyThresholdCount(healthyThresholdCount);
        return this;
    }

    /**
     * <p>
     * The codes to use when checking for a successful response from a target.
     * </p>
     * 
     * @param matcher
     *        The codes to use when checking for a successful response from a target.
     */

    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    /**
     * <p>
     * The codes to use when checking for a successful response from a target.
     * </p>
     * 
     * @return The codes to use when checking for a successful response from a target.
     */

    public Matcher getMatcher() {
        return this.matcher;
    }

    /**
     * <p>
     * The codes to use when checking for a successful response from a target.
     * </p>
     * 
     * @param matcher
     *        The codes to use when checking for a successful response from a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withMatcher(Matcher matcher) {
        setMatcher(matcher);
        return this;
    }

    /**
     * <p>
     * The destination for health checks on the targets. If the protocol version is <code>HTTP/1.1</code> or
     * <code>HTTP/2</code>, specify a valid URI (for example, <code>/path?query</code>). The default path is
     * <code>/</code>. Health checks are not supported if the protocol version is <code>gRPC</code>, however, you can
     * choose <code>HTTP/1.1</code> or <code>HTTP/2</code> and specify a valid URI.
     * </p>
     * 
     * @param path
     *        The destination for health checks on the targets. If the protocol version is <code>HTTP/1.1</code> or
     *        <code>HTTP/2</code>, specify a valid URI (for example, <code>/path?query</code>). The default path is
     *        <code>/</code>. Health checks are not supported if the protocol version is <code>gRPC</code>, however, you
     *        can choose <code>HTTP/1.1</code> or <code>HTTP/2</code> and specify a valid URI.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The destination for health checks on the targets. If the protocol version is <code>HTTP/1.1</code> or
     * <code>HTTP/2</code>, specify a valid URI (for example, <code>/path?query</code>). The default path is
     * <code>/</code>. Health checks are not supported if the protocol version is <code>gRPC</code>, however, you can
     * choose <code>HTTP/1.1</code> or <code>HTTP/2</code> and specify a valid URI.
     * </p>
     * 
     * @return The destination for health checks on the targets. If the protocol version is <code>HTTP/1.1</code> or
     *         <code>HTTP/2</code>, specify a valid URI (for example, <code>/path?query</code>). The default path is
     *         <code>/</code>. Health checks are not supported if the protocol version is <code>gRPC</code>, however,
     *         you can choose <code>HTTP/1.1</code> or <code>HTTP/2</code> and specify a valid URI.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The destination for health checks on the targets. If the protocol version is <code>HTTP/1.1</code> or
     * <code>HTTP/2</code>, specify a valid URI (for example, <code>/path?query</code>). The default path is
     * <code>/</code>. Health checks are not supported if the protocol version is <code>gRPC</code>, however, you can
     * choose <code>HTTP/1.1</code> or <code>HTTP/2</code> and specify a valid URI.
     * </p>
     * 
     * @param path
     *        The destination for health checks on the targets. If the protocol version is <code>HTTP/1.1</code> or
     *        <code>HTTP/2</code>, specify a valid URI (for example, <code>/path?query</code>). The default path is
     *        <code>/</code>. Health checks are not supported if the protocol version is <code>gRPC</code>, however, you
     *        can choose <code>HTTP/1.1</code> or <code>HTTP/2</code> and specify a valid URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The port used when performing health checks on targets. The default setting is the port that a target receives
     * traffic on.
     * </p>
     * 
     * @param port
     *        The port used when performing health checks on targets. The default setting is the port that a target
     *        receives traffic on.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port used when performing health checks on targets. The default setting is the port that a target receives
     * traffic on.
     * </p>
     * 
     * @return The port used when performing health checks on targets. The default setting is the port that a target
     *         receives traffic on.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port used when performing health checks on targets. The default setting is the port that a target receives
     * traffic on.
     * </p>
     * 
     * @param port
     *        The port used when performing health checks on targets. The default setting is the port that a target
     *        receives traffic on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The protocol used when performing health checks on targets. The possible protocols are <code>HTTP</code> and
     * <code>HTTPS</code>. The default is <code>HTTP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol used when performing health checks on targets. The possible protocols are <code>HTTP</code>
     *        and <code>HTTPS</code>. The default is <code>HTTP</code>.
     * @see TargetGroupProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used when performing health checks on targets. The possible protocols are <code>HTTP</code> and
     * <code>HTTPS</code>. The default is <code>HTTP</code>.
     * </p>
     * 
     * @return The protocol used when performing health checks on targets. The possible protocols are <code>HTTP</code>
     *         and <code>HTTPS</code>. The default is <code>HTTP</code>.
     * @see TargetGroupProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used when performing health checks on targets. The possible protocols are <code>HTTP</code> and
     * <code>HTTPS</code>. The default is <code>HTTP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol used when performing health checks on targets. The possible protocols are <code>HTTP</code>
     *        and <code>HTTPS</code>. The default is <code>HTTP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupProtocol
     */

    public HealthCheckConfig withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol used when performing health checks on targets. The possible protocols are <code>HTTP</code> and
     * <code>HTTPS</code>. The default is <code>HTTP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol used when performing health checks on targets. The possible protocols are <code>HTTP</code>
     *        and <code>HTTPS</code>. The default is <code>HTTP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupProtocol
     */

    public HealthCheckConfig withProtocol(TargetGroupProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The protocol version used when performing health checks on targets. The possible protocol versions are
     * <code>HTTP1</code> and <code>HTTP2</code>.
     * </p>
     * 
     * @param protocolVersion
     *        The protocol version used when performing health checks on targets. The possible protocol versions are
     *        <code>HTTP1</code> and <code>HTTP2</code>.
     * @see HealthCheckProtocolVersion
     */

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    /**
     * <p>
     * The protocol version used when performing health checks on targets. The possible protocol versions are
     * <code>HTTP1</code> and <code>HTTP2</code>.
     * </p>
     * 
     * @return The protocol version used when performing health checks on targets. The possible protocol versions are
     *         <code>HTTP1</code> and <code>HTTP2</code>.
     * @see HealthCheckProtocolVersion
     */

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    /**
     * <p>
     * The protocol version used when performing health checks on targets. The possible protocol versions are
     * <code>HTTP1</code> and <code>HTTP2</code>.
     * </p>
     * 
     * @param protocolVersion
     *        The protocol version used when performing health checks on targets. The possible protocol versions are
     *        <code>HTTP1</code> and <code>HTTP2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckProtocolVersion
     */

    public HealthCheckConfig withProtocolVersion(String protocolVersion) {
        setProtocolVersion(protocolVersion);
        return this;
    }

    /**
     * <p>
     * The protocol version used when performing health checks on targets. The possible protocol versions are
     * <code>HTTP1</code> and <code>HTTP2</code>.
     * </p>
     * 
     * @param protocolVersion
     *        The protocol version used when performing health checks on targets. The possible protocol versions are
     *        <code>HTTP1</code> and <code>HTTP2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckProtocolVersion
     */

    public HealthCheckConfig withProtocolVersion(HealthCheckProtocolVersion protocolVersion) {
        this.protocolVersion = protocolVersion.toString();
        return this;
    }

    /**
     * <p>
     * The number of consecutive failed health checks required before considering a target unhealthy. The range is 2–10.
     * The default is 2.
     * </p>
     * 
     * @param unhealthyThresholdCount
     *        The number of consecutive failed health checks required before considering a target unhealthy. The range
     *        is 2–10. The default is 2.
     */

    public void setUnhealthyThresholdCount(Integer unhealthyThresholdCount) {
        this.unhealthyThresholdCount = unhealthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive failed health checks required before considering a target unhealthy. The range is 2–10.
     * The default is 2.
     * </p>
     * 
     * @return The number of consecutive failed health checks required before considering a target unhealthy. The range
     *         is 2–10. The default is 2.
     */

    public Integer getUnhealthyThresholdCount() {
        return this.unhealthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive failed health checks required before considering a target unhealthy. The range is 2–10.
     * The default is 2.
     * </p>
     * 
     * @param unhealthyThresholdCount
     *        The number of consecutive failed health checks required before considering a target unhealthy. The range
     *        is 2–10. The default is 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withUnhealthyThresholdCount(Integer unhealthyThresholdCount) {
        setUnhealthyThresholdCount(unhealthyThresholdCount);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getHealthCheckIntervalSeconds() != null)
            sb.append("HealthCheckIntervalSeconds: ").append(getHealthCheckIntervalSeconds()).append(",");
        if (getHealthCheckTimeoutSeconds() != null)
            sb.append("HealthCheckTimeoutSeconds: ").append(getHealthCheckTimeoutSeconds()).append(",");
        if (getHealthyThresholdCount() != null)
            sb.append("HealthyThresholdCount: ").append(getHealthyThresholdCount()).append(",");
        if (getMatcher() != null)
            sb.append("Matcher: ").append(getMatcher()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getProtocolVersion() != null)
            sb.append("ProtocolVersion: ").append(getProtocolVersion()).append(",");
        if (getUnhealthyThresholdCount() != null)
            sb.append("UnhealthyThresholdCount: ").append(getUnhealthyThresholdCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheckConfig == false)
            return false;
        HealthCheckConfig other = (HealthCheckConfig) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getHealthCheckIntervalSeconds() == null ^ this.getHealthCheckIntervalSeconds() == null)
            return false;
        if (other.getHealthCheckIntervalSeconds() != null && other.getHealthCheckIntervalSeconds().equals(this.getHealthCheckIntervalSeconds()) == false)
            return false;
        if (other.getHealthCheckTimeoutSeconds() == null ^ this.getHealthCheckTimeoutSeconds() == null)
            return false;
        if (other.getHealthCheckTimeoutSeconds() != null && other.getHealthCheckTimeoutSeconds().equals(this.getHealthCheckTimeoutSeconds()) == false)
            return false;
        if (other.getHealthyThresholdCount() == null ^ this.getHealthyThresholdCount() == null)
            return false;
        if (other.getHealthyThresholdCount() != null && other.getHealthyThresholdCount().equals(this.getHealthyThresholdCount()) == false)
            return false;
        if (other.getMatcher() == null ^ this.getMatcher() == null)
            return false;
        if (other.getMatcher() != null && other.getMatcher().equals(this.getMatcher()) == false)
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
        if (other.getProtocolVersion() == null ^ this.getProtocolVersion() == null)
            return false;
        if (other.getProtocolVersion() != null && other.getProtocolVersion().equals(this.getProtocolVersion()) == false)
            return false;
        if (other.getUnhealthyThresholdCount() == null ^ this.getUnhealthyThresholdCount() == null)
            return false;
        if (other.getUnhealthyThresholdCount() != null && other.getUnhealthyThresholdCount().equals(this.getUnhealthyThresholdCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckIntervalSeconds() == null) ? 0 : getHealthCheckIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckTimeoutSeconds() == null) ? 0 : getHealthCheckTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getHealthyThresholdCount() == null) ? 0 : getHealthyThresholdCount().hashCode());
        hashCode = prime * hashCode + ((getMatcher() == null) ? 0 : getMatcher().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getProtocolVersion() == null) ? 0 : getProtocolVersion().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyThresholdCount() == null) ? 0 : getUnhealthyThresholdCount().hashCode());
        return hashCode;
    }

    @Override
    public HealthCheckConfig clone() {
        try {
            return (HealthCheckConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.HealthCheckConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
