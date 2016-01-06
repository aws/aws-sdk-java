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
 * <p>
 * Information about a policy.
 * </p>
 */
public class PolicyDescription implements Serializable, Cloneable {

    /**
     * The name of the policy.
     */
    private String policyName;

    /**
     * The name of the policy type.
     */
    private String policyTypeName;

    /**
     * The policy attributes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttributeDescription> policyAttributeDescriptions;

    /**
     * The name of the policy.
     *
     * @return The name of the policy.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the policy.
     *
     * @param policyName The name of the policy.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyName The name of the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyDescription withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The name of the policy type.
     *
     * @return The name of the policy type.
     */
    public String getPolicyTypeName() {
        return policyTypeName;
    }
    
    /**
     * The name of the policy type.
     *
     * @param policyTypeName The name of the policy type.
     */
    public void setPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }
    
    /**
     * The name of the policy type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeName The name of the policy type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyDescription withPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
        return this;
    }

    /**
     * The policy attributes.
     *
     * @return The policy attributes.
     */
    public java.util.List<PolicyAttributeDescription> getPolicyAttributeDescriptions() {
        if (policyAttributeDescriptions == null) {
              policyAttributeDescriptions = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttributeDescription>();
              policyAttributeDescriptions.setAutoConstruct(true);
        }
        return policyAttributeDescriptions;
    }
    
    /**
     * The policy attributes.
     *
     * @param policyAttributeDescriptions The policy attributes.
     */
    public void setPolicyAttributeDescriptions(java.util.Collection<PolicyAttributeDescription> policyAttributeDescriptions) {
        if (policyAttributeDescriptions == null) {
            this.policyAttributeDescriptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttributeDescription> policyAttributeDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttributeDescription>(policyAttributeDescriptions.size());
        policyAttributeDescriptionsCopy.addAll(policyAttributeDescriptions);
        this.policyAttributeDescriptions = policyAttributeDescriptionsCopy;
    }
    
    /**
     * The policy attributes.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link
     * #setPolicyAttributeDescriptions(java.util.Collection)} or {@link
     * #withPolicyAttributeDescriptions(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributeDescriptions The policy attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyDescription withPolicyAttributeDescriptions(PolicyAttributeDescription... policyAttributeDescriptions) {
        if (getPolicyAttributeDescriptions() == null) setPolicyAttributeDescriptions(new java.util.ArrayList<PolicyAttributeDescription>(policyAttributeDescriptions.length));
        for (PolicyAttributeDescription value : policyAttributeDescriptions) {
            getPolicyAttributeDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * The policy attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributeDescriptions The policy attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyDescription withPolicyAttributeDescriptions(java.util.Collection<PolicyAttributeDescription> policyAttributeDescriptions) {
        if (policyAttributeDescriptions == null) {
            this.policyAttributeDescriptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttributeDescription> policyAttributeDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyAttributeDescription>(policyAttributeDescriptions.size());
            policyAttributeDescriptionsCopy.addAll(policyAttributeDescriptions);
            this.policyAttributeDescriptions = policyAttributeDescriptionsCopy;
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
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyTypeName() != null) sb.append("PolicyTypeName: " + getPolicyTypeName() + ",");
        if (getPolicyAttributeDescriptions() != null) sb.append("PolicyAttributeDescriptions: " + getPolicyAttributeDescriptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyTypeName() == null) ? 0 : getPolicyTypeName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyAttributeDescriptions() == null) ? 0 : getPolicyAttributeDescriptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PolicyDescription == false) return false;
        PolicyDescription other = (PolicyDescription)obj;
        
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getPolicyTypeName() == null ^ this.getPolicyTypeName() == null) return false;
        if (other.getPolicyTypeName() != null && other.getPolicyTypeName().equals(this.getPolicyTypeName()) == false) return false; 
        if (other.getPolicyAttributeDescriptions() == null ^ this.getPolicyAttributeDescriptions() == null) return false;
        if (other.getPolicyAttributeDescriptions() != null && other.getPolicyAttributeDescriptions().equals(this.getPolicyAttributeDescriptions()) == false) return false; 
        return true;
    }
    
    @Override
    public PolicyDescription clone() {
        try {
            return (PolicyDescription) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    