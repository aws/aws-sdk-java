/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a WorkSpace creation request.
 * </p>
 */
public class WorkspaceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the AWS Directory Service directory to create the
     * WorkSpace in. You can use the <a>DescribeWorkspaceDirectories</a>
     * operation to obtain a list of the directories that are available.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The username that the WorkSpace is assigned to. This username must exist
     * in the AWS Directory Service directory specified by the
     * <code>DirectoryId</code> member.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The identifier of the bundle to create the WorkSpace from. You can use
     * the <a>DescribeWorkspaceBundles</a> operation to obtain a list of the
     * bundles that are available.
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
     * Specifies whether the data stored on the user volume, or D: drive, is
     * encrypted.
     * </p>
     */
    private Boolean userVolumeEncryptionEnabled;
    /**
     * <p>
     * Specifies whether the data stored on the root volume, or C: drive, is
     * encrypted.
     * </p>
     */
    private Boolean rootVolumeEncryptionEnabled;

    /**
     * <p>
     * The identifier of the AWS Directory Service directory to create the
     * WorkSpace in. You can use the <a>DescribeWorkspaceDirectories</a>
     * operation to obtain a list of the directories that are available.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the AWS Directory Service directory to create
     *        the WorkSpace in. You can use the
     *        <a>DescribeWorkspaceDirectories</a> operation to obtain a list of
     *        the directories that are available.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the AWS Directory Service directory to create the
     * WorkSpace in. You can use the <a>DescribeWorkspaceDirectories</a>
     * operation to obtain a list of the directories that are available.
     * </p>
     * 
     * @return The identifier of the AWS Directory Service directory to create
     *         the WorkSpace in. You can use the
     *         <a>DescribeWorkspaceDirectories</a> operation to obtain a list of
     *         the directories that are available.
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the AWS Directory Service directory to create the
     * WorkSpace in. You can use the <a>DescribeWorkspaceDirectories</a>
     * operation to obtain a list of the directories that are available.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the AWS Directory Service directory to create
     *        the WorkSpace in. You can use the
     *        <a>DescribeWorkspaceDirectories</a> operation to obtain a list of
     *        the directories that are available.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public WorkspaceRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The username that the WorkSpace is assigned to. This username must exist
     * in the AWS Directory Service directory specified by the
     * <code>DirectoryId</code> member.
     * </p>
     * 
     * @param userName
     *        The username that the WorkSpace is assigned to. This username must
     *        exist in the AWS Directory Service directory specified by the
     *        <code>DirectoryId</code> member.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The username that the WorkSpace is assigned to. This username must exist
     * in the AWS Directory Service directory specified by the
     * <code>DirectoryId</code> member.
     * </p>
     * 
     * @return The username that the WorkSpace is assigned to. This username
     *         must exist in the AWS Directory Service directory specified by
     *         the <code>DirectoryId</code> member.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The username that the WorkSpace is assigned to. This username must exist
     * in the AWS Directory Service directory specified by the
     * <code>DirectoryId</code> member.
     * </p>
     * 
     * @param userName
     *        The username that the WorkSpace is assigned to. This username must
     *        exist in the AWS Directory Service directory specified by the
     *        <code>DirectoryId</code> member.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public WorkspaceRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The identifier of the bundle to create the WorkSpace from. You can use
     * the <a>DescribeWorkspaceBundles</a> operation to obtain a list of the
     * bundles that are available.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the bundle to create the WorkSpace from. You can
     *        use the <a>DescribeWorkspaceBundles</a> operation to obtain a list
     *        of the bundles that are available.
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The identifier of the bundle to create the WorkSpace from. You can use
     * the <a>DescribeWorkspaceBundles</a> operation to obtain a list of the
     * bundles that are available.
     * </p>
     * 
     * @return The identifier of the bundle to create the WorkSpace from. You
     *         can use the <a>DescribeWorkspaceBundles</a> operation to obtain a
     *         list of the bundles that are available.
     */
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The identifier of the bundle to create the WorkSpace from. You can use
     * the <a>DescribeWorkspaceBundles</a> operation to obtain a list of the
     * bundles that are available.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the bundle to create the WorkSpace from. You can
     *        use the <a>DescribeWorkspaceBundles</a> operation to obtain a list
     *        of the bundles that are available.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public WorkspaceRequest withVolumeEncryptionKey(String volumeEncryptionKey) {
        setVolumeEncryptionKey(volumeEncryptionKey);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data stored on the user volume, or D: drive, is
     * encrypted.
     * </p>
     * 
     * @param userVolumeEncryptionEnabled
     *        Specifies whether the data stored on the user volume, or D: drive,
     *        is encrypted.
     */
    public void setUserVolumeEncryptionEnabled(
            Boolean userVolumeEncryptionEnabled) {
        this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Specifies whether the data stored on the user volume, or D: drive, is
     * encrypted.
     * </p>
     * 
     * @return Specifies whether the data stored on the user volume, or D:
     *         drive, is encrypted.
     */
    public Boolean getUserVolumeEncryptionEnabled() {
        return this.userVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Specifies whether the data stored on the user volume, or D: drive, is
     * encrypted.
     * </p>
     * 
     * @param userVolumeEncryptionEnabled
     *        Specifies whether the data stored on the user volume, or D: drive,
     *        is encrypted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public WorkspaceRequest withUserVolumeEncryptionEnabled(
            Boolean userVolumeEncryptionEnabled) {
        setUserVolumeEncryptionEnabled(userVolumeEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data stored on the user volume, or D: drive, is
     * encrypted.
     * </p>
     * 
     * @return Specifies whether the data stored on the user volume, or D:
     *         drive, is encrypted.
     */
    public Boolean isUserVolumeEncryptionEnabled() {
        return this.userVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Specifies whether the data stored on the root volume, or C: drive, is
     * encrypted.
     * </p>
     * 
     * @param rootVolumeEncryptionEnabled
     *        Specifies whether the data stored on the root volume, or C: drive,
     *        is encrypted.
     */
    public void setRootVolumeEncryptionEnabled(
            Boolean rootVolumeEncryptionEnabled) {
        this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Specifies whether the data stored on the root volume, or C: drive, is
     * encrypted.
     * </p>
     * 
     * @return Specifies whether the data stored on the root volume, or C:
     *         drive, is encrypted.
     */
    public Boolean getRootVolumeEncryptionEnabled() {
        return this.rootVolumeEncryptionEnabled;
    }

    /**
     * <p>
     * Specifies whether the data stored on the root volume, or C: drive, is
     * encrypted.
     * </p>
     * 
     * @param rootVolumeEncryptionEnabled
     *        Specifies whether the data stored on the root volume, or C: drive,
     *        is encrypted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public WorkspaceRequest withRootVolumeEncryptionEnabled(
            Boolean rootVolumeEncryptionEnabled) {
        setRootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data stored on the root volume, or C: drive, is
     * encrypted.
     * </p>
     * 
     * @return Specifies whether the data stored on the root volume, or C:
     *         drive, is encrypted.
     */
    public Boolean isRootVolumeEncryptionEnabled() {
        return this.rootVolumeEncryptionEnabled;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getBundleId() != null)
            sb.append("BundleId: " + getBundleId() + ",");
        if (getVolumeEncryptionKey() != null)
            sb.append("VolumeEncryptionKey: " + getVolumeEncryptionKey() + ",");
        if (getUserVolumeEncryptionEnabled() != null)
            sb.append("UserVolumeEncryptionEnabled: "
                    + getUserVolumeEncryptionEnabled() + ",");
        if (getRootVolumeEncryptionEnabled() != null)
            sb.append("RootVolumeEncryptionEnabled: "
                    + getRootVolumeEncryptionEnabled());
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
        if (other.getDirectoryId() != null
                && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null
                && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null
                && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getVolumeEncryptionKey() == null
                ^ this.getVolumeEncryptionKey() == null)
            return false;
        if (other.getVolumeEncryptionKey() != null
                && other.getVolumeEncryptionKey().equals(
                        this.getVolumeEncryptionKey()) == false)
            return false;
        if (other.getUserVolumeEncryptionEnabled() == null
                ^ this.getUserVolumeEncryptionEnabled() == null)
            return false;
        if (other.getUserVolumeEncryptionEnabled() != null
                && other.getUserVolumeEncryptionEnabled().equals(
                        this.getUserVolumeEncryptionEnabled()) == false)
            return false;
        if (other.getRootVolumeEncryptionEnabled() == null
                ^ this.getRootVolumeEncryptionEnabled() == null)
            return false;
        if (other.getRootVolumeEncryptionEnabled() != null
                && other.getRootVolumeEncryptionEnabled().equals(
                        this.getRootVolumeEncryptionEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode
                + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime
                * hashCode
                + ((getVolumeEncryptionKey() == null) ? 0
                        : getVolumeEncryptionKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getUserVolumeEncryptionEnabled() == null) ? 0
                        : getUserVolumeEncryptionEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getRootVolumeEncryptionEnabled() == null) ? 0
                        : getRootVolumeEncryptionEnabled().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceRequest clone() {
        try {
            return (WorkspaceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}