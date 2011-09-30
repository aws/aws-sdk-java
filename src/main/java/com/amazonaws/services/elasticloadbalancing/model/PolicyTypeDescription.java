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

/**
 * <p>
 * The PolicyTypeDescription data type.
 * </p>
 */
public class PolicyTypeDescription {

    /**
     * The name of the policy type.
     */
    private String policyTypeName;

    /**
     * A human-readable description of the policy type.
     */
    private String description;

    /**
     * The description of the policy attributes associated with the
     * LoadBalancer policies defined by the Elastic Load Balancing service.
     */
    private java.util.List<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions;

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
    public PolicyTypeDescription withPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
        return this;
    }
    
    
    /**
     * A human-readable description of the policy type.
     *
     * @return A human-readable description of the policy type.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A human-readable description of the policy type.
     *
     * @param description A human-readable description of the policy type.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A human-readable description of the policy type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A human-readable description of the policy type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PolicyTypeDescription withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * The description of the policy attributes associated with the
     * LoadBalancer policies defined by the Elastic Load Balancing service.
     *
     * @return The description of the policy attributes associated with the
     *         LoadBalancer policies defined by the Elastic Load Balancing service.
     */
    public java.util.List<PolicyAttributeTypeDescription> getPolicyAttributeTypeDescriptions() {
        
        if (policyAttributeTypeDescriptions == null) {
            policyAttributeTypeDescriptions = new java.util.ArrayList<PolicyAttributeTypeDescription>();
        }
        return policyAttributeTypeDescriptions;
    }
    
    /**
     * The description of the policy attributes associated with the
     * LoadBalancer policies defined by the Elastic Load Balancing service.
     *
     * @param policyAttributeTypeDescriptions The description of the policy attributes associated with the
     *         LoadBalancer policies defined by the Elastic Load Balancing service.
     */
    public void setPolicyAttributeTypeDescriptions(java.util.Collection<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions) {
        java.util.List<PolicyAttributeTypeDescription> policyAttributeTypeDescriptionsCopy = new java.util.ArrayList<PolicyAttributeTypeDescription>();
        if (policyAttributeTypeDescriptions != null) {
            policyAttributeTypeDescriptionsCopy.addAll(policyAttributeTypeDescriptions);
        }
        this.policyAttributeTypeDescriptions = policyAttributeTypeDescriptionsCopy;
    }
    
    /**
     * The description of the policy attributes associated with the
     * LoadBalancer policies defined by the Elastic Load Balancing service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributeTypeDescriptions The description of the policy attributes associated with the
     *         LoadBalancer policies defined by the Elastic Load Balancing service.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PolicyTypeDescription withPolicyAttributeTypeDescriptions(PolicyAttributeTypeDescription... policyAttributeTypeDescriptions) {
        if (getPolicyAttributeTypeDescriptions() == null) setPolicyAttributeTypeDescriptions(new java.util.ArrayList<PolicyAttributeTypeDescription>());
        for (PolicyAttributeTypeDescription value : policyAttributeTypeDescriptions) {
            getPolicyAttributeTypeDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * The description of the policy attributes associated with the
     * LoadBalancer policies defined by the Elastic Load Balancing service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyAttributeTypeDescriptions The description of the policy attributes associated with the
     *         LoadBalancer policies defined by the Elastic Load Balancing service.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PolicyTypeDescription withPolicyAttributeTypeDescriptions(java.util.Collection<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions) {
        java.util.List<PolicyAttributeTypeDescription> policyAttributeTypeDescriptionsCopy = new java.util.ArrayList<PolicyAttributeTypeDescription>();
        if (policyAttributeTypeDescriptions != null) {
            policyAttributeTypeDescriptionsCopy.addAll(policyAttributeTypeDescriptions);
        }
        this.policyAttributeTypeDescriptions = policyAttributeTypeDescriptionsCopy;

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
        sb.append("PolicyTypeName: " + policyTypeName + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("PolicyAttributeTypeDescriptions: " + policyAttributeTypeDescriptions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    