/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a filter to refine policies returned in a query.
 * </p>
 * <p>
 * This data type is used as a response parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListPolicies.html">ListPolicies</a>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/PolicyFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters the output to only policies that reference the specified principal.
     * </p>
     */
    private EntityReference principal;
    /**
     * <p>
     * Filters the output to only policies that reference the specified resource.
     * </p>
     */
    private EntityReference resource;
    /**
     * <p>
     * Filters the output to only policies of the specified type.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * Filters the output to only template-linked policies that were instantiated from the specified policy template.
     * </p>
     */
    private String policyTemplateId;

    /**
     * <p>
     * Filters the output to only policies that reference the specified principal.
     * </p>
     * 
     * @param principal
     *        Filters the output to only policies that reference the specified principal.
     */

    public void setPrincipal(EntityReference principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * Filters the output to only policies that reference the specified principal.
     * </p>
     * 
     * @return Filters the output to only policies that reference the specified principal.
     */

    public EntityReference getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * Filters the output to only policies that reference the specified principal.
     * </p>
     * 
     * @param principal
     *        Filters the output to only policies that reference the specified principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyFilter withPrincipal(EntityReference principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * Filters the output to only policies that reference the specified resource.
     * </p>
     * 
     * @param resource
     *        Filters the output to only policies that reference the specified resource.
     */

    public void setResource(EntityReference resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * Filters the output to only policies that reference the specified resource.
     * </p>
     * 
     * @return Filters the output to only policies that reference the specified resource.
     */

    public EntityReference getResource() {
        return this.resource;
    }

    /**
     * <p>
     * Filters the output to only policies that reference the specified resource.
     * </p>
     * 
     * @param resource
     *        Filters the output to only policies that reference the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyFilter withResource(EntityReference resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * Filters the output to only policies of the specified type.
     * </p>
     * 
     * @param policyType
     *        Filters the output to only policies of the specified type.
     * @see PolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * Filters the output to only policies of the specified type.
     * </p>
     * 
     * @return Filters the output to only policies of the specified type.
     * @see PolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * Filters the output to only policies of the specified type.
     * </p>
     * 
     * @param policyType
     *        Filters the output to only policies of the specified type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PolicyFilter withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * Filters the output to only policies of the specified type.
     * </p>
     * 
     * @param policyType
     *        Filters the output to only policies of the specified type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PolicyFilter withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * <p>
     * Filters the output to only template-linked policies that were instantiated from the specified policy template.
     * </p>
     * 
     * @param policyTemplateId
     *        Filters the output to only template-linked policies that were instantiated from the specified policy
     *        template.
     */

    public void setPolicyTemplateId(String policyTemplateId) {
        this.policyTemplateId = policyTemplateId;
    }

    /**
     * <p>
     * Filters the output to only template-linked policies that were instantiated from the specified policy template.
     * </p>
     * 
     * @return Filters the output to only template-linked policies that were instantiated from the specified policy
     *         template.
     */

    public String getPolicyTemplateId() {
        return this.policyTemplateId;
    }

    /**
     * <p>
     * Filters the output to only template-linked policies that were instantiated from the specified policy template.
     * </p>
     * 
     * @param policyTemplateId
     *        Filters the output to only template-linked policies that were instantiated from the specified policy
     *        template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyFilter withPolicyTemplateId(String policyTemplateId) {
        setPolicyTemplateId(policyTemplateId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getPolicyTemplateId() != null)
            sb.append("PolicyTemplateId: ").append(getPolicyTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyFilter == false)
            return false;
        PolicyFilter other = (PolicyFilter) obj;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getPolicyTemplateId() == null ^ this.getPolicyTemplateId() == null)
            return false;
        if (other.getPolicyTemplateId() != null && other.getPolicyTemplateId().equals(this.getPolicyTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getPolicyTemplateId() == null) ? 0 : getPolicyTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public PolicyFilter clone() {
        try {
            return (PolicyFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.PolicyFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
