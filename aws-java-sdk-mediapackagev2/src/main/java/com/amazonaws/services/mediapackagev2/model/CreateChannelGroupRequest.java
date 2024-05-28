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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateChannelGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region. You can't use spaces in the name. You can't change the name after you
     * create the channel group.
     * </p>
     */
    private String channelGroupName;
    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Enter any descriptive text that helps you to identify the channel group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A comma-separated list of tag key:value pairs that you define. For example:
     * </p>
     * <p>
     * <code>"Key1": "Value1",</code>
     * </p>
     * <p>
     * <code>"Key2": "Value2"</code>
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region. You can't use spaces in the name. You can't change the name after you
     * create the channel group.
     * </p>
     * 
     * @param channelGroupName
     *        The name that describes the channel group. The name is the primary identifier for the channel group, and
     *        must be unique for your account in the AWS Region. You can't use spaces in the name. You can't change the
     *        name after you create the channel group.
     */

    public void setChannelGroupName(String channelGroupName) {
        this.channelGroupName = channelGroupName;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region. You can't use spaces in the name. You can't change the name after you
     * create the channel group.
     * </p>
     * 
     * @return The name that describes the channel group. The name is the primary identifier for the channel group, and
     *         must be unique for your account in the AWS Region. You can't use spaces in the name. You can't change the
     *         name after you create the channel group.
     */

    public String getChannelGroupName() {
        return this.channelGroupName;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region. You can't use spaces in the name. You can't change the name after you
     * create the channel group.
     * </p>
     * 
     * @param channelGroupName
     *        The name that describes the channel group. The name is the primary identifier for the channel group, and
     *        must be unique for your account in the AWS Region. You can't use spaces in the name. You can't change the
     *        name after you create the channel group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelGroupRequest withChannelGroupName(String channelGroupName) {
        setChannelGroupName(channelGroupName);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelGroupRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Enter any descriptive text that helps you to identify the channel group.
     * </p>
     * 
     * @param description
     *        Enter any descriptive text that helps you to identify the channel group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Enter any descriptive text that helps you to identify the channel group.
     * </p>
     * 
     * @return Enter any descriptive text that helps you to identify the channel group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Enter any descriptive text that helps you to identify the channel group.
     * </p>
     * 
     * @param description
     *        Enter any descriptive text that helps you to identify the channel group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of tag key:value pairs that you define. For example:
     * </p>
     * <p>
     * <code>"Key1": "Value1",</code>
     * </p>
     * <p>
     * <code>"Key2": "Value2"</code>
     * </p>
     * 
     * @return A comma-separated list of tag key:value pairs that you define. For example:</p>
     *         <p>
     *         <code>"Key1": "Value1",</code>
     *         </p>
     *         <p>
     *         <code>"Key2": "Value2"</code>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A comma-separated list of tag key:value pairs that you define. For example:
     * </p>
     * <p>
     * <code>"Key1": "Value1",</code>
     * </p>
     * <p>
     * <code>"Key2": "Value2"</code>
     * </p>
     * 
     * @param tags
     *        A comma-separated list of tag key:value pairs that you define. For example:</p>
     *        <p>
     *        <code>"Key1": "Value1",</code>
     *        </p>
     *        <p>
     *        <code>"Key2": "Value2"</code>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A comma-separated list of tag key:value pairs that you define. For example:
     * </p>
     * <p>
     * <code>"Key1": "Value1",</code>
     * </p>
     * <p>
     * <code>"Key2": "Value2"</code>
     * </p>
     * 
     * @param tags
     *        A comma-separated list of tag key:value pairs that you define. For example:</p>
     *        <p>
     *        <code>"Key1": "Value1",</code>
     *        </p>
     *        <p>
     *        <code>"Key2": "Value2"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelGroupRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateChannelGroupRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelGroupRequest addTagsEntry(String key, String value) {
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

    public CreateChannelGroupRequest clearTagsEntries() {
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
        if (getChannelGroupName() != null)
            sb.append("ChannelGroupName: ").append(getChannelGroupName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateChannelGroupRequest == false)
            return false;
        CreateChannelGroupRequest other = (CreateChannelGroupRequest) obj;
        if (other.getChannelGroupName() == null ^ this.getChannelGroupName() == null)
            return false;
        if (other.getChannelGroupName() != null && other.getChannelGroupName().equals(this.getChannelGroupName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getChannelGroupName() == null) ? 0 : getChannelGroupName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelGroupRequest clone() {
        return (CreateChannelGroupRequest) super.clone();
    }

}
