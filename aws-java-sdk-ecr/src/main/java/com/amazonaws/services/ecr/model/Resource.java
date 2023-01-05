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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the resource involved in a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/Resource" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains details about the resource involved in a finding.
     * </p>
     */
    private ResourceDetails details;
    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The tags attached to the resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String type;

    /**
     * <p>
     * An object that contains details about the resource involved in a finding.
     * </p>
     * 
     * @param details
     *        An object that contains details about the resource involved in a finding.
     */

    public void setDetails(ResourceDetails details) {
        this.details = details;
    }

    /**
     * <p>
     * An object that contains details about the resource involved in a finding.
     * </p>
     * 
     * @return An object that contains details about the resource involved in a finding.
     */

    public ResourceDetails getDetails() {
        return this.details;
    }

    /**
     * <p>
     * An object that contains details about the resource involved in a finding.
     * </p>
     * 
     * @param details
     *        An object that contains details about the resource involved in a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withDetails(ResourceDetails details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param id
     *        The ID of the resource.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param id
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The tags attached to the resource.
     * </p>
     * 
     * @return The tags attached to the resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags attached to the resource.
     * </p>
     * 
     * @param tags
     *        The tags attached to the resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags attached to the resource.
     * </p>
     * 
     * @param tags
     *        The tags attached to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Resource#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Resource addTagsEntry(String key, String value) {
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

    public Resource clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param type
     *        The type of resource.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @return The type of resource.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param type
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withType(String type) {
        setType(type);
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
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
