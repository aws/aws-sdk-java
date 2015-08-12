/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
            sb.append("BundleId: " + getBundleId());
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