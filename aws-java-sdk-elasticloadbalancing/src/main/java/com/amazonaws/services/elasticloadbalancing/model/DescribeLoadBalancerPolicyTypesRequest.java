/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancerPolicyTypes(DescribeLoadBalancerPolicyTypesRequest) DescribeLoadBalancerPolicyTypes operation}.
 * <p>
 * Describes the specified load balancer policy types.
 * </p>
 * <p>
 * You can use these policy types with CreateLoadBalancerPolicy to create
 * policy configurations for a load balancer.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancerPolicyTypes(DescribeLoadBalancerPolicyTypesRequest)
 */
public class DescribeLoadBalancerPolicyTypesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The names of the policy types. If no names are specified, describes
     * all policy types defined by Elastic Load Balancing.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyTypeNames;

    /**
     * The names of the policy types. If no names are specified, describes
     * all policy types defined by Elastic Load Balancing.
     *
     * @return The names of the policy types. If no names are specified, describes
     *         all policy types defined by Elastic Load Balancing.
     */
    public java.util.List<String> getPolicyTypeNames() {
        if (policyTypeNames == null) {
              policyTypeNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyTypeNames.setAutoConstruct(true);
        }
        return policyTypeNames;
    }
    
    /**
     * The names of the policy types. If no names are specified, describes
     * all policy types defined by Elastic Load Balancing.
     *
     * @param policyTypeNames The names of the policy types. If no names are specified, describes
     *         all policy types defined by Elastic Load Balancing.
     */
    public void setPolicyTypeNames(java.util.Collection<String> policyTypeNames) {
        if (policyTypeNames == null) {
            this.policyTypeNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> policyTypeNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyTypeNames.size());
        policyTypeNamesCopy.addAll(policyTypeNames);
        this.policyTypeNames = policyTypeNamesCopy;
    }
    
    /**
     * The names of the policy types. If no names are specified, describes
     * all policy types defined by Elastic Load Balancing.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyTypeNames(java.util.Collection)} or {@link
     * #withPolicyTypeNames(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeNames The names of the policy types. If no names are specified, describes
     *         all policy types defined by Elastic Load Balancing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancerPolicyTypesRequest withPolicyTypeNames(String... policyTypeNames) {
        if (getPolicyTypeNames() == null) setPolicyTypeNames(new java.util.ArrayList<String>(policyTypeNames.length));
        for (String value : policyTypeNames) {
            getPolicyTypeNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of the policy types. If no names are specified, describes
     * all policy types defined by Elastic Load Balancing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeNames The names of the policy types. If no names are specified, describes
     *         all policy types defined by Elastic Load Balancing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancerPolicyTypesRequest withPolicyTypeNames(java.util.Collection<String> policyTypeNames) {
        if (policyTypeNames == null) {
            this.policyTypeNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> policyTypeNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyTypeNames.size());
            policyTypeNamesCopy.addAll(policyTypeNames);
            this.policyTypeNames = policyTypeNamesCopy;
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
        if (getPolicyTypeNames() != null) sb.append("PolicyTypeNames: " + getPolicyTypeNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyTypeNames() == null) ? 0 : getPolicyTypeNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLoadBalancerPolicyTypesRequest == false) return false;
        DescribeLoadBalancerPolicyTypesRequest other = (DescribeLoadBalancerPolicyTypesRequest)obj;
        
        if (other.getPolicyTypeNames() == null ^ this.getPolicyTypeNames() == null) return false;
        if (other.getPolicyTypeNames() != null && other.getPolicyTypeNames().equals(this.getPolicyTypeNames()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeLoadBalancerPolicyTypesRequest clone() {
        
            return (DescribeLoadBalancerPolicyTypesRequest) super.clone();
    }

}
    