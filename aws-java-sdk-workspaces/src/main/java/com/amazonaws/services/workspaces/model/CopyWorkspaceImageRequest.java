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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CopyWorkspaceImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyWorkspaceImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the image.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the source image.
     * </p>
     */
    private String sourceImageId;
    /**
     * <p>
     * The identifier of the source Region.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * The tags for the image.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param name
     *        The name of the image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @return The name of the image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param name
     *        The name of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyWorkspaceImageRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the image.
     * </p>
     * 
     * @param description
     *        A description of the image.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the image.
     * </p>
     * 
     * @return A description of the image.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the image.
     * </p>
     * 
     * @param description
     *        A description of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyWorkspaceImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the source image.
     * </p>
     * 
     * @param sourceImageId
     *        The identifier of the source image.
     */

    public void setSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
    }

    /**
     * <p>
     * The identifier of the source image.
     * </p>
     * 
     * @return The identifier of the source image.
     */

    public String getSourceImageId() {
        return this.sourceImageId;
    }

    /**
     * <p>
     * The identifier of the source image.
     * </p>
     * 
     * @param sourceImageId
     *        The identifier of the source image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyWorkspaceImageRequest withSourceImageId(String sourceImageId) {
        setSourceImageId(sourceImageId);
        return this;
    }

    /**
     * <p>
     * The identifier of the source Region.
     * </p>
     * 
     * @param sourceRegion
     *        The identifier of the source Region.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The identifier of the source Region.
     * </p>
     * 
     * @return The identifier of the source Region.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The identifier of the source Region.
     * </p>
     * 
     * @param sourceRegion
     *        The identifier of the source Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyWorkspaceImageRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The tags for the image.
     * </p>
     * 
     * @return The tags for the image.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for the image.
     * </p>
     * 
     * @param tags
     *        The tags for the image.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyWorkspaceImageRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the image.
     * </p>
     * 
     * @param tags
     *        The tags for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyWorkspaceImageRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSourceImageId() != null)
            sb.append("SourceImageId: ").append(getSourceImageId()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
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

        if (obj instanceof CopyWorkspaceImageRequest == false)
            return false;
        CopyWorkspaceImageRequest other = (CopyWorkspaceImageRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSourceImageId() == null ^ this.getSourceImageId() == null)
            return false;
        if (other.getSourceImageId() != null && other.getSourceImageId().equals(this.getSourceImageId()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSourceImageId() == null) ? 0 : getSourceImageId().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CopyWorkspaceImageRequest clone() {
        return (CopyWorkspaceImageRequest) super.clone();
    }

}
