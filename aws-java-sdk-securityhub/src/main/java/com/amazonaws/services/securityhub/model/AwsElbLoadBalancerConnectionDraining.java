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
 * Contains information about the connection draining configuration for the load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElbLoadBalancerConnectionDraining"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLoadBalancerConnectionDraining implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether connection draining is enabled for the load balancer.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The maximum time, in seconds, to keep the existing connections open before deregistering the instances.
     * </p>
     */
    private Integer timeout;

    /**
     * <p>
     * Indicates whether connection draining is enabled for the load balancer.
     * </p>
     * 
     * @param enabled
     *        Indicates whether connection draining is enabled for the load balancer.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether connection draining is enabled for the load balancer.
     * </p>
     * 
     * @return Indicates whether connection draining is enabled for the load balancer.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether connection draining is enabled for the load balancer.
     * </p>
     * 
     * @param enabled
     *        Indicates whether connection draining is enabled for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerConnectionDraining withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether connection draining is enabled for the load balancer.
     * </p>
     * 
     * @return Indicates whether connection draining is enabled for the load balancer.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The maximum time, in seconds, to keep the existing connections open before deregistering the instances.
     * </p>
     * 
     * @param timeout
     *        The maximum time, in seconds, to keep the existing connections open before deregistering the instances.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, to keep the existing connections open before deregistering the instances.
     * </p>
     * 
     * @return The maximum time, in seconds, to keep the existing connections open before deregistering the instances.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The maximum time, in seconds, to keep the existing connections open before deregistering the instances.
     * </p>
     * 
     * @param timeout
     *        The maximum time, in seconds, to keep the existing connections open before deregistering the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerConnectionDraining withTimeout(Integer timeout) {
        setTimeout(timeout);
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
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElbLoadBalancerConnectionDraining == false)
            return false;
        AwsElbLoadBalancerConnectionDraining other = (AwsElbLoadBalancerConnectionDraining) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        return hashCode;
    }

    @Override
    public AwsElbLoadBalancerConnectionDraining clone() {
        try {
            return (AwsElbLoadBalancerConnectionDraining) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElbLoadBalancerConnectionDrainingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
