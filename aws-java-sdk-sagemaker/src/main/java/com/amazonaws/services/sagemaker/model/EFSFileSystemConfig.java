/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The settings for assigning a custom Amazon EFS file system to a user profile or space for an Amazon SageMaker Domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EFSFileSystemConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EFSFileSystemConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of your Amazon EFS file system.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The path to the file system directory that is accessible in Amazon SageMaker Studio. Permitted users can access
     * only this directory and below.
     * </p>
     */
    private String fileSystemPath;

    /**
     * <p>
     * The ID of your Amazon EFS file system.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of your Amazon EFS file system.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of your Amazon EFS file system.
     * </p>
     * 
     * @return The ID of your Amazon EFS file system.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of your Amazon EFS file system.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of your Amazon EFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EFSFileSystemConfig withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The path to the file system directory that is accessible in Amazon SageMaker Studio. Permitted users can access
     * only this directory and below.
     * </p>
     * 
     * @param fileSystemPath
     *        The path to the file system directory that is accessible in Amazon SageMaker Studio. Permitted users can
     *        access only this directory and below.
     */

    public void setFileSystemPath(String fileSystemPath) {
        this.fileSystemPath = fileSystemPath;
    }

    /**
     * <p>
     * The path to the file system directory that is accessible in Amazon SageMaker Studio. Permitted users can access
     * only this directory and below.
     * </p>
     * 
     * @return The path to the file system directory that is accessible in Amazon SageMaker Studio. Permitted users can
     *         access only this directory and below.
     */

    public String getFileSystemPath() {
        return this.fileSystemPath;
    }

    /**
     * <p>
     * The path to the file system directory that is accessible in Amazon SageMaker Studio. Permitted users can access
     * only this directory and below.
     * </p>
     * 
     * @param fileSystemPath
     *        The path to the file system directory that is accessible in Amazon SageMaker Studio. Permitted users can
     *        access only this directory and below.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EFSFileSystemConfig withFileSystemPath(String fileSystemPath) {
        setFileSystemPath(fileSystemPath);
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
        if (getFileSystemPath() != null)
            sb.append("FileSystemPath: ").append(getFileSystemPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EFSFileSystemConfig == false)
            return false;
        EFSFileSystemConfig other = (EFSFileSystemConfig) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getFileSystemPath() == null ^ this.getFileSystemPath() == null)
            return false;
        if (other.getFileSystemPath() != null && other.getFileSystemPath().equals(this.getFileSystemPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getFileSystemPath() == null) ? 0 : getFileSystemPath().hashCode());
        return hashCode;
    }

    @Override
    public EFSFileSystemConfig clone() {
        try {
            return (EFSFileSystemConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EFSFileSystemConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
