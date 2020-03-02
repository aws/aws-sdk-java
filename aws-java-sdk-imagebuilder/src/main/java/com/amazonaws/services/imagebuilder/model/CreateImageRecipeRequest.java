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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateImageRecipe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImageRecipeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the image recipe.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the image recipe.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The semantic version of the image recipe.
     * </p>
     */
    private String semanticVersion;
    /**
     * <p>
     * The components of the image recipe.
     * </p>
     */
    private java.util.List<ComponentConfiguration> components;
    /**
     * <p>
     * The parent image of the image recipe.
     * </p>
     */
    private String parentImage;
    /**
     * <p>
     * The block device mappings of the image recipe.
     * </p>
     */
    private java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * The tags of the image recipe.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the image recipe.
     * </p>
     * 
     * @param name
     *        The name of the image recipe.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the image recipe.
     * </p>
     * 
     * @return The name of the image recipe.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the image recipe.
     * </p>
     * 
     * @param name
     *        The name of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRecipeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the image recipe.
     * </p>
     * 
     * @param description
     *        The description of the image recipe.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the image recipe.
     * </p>
     * 
     * @return The description of the image recipe.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the image recipe.
     * </p>
     * 
     * @param description
     *        The description of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRecipeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The semantic version of the image recipe.
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the image recipe.
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the image recipe.
     * </p>
     * 
     * @return The semantic version of the image recipe.
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the image recipe.
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRecipeRequest withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * <p>
     * The components of the image recipe.
     * </p>
     * 
     * @return The components of the image recipe.
     */

    public java.util.List<ComponentConfiguration> getComponents() {
        return components;
    }

    /**
     * <p>
     * The components of the image recipe.
     * </p>
     * 
     * @param components
     *        The components of the image recipe.
     */

    public void setComponents(java.util.Collection<ComponentConfiguration> components) {
        if (components == null) {
            this.components = null;
            return;
        }

        this.components = new java.util.ArrayList<ComponentConfiguration>(components);
    }

    /**
     * <p>
     * The components of the image recipe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponents(java.util.Collection)} or {@link #withComponents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param components
     *        The components of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRecipeRequest withComponents(ComponentConfiguration... components) {
        if (this.components == null) {
            setComponents(new java.util.ArrayList<ComponentConfiguration>(components.length));
        }
        for (ComponentConfiguration ele : components) {
            this.components.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The components of the image recipe.
     * </p>
     * 
     * @param components
     *        The components of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRecipeRequest withComponents(java.util.Collection<ComponentConfiguration> components) {
        setComponents(components);
        return this;
    }

    /**
     * <p>
     * The parent image of the image recipe.
     * </p>
     * 
     * @param parentImage
     *        The parent image of the image recipe.
     */

    public void setParentImage(String parentImage) {
        this.parentImage = parentImage;
    }

    /**
     * <p>
     * The parent image of the image recipe.
     * </p>
     * 
     * @return The parent image of the image recipe.
     */

    public String getParentImage() {
        return this.parentImage;
    }

    /**
     * <p>
     * The parent image of the image recipe.
     * </p>
     * 
     * @param parentImage
     *        The parent image of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRecipeRequest withParentImage(String parentImage) {
        setParentImage(parentImage);
        return this;
    }

    /**
     * <p>
     * The block device mappings of the image recipe.
     * </p>
     * 
     * @return The block device mappings of the image recipe.
     */

    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mappings of the image recipe.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mappings of the image recipe.
     */

    public void setBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new java.util.ArrayList<InstanceBlockDeviceMapping>(blockDeviceMappings);
    }

    /**
     * <p>
     * The block device mappings of the image recipe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mappings of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRecipeRequest withBlockDeviceMappings(InstanceBlockDeviceMapping... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new java.util.ArrayList<InstanceBlockDeviceMapping>(blockDeviceMappings.length));
        }
        for (InstanceBlockDeviceMapping ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The block device mappings of the image recipe.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mappings of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRecipeRequest withBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The tags of the image recipe.
     * </p>
     * 
     * @return The tags of the image recipe.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the image recipe.
     * </p>
     * 
     * @param tags
     *        The tags of the image recipe.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the image recipe.
     * </p>
     * 
     * @param tags
     *        The tags of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRecipeRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateImageRecipeRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRecipeRequest addTagsEntry(String key, String value) {
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

    public CreateImageRecipeRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token used to make this request idempotent.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * 
     * @return The idempotency token used to make this request idempotent.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token used to make this request idempotent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRecipeRequest withClientToken(String clientToken) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getComponents() != null)
            sb.append("Components: ").append(getComponents()).append(",");
        if (getParentImage() != null)
            sb.append("ParentImage: ").append(getParentImage()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateImageRecipeRequest == false)
            return false;
        CreateImageRecipeRequest other = (CreateImageRecipeRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getComponents() == null ^ this.getComponents() == null)
            return false;
        if (other.getComponents() != null && other.getComponents().equals(this.getComponents()) == false)
            return false;
        if (other.getParentImage() == null ^ this.getParentImage() == null)
            return false;
        if (other.getParentImage() != null && other.getParentImage().equals(this.getParentImage()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode + ((getParentImage() == null) ? 0 : getParentImage().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateImageRecipeRequest clone() {
        return (CreateImageRecipeRequest) super.clone();
    }

}
