/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#setLoadBalancerPoliciesForBackendServer(SetLoadBalancerPoliciesForBackendServerRequest) SetLoadBalancerPoliciesForBackendServer operation}.
 * <p>
 * Replaces the current set of policies associated with a port on which
 * the back-end server is listening with a new set of policies. After the
 * policies have been created using CreateLoadBalancerPolicy, they can be
 * applied here as a list. At this time, only the back-end server
 * authentication policy type can be applied to the back-end ports; this
 * policy type is composed of multiple public key policies.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#setLoadBalancerPoliciesForBackendServer(SetLoadBalancerPoliciesForBackendServerRequest)
 */
public class SetLoadBalancerPoliciesForBackendServerRequest extends AmazonWebServiceRequest {

    /**
     * The mnemonic name associated with the LoadBalancer. This name must be
     * unique within the client AWS account.
     */
    private String loadBalancerName;

    /**
     * The port number associated with the back-end server.
     */
    private Integer instancePort;

    /**
     * List of policy names to be set. If the list is empty, then all current
     * polices are removed from the back-end server.
     */
    private java.util.List<String> policyNames;

    /**
     * The mnemonic name associated with the LoadBalancer. This name must be
     * unique within the client AWS account.
     *
     * @return The mnemonic name associated with the LoadBalancer. This name must be
     *         unique within the client AWS account.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the LoadBalancer. This name must be
     * unique within the client AWS account.
     *
     * @param loadBalancerName The mnemonic name associated with the LoadBalancer. This name must be
     *         unique within the client AWS account.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the LoadBalancer. This name must be
     * unique within the client AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The mnemonic name associated with the LoadBalancer. This name must be
     *         unique within the client AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetLoadBalancerPoliciesForBackendServerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * The port number associated with the back-end server.
     *
     * @return The port number associated with the back-end server.
     */
    public Integer getInstancePort() {
        return instancePort;
    }
    
    /**
     * The port number associated with the back-end server.
     *
     * @param instancePort The port number associated with the back-end server.
     */
    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }
    
    /**
     * The port number associated with the back-end server.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instancePort The port number associated with the back-end server.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetLoadBalancerPoliciesForBackendServerRequest withInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    
    
    /**
     * List of policy names to be set. If the list is empty, then all current
     * polices are removed from the back-end server.
     *
     * @return List of policy names to be set. If the list is empty, then all current
     *         polices are removed from the back-end server.
     */
    public java.util.List<String> getPolicyNames() {
        
        if (policyNames == null) {
            policyNames = new java.util.ArrayList<String>();
        }
        return policyNames;
    }
    
    /**
     * List of policy names to be set. If the list is empty, then all current
     * polices are removed from the back-end server.
     *
     * @param policyNames List of policy names to be set. If the list is empty, then all current
     *         polices are removed from the back-end server.
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        java.util.List<String> policyNamesCopy = new java.util.ArrayList<String>();
        if (policyNames != null) {
            policyNamesCopy.addAll(policyNames);
        }
        this.policyNames = policyNamesCopy;
    }
    
    /**
     * List of policy names to be set. If the list is empty, then all current
     * polices are removed from the back-end server.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames List of policy names to be set. If the list is empty, then all current
     *         polices are removed from the back-end server.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetLoadBalancerPoliciesForBackendServerRequest withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) setPolicyNames(new java.util.ArrayList<String>());
        for (String value : policyNames) {
            getPolicyNames().add(value);
        }
        return this;
    }
    
    /**
     * List of policy names to be set. If the list is empty, then all current
     * polices are removed from the back-end server.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames List of policy names to be set. If the list is empty, then all current
     *         polices are removed from the back-end server.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetLoadBalancerPoliciesForBackendServerRequest withPolicyNames(java.util.Collection<String> policyNames) {
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
        sb.append("InstancePort: " + instancePort + ", ");
        sb.append("PolicyNames: " + policyNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    