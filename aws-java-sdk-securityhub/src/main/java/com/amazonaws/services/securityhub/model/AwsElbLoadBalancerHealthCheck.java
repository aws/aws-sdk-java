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
 * Contains information about the health checks that are conducted on the load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElbLoadBalancerHealthCheck"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLoadBalancerHealthCheck implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of consecutive health check successes required before the instance is moved to the Healthy state.
     * </p>
     */
    private Integer healthyThreshold;
    /**
     * <p>
     * The approximate interval, in seconds, between health checks of an individual instance.
     * </p>
     */
    private Integer interval;
    /**
     * <p>
     * The instance that is being checked. The target specifies the protocol and port. The available protocols are TCP,
     * SSL, HTTP, and HTTPS. The range of valid ports is 1 through 65535.
     * </p>
     * <p>
     * For the HTTP and HTTPS protocols, the target also specifies the ping path.
     * </p>
     * <p>
     * For the TCP protocol, the target is specified as <code>TCP: <i>&lt;port&gt;</i> </code>.
     * </p>
     * <p>
     * For the SSL protocol, the target is specified as <code>SSL.<i>&lt;port&gt;</i> </code>.
     * </p>
     * <p>
     * For the HTTP and HTTPS protocols, the target is specified as
     * <code> <i>&lt;protocol&gt;</i>:<i>&lt;port&gt;</i>/<i>&lt;path to ping&gt;</i> </code>.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed health check.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The number of consecutive health check failures that must occur before the instance is moved to the Unhealthy
     * state.
     * </p>
     */
    private Integer unhealthyThreshold;

    /**
     * <p>
     * The number of consecutive health check successes required before the instance is moved to the Healthy state.
     * </p>
     * 
     * @param healthyThreshold
     *        The number of consecutive health check successes required before the instance is moved to the Healthy
     *        state.
     */

    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive health check successes required before the instance is moved to the Healthy state.
     * </p>
     * 
     * @return The number of consecutive health check successes required before the instance is moved to the Healthy
     *         state.
     */

    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive health check successes required before the instance is moved to the Healthy state.
     * </p>
     * 
     * @param healthyThreshold
     *        The number of consecutive health check successes required before the instance is moved to the Healthy
     *        state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerHealthCheck withHealthyThreshold(Integer healthyThreshold) {
        setHealthyThreshold(healthyThreshold);
        return this;
    }

    /**
     * <p>
     * The approximate interval, in seconds, between health checks of an individual instance.
     * </p>
     * 
     * @param interval
     *        The approximate interval, in seconds, between health checks of an individual instance.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The approximate interval, in seconds, between health checks of an individual instance.
     * </p>
     * 
     * @return The approximate interval, in seconds, between health checks of an individual instance.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The approximate interval, in seconds, between health checks of an individual instance.
     * </p>
     * 
     * @param interval
     *        The approximate interval, in seconds, between health checks of an individual instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerHealthCheck withInterval(Integer interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The instance that is being checked. The target specifies the protocol and port. The available protocols are TCP,
     * SSL, HTTP, and HTTPS. The range of valid ports is 1 through 65535.
     * </p>
     * <p>
     * For the HTTP and HTTPS protocols, the target also specifies the ping path.
     * </p>
     * <p>
     * For the TCP protocol, the target is specified as <code>TCP: <i>&lt;port&gt;</i> </code>.
     * </p>
     * <p>
     * For the SSL protocol, the target is specified as <code>SSL.<i>&lt;port&gt;</i> </code>.
     * </p>
     * <p>
     * For the HTTP and HTTPS protocols, the target is specified as
     * <code> <i>&lt;protocol&gt;</i>:<i>&lt;port&gt;</i>/<i>&lt;path to ping&gt;</i> </code>.
     * </p>
     * 
     * @param target
     *        The instance that is being checked. The target specifies the protocol and port. The available protocols
     *        are TCP, SSL, HTTP, and HTTPS. The range of valid ports is 1 through 65535.</p>
     *        <p>
     *        For the HTTP and HTTPS protocols, the target also specifies the ping path.
     *        </p>
     *        <p>
     *        For the TCP protocol, the target is specified as <code>TCP: <i>&lt;port&gt;</i> </code>.
     *        </p>
     *        <p>
     *        For the SSL protocol, the target is specified as <code>SSL.<i>&lt;port&gt;</i> </code>.
     *        </p>
     *        <p>
     *        For the HTTP and HTTPS protocols, the target is specified as
     *        <code> <i>&lt;protocol&gt;</i>:<i>&lt;port&gt;</i>/<i>&lt;path to ping&gt;</i> </code>.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The instance that is being checked. The target specifies the protocol and port. The available protocols are TCP,
     * SSL, HTTP, and HTTPS. The range of valid ports is 1 through 65535.
     * </p>
     * <p>
     * For the HTTP and HTTPS protocols, the target also specifies the ping path.
     * </p>
     * <p>
     * For the TCP protocol, the target is specified as <code>TCP: <i>&lt;port&gt;</i> </code>.
     * </p>
     * <p>
     * For the SSL protocol, the target is specified as <code>SSL.<i>&lt;port&gt;</i> </code>.
     * </p>
     * <p>
     * For the HTTP and HTTPS protocols, the target is specified as
     * <code> <i>&lt;protocol&gt;</i>:<i>&lt;port&gt;</i>/<i>&lt;path to ping&gt;</i> </code>.
     * </p>
     * 
     * @return The instance that is being checked. The target specifies the protocol and port. The available protocols
     *         are TCP, SSL, HTTP, and HTTPS. The range of valid ports is 1 through 65535.</p>
     *         <p>
     *         For the HTTP and HTTPS protocols, the target also specifies the ping path.
     *         </p>
     *         <p>
     *         For the TCP protocol, the target is specified as <code>TCP: <i>&lt;port&gt;</i> </code>.
     *         </p>
     *         <p>
     *         For the SSL protocol, the target is specified as <code>SSL.<i>&lt;port&gt;</i> </code>.
     *         </p>
     *         <p>
     *         For the HTTP and HTTPS protocols, the target is specified as
     *         <code> <i>&lt;protocol&gt;</i>:<i>&lt;port&gt;</i>/<i>&lt;path to ping&gt;</i> </code>.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The instance that is being checked. The target specifies the protocol and port. The available protocols are TCP,
     * SSL, HTTP, and HTTPS. The range of valid ports is 1 through 65535.
     * </p>
     * <p>
     * For the HTTP and HTTPS protocols, the target also specifies the ping path.
     * </p>
     * <p>
     * For the TCP protocol, the target is specified as <code>TCP: <i>&lt;port&gt;</i> </code>.
     * </p>
     * <p>
     * For the SSL protocol, the target is specified as <code>SSL.<i>&lt;port&gt;</i> </code>.
     * </p>
     * <p>
     * For the HTTP and HTTPS protocols, the target is specified as
     * <code> <i>&lt;protocol&gt;</i>:<i>&lt;port&gt;</i>/<i>&lt;path to ping&gt;</i> </code>.
     * </p>
     * 
     * @param target
     *        The instance that is being checked. The target specifies the protocol and port. The available protocols
     *        are TCP, SSL, HTTP, and HTTPS. The range of valid ports is 1 through 65535.</p>
     *        <p>
     *        For the HTTP and HTTPS protocols, the target also specifies the ping path.
     *        </p>
     *        <p>
     *        For the TCP protocol, the target is specified as <code>TCP: <i>&lt;port&gt;</i> </code>.
     *        </p>
     *        <p>
     *        For the SSL protocol, the target is specified as <code>SSL.<i>&lt;port&gt;</i> </code>.
     *        </p>
     *        <p>
     *        For the HTTP and HTTPS protocols, the target is specified as
     *        <code> <i>&lt;protocol&gt;</i>:<i>&lt;port&gt;</i>/<i>&lt;path to ping&gt;</i> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerHealthCheck withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed health check.
     * </p>
     * 
     * @param timeout
     *        The amount of time, in seconds, during which no response means a failed health check.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed health check.
     * </p>
     * 
     * @return The amount of time, in seconds, during which no response means a failed health check.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed health check.
     * </p>
     * 
     * @param timeout
     *        The amount of time, in seconds, during which no response means a failed health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerHealthCheck withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health check failures that must occur before the instance is moved to the Unhealthy
     * state.
     * </p>
     * 
     * @param unhealthyThreshold
     *        The number of consecutive health check failures that must occur before the instance is moved to the
     *        Unhealthy state.
     */

    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive health check failures that must occur before the instance is moved to the Unhealthy
     * state.
     * </p>
     * 
     * @return The number of consecutive health check failures that must occur before the instance is moved to the
     *         Unhealthy state.
     */

    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive health check failures that must occur before the instance is moved to the Unhealthy
     * state.
     * </p>
     * 
     * @param unhealthyThreshold
     *        The number of consecutive health check failures that must occur before the instance is moved to the
     *        Unhealthy state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerHealthCheck withUnhealthyThreshold(Integer unhealthyThreshold) {
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
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
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

        if (obj instanceof AwsElbLoadBalancerHealthCheck == false)
            return false;
        AwsElbLoadBalancerHealthCheck other = (AwsElbLoadBalancerHealthCheck) obj;
        if (other.getHealthyThreshold() == null ^ this.getHealthyThreshold() == null)
            return false;
        if (other.getHealthyThreshold() != null && other.getHealthyThreshold().equals(this.getHealthyThreshold()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
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
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyThreshold() == null) ? 0 : getUnhealthyThreshold().hashCode());
        return hashCode;
    }

    @Override
    public AwsElbLoadBalancerHealthCheck clone() {
        try {
            return (AwsElbLoadBalancerHealthCheck) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElbLoadBalancerHealthCheckMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
