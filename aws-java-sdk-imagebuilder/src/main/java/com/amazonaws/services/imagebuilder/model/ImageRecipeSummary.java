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
 * A summary of an image recipe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImageRecipeSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageRecipeSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The parent image of the image recipe.
     * </p>
     */
    private String parentImage;
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

    public ImageRecipeSummary withArn(String arn) {
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

    public ImageRecipeSummary withName(String name) {
        setName(name);
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

    public ImageRecipeSummary withPlatform(String platform) {
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

    public ImageRecipeSummary withPlatform(Platform platform) {
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

    public ImageRecipeSummary withOwner(String owner) {
        setOwner(owner);
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

    public ImageRecipeSummary withParentImage(String parentImage) {
        setParentImage(parentImage);
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

    public ImageRecipeSummary withDateCreated(String dateCreated) {
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

    public ImageRecipeSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ImageRecipeSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ImageRecipeSummary addTagsEntry(String key, String value) {
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

    public ImageRecipeSummary clearTagsEntries() {
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
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getParentImage() != null)
            sb.append("ParentImage: ").append(getParentImage()).append(",");
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

        if (obj instanceof ImageRecipeSummary == false)
            return false;
        ImageRecipeSummary other = (ImageRecipeSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getParentImage() == null ^ this.getParentImage() == null)
            return false;
        if (other.getParentImage() != null && other.getParentImage().equals(this.getParentImage()) == false)
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
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getParentImage() == null) ? 0 : getParentImage().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImageRecipeSummary clone() {
        try {
            return (ImageRecipeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImageRecipeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
