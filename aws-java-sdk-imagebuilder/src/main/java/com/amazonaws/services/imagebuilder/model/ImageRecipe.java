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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An image recipe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImageRecipe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageRecipe implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe.
     * </p>
     */
    private String arn;
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
     * The platform of the image recipe.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The owner of the image recipe.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The version of the image recipe.
     * </p>
     */
    private String version;
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
     * The block device mappings to apply when creating images from this recipe.
     * </p>
     */
    private java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * The date on which this image recipe was created.
     * </p>
     */
    private String dateCreated;
    /**
     * <p>
     * The tags of the image recipe.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the image recipe.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image recipe.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecipe withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public ImageRecipe withName(String name) {
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

    public ImageRecipe withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The platform of the image recipe.
     * </p>
     * 
     * @param platform
     *        The platform of the image recipe.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the image recipe.
     * </p>
     * 
     * @return The platform of the image recipe.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the image recipe.
     * </p>
     * 
     * @param platform
     *        The platform of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ImageRecipe withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the image recipe.
     * </p>
     * 
     * @param platform
     *        The platform of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ImageRecipe withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The owner of the image recipe.
     * </p>
     * 
     * @param owner
     *        The owner of the image recipe.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the image recipe.
     * </p>
     * 
     * @return The owner of the image recipe.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the image recipe.
     * </p>
     * 
     * @param owner
     *        The owner of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecipe withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The version of the image recipe.
     * </p>
     * 
     * @param version
     *        The version of the image recipe.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the image recipe.
     * </p>
     * 
     * @return The version of the image recipe.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the image recipe.
     * </p>
     * 
     * @param version
     *        The version of the image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecipe withVersion(String version) {
        setVersion(version);
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

    public ImageRecipe withComponents(ComponentConfiguration... components) {
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

    public ImageRecipe withComponents(java.util.Collection<ComponentConfiguration> components) {
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

    public ImageRecipe withParentImage(String parentImage) {
        setParentImage(parentImage);
        return this;
    }

    /**
     * <p>
     * The block device mappings to apply when creating images from this recipe.
     * </p>
     * 
     * @return The block device mappings to apply when creating images from this recipe.
     */

    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mappings to apply when creating images from this recipe.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mappings to apply when creating images from this recipe.
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
     * The block device mappings to apply when creating images from this recipe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mappings to apply when creating images from this recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecipe withBlockDeviceMappings(InstanceBlockDeviceMapping... blockDeviceMappings) {
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
     * The block device mappings to apply when creating images from this recipe.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mappings to apply when creating images from this recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecipe withBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The date on which this image recipe was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which this image recipe was created.
     */

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date on which this image recipe was created.
     * </p>
     * 
     * @return The date on which this image recipe was created.
     */

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date on which this image recipe was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which this image recipe was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecipe withDateCreated(String dateCreated) {
        setDateCreated(dateCreated);
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

    public ImageRecipe withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ImageRecipe#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecipe addTagsEntry(String key, String value) {
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

    public ImageRecipe clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getComponents() != null)
            sb.append("Components: ").append(getComponents()).append(",");
        if (getParentImage() != null)
            sb.append("ParentImage: ").append(getParentImage()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
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

        if (obj instanceof ImageRecipe == false)
            return false;
        ImageRecipe other = (ImageRecipe) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
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
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode + ((getParentImage() == null) ? 0 : getParentImage().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImageRecipe clone() {
        try {
            return (ImageRecipe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImageRecipeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
