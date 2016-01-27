/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancerPolicies(DescribeLoadBalancerPoliciesRequest) DescribeLoadBalancerPolicies operation}.
 * <p>
 * Describes the specified policies.
 * </p>
 * <p>
 * If you specify a load balancer name, the action returns the
 * descriptions of all policies created for the load balancer. If you
 * specify a policy name associated with your load balancer, the action
 * returns the description of that policy. If you don't specify a load
 * balancer name, the action returns descriptions of the specified sample
 * policies, or descriptions of all sample policies. The names of the
 * sample policies have the <code>ELBSample-</code> prefix.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancerPolicies(DescribeLoadBalancerPoliciesRequest)
 */
public class DescribeLoadBalancerPoliciesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the load balancer.
     */
    private String loadBalancerName;

    /**
     * The names of the policies.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNames;

    /**
     * The name of the load balancer.
     *
     * @return The name of the load balancer.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name of the load balancer.
     *
     * @param loadBalancerName The name of the load balancer.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name of the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name of the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancerPoliciesRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * The names of the policies.
     *
     * @return The names of the policies.
     */
    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
              policyNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyNames.setAutoConstruct(true);
        }
        return policyNames;
    }
    
    /**
     * The names of the policies.
     *
     * @param policyNames The names of the policies.
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
        policyNamesCopy.addAll(policyNames);
        this.policyNames = policyNamesCopy;
    }
    
    /**
     * The names of the policies.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyNames(java.util.Collection)} or {@link
     * #withPolicyNames(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames The names of the policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancerPoliciesRequest withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) setPolicyNames(new java.util.ArrayList<String>(policyNames.length));
        for (String value : policyNames) {
            getPolicyNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of the policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames The names of the policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancerPoliciesRequest withPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
            policyNamesCopy.addAll(policyNames);
            this.policyNames = policyNamesCopy;
        }

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
        if (getLoadBalancerName() != null) sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getPolicyNames() != null) sb.append("PolicyNames: " + getPolicyNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLoadBalancerPoliciesRequest == false) return false;
        DescribeLoadBalancerPoliciesRequest other = (DescribeLoadBalancerPoliciesRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null) return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeLoadBalancerPoliciesRequest clone() {
        
            return (DescribeLoadBalancerPoliciesRequest) super.clone();
    }

}
    