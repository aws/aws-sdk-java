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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeLoadBalancerAttributes.
 * </p>
 */
public class DescribeLoadBalancerAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the load balancer attributes.
     * </p>
     */
    private LoadBalancerAttributes loadBalancerAttributes;

    /**
     * <p>
     * Information about the load balancer attributes.
     * </p>
     * 
     * @param loadBalancerAttributes
     *        Information about the load balancer attributes.
     */

    public void setLoadBalancerAttributes(LoadBalancerAttributes loadBalancerAttributes) {
        this.loadBalancerAttributes = loadBalancerAttributes;
    }

    /**
     * <p>
     * Information about the load balancer attributes.
     * </p>
     * 
     * @return Information about the load balancer attributes.
     */

    public LoadBalancerAttributes getLoadBalancerAttributes() {
        return this.loadBalancerAttributes;
    }

    /**
     * <p>
     * Information about the load balancer attributes.
     * </p>
     * 
     * @param loadBalancerAttributes
     *        Information about the load balancer attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancerAttributesResult withLoadBalancerAttributes(LoadBalancerAttributes loadBalancerAttributes) {
        setLoadBalancerAttributes(loadBalancerAttributes);
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
        if (getLoadBalancerAttributes() != null)
            sb.append("LoadBalancerAttributes: " + getLoadBalancerAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBalancerAttributesResult == false)
            return false;
        DescribeLoadBalancerAttributesResult other = (DescribeLoadBalancerAttributesResult) obj;
        if (other.getLoadBalancerAttributes() == null ^ this.getLoadBalancerAttributes() == null)
            return false;
        if (other.getLoadBalancerAttributes() != null && other.getLoadBalancerAttributes().equals(this.getLoadBalancerAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerAttributes() == null) ? 0 : getLoadBalancerAttributes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLoadBalancerAttributesResult clone() {
        try {
            return (DescribeLoadBalancerAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
