/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the tags (keys and values) for an application, campaign, message template, or segment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/TagsModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagsModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags for an application, campaign, message template,
     * or segment. Each of these resources can have a maximum of 50 tags.
     * </p>
     * <p>
     * Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is 128
     * characters. The maximum length of a tag value is 256 characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags for an application, campaign, message template,
     * or segment. Each of these resources can have a maximum of 50 tags.
     * </p>
     * <p>
     * Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is 128
     * characters. The maximum length of a tag value is 256 characters.
     * </p>
     * 
     * @return A string-to-string map of key-value pairs that defines the tags for an application, campaign, message
     *         template, or segment. Each of these resources can have a maximum of 50 tags.</p>
     *         <p>
     *         Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is
     *         128 characters. The maximum length of a tag value is 256 characters.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags for an application, campaign, message template,
     * or segment. Each of these resources can have a maximum of 50 tags.
     * </p>
     * <p>
     * Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is 128
     * characters. The maximum length of a tag value is 256 characters.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that defines the tags for an application, campaign, message
     *        template, or segment. Each of these resources can have a maximum of 50 tags.</p>
     *        <p>
     *        Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is
     *        128 characters. The maximum length of a tag value is 256 characters.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags for an application, campaign, message template,
     * or segment. Each of these resources can have a maximum of 50 tags.
     * </p>
     * <p>
     * Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is 128
     * characters. The maximum length of a tag value is 256 characters.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that defines the tags for an application, campaign, message
     *        template, or segment. Each of these resources can have a maximum of 50 tags.</p>
     *        <p>
     *        Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is
     *        128 characters. The maximum length of a tag value is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagsModel withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see TagsModel#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TagsModel addTagsEntry(String key, String value) {
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

    public TagsModel clearTagsEntries() {
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

        if (obj instanceof TagsModel == false)
            return false;
        TagsModel other = (TagsModel) obj;
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

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagsModel clone() {
        try {
            return (TagsModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.TagsModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
