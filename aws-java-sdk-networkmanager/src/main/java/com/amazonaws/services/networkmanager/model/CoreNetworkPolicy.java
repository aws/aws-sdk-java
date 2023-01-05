/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a core network policy. You can have only one LIVE Core Policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CoreNetworkPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a core network.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The ID of the policy version.
     * </p>
     */
    private Integer policyVersionId;
    /**
     * <p>
     * Whether a core network policy is the current LIVE policy or the most recently submitted policy.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The description of a core network policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The timestamp when a core network policy was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The state of a core network policy.
     * </p>
     */
    private String changeSetState;
    /**
     * <p>
     * Describes any errors in a core network policy.
     * </p>
     */
    private java.util.List<CoreNetworkPolicyError> policyErrors;
    /**
     * <p>
     * Describes a core network policy.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @return The ID of a core network.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkPolicy withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the policy version.
     * </p>
     * 
     * @param policyVersionId
     *        The ID of the policy version.
     */

    public void setPolicyVersionId(Integer policyVersionId) {
        this.policyVersionId = policyVersionId;
    }

    /**
     * <p>
     * The ID of the policy version.
     * </p>
     * 
     * @return The ID of the policy version.
     */

    public Integer getPolicyVersionId() {
        return this.policyVersionId;
    }

    /**
     * <p>
     * The ID of the policy version.
     * </p>
     * 
     * @param policyVersionId
     *        The ID of the policy version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkPolicy withPolicyVersionId(Integer policyVersionId) {
        setPolicyVersionId(policyVersionId);
        return this;
    }

    /**
     * <p>
     * Whether a core network policy is the current LIVE policy or the most recently submitted policy.
     * </p>
     * 
     * @param alias
     *        Whether a core network policy is the current LIVE policy or the most recently submitted policy.
     * @see CoreNetworkPolicyAlias
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * Whether a core network policy is the current LIVE policy or the most recently submitted policy.
     * </p>
     * 
     * @return Whether a core network policy is the current LIVE policy or the most recently submitted policy.
     * @see CoreNetworkPolicyAlias
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * Whether a core network policy is the current LIVE policy or the most recently submitted policy.
     * </p>
     * 
     * @param alias
     *        Whether a core network policy is the current LIVE policy or the most recently submitted policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreNetworkPolicyAlias
     */

    public CoreNetworkPolicy withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * Whether a core network policy is the current LIVE policy or the most recently submitted policy.
     * </p>
     * 
     * @param alias
     *        Whether a core network policy is the current LIVE policy or the most recently submitted policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreNetworkPolicyAlias
     */

    public CoreNetworkPolicy withAlias(CoreNetworkPolicyAlias alias) {
        this.alias = alias.toString();
        return this;
    }

    /**
     * <p>
     * The description of a core network policy.
     * </p>
     * 
     * @param description
     *        The description of a core network policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a core network policy.
     * </p>
     * 
     * @return The description of a core network policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a core network policy.
     * </p>
     * 
     * @param description
     *        The description of a core network policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkPolicy withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The timestamp when a core network policy was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when a core network policy was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when a core network policy was created.
     * </p>
     * 
     * @return The timestamp when a core network policy was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when a core network policy was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when a core network policy was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkPolicy withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The state of a core network policy.
     * </p>
     * 
     * @param changeSetState
     *        The state of a core network policy.
     * @see ChangeSetState
     */

    public void setChangeSetState(String changeSetState) {
        this.changeSetState = changeSetState;
    }

    /**
     * <p>
     * The state of a core network policy.
     * </p>
     * 
     * @return The state of a core network policy.
     * @see ChangeSetState
     */

    public String getChangeSetState() {
        return this.changeSetState;
    }

    /**
     * <p>
     * The state of a core network policy.
     * </p>
     * 
     * @param changeSetState
     *        The state of a core network policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeSetState
     */

    public CoreNetworkPolicy withChangeSetState(String changeSetState) {
        setChangeSetState(changeSetState);
        return this;
    }

    /**
     * <p>
     * The state of a core network policy.
     * </p>
     * 
     * @param changeSetState
     *        The state of a core network policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeSetState
     */

    public CoreNetworkPolicy withChangeSetState(ChangeSetState changeSetState) {
        this.changeSetState = changeSetState.toString();
        return this;
    }

    /**
     * <p>
     * Describes any errors in a core network policy.
     * </p>
     * 
     * @return Describes any errors in a core network policy.
     */

    public java.util.List<CoreNetworkPolicyError> getPolicyErrors() {
        return policyErrors;
    }

    /**
     * <p>
     * Describes any errors in a core network policy.
     * </p>
     * 
     * @param policyErrors
     *        Describes any errors in a core network policy.
     */

    public void setPolicyErrors(java.util.Collection<CoreNetworkPolicyError> policyErrors) {
        if (policyErrors == null) {
            this.policyErrors = null;
            return;
        }

        this.policyErrors = new java.util.ArrayList<CoreNetworkPolicyError>(policyErrors);
    }

    /**
     * <p>
     * Describes any errors in a core network policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyErrors(java.util.Collection)} or {@link #withPolicyErrors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyErrors
     *        Describes any errors in a core network policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkPolicy withPolicyErrors(CoreNetworkPolicyError... policyErrors) {
        if (this.policyErrors == null) {
            setPolicyErrors(new java.util.ArrayList<CoreNetworkPolicyError>(policyErrors.length));
        }
        for (CoreNetworkPolicyError ele : policyErrors) {
            this.policyErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes any errors in a core network policy.
     * </p>
     * 
     * @param policyErrors
     *        Describes any errors in a core network policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkPolicy withPolicyErrors(java.util.Collection<CoreNetworkPolicyError> policyErrors) {
        setPolicyErrors(policyErrors);
        return this;
    }

    /**
     * <p>
     * Describes a core network policy.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param policyDocument
     *        Describes a core network policy.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * Describes a core network policy.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return Describes a core network policy.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * Describes a core network policy.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param policyDocument
     *        Describes a core network policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkPolicy withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getPolicyVersionId() != null)
            sb.append("PolicyVersionId: ").append(getPolicyVersionId()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getChangeSetState() != null)
            sb.append("ChangeSetState: ").append(getChangeSetState()).append(",");
        if (getPolicyErrors() != null)
            sb.append("PolicyErrors: ").append(getPolicyErrors()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoreNetworkPolicy == false)
            return false;
        CoreNetworkPolicy other = (CoreNetworkPolicy) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getPolicyVersionId() == null ^ this.getPolicyVersionId() == null)
            return false;
        if (other.getPolicyVersionId() != null && other.getPolicyVersionId().equals(this.getPolicyVersionId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getChangeSetState() == null ^ this.getChangeSetState() == null)
            return false;
        if (other.getChangeSetState() != null && other.getChangeSetState().equals(this.getChangeSetState()) == false)
            return false;
        if (other.getPolicyErrors() == null ^ this.getPolicyErrors() == null)
            return false;
        if (other.getPolicyErrors() != null && other.getPolicyErrors().equals(this.getPolicyErrors()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getPolicyVersionId() == null) ? 0 : getPolicyVersionId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getChangeSetState() == null) ? 0 : getChangeSetState().hashCode());
        hashCode = prime * hashCode + ((getPolicyErrors() == null) ? 0 : getPolicyErrors().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        return hashCode;
    }

    @Override
    public CoreNetworkPolicy clone() {
        try {
            return (CoreNetworkPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.CoreNetworkPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
