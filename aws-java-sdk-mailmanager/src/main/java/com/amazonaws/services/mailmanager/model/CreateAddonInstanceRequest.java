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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateAddonInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAddonInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of a previously created subscription that an Add On instance is created for. You can only have one
     * instance per subscription.
     * </p>
     */
    private String addonSubscriptionId;
    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The unique ID of a previously created subscription that an Add On instance is created for. You can only have one
     * instance per subscription.
     * </p>
     * 
     * @param addonSubscriptionId
     *        The unique ID of a previously created subscription that an Add On instance is created for. You can only
     *        have one instance per subscription.
     */

    public void setAddonSubscriptionId(String addonSubscriptionId) {
        this.addonSubscriptionId = addonSubscriptionId;
    }

    /**
     * <p>
     * The unique ID of a previously created subscription that an Add On instance is created for. You can only have one
     * instance per subscription.
     * </p>
     * 
     * @return The unique ID of a previously created subscription that an Add On instance is created for. You can only
     *         have one instance per subscription.
     */

    public String getAddonSubscriptionId() {
        return this.addonSubscriptionId;
    }

    /**
     * <p>
     * The unique ID of a previously created subscription that an Add On instance is created for. You can only have one
     * instance per subscription.
     * </p>
     * 
     * @param addonSubscriptionId
     *        The unique ID of a previously created subscription that an Add On instance is created for. You can only
     *        have one instance per subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonInstanceRequest withAddonSubscriptionId(String addonSubscriptionId) {
        setAddonSubscriptionId(addonSubscriptionId);
        return this;
    }

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     * 
     * @return A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonInstanceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for the resource. For example, { "tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for the resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
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
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for the resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonInstanceRequest withTags(Tag... tags) {
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
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for the resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAddonInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAddonSubscriptionId() != null)
            sb.append("AddonSubscriptionId: ").append(getAddonSubscriptionId()).append(",");
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

        if (obj instanceof CreateAddonInstanceRequest == false)
            return false;
        CreateAddonInstanceRequest other = (CreateAddonInstanceRequest) obj;
        if (other.getAddonSubscriptionId() == null ^ this.getAddonSubscriptionId() == null)
            return false;
        if (other.getAddonSubscriptionId() != null && other.getAddonSubscriptionId().equals(this.getAddonSubscriptionId()) == false)
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

        hashCode = prime * hashCode + ((getAddonSubscriptionId() == null) ? 0 : getAddonSubscriptionId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAddonInstanceRequest clone() {
        return (CreateAddonInstanceRequest) super.clone();
    }

}
