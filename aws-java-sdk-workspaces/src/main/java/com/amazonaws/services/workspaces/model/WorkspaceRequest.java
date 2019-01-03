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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the information used to create a WorkSpace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/WorkspaceRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the AWS Directory Service directory for the WorkSpace. You can use
     * <a>DescribeWorkspaceDirectories</a> to list the available directories.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The username of the user for the WorkSpace. This username must exist in the AWS Directory Service directory for
     * the WorkSpace.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The identifier of the bundle for the WorkSpace. You can use <a>DescribeWorkspaceBundles</a> to list the available
     * bundles.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The KMS key used to encrypt data stored on your WorkSpace.
     * </p>
     */
    private String volumeEncryptionKey;
    /**
     * <p>
     * Indicates whether the data stored on the user volume is encrypted.
     * </p>
     */
    private Boolean userVolumeEncryptionEnabled;
    /**
     * <p>
     * Indicates whether the data stored on the root volume is encrypted.
     * </p>
     */
    private Boolean rootVolumeEncryptionEnabled;
    /**
     * <p>
     * The WorkSpace properties.
     * </p>
     */
    private WorkspaceProperties workspaceProperties;
    /**
     * <p>
     * The tags for the WorkSpace.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The identifier of the AWS Directory Service directory for the WorkSpace. You can use
     * <a>DescribeWorkspaceDirectories</a> to list the available directories.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the AWS Directory Service directory for the WorkSpace. You can use
     *        <a>DescribeWorkspaceDirectories</a> to list the available directories.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the AWS Directory Service directory for the WorkSpace. You can use
     * <a>DescribeWorkspaceDirectories</a> to list the available directories.
     * </p>
     * 
     * @return The identifier of the AWS Directory Service directory for the WorkSpace. You can use
     *         <a>DescribeWorkspaceDirectories</a> to list the available directories.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the AWS Directory Service directory for the WorkSpace. You can use
     * <a>DescribeWorkspaceDirectories</a> to list the available directories.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the AWS Directory Service directory for the WorkSpace. You can use
     *        <a>DescribeWorkspaceDirectories</a> to list the available directories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The username of the user for the WorkSpace. This username must exist in the AWS Directory Service directory for
     * the WorkSpace.
     * </p>
     * 
     * @param userName
     *        The username of the user for the WorkSpace. This username must exist in the AWS Directory Service
     *        directory for the WorkSpace.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The username of the user for the WorkSpace. This username must exist in the AWS Directory Service directory for
     * the WorkSpace.
     * </p>
     * 
     * @return The username of the user for the WorkSpace. This username must exist in the AWS Directory Service
     *         directory for the WorkSpace.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The username of the user for the WorkSpace. This username must exist in the AWS Directory Service directory for
     * the WorkSpace.
     * </p>
     * 
     * @param userName
     *        The username of the user for the WorkSpace. This username must exist in the AWS Directory Service
     *        directory for the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The identifier of the bundle for the WorkSpace. You can use <a>DescribeWorkspaceBundles</a> to list the available
     * bundles.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the bundle for the WorkSpace. You can use <a>DescribeWorkspaceBundles</a> to list the
     *        available bundles.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The identifier of the bundle for the WorkSpace. You can use <a>DescribeWorkspaceBundles</a> to list the available
     * bundles.
     * </p>
     * 
     * @return The identifier of the bundle for the WorkSpace. You can use <a>DescribeWorkspaceBundles</a> to list the
     *         available bundles.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The identifier of the bundle for the WorkSpace. You can use <a>DescribeWorkspaceBundles</a> to list the available
     * bundles.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the bundle for the WorkSpace. You can use <a>DescribeWorkspaceBundles</a> to list the
     *        available bundles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The KMS key used to encrypt data stored on your WorkSpace.
     * </p>
     * 
     * @param volumeEncryptionKey
     *        The KMS key used to encrypt data stored on your WorkSpace.
     */

    public void setVolumeEncryptionKey(String volumeEncryptionKey) {
        this.volumeEncryptionKey = volumeEncryptionKey;
    }

    /**
     * <p>
     * The KMS key used to encrypt data stored on your WorkSpace.
     * </p>
     * 
     * @return The KMS key used to encrypt data stored on your WorkSpace.
     */

    public String getVolumeEncryptionKey() {
        return this.volumeEncryptionKey;
    }

    /**
     * <p>
     * The KMS key used to encrypt data stored on your WorkSpace.
     * </p>
     * 
     * @param volumeEncryptionKey
     *        The KMS key used to encrypt data stored on your WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceRequest withVolumeEncryptionKey(String volumeEncryptionKey) {
        setVolumeEncryptionKey(volumeEncryptionKey);
        return this;
    }

    /**
     * <p>
     * Indicates whether the data stored on the user volume is encrypted.
     * </p>
     * 
     * @param userVolumeEncryptionEnabled
     *        Indicates whether the data stored on the user volume is encrypted.
     */

    public void setUserVolumeEncryptionEnabled(Boolean userVolumeEncryptionEnabled) {
        this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Indicates whether the data stored on the user volume is encrypted.
     * </p>
     * 
     * @return Indicates whether the data stored on the user volume is encrypted.
     */

    public Boolean getUserVolumeEncryptionEnabled() {
        return this.userVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Indicates whether the data stored on the user volume is encrypted.
     * </p>
     * 
     * @param userVolumeEncryptionEnabled
     *        Indicates whether the data stored on the user volume is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceRequest withUserVolumeEncryptionEnabled(Boolean userVolumeEncryptionEnabled) {
        setUserVolumeEncryptionEnabled(userVolumeEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the data stored on the user volume is encrypted.
     * </p>
     * 
     * @return Indicates whether the data stored on the user volume is encrypted.
     */

    public Boolean isUserVolumeEncryptionEnabled() {
        return this.userVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Indicates whether the data stored on the root volume is encrypted.
     * </p>
     * 
     * @param rootVolumeEncryptionEnabled
     *        Indicates whether the data stored on the root volume is encrypted.
     */

    public void setRootVolumeEncryptionEnabled(Boolean rootVolumeEncryptionEnabled) {
        this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Indicates whether the data stored on the root volume is encrypted.
     * </p>
     * 
     * @return Indicates whether the data stored on the root volume is encrypted.
     */

    public Boolean getRootVolumeEncryptionEnabled() {
        return this.rootVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Indicates whether the data stored on the root volume is encrypted.
     * </p>
     * 
     * @param rootVolumeEncryptionEnabled
     *        Indicates whether the data stored on the root volume is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceRequest withRootVolumeEncryptionEnabled(Boolean rootVolumeEncryptionEnabled) {
        setRootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the data stored on the root volume is encrypted.
     * </p>
     * 
     * @return Indicates whether the data stored on the root volume is encrypted.
     */

    public Boolean isRootVolumeEncryptionEnabled() {
        return this.rootVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * The WorkSpace properties.
     * </p>
     * 
     * @param workspaceProperties
     *        The WorkSpace properties.
     */

    public void setWorkspaceProperties(WorkspaceProperties workspaceProperties) {
        this.workspaceProperties = workspaceProperties;
    }

    /**
     * <p>
     * The WorkSpace properties.
     * </p>
     * 
     * @return The WorkSpace properties.
     */

    public WorkspaceProperties getWorkspaceProperties() {
        return this.workspaceProperties;
    }

    /**
     * <p>
     * The WorkSpace properties.
     * </p>
     * 
     * @param workspaceProperties
     *        The WorkSpace properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceRequest withWorkspaceProperties(WorkspaceProperties workspaceProperties) {
        setWorkspaceProperties(workspaceProperties);
        return this;
    }

    /**
     * <p>
     * The tags for the WorkSpace.
     * </p>
     * 
     * @return The tags for the WorkSpace.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for the WorkSpace.
     * </p>
     * 
     * @param tags
     *        The tags for the WorkSpace.
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
     * The tags for the WorkSpace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceRequest withTags(Tag... tags) {
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
     * The tags for the WorkSpace.
     * </p>
     * 
     * @param tags
     *        The tags for the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getVolumeEncryptionKey() != null)
            sb.append("VolumeEncryptionKey: ").append(getVolumeEncryptionKey()).append(",");
        if (getUserVolumeEncryptionEnabled() != null)
            sb.append("UserVolumeEncryptionEnabled: ").append(getUserVolumeEncryptionEnabled()).append(",");
        if (getRootVolumeEncryptionEnabled() != null)
            sb.append("RootVolumeEncryptionEnabled: ").append(getRootVolumeEncryptionEnabled()).append(",");
        if (getWorkspaceProperties() != null)
            sb.append("WorkspaceProperties: ").append(getWorkspaceProperties()).append(",");
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

        if (obj instanceof WorkspaceRequest == false)
            return false;
        WorkspaceRequest other = (WorkspaceRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getVolumeEncryptionKey() == null ^ this.getVolumeEncryptionKey() == null)
            return false;
        if (other.getVolumeEncryptionKey() != null && other.getVolumeEncryptionKey().equals(this.getVolumeEncryptionKey()) == false)
            return false;
        if (other.getUserVolumeEncryptionEnabled() == null ^ this.getUserVolumeEncryptionEnabled() == null)
            return false;
        if (other.getUserVolumeEncryptionEnabled() != null && other.getUserVolumeEncryptionEnabled().equals(this.getUserVolumeEncryptionEnabled()) == false)
            return false;
        if (other.getRootVolumeEncryptionEnabled() == null ^ this.getRootVolumeEncryptionEnabled() == null)
            return false;
        if (other.getRootVolumeEncryptionEnabled() != null && other.getRootVolumeEncryptionEnabled().equals(this.getRootVolumeEncryptionEnabled()) == false)
            return false;
        if (other.getWorkspaceProperties() == null ^ this.getWorkspaceProperties() == null)
            return false;
        if (other.getWorkspaceProperties() != null && other.getWorkspaceProperties().equals(this.getWorkspaceProperties()) == false)
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

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getVolumeEncryptionKey() == null) ? 0 : getVolumeEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getUserVolumeEncryptionEnabled() == null) ? 0 : getUserVolumeEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getRootVolumeEncryptionEnabled() == null) ? 0 : getRootVolumeEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceProperties() == null) ? 0 : getWorkspaceProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceRequest clone() {
        try {
            return (WorkspaceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.WorkspaceRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
