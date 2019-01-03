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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a file in a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/File" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class File implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The blob ID that contains the file information.
     * </p>
     */
    private String blobId;
    /**
     * <p>
     * The fully-qualified path to the file in the repository.
     * </p>
     */
    private String absolutePath;
    /**
     * <p>
     * The relative path of the file from the folder where the query originated.
     * </p>
     */
    private String relativePath;
    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
     * </p>
     */
    private String fileMode;

    /**
     * <p>
     * The blob ID that contains the file information.
     * </p>
     * 
     * @param blobId
     *        The blob ID that contains the file information.
     */

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    /**
     * <p>
     * The blob ID that contains the file information.
     * </p>
     * 
     * @return The blob ID that contains the file information.
     */

    public String getBlobId() {
        return this.blobId;
    }

    /**
     * <p>
     * The blob ID that contains the file information.
     * </p>
     * 
     * @param blobId
     *        The blob ID that contains the file information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public File withBlobId(String blobId) {
        setBlobId(blobId);
        return this;
    }

    /**
     * <p>
     * The fully-qualified path to the file in the repository.
     * </p>
     * 
     * @param absolutePath
     *        The fully-qualified path to the file in the repository.
     */

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    /**
     * <p>
     * The fully-qualified path to the file in the repository.
     * </p>
     * 
     * @return The fully-qualified path to the file in the repository.
     */

    public String getAbsolutePath() {
        return this.absolutePath;
    }

    /**
     * <p>
     * The fully-qualified path to the file in the repository.
     * </p>
     * 
     * @param absolutePath
     *        The fully-qualified path to the file in the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public File withAbsolutePath(String absolutePath) {
        setAbsolutePath(absolutePath);
        return this;
    }

    /**
     * <p>
     * The relative path of the file from the folder where the query originated.
     * </p>
     * 
     * @param relativePath
     *        The relative path of the file from the folder where the query originated.
     */

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    /**
     * <p>
     * The relative path of the file from the folder where the query originated.
     * </p>
     * 
     * @return The relative path of the file from the folder where the query originated.
     */

    public String getRelativePath() {
        return this.relativePath;
    }

    /**
     * <p>
     * The relative path of the file from the folder where the query originated.
     * </p>
     * 
     * @param relativePath
     *        The relative path of the file from the folder where the query originated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public File withRelativePath(String relativePath) {
        setRelativePath(relativePath);
        return this;
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
     * </p>
     * 
     * @param fileMode
     *        The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
     * @see FileModeTypeEnum
     */

    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
     * </p>
     * 
     * @return The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
     * @see FileModeTypeEnum
     */

    public String getFileMode() {
        return this.fileMode;
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
     * </p>
     * 
     * @param fileMode
     *        The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileModeTypeEnum
     */

    public File withFileMode(String fileMode) {
        setFileMode(fileMode);
        return this;
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
     * </p>
     * 
     * @param fileMode
     *        The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileModeTypeEnum
     */

    public File withFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
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
        if (getBlobId() != null)
            sb.append("BlobId: ").append(getBlobId()).append(",");
        if (getAbsolutePath() != null)
            sb.append("AbsolutePath: ").append(getAbsolutePath()).append(",");
        if (getRelativePath() != null)
            sb.append("RelativePath: ").append(getRelativePath()).append(",");
        if (getFileMode() != null)
            sb.append("FileMode: ").append(getFileMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof File == false)
            return false;
        File other = (File) obj;
        if (other.getBlobId() == null ^ this.getBlobId() == null)
            return false;
        if (other.getBlobId() != null && other.getBlobId().equals(this.getBlobId()) == false)
            return false;
        if (other.getAbsolutePath() == null ^ this.getAbsolutePath() == null)
            return false;
        if (other.getAbsolutePath() != null && other.getAbsolutePath().equals(this.getAbsolutePath()) == false)
            return false;
        if (other.getRelativePath() == null ^ this.getRelativePath() == null)
            return false;
        if (other.getRelativePath() != null && other.getRelativePath().equals(this.getRelativePath()) == false)
            return false;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlobId() == null) ? 0 : getBlobId().hashCode());
        hashCode = prime * hashCode + ((getAbsolutePath() == null) ? 0 : getAbsolutePath().hashCode());
        hashCode = prime * hashCode + ((getRelativePath() == null) ? 0 : getRelativePath().hashCode());
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        return hashCode;
    }

    @Override
    public File clone() {
        try {
            return (File) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.FileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
