/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateFolder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFolderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The folder ID.
     * </p>
     */
    private String folderId;
    /**
     * <p>
     * The name of the folder.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of folder. By default, <code>folderType</code> is <code>SHARED</code>.
     * </p>
     */
    private String folderType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the parent folder.
     * </p>
     * <p>
     * <code>ParentFolderArn</code> can be null. An empty <code>parentFolderArn</code> creates a root-level folder.
     * </p>
     */
    private String parentFolderArn;
    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions of a folder.
     * </p>
     * <p>
     * To specify no permissions, omit <code>Permissions</code>.
     * </p>
     */
    private java.util.List<ResourcePermission> permissions;
    /**
     * <p>
     * Tags for the folder.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The AWS Account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS Account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS Account ID.
     * </p>
     * 
     * @return The AWS Account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The AWS Account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS Account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFolderRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The folder ID.
     * </p>
     * 
     * @param folderId
     *        The folder ID.
     */

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    /**
     * <p>
     * The folder ID.
     * </p>
     * 
     * @return The folder ID.
     */

    public String getFolderId() {
        return this.folderId;
    }

    /**
     * <p>
     * The folder ID.
     * </p>
     * 
     * @param folderId
     *        The folder ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFolderRequest withFolderId(String folderId) {
        setFolderId(folderId);
        return this;
    }

    /**
     * <p>
     * The name of the folder.
     * </p>
     * 
     * @param name
     *        The name of the folder.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the folder.
     * </p>
     * 
     * @return The name of the folder.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the folder.
     * </p>
     * 
     * @param name
     *        The name of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFolderRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of folder. By default, <code>folderType</code> is <code>SHARED</code>.
     * </p>
     * 
     * @param folderType
     *        The type of folder. By default, <code>folderType</code> is <code>SHARED</code>.
     * @see FolderType
     */

    public void setFolderType(String folderType) {
        this.folderType = folderType;
    }

    /**
     * <p>
     * The type of folder. By default, <code>folderType</code> is <code>SHARED</code>.
     * </p>
     * 
     * @return The type of folder. By default, <code>folderType</code> is <code>SHARED</code>.
     * @see FolderType
     */

    public String getFolderType() {
        return this.folderType;
    }

    /**
     * <p>
     * The type of folder. By default, <code>folderType</code> is <code>SHARED</code>.
     * </p>
     * 
     * @param folderType
     *        The type of folder. By default, <code>folderType</code> is <code>SHARED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FolderType
     */

    public CreateFolderRequest withFolderType(String folderType) {
        setFolderType(folderType);
        return this;
    }

    /**
     * <p>
     * The type of folder. By default, <code>folderType</code> is <code>SHARED</code>.
     * </p>
     * 
     * @param folderType
     *        The type of folder. By default, <code>folderType</code> is <code>SHARED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FolderType
     */

    public CreateFolderRequest withFolderType(FolderType folderType) {
        this.folderType = folderType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the parent folder.
     * </p>
     * <p>
     * <code>ParentFolderArn</code> can be null. An empty <code>parentFolderArn</code> creates a root-level folder.
     * </p>
     * 
     * @param parentFolderArn
     *        The Amazon Resource Name (ARN) for the parent folder.</p>
     *        <p>
     *        <code>ParentFolderArn</code> can be null. An empty <code>parentFolderArn</code> creates a root-level
     *        folder.
     */

    public void setParentFolderArn(String parentFolderArn) {
        this.parentFolderArn = parentFolderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the parent folder.
     * </p>
     * <p>
     * <code>ParentFolderArn</code> can be null. An empty <code>parentFolderArn</code> creates a root-level folder.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the parent folder.</p>
     *         <p>
     *         <code>ParentFolderArn</code> can be null. An empty <code>parentFolderArn</code> creates a root-level
     *         folder.
     */

    public String getParentFolderArn() {
        return this.parentFolderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the parent folder.
     * </p>
     * <p>
     * <code>ParentFolderArn</code> can be null. An empty <code>parentFolderArn</code> creates a root-level folder.
     * </p>
     * 
     * @param parentFolderArn
     *        The Amazon Resource Name (ARN) for the parent folder.</p>
     *        <p>
     *        <code>ParentFolderArn</code> can be null. An empty <code>parentFolderArn</code> creates a root-level
     *        folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFolderRequest withParentFolderArn(String parentFolderArn) {
        setParentFolderArn(parentFolderArn);
        return this;
    }

    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions of a folder.
     * </p>
     * <p>
     * To specify no permissions, omit <code>Permissions</code>.
     * </p>
     * 
     * @return A structure that describes the principals and the resource-level permissions of a folder.</p>
     *         <p>
     *         To specify no permissions, omit <code>Permissions</code>.
     */

    public java.util.List<ResourcePermission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions of a folder.
     * </p>
     * <p>
     * To specify no permissions, omit <code>Permissions</code>.
     * </p>
     * 
     * @param permissions
     *        A structure that describes the principals and the resource-level permissions of a folder.</p>
     *        <p>
     *        To specify no permissions, omit <code>Permissions</code>.
     */

    public void setPermissions(java.util.Collection<ResourcePermission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<ResourcePermission>(permissions);
    }

    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions of a folder.
     * </p>
     * <p>
     * To specify no permissions, omit <code>Permissions</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        A structure that describes the principals and the resource-level permissions of a folder.</p>
     *        <p>
     *        To specify no permissions, omit <code>Permissions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFolderRequest withPermissions(ResourcePermission... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<ResourcePermission>(permissions.length));
        }
        for (ResourcePermission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions of a folder.
     * </p>
     * <p>
     * To specify no permissions, omit <code>Permissions</code>.
     * </p>
     * 
     * @param permissions
     *        A structure that describes the principals and the resource-level permissions of a folder.</p>
     *        <p>
     *        To specify no permissions, omit <code>Permissions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFolderRequest withPermissions(java.util.Collection<ResourcePermission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * Tags for the folder.
     * </p>
     * 
     * @return Tags for the folder.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for the folder.
     * </p>
     * 
     * @param tags
     *        Tags for the folder.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags for the folder.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags for the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFolderRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags for the folder.
     * </p>
     * 
     * @param tags
     *        Tags for the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFolderRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getFolderId() != null)
            sb.append("FolderId: ").append(getFolderId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFolderType() != null)
            sb.append("FolderType: ").append(getFolderType()).append(",");
        if (getParentFolderArn() != null)
            sb.append("ParentFolderArn: ").append(getParentFolderArn()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
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

        if (obj instanceof CreateFolderRequest == false)
            return false;
        CreateFolderRequest other = (CreateFolderRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getFolderId() == null ^ this.getFolderId() == null)
            return false;
        if (other.getFolderId() != null && other.getFolderId().equals(this.getFolderId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFolderType() == null ^ this.getFolderType() == null)
            return false;
        if (other.getFolderType() != null && other.getFolderType().equals(this.getFolderType()) == false)
            return false;
        if (other.getParentFolderArn() == null ^ this.getParentFolderArn() == null)
            return false;
        if (other.getParentFolderArn() != null && other.getParentFolderArn().equals(this.getParentFolderArn()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
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

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getFolderId() == null) ? 0 : getFolderId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFolderType() == null) ? 0 : getFolderType().hashCode());
        hashCode = prime * hashCode + ((getParentFolderArn() == null) ? 0 : getParentFolderArn().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFolderRequest clone() {
        return (CreateFolderRequest) super.clone();
    }

}
