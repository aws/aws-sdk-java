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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Placeholder documentation for CreateCloudWatchAlarmTemplateGroupRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateCloudWatchAlarmTemplateGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCloudWatchAlarmTemplateGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A resource's optional description. */
    private String description;
    /** A resource's name. Names must be unique within the scope of a resource type in a specific region. */
    private String name;

    private java.util.Map<String, String> tags;

    /**
     * A resource's optional description.
     * 
     * @param description
     *        A resource's optional description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A resource's optional description.
     * 
     * @return A resource's optional description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A resource's optional description.
     * 
     * @param description
     *        A resource's optional description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * 
     * @param name
     *        A resource's name. Names must be unique within the scope of a resource type in a specific region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * 
     * @return A resource's name. Names must be unique within the scope of a resource type in a specific region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * 
     * @param name
     *        A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateGroupRequest withName(String name) {
        setName(name);
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

    public CreateCloudWatchAlarmTemplateGroupRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateCloudWatchAlarmTemplateGroupRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudWatchAlarmTemplateGroupRequest addTagsEntry(String key, String value) {
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

    public CreateCloudWatchAlarmTemplateGroupRequest clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateCloudWatchAlarmTemplateGroupRequest == false)
            return false;
        CreateCloudWatchAlarmTemplateGroupRequest other = (CreateCloudWatchAlarmTemplateGroupRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCloudWatchAlarmTemplateGroupRequest clone() {
        return (CreateCloudWatchAlarmTemplateGroupRequest) super.clone();
    }

}
