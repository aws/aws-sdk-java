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
 * Contains information about a policy created by instantiating a policy template.
 * </p>
 * <p>
 * This
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/TemplateLinkedPolicyDefinitionItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateLinkedPolicyDefinitionItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the policy template used to create this policy.
     * </p>
     */
    private String policyTemplateId;
    /**
     * <p>
     * The principal associated with this template-linked policy. Verified Permissions substitutes this principal for
     * the <code>?principal</code> placeholder in the policy template when it evaluates an authorization request.
     * </p>
     */
    private EntityIdentifier principal;
    /**
     * <p>
     * The resource associated with this template-linked policy. Verified Permissions substitutes this resource for the
     * <code>?resource</code> placeholder in the policy template when it evaluates an authorization request.
     * </p>
     */
    private EntityIdentifier resource;

    /**
     * <p>
     * The unique identifier of the policy template used to create this policy.
     * </p>
     * 
     * @param policyTemplateId
     *        The unique identifier of the policy template used to create this policy.
     */

    public void setPolicyTemplateId(String policyTemplateId) {
        this.policyTemplateId = policyTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the policy template used to create this policy.
     * </p>
     * 
     * @return The unique identifier of the policy template used to create this policy.
     */

    public String getPolicyTemplateId() {
        return this.policyTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the policy template used to create this policy.
     * </p>
     * 
     * @param policyTemplateId
     *        The unique identifier of the policy template used to create this policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateLinkedPolicyDefinitionItem withPolicyTemplateId(String policyTemplateId) {
        setPolicyTemplateId(policyTemplateId);
        return this;
    }

    /**
     * <p>
     * The principal associated with this template-linked policy. Verified Permissions substitutes this principal for
     * the <code>?principal</code> placeholder in the policy template when it evaluates an authorization request.
     * </p>
     * 
     * @param principal
     *        The principal associated with this template-linked policy. Verified Permissions substitutes this principal
     *        for the <code>?principal</code> placeholder in the policy template when it evaluates an authorization
     *        request.
     */

    public void setPrincipal(EntityIdentifier principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal associated with this template-linked policy. Verified Permissions substitutes this principal for
     * the <code>?principal</code> placeholder in the policy template when it evaluates an authorization request.
     * </p>
     * 
     * @return The principal associated with this template-linked policy. Verified Permissions substitutes this
     *         principal for the <code>?principal</code> placeholder in the policy template when it evaluates an
     *         authorization request.
     */

    public EntityIdentifier getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The principal associated with this template-linked policy. Verified Permissions substitutes this principal for
     * the <code>?principal</code> placeholder in the policy template when it evaluates an authorization request.
     * </p>
     * 
     * @param principal
     *        The principal associated with this template-linked policy. Verified Permissions substitutes this principal
     *        for the <code>?principal</code> placeholder in the policy template when it evaluates an authorization
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateLinkedPolicyDefinitionItem withPrincipal(EntityIdentifier principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The resource associated with this template-linked policy. Verified Permissions substitutes this resource for the
     * <code>?resource</code> placeholder in the policy template when it evaluates an authorization request.
     * </p>
     * 
     * @param resource
     *        The resource associated with this template-linked policy. Verified Permissions substitutes this resource
     *        for the <code>?resource</code> placeholder in the policy template when it evaluates an authorization
     *        request.
     */

    public void setResource(EntityIdentifier resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource associated with this template-linked policy. Verified Permissions substitutes this resource for the
     * <code>?resource</code> placeholder in the policy template when it evaluates an authorization request.
     * </p>
     * 
     * @return The resource associated with this template-linked policy. Verified Permissions substitutes this resource
     *         for the <code>?resource</code> placeholder in the policy template when it evaluates an authorization
     *         request.
     */

    public EntityIdentifier getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource associated with this template-linked policy. Verified Permissions substitutes this resource for the
     * <code>?resource</code> placeholder in the policy template when it evaluates an authorization request.
     * </p>
     * 
     * @param resource
     *        The resource associated with this template-linked policy. Verified Permissions substitutes this resource
     *        for the <code>?resource</code> placeholder in the policy template when it evaluates an authorization
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateLinkedPolicyDefinitionItem withResource(EntityIdentifier resource) {
        setResource(resource);
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
        if (getPolicyTemplateId() != null)
            sb.append("PolicyTemplateId: ").append(getPolicyTemplateId()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateLinkedPolicyDefinitionItem == false)
            return false;
        TemplateLinkedPolicyDefinitionItem other = (TemplateLinkedPolicyDefinitionItem) obj;
        if (other.getPolicyTemplateId() == null ^ this.getPolicyTemplateId() == null)
            return false;
        if (other.getPolicyTemplateId() != null && other.getPolicyTemplateId().equals(this.getPolicyTemplateId()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyTemplateId() == null) ? 0 : getPolicyTemplateId().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        return hashCode;
    }

    @Override
    public TemplateLinkedPolicyDefinitionItem clone() {
        try {
            return (TemplateLinkedPolicyDefinitionItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.TemplateLinkedPolicyDefinitionItemMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
