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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#deleteLoadBalancerPolicy(DeleteLoadBalancerPolicyRequest) DeleteLoadBalancerPolicy operation}.
 * <p>
 * Deletes a policy from the load balancer. The specified policy must not be enabled for any listeners.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#deleteLoadBalancerPolicy(DeleteLoadBalancerPolicyRequest)
 */
public class DeleteLoadBalancerPolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The mnemonic name associated with the load balancer.
     */
    private String loadBalancerName;

    /**
     * The mnemonic name for the policy being deleted.
     */
    private String policyName;

    /**
     * Default constructor for a new DeleteLoadBalancerPolicyRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteLoadBalancerPolicyRequest() {}
    
    /**
     * Constructs a new DeleteLoadBalancerPolicyRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The mnemonic name associated with the load
     * balancer.
     * @param policyName The mnemonic name for the policy being deleted.
     */
    public DeleteLoadBalancerPolicyRequest(String loadBalancerName, String policyName) {
        setLoadBalancerName(loadBalancerName);
        setPolicyName(policyName);
    }

    /**
     * The mnemonic name associated with the load balancer.
     *
     * @return The mnemonic name associated with the load balancer.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the load balancer.
     *
     * @param loadBalancerName The mnemonic name associated with the load balancer.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The mnemonic name associated with the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteLoadBalancerPolicyRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * The mnemonic name for the policy being deleted.
     *
     * @return The mnemonic name for the policy being deleted.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The mnemonic name for the policy being deleted.
     *
     * @param policyName The mnemonic name for the policy being deleted.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The mnemonic name for the policy being deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyName The mnemonic name for the policy being deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteLoadBalancerPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
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
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteLoadBalancerPolicyRequest == false) return false;
        DeleteLoadBalancerPolicyRequest other = (DeleteLoadBalancerPolicyRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        return true;
    }
    
}
    