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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeFolderPermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFolderPermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status. If succeeded, the status is <code>SC_OK</code>.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * The folder ID.
     * </p>
     */
    private String folderId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the folder.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Information about the permissions on the folder.
     * </p>
     */
    private java.util.List<ResourcePermission> permissions;
    /**
     * <p>
     * The request ID.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * The status. If succeeded, the status is <code>SC_OK</code>.
     * </p>
     * 
     * @param status
     *        The status. If succeeded, the status is <code>SC_OK</code>.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The status. If succeeded, the status is <code>SC_OK</code>.
     * </p>
     * 
     * @return The status. If succeeded, the status is <code>SC_OK</code>.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status. If succeeded, the status is <code>SC_OK</code>.
     * </p>
     * 
     * @param status
     *        The status. If succeeded, the status is <code>SC_OK</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderPermissionsResult withStatus(Integer status) {
        setStatus(status);
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

    public DescribeFolderPermissionsResult withFolderId(String folderId) {
        setFolderId(folderId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the folder.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the folder.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the folder.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the folder.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the folder.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderPermissionsResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Information about the permissions on the folder.
     * </p>
     * 
     * @return Information about the permissions on the folder.
     */

    public java.util.List<ResourcePermission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * Information about the permissions on the folder.
     * </p>
     * 
     * @param permissions
     *        Information about the permissions on the folder.
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
     * Information about the permissions on the folder.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        Information about the permissions on the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderPermissionsResult withPermissions(ResourcePermission... permissions) {
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
     * Information about the permissions on the folder.
     * </p>
     * 
     * @param permissions
     *        Information about the permissions on the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderPermissionsResult withPermissions(java.util.Collection<ResourcePermission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The request ID.
     * </p>
     * 
     * @param requestId
     *        The request ID.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID.
     * </p>
     * 
     * @return The request ID.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID.
     * </p>
     * 
     * @param requestId
     *        The request ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderPermissionsResult withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFolderId() != null)
            sb.append("FolderId: ").append(getFolderId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFolderPermissionsResult == false)
            return false;
        DescribeFolderPermissionsResult other = (DescribeFolderPermissionsResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFolderId() == null ^ this.getFolderId() == null)
            return false;
        if (other.getFolderId() != null && other.getFolderId().equals(this.getFolderId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFolderId() == null) ? 0 : getFolderId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFolderPermissionsResult clone() {
        try {
            return (DescribeFolderPermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
