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


/**
 * <p>
 * The output for the DescribeLoadBalancerPolicies action.
 * </p>
 */
public class DescribeLoadBalancerPoliciesResult implements Serializable {

    /**
     * A list of policy description structures.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDescription> policyDescriptions;

    /**
     * A list of policy description structures.
     *
     * @return A list of policy description structures.
     */
    public java.util.List<PolicyDescription> getPolicyDescriptions() {
        if (policyDescriptions == null) {
              policyDescriptions = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDescription>();
              policyDescriptions.setAutoConstruct(true);
        }
        return policyDescriptions;
    }
    
    /**
     * A list of policy description structures.
     *
     * @param policyDescriptions A list of policy description structures.
     */
    public void setPolicyDescriptions(java.util.Collection<PolicyDescription> policyDescriptions) {
        if (policyDescriptions == null) {
            this.policyDescriptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDescription> policyDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDescription>(policyDescriptions.size());
        policyDescriptionsCopy.addAll(policyDescriptions);
        this.policyDescriptions = policyDescriptionsCopy;
    }
    
    /**
     * A list of policy description structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyDescriptions A list of policy description structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoadBalancerPoliciesResult withPolicyDescriptions(PolicyDescription... policyDescriptions) {
        if (getPolicyDescriptions() == null) setPolicyDescriptions(new java.util.ArrayList<PolicyDescription>(policyDescriptions.length));
        for (PolicyDescription value : policyDescriptions) {
            getPolicyDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * A list of policy description structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyDescriptions A list of policy description structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoadBalancerPoliciesResult withPolicyDescriptions(java.util.Collection<PolicyDescription> policyDescriptions) {
        if (policyDescriptions == null) {
            this.policyDescriptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDescription> policyDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyDescription>(policyDescriptions.size());
            policyDescriptionsCopy.addAll(policyDescriptions);
            this.policyDescriptions = policyDescriptionsCopy;
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
        if (getPolicyDescriptions() != null) sb.append("PolicyDescriptions: " + getPolicyDescriptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyDescriptions() == null) ? 0 : getPolicyDescriptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLoadBalancerPoliciesResult == false) return false;
        DescribeLoadBalancerPoliciesResult other = (DescribeLoadBalancerPoliciesResult)obj;
        
        if (other.getPolicyDescriptions() == null ^ this.getPolicyDescriptions() == null) return false;
        if (other.getPolicyDescriptions() != null && other.getPolicyDescriptions().equals(this.getPolicyDescriptions()) == false) return false; 
        return true;
    }
    
}
    