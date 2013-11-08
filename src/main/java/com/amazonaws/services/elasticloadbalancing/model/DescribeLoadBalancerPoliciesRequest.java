/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Returns detailed descriptions of the policies. If you specify a load balancer name, the action returns the descriptions of all the policies created
 * for the load balancer. If you specify a policy name associated with your load balancer, the action returns the description of that policy. If you
 * don't specify a load balancer name, the action returns descriptions of the specified sample policies, or descriptions of all the sample policies. The
 * names of the sample policies have the <code>ELBSample-</code> prefix.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancerPolicies(DescribeLoadBalancerPoliciesRequest)
 */
public class DescribeLoadBalancerPoliciesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The mnemonic name associated with the load balancer. If no name is
     * specified, the operation returns the attributes of either all the
     * sample policies pre-defined by Elastic Load Balancing or the specified
     * sample polices.
     */
    private String loadBalancerName;

    /**
     * The names of load balancer policies you've created or Elastic Load
     * Balancing sample policy names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNames;

    /**
     * The mnemonic name associated with the load balancer. If no name is
     * specified, the operation returns the attributes of either all the
     * sample policies pre-defined by Elastic Load Balancing or the specified
     * sample polices.
     *
     * @return The mnemonic name associated with the load balancer. If no name is
     *         specified, the operation returns the attributes of either all the
     *         sample policies pre-defined by Elastic Load Balancing or the specified
     *         sample polices.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the load balancer. If no name is
     * specified, the operation returns the attributes of either all the
     * sample policies pre-defined by Elastic Load Balancing or the specified
     * sample polices.
     *
     * @param loadBalancerName The mnemonic name associated with the load balancer. If no name is
     *         specified, the operation returns the attributes of either all the
     *         sample policies pre-defined by Elastic Load Balancing or the specified
     *         sample polices.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the load balancer. If no name is
     * specified, the operation returns the attributes of either all the
     * sample policies pre-defined by Elastic Load Balancing or the specified
     * sample polices.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The mnemonic name associated with the load balancer. If no name is
     *         specified, the operation returns the attributes of either all the
     *         sample policies pre-defined by Elastic Load Balancing or the specified
     *         sample polices.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoadBalancerPoliciesRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * The names of load balancer policies you've created or Elastic Load
     * Balancing sample policy names.
     *
     * @return The names of load balancer policies you've created or Elastic Load
     *         Balancing sample policy names.
     */
    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
              policyNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyNames.setAutoConstruct(true);
        }
        return policyNames;
    }
    
    /**
     * The names of load balancer policies you've created or Elastic Load
     * Balancing sample policy names.
     *
     * @param policyNames The names of load balancer policies you've created or Elastic Load
     *         Balancing sample policy names.
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
     * The names of load balancer policies you've created or Elastic Load
     * Balancing sample policy names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames The names of load balancer policies you've created or Elastic Load
     *         Balancing sample policy names.
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
     * The names of load balancer policies you've created or Elastic Load
     * Balancing sample policy names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames The names of load balancer policies you've created or Elastic Load
     *         Balancing sample policy names.
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
    
}
    