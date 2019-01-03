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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the <code>ConnectionDraining</code> attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/ConnectionDraining"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionDraining implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether connection draining is enabled for the load balancer.
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
     * Specifies whether connection draining is enabled for the load balancer.
     * </p>
     * 
     * @param enabled
     *        Specifies whether connection draining is enabled for the load balancer.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether connection draining is enabled for the load balancer.
     * </p>
     * 
     * @return Specifies whether connection draining is enabled for the load balancer.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether connection draining is enabled for the load balancer.
     * </p>
     * 
     * @param enabled
     *        Specifies whether connection draining is enabled for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionDraining withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether connection draining is enabled for the load balancer.
     * </p>
     * 
     * @return Specifies whether connection draining is enabled for the load balancer.
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

    public ConnectionDraining withTimeout(Integer timeout) {
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

        if (obj instanceof ConnectionDraining == false)
            return false;
        ConnectionDraining other = (ConnectionDraining) obj;
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
    public ConnectionDraining clone() {
        try {
            return (ConnectionDraining) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
