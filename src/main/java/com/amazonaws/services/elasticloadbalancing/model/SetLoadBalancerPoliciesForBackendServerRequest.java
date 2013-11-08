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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#setLoadBalancerPoliciesForBackendServer(SetLoadBalancerPoliciesForBackendServerRequest) SetLoadBalancerPoliciesForBackendServer operation}.
 * <p>
 * Replaces the current set of policies associated with a port on which the back-end server is listening with a new set of policies. After the policies
 * have been created using CreateLoadBalancerPolicy, they can be applied here as a list. At this time, only the back-end server authentication policy
 * type can be applied to the back-end ports; this policy type is composed of multiple public key policies.
 * </p>
 * <p>
 * <b>NOTE:</b> The SetLoadBalancerPoliciesForBackendServer replaces the current set of policies associated with the specified instance port. Every time
 * you use this action to enable the policies, use the PolicyNames parameter to list all the policies you want to enable.
 * </p>
 * <p>
 * You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies action to verify that the policy has been associated with the back-end server.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#setLoadBalancerPoliciesForBackendServer(SetLoadBalancerPoliciesForBackendServerRequest)
 */
public class SetLoadBalancerPoliciesForBackendServerRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The mnemonic name associated with the load balancer. This name must be
     * unique within the set of your load balancers.
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
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNames;

    /**
     * The mnemonic name associated with the load balancer. This name must be
     * unique within the set of your load balancers.
     *
     * @return The mnemonic name associated with the load balancer. This name must be
     *         unique within the set of your load balancers.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the load balancer. This name must be
     * unique within the set of your load balancers.
     *
     * @param loadBalancerName The mnemonic name associated with the load balancer. This name must be
     *         unique within the set of your load balancers.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the load balancer. This name must be
     * unique within the set of your load balancers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The mnemonic name associated with the load balancer. This name must be
     *         unique within the set of your load balancers.
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
              policyNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyNames.setAutoConstruct(true);
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
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
        policyNamesCopy.addAll(policyNames);
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
        if (getPolicyNames() == null) setPolicyNames(new java.util.ArrayList<String>(policyNames.length));
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
        if (getInstancePort() != null) sb.append("InstancePort: " + getInstancePort() + ",");
        if (getPolicyNames() != null) sb.append("PolicyNames: " + getPolicyNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getInstancePort() == null) ? 0 : getInstancePort().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetLoadBalancerPoliciesForBackendServerRequest == false) return false;
        SetLoadBalancerPoliciesForBackendServerRequest other = (SetLoadBalancerPoliciesForBackendServerRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getInstancePort() == null ^ this.getInstancePort() == null) return false;
        if (other.getInstancePort() != null && other.getInstancePort().equals(this.getInstancePort()) == false) return false; 
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null) return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false) return false; 
        return true;
    }
    
}
    