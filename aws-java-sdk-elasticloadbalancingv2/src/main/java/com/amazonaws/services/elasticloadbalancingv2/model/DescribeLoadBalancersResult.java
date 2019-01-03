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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeLoadBalancers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLoadBalancersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the load balancers.
     * </p>
     */
    private java.util.List<LoadBalancer> loadBalancers;
    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * Information about the load balancers.
     * </p>
     * 
     * @return Information about the load balancers.
     */

    public java.util.List<LoadBalancer> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * <p>
     * Information about the load balancers.
     * </p>
     * 
     * @param loadBalancers
     *        Information about the load balancers.
     */

    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new java.util.ArrayList<LoadBalancer>(loadBalancers);
    }

    /**
     * <p>
     * Information about the load balancers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancers(java.util.Collection)} or {@link #withLoadBalancers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param loadBalancers
     *        Information about the load balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancersResult withLoadBalancers(LoadBalancer... loadBalancers) {
        if (this.loadBalancers == null) {
            setLoadBalancers(new java.util.ArrayList<LoadBalancer>(loadBalancers.length));
        }
        for (LoadBalancer ele : loadBalancers) {
            this.loadBalancers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the load balancers.
     * </p>
     * 
     * @param loadBalancers
     *        Information about the load balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancersResult withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @param nextMarker
     *        The marker to use when requesting the next set of results. If there are no additional results, the string
     *        is empty.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @return The marker to use when requesting the next set of results. If there are no additional results, the string
     *         is empty.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @param nextMarker
     *        The marker to use when requesting the next set of results. If there are no additional results, the string
     *        is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBalancersResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getLoadBalancers() != null)
            sb.append("LoadBalancers: ").append(getLoadBalancers()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBalancersResult == false)
            return false;
        DescribeLoadBalancersResult other = (DescribeLoadBalancersResult) obj;
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLoadBalancersResult clone() {
        try {
            return (DescribeLoadBalancersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
