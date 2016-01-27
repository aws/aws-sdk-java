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

/**
 * 
 */
public class DescribeLoadBalancerPolicyTypesResult implements Serializable, Cloneable {

    /**
     * Information about the policy types.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PolicyTypeDescription> policyTypeDescriptions;

    /**
     * Information about the policy types.
     *
     * @return Information about the policy types.
     */
    public java.util.List<PolicyTypeDescription> getPolicyTypeDescriptions() {
        if (policyTypeDescriptions == null) {
              policyTypeDescriptions = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyTypeDescription>();
              policyTypeDescriptions.setAutoConstruct(true);
        }
        return policyTypeDescriptions;
    }
    
    /**
     * Information about the policy types.
     *
     * @param policyTypeDescriptions Information about the policy types.
     */
    public void setPolicyTypeDescriptions(java.util.Collection<PolicyTypeDescription> policyTypeDescriptions) {
        if (policyTypeDescriptions == null) {
            this.policyTypeDescriptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PolicyTypeDescription> policyTypeDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyTypeDescription>(policyTypeDescriptions.size());
        policyTypeDescriptionsCopy.addAll(policyTypeDescriptions);
        this.policyTypeDescriptions = policyTypeDescriptionsCopy;
    }
    
    /**
     * Information about the policy types.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyTypeDescriptions(java.util.Collection)} or
     * {@link #withPolicyTypeDescriptions(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeDescriptions Information about the policy types.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancerPolicyTypesResult withPolicyTypeDescriptions(PolicyTypeDescription... policyTypeDescriptions) {
        if (getPolicyTypeDescriptions() == null) setPolicyTypeDescriptions(new java.util.ArrayList<PolicyTypeDescription>(policyTypeDescriptions.length));
        for (PolicyTypeDescription value : policyTypeDescriptions) {
            getPolicyTypeDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * Information about the policy types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeDescriptions Information about the policy types.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancerPolicyTypesResult withPolicyTypeDescriptions(java.util.Collection<PolicyTypeDescription> policyTypeDescriptions) {
        if (policyTypeDescriptions == null) {
            this.policyTypeDescriptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PolicyTypeDescription> policyTypeDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyTypeDescription>(policyTypeDescriptions.size());
            policyTypeDescriptionsCopy.addAll(policyTypeDescriptions);
            this.policyTypeDescriptions = policyTypeDescriptionsCopy;
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
        if (getPolicyTypeDescriptions() != null) sb.append("PolicyTypeDescriptions: " + getPolicyTypeDescriptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyTypeDescriptions() == null) ? 0 : getPolicyTypeDescriptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLoadBalancerPolicyTypesResult == false) return false;
        DescribeLoadBalancerPolicyTypesResult other = (DescribeLoadBalancerPolicyTypesResult)obj;
        
        if (other.getPolicyTypeDescriptions() == null ^ this.getPolicyTypeDescriptions() == null) return false;
        if (other.getPolicyTypeDescriptions() != null && other.getPolicyTypeDescriptions().equals(this.getPolicyTypeDescriptions()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeLoadBalancerPolicyTypesResult clone() {
        try {
            return (DescribeLoadBalancerPolicyTypesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    