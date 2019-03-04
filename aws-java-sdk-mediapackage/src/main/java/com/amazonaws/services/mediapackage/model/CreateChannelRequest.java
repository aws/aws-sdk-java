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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A new Channel configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/CreateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A short text description of the Channel. */
    private String description;
    /**
     * The ID of the Channel. The ID must be unique within the region and it cannot be changed after a Channel is
     * created.
     */
    private String id;

    private java.util.Map<String, String> tags;

    /**
     * A short text description of the Channel.
     * 
     * @param description
     *        A short text description of the Channel.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A short text description of the Channel.
     * 
     * @return A short text description of the Channel.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A short text description of the Channel.
     * 
     * @param description
     *        A short text description of the Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The ID of the Channel. The ID must be unique within the region and it cannot be changed after a Channel is
     * created.
     * 
     * @param id
     *        The ID of the Channel. The ID must be unique within the region and it cannot be changed after a Channel is
     *        created.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the Channel. The ID must be unique within the region and it cannot be changed after a Channel is
     * created.
     * 
     * @return The ID of the Channel. The ID must be unique within the region and it cannot be changed after a Channel
     *         is created.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the Channel. The ID must be unique within the region and it cannot be changed after a Channel is
     * created.
     * 
     * @param id
     *        The ID of the Channel. The ID must be unique within the region and it cannot be changed after a Channel is
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateChannelRequest addTagsEntry(String key, String value) {
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

    public CreateChannelRequest clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof CreateChannelRequest == false)
            return false;
        CreateChannelRequest other = (CreateChannelRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelRequest clone() {
        return (CreateChannelRequest) super.clone();
    }

}
