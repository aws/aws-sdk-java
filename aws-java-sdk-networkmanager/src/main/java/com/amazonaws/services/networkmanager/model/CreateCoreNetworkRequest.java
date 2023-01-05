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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateCoreNetwork" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCoreNetworkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network that a core network will be a part of.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The description of a core network.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Key-value tags associated with a core network request.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The policy document for creating a core network.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * The client token associated with a core network request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the global network that a core network will be a part of.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network that a core network will be a part of.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network that a core network will be a part of.
     * </p>
     * 
     * @return The ID of the global network that a core network will be a part of.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network that a core network will be a part of.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network that a core network will be a part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreNetworkRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The description of a core network.
     * </p>
     * 
     * @param description
     *        The description of a core network.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a core network.
     * </p>
     * 
     * @return The description of a core network.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a core network.
     * </p>
     * 
     * @param description
     *        The description of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreNetworkRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Key-value tags associated with a core network request.
     * </p>
     * 
     * @return Key-value tags associated with a core network request.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value tags associated with a core network request.
     * </p>
     * 
     * @param tags
     *        Key-value tags associated with a core network request.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Key-value tags associated with a core network request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value tags associated with a core network request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreNetworkRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key-value tags associated with a core network request.
     * </p>
     * 
     * @param tags
     *        Key-value tags associated with a core network request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreNetworkRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The policy document for creating a core network.
     * </p>
     * 
     * @param policyDocument
     *        The policy document for creating a core network.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The policy document for creating a core network.
     * </p>
     * 
     * @return The policy document for creating a core network.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The policy document for creating a core network.
     * </p>
     * 
     * @param policyDocument
     *        The policy document for creating a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreNetworkRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * The client token associated with a core network request.
     * </p>
     * 
     * @param clientToken
     *        The client token associated with a core network request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token associated with a core network request.
     * </p>
     * 
     * @return The client token associated with a core network request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token associated with a core network request.
     * </p>
     * 
     * @param clientToken
     *        The client token associated with a core network request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreNetworkRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCoreNetworkRequest == false)
            return false;
        CreateCoreNetworkRequest other = (CreateCoreNetworkRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateCoreNetworkRequest clone() {
        return (CreateCoreNetworkRequest) super.clone();
    }

}
