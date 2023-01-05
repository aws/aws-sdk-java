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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateUpdatedWorkspaceImage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUpdatedWorkspaceImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new updated WorkSpace image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of whether updates for the WorkSpace image are available.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the source WorkSpace image.
     * </p>
     */
    private String sourceImageId;
    /**
     * <p>
     * The tags that you want to add to the new updated WorkSpace image.
     * </p>
     * <note>
     * <p>
     * To add tags at the same time when you're creating the updated image, you must create an IAM policy that grants
     * your IAM user permissions to use <code>workspaces:CreateTags</code>.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the new updated WorkSpace image.
     * </p>
     * 
     * @param name
     *        The name of the new updated WorkSpace image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new updated WorkSpace image.
     * </p>
     * 
     * @return The name of the new updated WorkSpace image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new updated WorkSpace image.
     * </p>
     * 
     * @param name
     *        The name of the new updated WorkSpace image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedWorkspaceImageRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of whether updates for the WorkSpace image are available.
     * </p>
     * 
     * @param description
     *        A description of whether updates for the WorkSpace image are available.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of whether updates for the WorkSpace image are available.
     * </p>
     * 
     * @return A description of whether updates for the WorkSpace image are available.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of whether updates for the WorkSpace image are available.
     * </p>
     * 
     * @param description
     *        A description of whether updates for the WorkSpace image are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedWorkspaceImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the source WorkSpace image.
     * </p>
     * 
     * @param sourceImageId
     *        The identifier of the source WorkSpace image.
     */

    public void setSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
    }

    /**
     * <p>
     * The identifier of the source WorkSpace image.
     * </p>
     * 
     * @return The identifier of the source WorkSpace image.
     */

    public String getSourceImageId() {
        return this.sourceImageId;
    }

    /**
     * <p>
     * The identifier of the source WorkSpace image.
     * </p>
     * 
     * @param sourceImageId
     *        The identifier of the source WorkSpace image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedWorkspaceImageRequest withSourceImageId(String sourceImageId) {
        setSourceImageId(sourceImageId);
        return this;
    }

    /**
     * <p>
     * The tags that you want to add to the new updated WorkSpace image.
     * </p>
     * <note>
     * <p>
     * To add tags at the same time when you're creating the updated image, you must create an IAM policy that grants
     * your IAM user permissions to use <code>workspaces:CreateTags</code>.
     * </p>
     * </note>
     * 
     * @return The tags that you want to add to the new updated WorkSpace image.</p> <note>
     *         <p>
     *         To add tags at the same time when you're creating the updated image, you must create an IAM policy that
     *         grants your IAM user permissions to use <code>workspaces:CreateTags</code>.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags that you want to add to the new updated WorkSpace image.
     * </p>
     * <note>
     * <p>
     * To add tags at the same time when you're creating the updated image, you must create an IAM policy that grants
     * your IAM user permissions to use <code>workspaces:CreateTags</code>.
     * </p>
     * </note>
     * 
     * @param tags
     *        The tags that you want to add to the new updated WorkSpace image.</p> <note>
     *        <p>
     *        To add tags at the same time when you're creating the updated image, you must create an IAM policy that
     *        grants your IAM user permissions to use <code>workspaces:CreateTags</code>.
     *        </p>
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
     * The tags that you want to add to the new updated WorkSpace image.
     * </p>
     * <note>
     * <p>
     * To add tags at the same time when you're creating the updated image, you must create an IAM policy that grants
     * your IAM user permissions to use <code>workspaces:CreateTags</code>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags that you want to add to the new updated WorkSpace image.</p> <note>
     *        <p>
     *        To add tags at the same time when you're creating the updated image, you must create an IAM policy that
     *        grants your IAM user permissions to use <code>workspaces:CreateTags</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedWorkspaceImageRequest withTags(Tag... tags) {
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
     * The tags that you want to add to the new updated WorkSpace image.
     * </p>
     * <note>
     * <p>
     * To add tags at the same time when you're creating the updated image, you must create an IAM policy that grants
     * your IAM user permissions to use <code>workspaces:CreateTags</code>.
     * </p>
     * </note>
     * 
     * @param tags
     *        The tags that you want to add to the new updated WorkSpace image.</p> <note>
     *        <p>
     *        To add tags at the same time when you're creating the updated image, you must create an IAM policy that
     *        grants your IAM user permissions to use <code>workspaces:CreateTags</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedWorkspaceImageRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof CreateUpdatedWorkspaceImageRequest == false)
            return false;
        CreateUpdatedWorkspaceImageRequest other = (CreateUpdatedWorkspaceImageRequest) obj;
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateUpdatedWorkspaceImageRequest clone() {
        return (CreateUpdatedWorkspaceImageRequest) super.clone();
    }

}
