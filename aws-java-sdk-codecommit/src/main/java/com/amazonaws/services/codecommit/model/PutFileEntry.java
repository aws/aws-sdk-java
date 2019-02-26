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
 * Information about a file that will be added or updated as part of a commit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutFileEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFileEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full path to the file in the repository, including the name of the file.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
     * </p>
     */
    private String fileMode;
    /**
     * <p>
     * The content of the file, if a source file is not specified.
     * </p>
     */
    private java.nio.ByteBuffer fileContent;
    /**
     * <p>
     * The name and full path of the file that contains the changes you want to make as part of the commit, if you are
     * not providing the file content directly.
     * </p>
     */
    private SourceFileSpecifier sourceFile;

    /**
     * <p>
     * The full path to the file in the repository, including the name of the file.
     * </p>
     * 
     * @param filePath
     *        The full path to the file in the repository, including the name of the file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The full path to the file in the repository, including the name of the file.
     * </p>
     * 
     * @return The full path to the file in the repository, including the name of the file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The full path to the file in the repository, including the name of the file.
     * </p>
     * 
     * @param filePath
     *        The full path to the file in the repository, including the name of the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileEntry withFilePath(String filePath) {
        setFilePath(filePath);
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

    public PutFileEntry withFileMode(String fileMode) {
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

    public PutFileEntry withFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
        return this;
    }

    /**
     * <p>
     * The content of the file, if a source file is not specified.
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
     *        The content of the file, if a source file is not specified.
     */

    public void setFileContent(java.nio.ByteBuffer fileContent) {
        this.fileContent = fileContent;
    }

    /**
     * <p>
     * The content of the file, if a source file is not specified.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The content of the file, if a source file is not specified.
     */

    public java.nio.ByteBuffer getFileContent() {
        return this.fileContent;
    }

    /**
     * <p>
     * The content of the file, if a source file is not specified.
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
     *        The content of the file, if a source file is not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileEntry withFileContent(java.nio.ByteBuffer fileContent) {
        setFileContent(fileContent);
        return this;
    }

    /**
     * <p>
     * The name and full path of the file that contains the changes you want to make as part of the commit, if you are
     * not providing the file content directly.
     * </p>
     * 
     * @param sourceFile
     *        The name and full path of the file that contains the changes you want to make as part of the commit, if
     *        you are not providing the file content directly.
     */

    public void setSourceFile(SourceFileSpecifier sourceFile) {
        this.sourceFile = sourceFile;
    }

    /**
     * <p>
     * The name and full path of the file that contains the changes you want to make as part of the commit, if you are
     * not providing the file content directly.
     * </p>
     * 
     * @return The name and full path of the file that contains the changes you want to make as part of the commit, if
     *         you are not providing the file content directly.
     */

    public SourceFileSpecifier getSourceFile() {
        return this.sourceFile;
    }

    /**
     * <p>
     * The name and full path of the file that contains the changes you want to make as part of the commit, if you are
     * not providing the file content directly.
     * </p>
     * 
     * @param sourceFile
     *        The name and full path of the file that contains the changes you want to make as part of the commit, if
     *        you are not providing the file content directly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFileEntry withSourceFile(SourceFileSpecifier sourceFile) {
        setSourceFile(sourceFile);
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
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getFileMode() != null)
            sb.append("FileMode: ").append(getFileMode()).append(",");
        if (getFileContent() != null)
            sb.append("FileContent: ").append(getFileContent()).append(",");
        if (getSourceFile() != null)
            sb.append("SourceFile: ").append(getSourceFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutFileEntry == false)
            return false;
        PutFileEntry other = (PutFileEntry) obj;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        if (other.getFileContent() == null ^ this.getFileContent() == null)
            return false;
        if (other.getFileContent() != null && other.getFileContent().equals(this.getFileContent()) == false)
            return false;
        if (other.getSourceFile() == null ^ this.getSourceFile() == null)
            return false;
        if (other.getSourceFile() != null && other.getSourceFile().equals(this.getSourceFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        hashCode = prime * hashCode + ((getFileContent() == null) ? 0 : getFileContent().hashCode());
        hashCode = prime * hashCode + ((getSourceFile() == null) ? 0 : getSourceFile().hashCode());
        return hashCode;
    }

    @Override
    public PutFileEntry clone() {
        try {
            return (PutFileEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.PutFileEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
