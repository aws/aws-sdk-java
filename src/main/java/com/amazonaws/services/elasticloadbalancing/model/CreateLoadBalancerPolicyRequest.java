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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancerPolicy(CreateLoadBalancerPolicyRequest) CreateLoadBalancerPolicy operation}.
 * <p>
 * Creates a new policy that contains the necessary attributes depending on the policy type. Policies are settings that are saved for your load balancer
 * and that can be applied to the front-end listener, or the back-end application server, depending on your policy type.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancerPolicy(CreateLoadBalancerPolicyRequest)
 */
public class CreateLoadBalancerPolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name associated with the LoadBalancer for which the policy is
     * being created.
     */
    private String loadBalancerName;

    /**
     * The name of the load balancer policy being created. The name must be
     * unique within the set of policies for this load balancer.
     */
    private String policyName;

    /**
     * The name of the base policy type being used to create this policy. To
     * get the list of policy types, use the
     * <a>DescribeLoadBalancerPolicyTypes</a> action.
     */
    private String policyTypeName;

    /**
     * A list of attributes associated with the policy being created.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttribute> policyAttributes;

    /**
     * The name associated with the LoadBalancer for which the policy is
     * being created.
     *
     * @return The name associated with the LoadBalancer for which the policy is
     *         being created.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer for which the policy is
     * being created.
     *
     * @param loadBalancerName The name associated with the LoadBalancer for which the policy is
     *         being created.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer for which the policy is
     * being created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the LoadBalancer for which the policy is
     *         being created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLoadBalancerPolicyRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * The name of the load balancer policy being created. The name must be
     * unique within the set of policies for this load balancer.
     *
     * @return The name of the load balancer policy being created. The name must be
     *         unique within the set of policies for this load balancer.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the load balancer policy being created. The name must be
     * unique within the set of policies for this load balancer.
     *
     * @param policyName The name of the load balancer policy being created. The name must be
     *         unique within the set of policies for this load balancer.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the load balancer policy being created. The name must be
     * unique within the set of policies for this load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyName The name of the load balancer policy being created. The name must be
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
     * The name of the base policy type being used to create this policy. To
     * get the list of policy types, use the
     * <a>DescribeLoadBalancerPolicyTypes</a> action.
     *
     * @return The name of the base policy type being used to create this policy. To
     *         get the list of policy types, use the
     *         <a>DescribeLoadBalancerPolicyTypes</a> action.
     */
    public String getPolicyTypeName() {
        return policyTypeName;
    }
    
    /**
     * The name of the base policy type being used to create this policy. To
     * get the list of policy types, use the
     * <a>DescribeLoadBalancerPolicyTypes</a> action.
     *
     * @param policyTypeName The name of the base policy type being used to create this policy. To
     *         get the list of policy types, use the
     *         <a>DescribeLoadBalancerPolicyTypes</a> action.
     */
    public void setPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }
    
    /**
     * The name of the base policy type being used to create this policy. To
     * get the list of policy types, use the
     * <a>DescribeLoadBalancerPolicyTypes</a> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeName The name of the base policy type being used to create this policy. To
     *         get the list of policy types, use the
     *         <a>DescribeLoadBalancerPolicyTypes</a> action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLoadBalancerPolicyRequest withPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
        return this;
    }

    /**
     * A list of attributes associated with the policy being created.
     *
     * @return A list of attributes associated with the policy being created.
     */
    public java.util.List<PolicyAttribute> getPolicyAttributes() {
        if (policyAttributes == null) {
              policyAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttribute>();
              policyAttributes.setAutoConstruct(true);
        }
        return policyAttributes;
    }
    
    /**
     * A list of attributes associated with the policy being created.
     *
     * @param policyAttributes A list of attributes associated with the policy being created.
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
     * A list of attributes associated with the policy being created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributes A list of attributes associated with the policy being created.
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
     * A list of attributes associated with the policy being created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributes A list of attributes associated with the policy being created.
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
    
}
    