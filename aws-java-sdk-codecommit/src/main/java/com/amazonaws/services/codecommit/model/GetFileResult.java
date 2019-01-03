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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full commit ID of the commit that contains the content returned by GetFile.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * The blob ID of the object that represents the file content.
     * </p>
     */
    private String blobId;
    /**
     * <p>
     * The fully qualified path to the specified file. This returns the name and extension of the file.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and not
     * numeric values.
     * </p>
     * <note>
     * <p>
     * The file mode permissions returned by this API are not the standard file mode permission values, such as 100644,
     * but rather extrapolated values. See below for a full list of supported return values.
     * </p>
     * </note>
     */
    private String fileMode;
    /**
     * <p>
     * The size of the contents of the file, in bytes.
     * </p>
     */
    private Long fileSize;
    /**
     * <p>
     * The base-64 encoded binary data object that represents the content of the file.
     * </p>
     */
    private java.nio.ByteBuffer fileContent;

    /**
     * <p>
     * The full commit ID of the commit that contains the content returned by GetFile.
     * </p>
     * 
     * @param commitId
     *        The full commit ID of the commit that contains the content returned by GetFile.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains the content returned by GetFile.
     * </p>
     * 
     * @return The full commit ID of the commit that contains the content returned by GetFile.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains the content returned by GetFile.
     * </p>
     * 
     * @param commitId
     *        The full commit ID of the commit that contains the content returned by GetFile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFileResult withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * The blob ID of the object that represents the file content.
     * </p>
     * 
     * @param blobId
     *        The blob ID of the object that represents the file content.
     */

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    /**
     * <p>
     * The blob ID of the object that represents the file content.
     * </p>
     * 
     * @return The blob ID of the object that represents the file content.
     */

    public String getBlobId() {
        return this.blobId;
    }

    /**
     * <p>
     * The blob ID of the object that represents the file content.
     * </p>
     * 
     * @param blobId
     *        The blob ID of the object that represents the file content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFileResult withBlobId(String blobId) {
        setBlobId(blobId);
        return this;
    }

    /**
     * <p>
     * The fully qualified path to the specified file. This returns the name and extension of the file.
     * </p>
     * 
     * @param filePath
     *        The fully qualified path to the specified file. This returns the name and extension of the file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The fully qualified path to the specified file. This returns the name and extension of the file.
     * </p>
     * 
     * @return The fully qualified path to the specified file. This returns the name and extension of the file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The fully qualified path to the specified file. This returns the name and extension of the file.
     * </p>
     * 
     * @param filePath
     *        The fully qualified path to the specified file. This returns the name and extension of the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFileResult withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and not
     * numeric values.
     * </p>
     * <note>
     * <p>
     * The file mode permissions returned by this API are not the standard file mode permission values, such as 100644,
     * but rather extrapolated values. See below for a full list of supported return values.
     * </p>
     * </note>
     * 
     * @param fileMode
     *        The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and
     *        not numeric values.</p> <note>
     *        <p>
     *        The file mode permissions returned by this API are not the standard file mode permission values, such as
     *        100644, but rather extrapolated values. See below for a full list of supported return values.
     *        </p>
     * @see FileModeTypeEnum
     */

    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and not
     * numeric values.
     * </p>
     * <note>
     * <p>
     * The file mode permissions returned by this API are not the standard file mode permission values, such as 100644,
     * but rather extrapolated values. See below for a full list of supported return values.
     * </p>
     * </note>
     * 
     * @return The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and
     *         not numeric values.</p> <note>
     *         <p>
     *         The file mode permissions returned by this API are not the standard file mode permission values, such as
     *         100644, but rather extrapolated values. See below for a full list of supported return values.
     *         </p>
     * @see FileModeTypeEnum
     */

    public String getFileMode() {
        return this.fileMode;
    }

    /**
     * <p>
     * The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and not
     * numeric values.
     * </p>
     * <note>
     * <p>
     * The file mode permissions returned by this API are not the standard file mode permission values, such as 100644,
     * but rather extrapolated values. See below for a full list of supported return values.
     * </p>
     * </note>
     * 
     * @param fileMode
     *        The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and
     *        not numeric values.</p> <note>
     *        <p>
     *        The file mode permissions returned by this API are not the standard file mode permission values, such as
     *        100644, but rather extrapolated values. See below for a full list of supported return values.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileModeTypeEnum
     */

    public GetFileResult withFileMode(String fileMode) {
        setFileMode(fileMode);
        return this;
    }

    /**
     * <p>
     * The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and not
     * numeric values.
     * </p>
     * <note>
     * <p>
     * The file mode permissions returned by this API are not the standard file mode permission values, such as 100644,
     * but rather extrapolated values. See below for a full list of supported return values.
     * </p>
     * </note>
     * 
     * @param fileMode
     *        The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and
     *        not numeric values.</p> <note>
     *        <p>
     *        The file mode permissions returned by this API are not the standard file mode permission values, such as
     *        100644, but rather extrapolated values. See below for a full list of supported return values.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileModeTypeEnum
     */

    public GetFileResult withFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
        return this;
    }

    /**
     * <p>
     * The size of the contents of the file, in bytes.
     * </p>
     * 
     * @param fileSize
     *        The size of the contents of the file, in bytes.
     */

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * <p>
     * The size of the contents of the file, in bytes.
     * </p>
     * 
     * @return The size of the contents of the file, in bytes.
     */

    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * <p>
     * The size of the contents of the file, in bytes.
     * </p>
     * 
     * @param fileSize
     *        The size of the contents of the file, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFileResult withFileSize(Long fileSize) {
        setFileSize(fileSize);
        return this;
    }

    /**
     * <p>
     * The base-64 encoded binary data object that represents the content of the file.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param fileContent
     *        The base-64 encoded binary data object that represents the content of the file.
     */

    public void setFileContent(java.nio.ByteBuffer fileContent) {
        this.fileContent = fileContent;
    }

    /**
     * <p>
     * The base-64 encoded binary data object that represents the content of the file.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The base-64 encoded binary data object that represents the content of the file.
     */

    public java.nio.ByteBuffer getFileContent() {
        return this.fileContent;
    }

    /**
     * <p>
     * The base-64 encoded binary data object that represents the content of the file.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param fileContent
     *        The base-64 encoded binary data object that represents the content of the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFileResult withFileContent(java.nio.ByteBuffer fileContent) {
        setFileContent(fileContent);
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
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId()).append(",");
        if (getBlobId() != null)
            sb.append("BlobId: ").append(getBlobId()).append(",");
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getFileMode() != null)
            sb.append("FileMode: ").append(getFileMode()).append(",");
        if (getFileSize() != null)
            sb.append("FileSize: ").append(getFileSize()).append(",");
        if (getFileContent() != null)
            sb.append("FileContent: ").append(getFileContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFileResult == false)
            return false;
        GetFileResult other = (GetFileResult) obj;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getBlobId() == null ^ this.getBlobId() == null)
            return false;
        if (other.getBlobId() != null && other.getBlobId().equals(this.getBlobId()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        if (other.getFileSize() == null ^ this.getFileSize() == null)
            return false;
        if (other.getFileSize() != null && other.getFileSize().equals(this.getFileSize()) == false)
            return false;
        if (other.getFileContent() == null ^ this.getFileContent() == null)
            return false;
        if (other.getFileContent() != null && other.getFileContent().equals(this.getFileContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getBlobId() == null) ? 0 : getBlobId().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        hashCode = prime * hashCode + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        hashCode = prime * hashCode + ((getFileContent() == null) ? 0 : getFileContent().hashCode());
        return hashCode;
    }

    @Override
    public GetFileResult clone() {
        try {
            return (GetFileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
