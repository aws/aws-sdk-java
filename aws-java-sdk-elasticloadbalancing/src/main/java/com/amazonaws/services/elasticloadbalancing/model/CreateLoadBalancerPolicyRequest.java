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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancerPolicy(CreateLoadBalancerPolicyRequest) CreateLoadBalancerPolicy operation}.
 * <p>
 * Creates a policy with the specified attributes for the specified load
 * balancer.
 * </p>
 * <p>
 * Policies are settings that are saved for your load balancer and that
 * can be applied to the front-end listener or the back-end application
 * server, depending on the policy type.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancerPolicy(CreateLoadBalancerPolicyRequest)
 */
public class CreateLoadBalancerPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the load balancer.
     */
    private String loadBalancerName;

    /**
     * The name of the load balancer policy to be created. This name must be
     * unique within the set of policies for this load balancer.
     */
    private String policyName;

    /**
     * The name of the base policy type. To get the list of policy types, use
     * <a>DescribeLoadBalancerPolicyTypes</a>.
     */
    private String policyTypeName;

    /**
     * The attributes for the policy.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttribute> policyAttributes;

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
    public CreateLoadBalancerPolicyRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * The name of the load balancer policy to be created. This name must be
     * unique within the set of policies for this load balancer.
     *
     * @return The name of the load balancer policy to be created. This name must be
     *         unique within the set of policies for this load balancer.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the load balancer policy to be created. This name must be
     * unique within the set of policies for this load balancer.
     *
     * @param policyName The name of the load balancer policy to be created. This name must be
     *         unique within the set of policies for this load balancer.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the load balancer policy to be created. This name must be
     * unique within the set of policies for this load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyName The name of the load balancer policy to be created. This name must be
     *         unique within the set of policies for this load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The name of the base policy type. To get the list of policy types, use
     * <a>DescribeLoadBalancerPolicyTypes</a>.
     *
     * @return The name of the base policy type. To get the list of policy types, use
     *         <a>DescribeLoadBalancerPolicyTypes</a>.
     */
    public String getPolicyTypeName() {
        return policyTypeName;
    }
    
    /**
     * The name of the base policy type. To get the list of policy types, use
     * <a>DescribeLoadBalancerPolicyTypes</a>.
     *
     * @param policyTypeName The name of the base policy type. To get the list of policy types, use
     *         <a>DescribeLoadBalancerPolicyTypes</a>.
     */
    public void setPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }
    
    /**
     * The name of the base policy type. To get the list of policy types, use
     * <a>DescribeLoadBalancerPolicyTypes</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeName The name of the base policy type. To get the list of policy types, use
     *         <a>DescribeLoadBalancerPolicyTypes</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerPolicyRequest withPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
        return this;
    }

    /**
     * The attributes for the policy.
     *
     * @return The attributes for the policy.
     */
    public java.util.List<PolicyAttribute> getPolicyAttributes() {
        if (policyAttributes == null) {
              policyAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttribute>();
              policyAttributes.setAutoConstruct(true);
        }
        return policyAttributes;
    }
    
    /**
     * The attributes for the policy.
     *
     * @param policyAttributes The attributes for the policy.
     */
    public void setPolicyAttributes(java.util.Collection<PolicyAttribute> policyAttributes) {
        if (policyAttributes == null) {
            this.policyAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttribute> policyAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttribute>(policyAttributes.size());
        policyAttributesCopy.addAll(policyAttributes);
        this.policyAttributes = policyAttributesCopy;
    }
    
    /**
     * The attributes for the policy.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyAttributes(java.util.Collection)} or {@link
     * #withPolicyAttributes(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributes The attributes for the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerPolicyRequest withPolicyAttributes(PolicyAttribute... policyAttributes) {
        if (getPolicyAttributes() == null) setPolicyAttributes(new java.util.ArrayList<PolicyAttribute>(policyAttributes.length));
        for (PolicyAttribute value : policyAttributes) {
            getPolicyAttributes().add(value);
        }
        return this;
    }
    
    /**
     * The attributes for the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributes The attributes for the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerPolicyRequest withPolicyAttributes(java.util.Collection<PolicyAttribute> policyAttributes) {
        if (policyAttributes == null) {
            this.policyAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttribute> policyAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttribute>(policyAttributes.size());
            policyAttributesCopy.addAll(policyAttributes);
            this.policyAttributes = policyAttributesCopy;
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
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyTypeName() != null) sb.append("PolicyTypeName: " + getPolicyTypeName() + ",");
        if (getPolicyAttributes() != null) sb.append("PolicyAttributes: " + getPolicyAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyTypeName() == null) ? 0 : getPolicyTypeName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyAttributes() == null) ? 0 : getPolicyAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateLoadBalancerPolicyRequest == false) return false;
        CreateLoadBalancerPolicyRequest other = (CreateLoadBalancerPolicyRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getPolicyTypeName() == null ^ this.getPolicyTypeName() == null) return false;
        if (other.getPolicyTypeName() != null && other.getPolicyTypeName().equals(this.getPolicyTypeName()) == false) return false; 
        if (other.getPolicyAttributes() == null ^ this.getPolicyAttributes() == null) return false;
        if (other.getPolicyAttributes() != null && other.getPolicyAttributes().equals(this.getPolicyAttributes()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateLoadBalancerPolicyRequest clone() {
        
            return (CreateLoadBalancerPolicyRequest) super.clone();
    }

}
    