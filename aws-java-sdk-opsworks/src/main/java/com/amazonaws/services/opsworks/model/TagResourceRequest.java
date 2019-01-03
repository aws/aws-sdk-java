/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The stack or layer's Amazon Resource Number (ARN).
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a stack or layer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 40 tags is allowed for any resource.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;

    /**
     * <p>
     * The stack or layer's Amazon Resource Number (ARN).
     * </p>
     * 
     * @param resourceArn
     *        The stack or layer's Amazon Resource Number (ARN).
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The stack or layer's Amazon Resource Number (ARN).
     * </p>
     * 
     * @return The stack or layer's Amazon Resource Number (ARN).
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The stack or layer's Amazon Resource Number (ARN).
     * </p>
     * 
     * @param resourceArn
     *        The stack or layer's Amazon Resource Number (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a stack or layer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 40 tags is allowed for any resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A map that contains tag keys and tag values that are attached to a stack or layer.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key cannot be empty.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators,
     *         or the following special characters: <code>+ - = . _ : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or
     *         the following special characters: <code>+ - = . _ : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Leading and trailing white spaces are trimmed from both the key and value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A maximum of 40 tags is allowed for any resource.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a stack or layer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 40 tags is allowed for any resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to a stack or layer.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The key cannot be empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators,
     *        or the following special characters: <code>+ - = . _ : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or
     *        the following special characters: <code>+ - = . _ : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Leading and trailing white spaces are trimmed from both the key and value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A maximum of 40 tags is allowed for any resource.
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a stack or layer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 40 tags is allowed for any resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to a stack or layer.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The key cannot be empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators,
     *        or the following special characters: <code>+ - = . _ : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or
     *        the following special characters: <code>+ - = . _ : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Leading and trailing white spaces are trimmed from both the key and value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A maximum of 40 tags is allowed for any resource.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public TagResourceRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
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

    public TagResourceRequest clearTagsEntries() {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
