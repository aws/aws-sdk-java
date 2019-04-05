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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreatePreset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePresetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Optional. A category for the preset you are creating. */
    private String category;
    /** Optional. A description of the preset you are creating. */
    private String description;
    /** The name of the preset you are creating. */
    private String name;
    /** Settings for preset */
    private PresetSettings settings;
    /** The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key. */
    private java.util.Map<String, String> tags;

    /**
     * Optional. A category for the preset you are creating.
     * 
     * @param category
     *        Optional. A category for the preset you are creating.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Optional. A category for the preset you are creating.
     * 
     * @return Optional. A category for the preset you are creating.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * Optional. A category for the preset you are creating.
     * 
     * @param category
     *        Optional. A category for the preset you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresetRequest withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * Optional. A description of the preset you are creating.
     * 
     * @param description
     *        Optional. A description of the preset you are creating.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Optional. A description of the preset you are creating.
     * 
     * @return Optional. A description of the preset you are creating.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * Optional. A description of the preset you are creating.
     * 
     * @param description
     *        Optional. A description of the preset you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The name of the preset you are creating.
     * 
     * @param name
     *        The name of the preset you are creating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the preset you are creating.
     * 
     * @return The name of the preset you are creating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the preset you are creating.
     * 
     * @param name
     *        The name of the preset you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Settings for preset
     * 
     * @param settings
     *        Settings for preset
     */

    public void setSettings(PresetSettings settings) {
        this.settings = settings;
    }

    /**
     * Settings for preset
     * 
     * @return Settings for preset
     */

    public PresetSettings getSettings() {
        return this.settings;
    }

    /**
     * Settings for preset
     * 
     * @param settings
     *        Settings for preset
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresetRequest withSettings(PresetSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
     * 
     * @return The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a
     *         key.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
     * 
     * @param tags
     *        The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a
     *        key.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
     * 
     * @param tags
     *        The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a
     *        key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresetRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreatePresetRequest addTagsEntry(String key, String value) {
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

    public CreatePresetRequest clearTagsEntries() {
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
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

        if (obj instanceof CreatePresetRequest == false)
            return false;
        CreatePresetRequest other = (CreatePresetRequest) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
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

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePresetRequest clone() {
        return (CreatePresetRequest) super.clone();
    }

}
