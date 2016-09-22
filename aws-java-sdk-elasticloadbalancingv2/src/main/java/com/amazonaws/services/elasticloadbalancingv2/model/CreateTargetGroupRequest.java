/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for CreateTargetGroup.
 * </p>
 */
public class CreateTargetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the target group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The protocol to use for routing traffic to the targets.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The port on which the targets receive traffic. This port is used unless you specify a port override when
     * registering the target.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The identifier of the virtual private cloud (VPC).
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The protocol the load balancer uses when performing health checks on targets. The default is the HTTP protocol.
     * </p>
     */
    private String healthCheckProtocol;
    /**
     * <p>
     * The port the load balancer uses when performing health checks on targets. The default is
     * <code>traffic-port</code>, which indicates the port on which each target receives traffic from the load balancer.
     * </p>
     */
    private String healthCheckPort;
    /**
     * <p>
     * The ping path that is the destination on the targets for health checks. The default is /.
     * </p>
     */
    private String healthCheckPath;
    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target. The default is 30
     * seconds.
     * </p>
     */
    private Integer healthCheckIntervalSeconds;
    /**
     * <p>
     * The amount of time, in seconds, during which no response from a target means a failed health check. The default
     * is 5 seconds.
     * </p>
     */
    private Integer healthCheckTimeoutSeconds;
    /**
     * <p>
     * The number of consecutive health checks successes required before considering an unhealthy target healthy. The
     * default is 5.
     * </p>
     */
    private Integer healthyThresholdCount;
    /**
     * <p>
     * The number of consecutive health check failures required before considering a target unhealthy. The default is 2.
     * </p>
     */
    private Integer unhealthyThresholdCount;
    /**
     * <p>
     * The HTTP codes to use when checking for a successful response from a target. The default is 200.
     * </p>
     */
    private Matcher matcher;

    /**
     * <p>
     * The name of the target group.
     * </p>
     * 
     * @param name
     *        The name of the target group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * 
     * @return The name of the target group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the target group.
     * </p>
     * 
     * @param name
     *        The name of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets.
     * @see ProtocolEnum
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets.
     * </p>
     * 
     * @return The protocol to use for routing traffic to the targets.
     * @see ProtocolEnum
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public CreateTargetGroupRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets.
     * @see ProtocolEnum
     */

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public CreateTargetGroupRequest withProtocol(ProtocolEnum protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The port on which the targets receive traffic. This port is used unless you specify a port override when
     * registering the target.
     * </p>
     * 
     * @param port
     *        The port on which the targets receive traffic. This port is used unless you specify a port override when
     *        registering the target.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the targets receive traffic. This port is used unless you specify a port override when
     * registering the target.
     * </p>
     * 
     * @return The port on which the targets receive traffic. This port is used unless you specify a port override when
     *         registering the target.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the targets receive traffic. This port is used unless you specify a port override when
     * registering the target.
     * </p>
     * 
     * @param port
     *        The port on which the targets receive traffic. This port is used unless you specify a port override when
     *        registering the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The identifier of the virtual private cloud (VPC).
     * </p>
     * 
     * @param vpcId
     *        The identifier of the virtual private cloud (VPC).
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the virtual private cloud (VPC).
     * </p>
     * 
     * @return The identifier of the virtual private cloud (VPC).
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the virtual private cloud (VPC).
     * </p>
     * 
     * @param vpcId
     *        The identifier of the virtual private cloud (VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The protocol the load balancer uses when performing health checks on targets. The default is the HTTP protocol.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol the load balancer uses when performing health checks on targets. The default is the HTTP
     *        protocol.
     * @see ProtocolEnum
     */

    public void setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
    }

    /**
     * <p>
     * The protocol the load balancer uses when performing health checks on targets. The default is the HTTP protocol.
     * </p>
     * 
     * @return The protocol the load balancer uses when performing health checks on targets. The default is the HTTP
     *         protocol.
     * @see ProtocolEnum
     */

    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    /**
     * <p>
     * The protocol the load balancer uses when performing health checks on targets. The default is the HTTP protocol.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol the load balancer uses when performing health checks on targets. The default is the HTTP
     *        protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public CreateTargetGroupRequest withHealthCheckProtocol(String healthCheckProtocol) {
        setHealthCheckProtocol(healthCheckProtocol);
        return this;
    }

    /**
     * <p>
     * The protocol the load balancer uses when performing health checks on targets. The default is the HTTP protocol.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol the load balancer uses when performing health checks on targets. The default is the HTTP
     *        protocol.
     * @see ProtocolEnum
     */

    public void setHealthCheckProtocol(ProtocolEnum healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol.toString();
    }

    /**
     * <p>
     * The protocol the load balancer uses when performing health checks on targets. The default is the HTTP protocol.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol the load balancer uses when performing health checks on targets. The default is the HTTP
     *        protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolEnum
     */

    public CreateTargetGroupRequest withHealthCheckProtocol(ProtocolEnum healthCheckProtocol) {
        setHealthCheckProtocol(healthCheckProtocol);
        return this;
    }

    /**
     * <p>
     * The port the load balancer uses when performing health checks on targets. The default is
     * <code>traffic-port</code>, which indicates the port on which each target receives traffic from the load balancer.
     * </p>
     * 
     * @param healthCheckPort
     *        The port the load balancer uses when performing health checks on targets. The default is
     *        <code>traffic-port</code>, which indicates the port on which each target receives traffic from the load
     *        balancer.
     */

    public void setHealthCheckPort(String healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
    }

    /**
     * <p>
     * The port the load balancer uses when performing health checks on targets. The default is
     * <code>traffic-port</code>, which indicates the port on which each target receives traffic from the load balancer.
     * </p>
     * 
     * @return The port the load balancer uses when performing health checks on targets. The default is
     *         <code>traffic-port</code>, which indicates the port on which each target receives traffic from the load
     *         balancer.
     */

    public String getHealthCheckPort() {
        return this.healthCheckPort;
    }

    /**
     * <p>
     * The port the load balancer uses when performing health checks on targets. The default is
     * <code>traffic-port</code>, which indicates the port on which each target receives traffic from the load balancer.
     * </p>
     * 
     * @param healthCheckPort
     *        The port the load balancer uses when performing health checks on targets. The default is
     *        <code>traffic-port</code>, which indicates the port on which each target receives traffic from the load
     *        balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withHealthCheckPort(String healthCheckPort) {
        setHealthCheckPort(healthCheckPort);
        return this;
    }

    /**
     * <p>
     * The ping path that is the destination on the targets for health checks. The default is /.
     * </p>
     * 
     * @param healthCheckPath
     *        The ping path that is the destination on the targets for health checks. The default is /.
     */

    public void setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    /**
     * <p>
     * The ping path that is the destination on the targets for health checks. The default is /.
     * </p>
     * 
     * @return The ping path that is the destination on the targets for health checks. The default is /.
     */

    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    /**
     * <p>
     * The ping path that is the destination on the targets for health checks. The default is /.
     * </p>
     * 
     * @param healthCheckPath
     *        The ping path that is the destination on the targets for health checks. The default is /.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withHealthCheckPath(String healthCheckPath) {
        setHealthCheckPath(healthCheckPath);
        return this;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target. The default is 30
     * seconds.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The approximate amount of time, in seconds, between health checks of an individual target. The default is
     *        30 seconds.
     */

    public void setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target. The default is 30
     * seconds.
     * </p>
     * 
     * @return The approximate amount of time, in seconds, between health checks of an individual target. The default is
     *         30 seconds.
     */

    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The approximate amount of time, in seconds, between health checks of an individual target. The default is 30
     * seconds.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The approximate amount of time, in seconds, between health checks of an individual target. The default is
     *        30 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        setHealthCheckIntervalSeconds(healthCheckIntervalSeconds);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response from a target means a failed health check. The default
     * is 5 seconds.
     * </p>
     * 
     * @param healthCheckTimeoutSeconds
     *        The amount of time, in seconds, during which no response from a target means a failed health check. The
     *        default is 5 seconds.
     */

    public void setHealthCheckTimeoutSeconds(Integer healthCheckTimeoutSeconds) {
        this.healthCheckTimeoutSeconds = healthCheckTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response from a target means a failed health check. The default
     * is 5 seconds.
     * </p>
     * 
     * @return The amount of time, in seconds, during which no response from a target means a failed health check. The
     *         default is 5 seconds.
     */

    public Integer getHealthCheckTimeoutSeconds() {
        return this.healthCheckTimeoutSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response from a target means a failed health check. The default
     * is 5 seconds.
     * </p>
     * 
     * @param healthCheckTimeoutSeconds
     *        The amount of time, in seconds, during which no response from a target means a failed health check. The
     *        default is 5 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withHealthCheckTimeoutSeconds(Integer healthCheckTimeoutSeconds) {
        setHealthCheckTimeoutSeconds(healthCheckTimeoutSeconds);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before considering an unhealthy target healthy. The
     * default is 5.
     * </p>
     * 
     * @param healthyThresholdCount
     *        The number of consecutive health checks successes required before considering an unhealthy target healthy.
     *        The default is 5.
     */

    public void setHealthyThresholdCount(Integer healthyThresholdCount) {
        this.healthyThresholdCount = healthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before considering an unhealthy target healthy. The
     * default is 5.
     * </p>
     * 
     * @return The number of consecutive health checks successes required before considering an unhealthy target
     *         healthy. The default is 5.
     */

    public Integer getHealthyThresholdCount() {
        return this.healthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before considering an unhealthy target healthy. The
     * default is 5.
     * </p>
     * 
     * @param healthyThresholdCount
     *        The number of consecutive health checks successes required before considering an unhealthy target healthy.
     *        The default is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withHealthyThresholdCount(Integer healthyThresholdCount) {
        setHealthyThresholdCount(healthyThresholdCount);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before considering a target unhealthy. The default is 2.
     * </p>
     * 
     * @param unhealthyThresholdCount
     *        The number of consecutive health check failures required before considering a target unhealthy. The
     *        default is 2.
     */

    public void setUnhealthyThresholdCount(Integer unhealthyThresholdCount) {
        this.unhealthyThresholdCount = unhealthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before considering a target unhealthy. The default is 2.
     * </p>
     * 
     * @return The number of consecutive health check failures required before considering a target unhealthy. The
     *         default is 2.
     */

    public Integer getUnhealthyThresholdCount() {
        return this.unhealthyThresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before considering a target unhealthy. The default is 2.
     * </p>
     * 
     * @param unhealthyThresholdCount
     *        The number of consecutive health check failures required before considering a target unhealthy. The
     *        default is 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withUnhealthyThresholdCount(Integer unhealthyThresholdCount) {
        setUnhealthyThresholdCount(unhealthyThresholdCount);
        return this;
    }

    /**
     * <p>
     * The HTTP codes to use when checking for a successful response from a target. The default is 200.
     * </p>
     * 
     * @param matcher
     *        The HTTP codes to use when checking for a successful response from a target. The default is 200.
     */

    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    /**
     * <p>
     * The HTTP codes to use when checking for a successful response from a target. The default is 200.
     * </p>
     * 
     * @return The HTTP codes to use when checking for a successful response from a target. The default is 200.
     */

    public Matcher getMatcher() {
        return this.matcher;
    }

    /**
     * <p>
     * The HTTP codes to use when checking for a successful response from a target. The default is 200.
     * </p>
     * 
     * @param matcher
     *        The HTTP codes to use when checking for a successful response from a target. The default is 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withMatcher(Matcher matcher) {
        setMatcher(matcher);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getHealthCheckProtocol() != null)
            sb.append("HealthCheckProtocol: " + getHealthCheckProtocol() + ",");
        if (getHealthCheckPort() != null)
            sb.append("HealthCheckPort: " + getHealthCheckPort() + ",");
        if (getHealthCheckPath() != null)
            sb.append("HealthCheckPath: " + getHealthCheckPath() + ",");
        if (getHealthCheckIntervalSeconds() != null)
            sb.append("HealthCheckIntervalSeconds: " + getHealthCheckIntervalSeconds() + ",");
        if (getHealthCheckTimeoutSeconds() != null)
            sb.append("HealthCheckTimeoutSeconds: " + getHealthCheckTimeoutSeconds() + ",");
        if (getHealthyThresholdCount() != null)
            sb.append("HealthyThresholdCount: " + getHealthyThresholdCount() + ",");
        if (getUnhealthyThresholdCount() != null)
            sb.append("UnhealthyThresholdCount: " + getUnhealthyThresholdCount() + ",");
        if (getMatcher() != null)
            sb.append("Matcher: " + getMatcher());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTargetGroupRequest == false)
            return false;
        CreateTargetGroupRequest other = (CreateTargetGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getHealthCheckProtocol() == null ^ this.getHealthCheckProtocol() == null)
            return false;
        if (other.getHealthCheckProtocol() != null && other.getHealthCheckProtocol().equals(this.getHealthCheckProtocol()) == false)
            return false;
        if (other.getHealthCheckPort() == null ^ this.getHealthCheckPort() == null)
            return false;
        if (other.getHealthCheckPort() != null && other.getHealthCheckPort().equals(this.getHealthCheckPort()) == false)
            return false;
        if (other.getHealthCheckPath() == null ^ this.getHealthCheckPath() == null)
            return false;
        if (other.getHealthCheckPath() != null && other.getHealthCheckPath().equals(this.getHealthCheckPath()) == false)
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
        if (other.getUnhealthyThresholdCount() == null ^ this.getUnhealthyThresholdCount() == null)
            return false;
        if (other.getUnhealthyThresholdCount() != null && other.getUnhealthyThresholdCount().equals(this.getUnhealthyThresholdCount()) == false)
            return false;
        if (other.getMatcher() == null ^ this.getMatcher() == null)
            return false;
        if (other.getMatcher() != null && other.getMatcher().equals(this.getMatcher()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckProtocol() == null) ? 0 : getHealthCheckProtocol().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPort() == null) ? 0 : getHealthCheckPort().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPath() == null) ? 0 : getHealthCheckPath().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckIntervalSeconds() == null) ? 0 : getHealthCheckIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckTimeoutSeconds() == null) ? 0 : getHealthCheckTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getHealthyThresholdCount() == null) ? 0 : getHealthyThresholdCount().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyThresholdCount() == null) ? 0 : getUnhealthyThresholdCount().hashCode());
        hashCode = prime * hashCode + ((getMatcher() == null) ? 0 : getMatcher().hashCode());
        return hashCode;
    }

    @Override
    public CreateTargetGroupRequest clone() {
        return (CreateTargetGroupRequest) super.clone();
    }
}
