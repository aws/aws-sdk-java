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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for DetachLoadBalancerFromSubnets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/DetachLoadBalancerFromSubnets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachLoadBalancerFromSubnetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnets;

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @return The name of the load balancer.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachLoadBalancerFromSubnetsRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     * 
     * @return The IDs of the subnets.
     */

    public java.util.List<String> getSubnets() {
        if (subnets == null) {
            subnets = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnets;
    }

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     * 
     * @param subnets
     *        The IDs of the subnets.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new com.amazonaws.internal.SdkInternalList<String>(subnets);
    }

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The IDs of the subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachLoadBalancerFromSubnetsRequest withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new com.amazonaws.internal.SdkInternalList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     * 
     * @param subnets
     *        The IDs of the subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachLoadBalancerFromSubnetsRequest withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachLoadBalancerFromSubnetsRequest == false)
            return false;
        DetachLoadBalancerFromSubnetsRequest other = (DetachLoadBalancerFromSubnetsRequest) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        return hashCode;
    }

    @Override
    public DetachLoadBalancerFromSubnetsRequest clone() {
        return (DetachLoadBalancerFromSubnetsRequest) super.clone();
    }

}
