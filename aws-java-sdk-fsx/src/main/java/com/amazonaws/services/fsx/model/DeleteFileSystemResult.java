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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response object for the <code>DeleteFileSystem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFileSystemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the file system being deleted.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The file system lifecycle for the deletion request. Should be <code>DELETING</code>.
     * </p>
     */
    private String lifecycle;

    private DeleteFileSystemWindowsResponse windowsResponse;

    /**
     * <p>
     * The ID of the file system being deleted.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system being deleted.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system being deleted.
     * </p>
     * 
     * @return The ID of the file system being deleted.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system being deleted.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileSystemResult withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The file system lifecycle for the deletion request. Should be <code>DELETING</code>.
     * </p>
     * 
     * @param lifecycle
     *        The file system lifecycle for the deletion request. Should be <code>DELETING</code>.
     * @see FileSystemLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The file system lifecycle for the deletion request. Should be <code>DELETING</code>.
     * </p>
     * 
     * @return The file system lifecycle for the deletion request. Should be <code>DELETING</code>.
     * @see FileSystemLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The file system lifecycle for the deletion request. Should be <code>DELETING</code>.
     * </p>
     * 
     * @param lifecycle
     *        The file system lifecycle for the deletion request. Should be <code>DELETING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemLifecycle
     */

    public DeleteFileSystemResult withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The file system lifecycle for the deletion request. Should be <code>DELETING</code>.
     * </p>
     * 
     * @param lifecycle
     *        The file system lifecycle for the deletion request. Should be <code>DELETING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemLifecycle
     */

    public DeleteFileSystemResult withLifecycle(FileSystemLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * @param windowsResponse
     */

    public void setWindowsResponse(DeleteFileSystemWindowsResponse windowsResponse) {
        this.windowsResponse = windowsResponse;
    }

    /**
     * @return
     */

    public DeleteFileSystemWindowsResponse getWindowsResponse() {
        return this.windowsResponse;
    }

    /**
     * @param windowsResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileSystemResult withWindowsResponse(DeleteFileSystemWindowsResponse windowsResponse) {
        setWindowsResponse(windowsResponse);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getWindowsResponse() != null)
            sb.append("WindowsResponse: ").append(getWindowsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileSystemResult == false)
            return false;
        DeleteFileSystemResult other = (DeleteFileSystemResult) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getWindowsResponse() == null ^ this.getWindowsResponse() == null)
            return false;
        if (other.getWindowsResponse() != null && other.getWindowsResponse().equals(this.getWindowsResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getWindowsResponse() == null) ? 0 : getWindowsResponse().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFileSystemResult clone() {
        try {
            return (DeleteFileSystemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
