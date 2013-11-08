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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#setLoadBalancerPoliciesOfListener(SetLoadBalancerPoliciesOfListenerRequest) SetLoadBalancerPoliciesOfListener operation}.
 * <p>
 * Associates, updates, or disables a policy with a listener on the load balancer. You can associate multiple policies with a listener.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#setLoadBalancerPoliciesOfListener(SetLoadBalancerPoliciesOfListenerRequest)
 */
public class SetLoadBalancerPoliciesOfListenerRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the load balancer.
     */
    private String loadBalancerName;

    /**
     * The external port of the load balancer to associate the policy.
     */
    private Integer loadBalancerPort;

    /**
     * List of policies to be associated with the listener. If the list is
     * empty, the current policy is removed from the listener.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNames;

    /**
     * Default constructor for a new SetLoadBalancerPoliciesOfListenerRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SetLoadBalancerPoliciesOfListenerRequest() {}
    
    /**
     * Constructs a new SetLoadBalancerPoliciesOfListenerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancerPort The external port of the load balancer to
     * associate the policy.
     * @param policyNames List of policies to be associated with the
     * listener. If the list is empty, the current policy is removed from the
     * listener.
     */
    public SetLoadBalancerPoliciesOfListenerRequest(String loadBalancerName, Integer loadBalancerPort, java.util.List<String> policyNames) {
        setLoadBalancerName(loadBalancerName);
        setLoadBalancerPort(loadBalancerPort);
        setPolicyNames(policyNames);
    }

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
    public SetLoadBalancerPoliciesOfListenerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * The external port of the load balancer to associate the policy.
     *
     * @return The external port of the load balancer to associate the policy.
     */
    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }
    
    /**
     * The external port of the load balancer to associate the policy.
     *
     * @param loadBalancerPort The external port of the load balancer to associate the policy.
     */
    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }
    
    /**
     * The external port of the load balancer to associate the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerPort The external port of the load balancer to associate the policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetLoadBalancerPoliciesOfListenerRequest withLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
        return this;
    }

    /**
     * List of policies to be associated with the listener. If the list is
     * empty, the current policy is removed from the listener.
     *
     * @return List of policies to be associated with the listener. If the list is
     *         empty, the current policy is removed from the listener.
     */
    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
              policyNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyNames.setAutoConstruct(true);
        }
        return policyNames;
    }
    
    /**
     * List of policies to be associated with the listener. If the list is
     * empty, the current policy is removed from the listener.
     *
     * @param policyNames List of policies to be associated with the listener. If the list is
     *         empty, the current policy is removed from the listener.
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
     * List of policies to be associated with the listener. If the list is
     * empty, the current policy is removed from the listener.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames List of policies to be associated with the listener. If the list is
     *         empty, the current policy is removed from the listener.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetLoadBalancerPoliciesOfListenerRequest withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) setPolicyNames(new java.util.ArrayList<String>(policyNames.length));
        for (String value : policyNames) {
            getPolicyNames().add(value);
        }
        return this;
    }
    
    /**
     * List of policies to be associated with the listener. If the list is
     * empty, the current policy is removed from the listener.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames List of policies to be associated with the listener. If the list is
     *         empty, the current policy is removed from the listener.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetLoadBalancerPoliciesOfListenerRequest withPolicyNames(java.util.Collection<String> policyNames) {
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
        if (getLoadBalancerPort() != null) sb.append("LoadBalancerPort: " + getLoadBalancerPort() + ",");
        if (getPolicyNames() != null) sb.append("PolicyNames: " + getPolicyNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getLoadBalancerPort() == null) ? 0 : getLoadBalancerPort().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetLoadBalancerPoliciesOfListenerRequest == false) return false;
        SetLoadBalancerPoliciesOfListenerRequest other = (SetLoadBalancerPoliciesOfListenerRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getLoadBalancerPort() == null ^ this.getLoadBalancerPort() == null) return false;
        if (other.getLoadBalancerPort() != null && other.getLoadBalancerPort().equals(this.getLoadBalancerPort()) == false) return false; 
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null) return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false) return false; 
        return true;
    }
    
}
    