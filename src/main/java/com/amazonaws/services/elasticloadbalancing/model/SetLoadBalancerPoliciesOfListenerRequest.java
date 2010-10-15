/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#setLoadBalancerPoliciesOfListener(SetLoadBalancerPoliciesOfListenerRequest) SetLoadBalancerPoliciesOfListener operation}.
 * <p>
 * Associates, updates, or disables a policy with a listener on the load
 * balancer. Currently only zero (0) or one (1) policy can be associated
 * with a listener.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#setLoadBalancerPoliciesOfListener(SetLoadBalancerPoliciesOfListenerRequest)
 */
public class SetLoadBalancerPoliciesOfListenerRequest extends AmazonWebServiceRequest {

    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     */
    private String loadBalancerName;

    /**
     * The external port of the LoadBalancer with which this policy has to be
     * associated.
     */
    private Integer loadBalancerPort;

    /**
     * List of policies to be associated with the listener. Currently this
     * list can have at most one policy. If the list is empty, the current
     * policy is removed from the listener.
     */
    private java.util.List<String> policyNames;

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
     * @param loadBalancerName The name associated with the LoadBalancer. The
     * name must be unique within the client AWS account.
     * @param loadBalancerPort The external port of the LoadBalancer with
     * which this policy has to be associated.
     * @param policyNames List of policies to be associated with the
     * listener. Currently this list can have at most one policy. If the list
     * is empty, the current policy is removed from the listener.
     */
    public SetLoadBalancerPoliciesOfListenerRequest(String loadBalancerName, Integer loadBalancerPort, java.util.List<String> policyNames) {
        this.loadBalancerName = loadBalancerName;
        this.loadBalancerPort = loadBalancerPort;
        this.policyNames = policyNames;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     *
     * @return The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetLoadBalancerPoliciesOfListenerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * The external port of the LoadBalancer with which this policy has to be
     * associated.
     *
     * @return The external port of the LoadBalancer with which this policy has to be
     *         associated.
     */
    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }
    
    /**
     * The external port of the LoadBalancer with which this policy has to be
     * associated.
     *
     * @param loadBalancerPort The external port of the LoadBalancer with which this policy has to be
     *         associated.
     */
    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }
    
    /**
     * The external port of the LoadBalancer with which this policy has to be
     * associated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerPort The external port of the LoadBalancer with which this policy has to be
     *         associated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetLoadBalancerPoliciesOfListenerRequest withLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
        return this;
    }
    
    
    /**
     * List of policies to be associated with the listener. Currently this
     * list can have at most one policy. If the list is empty, the current
     * policy is removed from the listener.
     *
     * @return List of policies to be associated with the listener. Currently this
     *         list can have at most one policy. If the list is empty, the current
     *         policy is removed from the listener.
     */
    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
            policyNames = new java.util.ArrayList<String>();
        }
        return policyNames;
    }
    
    /**
     * List of policies to be associated with the listener. Currently this
     * list can have at most one policy. If the list is empty, the current
     * policy is removed from the listener.
     *
     * @param policyNames List of policies to be associated with the listener. Currently this
     *         list can have at most one policy. If the list is empty, the current
     *         policy is removed from the listener.
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        java.util.List<String> policyNamesCopy = new java.util.ArrayList<String>();
        if (policyNames != null) {
            policyNamesCopy.addAll(policyNames);
        }
        this.policyNames = policyNamesCopy;
    }
    
    /**
     * List of policies to be associated with the listener. Currently this
     * list can have at most one policy. If the list is empty, the current
     * policy is removed from the listener.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames List of policies to be associated with the listener. Currently this
     *         list can have at most one policy. If the list is empty, the current
     *         policy is removed from the listener.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetLoadBalancerPoliciesOfListenerRequest withPolicyNames(String... policyNames) {
        for (String value : policyNames) {
            getPolicyNames().add(value);
        }
        return this;
    }
    
    /**
     * List of policies to be associated with the listener. Currently this
     * list can have at most one policy. If the list is empty, the current
     * policy is removed from the listener.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames List of policies to be associated with the listener. Currently this
     *         list can have at most one policy. If the list is empty, the current
     *         policy is removed from the listener.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetLoadBalancerPoliciesOfListenerRequest withPolicyNames(java.util.Collection<String> policyNames) {
        java.util.List<String> policyNamesCopy = new java.util.ArrayList<String>();
        if (policyNames != null) {
            policyNamesCopy.addAll(policyNames);
        }
        this.policyNames = policyNamesCopy;

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
        sb.append("LoadBalancerName: " + loadBalancerName + ", ");
        sb.append("LoadBalancerPort: " + loadBalancerPort + ", ");
        sb.append("PolicyNames: " + policyNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    