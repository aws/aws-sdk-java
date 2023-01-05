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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaceImage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new WorkSpace image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the new WorkSpace image.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the source WorkSpace
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The tags that you want to add to the new WorkSpace image. To add tags when you're creating the image, you must
     * create an IAM policy that grants your IAM user permission to use <code>workspaces:CreateTags</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the new WorkSpace image.
     * </p>
     * 
     * @param name
     *        The name of the new WorkSpace image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new WorkSpace image.
     * </p>
     * 
     * @return The name of the new WorkSpace image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new WorkSpace image.
     * </p>
     * 
     * @param name
     *        The name of the new WorkSpace image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceImageRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the new WorkSpace image.
     * </p>
     * 
     * @param description
     *        The description of the new WorkSpace image.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the new WorkSpace image.
     * </p>
     * 
     * @return The description of the new WorkSpace image.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the new WorkSpace image.
     * </p>
     * 
     * @param description
     *        The description of the new WorkSpace image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the source WorkSpace
     * </p>
     * 
     * @param workspaceId
     *        The identifier of the source WorkSpace
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The identifier of the source WorkSpace
     * </p>
     * 
     * @return The identifier of the source WorkSpace
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The identifier of the source WorkSpace
     * </p>
     * 
     * @param workspaceId
     *        The identifier of the source WorkSpace
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceImageRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The tags that you want to add to the new WorkSpace image. To add tags when you're creating the image, you must
     * create an IAM policy that grants your IAM user permission to use <code>workspaces:CreateTags</code>.
     * </p>
     * 
     * @return The tags that you want to add to the new WorkSpace image. To add tags when you're creating the image, you
     *         must create an IAM policy that grants your IAM user permission to use <code>workspaces:CreateTags</code>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags that you want to add to the new WorkSpace image. To add tags when you're creating the image, you must
     * create an IAM policy that grants your IAM user permission to use <code>workspaces:CreateTags</code>.
     * </p>
     * 
     * @param tags
     *        The tags that you want to add to the new WorkSpace image. To add tags when you're creating the image, you
     *        must create an IAM policy that grants your IAM user permission to use <code>workspaces:CreateTags</code>.
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
     * The tags that you want to add to the new WorkSpace image. To add tags when you're creating the image, you must
     * create an IAM policy that grants your IAM user permission to use <code>workspaces:CreateTags</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags that you want to add to the new WorkSpace image. To add tags when you're creating the image, you
     *        must create an IAM policy that grants your IAM user permission to use <code>workspaces:CreateTags</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceImageRequest withTags(Tag... tags) {
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
     * The tags that you want to add to the new WorkSpace image. To add tags when you're creating the image, you must
     * create an IAM policy that grants your IAM user permission to use <code>workspaces:CreateTags</code>.
     * </p>
     * 
     * @param tags
     *        The tags that you want to add to the new WorkSpace image. To add tags when you're creating the image, you
     *        must create an IAM policy that grants your IAM user permission to use <code>workspaces:CreateTags</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceImageRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
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

        if (obj instanceof CreateWorkspaceImageRequest == false)
            return false;
        CreateWorkspaceImageRequest other = (CreateWorkspaceImageRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
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
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspaceImageRequest clone() {
        return (CreateWorkspaceImageRequest) super.clone();
    }

}
