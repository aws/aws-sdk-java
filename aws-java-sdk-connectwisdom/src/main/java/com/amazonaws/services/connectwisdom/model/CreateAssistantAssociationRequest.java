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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateAssistantAssociation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssistantAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String assistantId;
    /**
     * <p>
     * The identifier of the associated resource.
     * </p>
     */
    private AssistantAssociationInputData association;
    /**
     * <p>
     * The type of association.
     * </p>
     */
    private String associationType;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @return The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssistantAssociationRequest withAssistantId(String assistantId) {
        setAssistantId(assistantId);
        return this;
    }

    /**
     * <p>
     * The identifier of the associated resource.
     * </p>
     * 
     * @param association
     *        The identifier of the associated resource.
     */

    public void setAssociation(AssistantAssociationInputData association) {
        this.association = association;
    }

    /**
     * <p>
     * The identifier of the associated resource.
     * </p>
     * 
     * @return The identifier of the associated resource.
     */

    public AssistantAssociationInputData getAssociation() {
        return this.association;
    }

    /**
     * <p>
     * The identifier of the associated resource.
     * </p>
     * 
     * @param association
     *        The identifier of the associated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssistantAssociationRequest withAssociation(AssistantAssociationInputData association) {
        setAssociation(association);
        return this;
    }

    /**
     * <p>
     * The type of association.
     * </p>
     * 
     * @param associationType
     *        The type of association.
     * @see AssociationType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * The type of association.
     * </p>
     * 
     * @return The type of association.
     * @see AssociationType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * The type of association.
     * </p>
     * 
     * @param associationType
     *        The type of association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationType
     */

    public CreateAssistantAssociationRequest withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * The type of association.
     * </p>
     * 
     * @param associationType
     *        The type of association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationType
     */

    public CreateAssistantAssociationRequest withAssociationType(AssociationType associationType) {
        this.associationType = associationType.toString();
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssistantAssociationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssistantAssociationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAssistantAssociationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssistantAssociationRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssistantAssociationRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAssistantId() != null)
            sb.append("AssistantId: ").append(getAssistantId()).append(",");
        if (getAssociation() != null)
            sb.append("Association: ").append(getAssociation()).append(",");
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssistantAssociationRequest == false)
            return false;
        CreateAssistantAssociationRequest other = (CreateAssistantAssociationRequest) obj;
        if (other.getAssistantId() == null ^ this.getAssistantId() == null)
            return false;
        if (other.getAssistantId() != null && other.getAssistantId().equals(this.getAssistantId()) == false)
            return false;
        if (other.getAssociation() == null ^ this.getAssociation() == null)
            return false;
        if (other.getAssociation() != null && other.getAssociation().equals(this.getAssociation()) == false)
            return false;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssistantId() == null) ? 0 : getAssistantId().hashCode());
        hashCode = prime * hashCode + ((getAssociation() == null) ? 0 : getAssociation().hashCode());
        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssistantAssociationRequest clone() {
        return (CreateAssistantAssociationRequest) super.clone();
    }

}
