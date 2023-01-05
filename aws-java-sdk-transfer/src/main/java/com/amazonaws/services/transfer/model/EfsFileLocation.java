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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reserved for future use.
 * </p>
 * <p>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/EfsFileLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EfsFileLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the file system, assigned by Amazon EFS.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The pathname for the folder being used by a workflow.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The identifier of the file system, assigned by Amazon EFS.
     * </p>
     * 
     * @param fileSystemId
     *        The identifier of the file system, assigned by Amazon EFS.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The identifier of the file system, assigned by Amazon EFS.
     * </p>
     * 
     * @return The identifier of the file system, assigned by Amazon EFS.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The identifier of the file system, assigned by Amazon EFS.
     * </p>
     * 
     * @param fileSystemId
     *        The identifier of the file system, assigned by Amazon EFS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EfsFileLocation withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The pathname for the folder being used by a workflow.
     * </p>
     * 
     * @param path
     *        The pathname for the folder being used by a workflow.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The pathname for the folder being used by a workflow.
     * </p>
     * 
     * @return The pathname for the folder being used by a workflow.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The pathname for the folder being used by a workflow.
     * </p>
     * 
     * @param path
     *        The pathname for the folder being used by a workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EfsFileLocation withPath(String path) {
        setPath(path);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EfsFileLocation == false)
            return false;
        EfsFileLocation other = (EfsFileLocation) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public EfsFileLocation clone() {
        try {
            return (EfsFileLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.EfsFileLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
