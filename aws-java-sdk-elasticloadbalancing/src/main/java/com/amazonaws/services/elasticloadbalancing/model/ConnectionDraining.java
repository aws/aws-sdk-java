/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>ConnectionDraining</code> data type.
 * </p>
 */
public class ConnectionDraining implements Serializable {

    /**
     * Specifies whether connection draining is enabled for the load
     * balancer.
     */
    private Boolean enabled;

    /**
     * Specifies the maximum time (in seconds) to keep the existing
     * connections open before deregistering the instances.
     */
    private Integer timeout;

    /**
     * Specifies whether connection draining is enabled for the load
     * balancer.
     *
     * @return Specifies whether connection draining is enabled for the load
     *         balancer.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Specifies whether connection draining is enabled for the load
     * balancer.
     *
     * @param enabled Specifies whether connection draining is enabled for the load
     *         balancer.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Specifies whether connection draining is enabled for the load
     * balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Specifies whether connection draining is enabled for the load
     *         balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConnectionDraining withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Specifies whether connection draining is enabled for the load
     * balancer.
     *
     * @return Specifies whether connection draining is enabled for the load
     *         balancer.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Specifies the maximum time (in seconds) to keep the existing
     * connections open before deregistering the instances.
     *
     * @return Specifies the maximum time (in seconds) to keep the existing
     *         connections open before deregistering the instances.
     */
    public Integer getTimeout() {
        return timeout;
    }
    
    /**
     * Specifies the maximum time (in seconds) to keep the existing
     * connections open before deregistering the instances.
     *
     * @param timeout Specifies the maximum time (in seconds) to keep the existing
     *         connections open before deregistering the instances.
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
    
    /**
     * Specifies the maximum time (in seconds) to keep the existing
     * connections open before deregistering the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeout Specifies the maximum time (in seconds) to keep the existing
     *         connections open before deregistering the instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConnectionDraining withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() + ",");
        if (getTimeout() != null) sb.append("Timeout: " + getTimeout() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConnectionDraining == false) return false;
        ConnectionDraining other = (ConnectionDraining)obj;
        
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getTimeout() == null ^ this.getTimeout() == null) return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false) return false; 
        return true;
    }
    
}
    