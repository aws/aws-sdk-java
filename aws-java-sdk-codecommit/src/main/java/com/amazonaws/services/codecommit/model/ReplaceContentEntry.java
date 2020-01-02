/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about a replacement content entry in the conflict of a merge or pull request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ReplaceContentEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceContentEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path of the conflicting file.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The replacement type to use when determining how to resolve the conflict.
     * </p>
     */
    private String replacementType;
    /**
     * <p>
     * The base-64 encoded content to use when the replacement type is USE_NEW_CONTENT.
     * </p>
     */
    private java.nio.ByteBuffer content;
    /**
     * <p>
     * The file mode to apply during conflict resoltion.
     * </p>
     */
    private String fileMode;

    /**
     * <p>
     * The path of the conflicting file.
     * </p>
     * 
     * @param filePath
     *        The path of the conflicting file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The path of the conflicting file.
     * </p>
     * 
     * @return The path of the conflicting file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The path of the conflicting file.
     * </p>
     * 
     * @param filePath
     *        The path of the conflicting file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceContentEntry withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The replacement type to use when determining how to resolve the conflict.
     * </p>
     * 
     * @param replacementType
     *        The replacement type to use when determining how to resolve the conflict.
     * @see ReplacementTypeEnum
     */

    public void setReplacementType(String replacementType) {
        this.replacementType = replacementType;
    }

    /**
     * <p>
     * The replacement type to use when determining how to resolve the conflict.
     * </p>
     * 
     * @return The replacement type to use when determining how to resolve the conflict.
     * @see ReplacementTypeEnum
     */

    public String getReplacementType() {
        return this.replacementType;
    }

    /**
     * <p>
     * The replacement type to use when determining how to resolve the conflict.
     * </p>
     * 
     * @param replacementType
     *        The replacement type to use when determining how to resolve the conflict.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplacementTypeEnum
     */

    public ReplaceContentEntry withReplacementType(String replacementType) {
        setReplacementType(replacementType);
        return this;
    }

    /**
     * <p>
     * The replacement type to use when determining how to resolve the conflict.
     * </p>
     * 
     * @param replacementType
     *        The replacement type to use when determining how to resolve the conflict.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplacementTypeEnum
     */

    public ReplaceContentEntry withReplacementType(ReplacementTypeEnum replacementType) {
        this.replacementType = replacementType.toString();
        return this;
    }

    /**
     * <p>
     * The base-64 encoded content to use when the replacement type is USE_NEW_CONTENT.
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
     * @param content
     *        The base-64 encoded content to use when the replacement type is USE_NEW_CONTENT.
     */

    public void setContent(java.nio.ByteBuffer content) {
        this.content = content;
    }

    /**
     * <p>
     * The base-64 encoded content to use when the replacement type is USE_NEW_CONTENT.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The base-64 encoded content to use when the replacement type is USE_NEW_CONTENT.
     */

    public java.nio.ByteBuffer getContent() {
        return this.content;
    }

    /**
     * <p>
     * The base-64 encoded content to use when the replacement type is USE_NEW_CONTENT.
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
     * @param content
     *        The base-64 encoded content to use when the replacement type is USE_NEW_CONTENT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceContentEntry withContent(java.nio.ByteBuffer content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The file mode to apply during conflict resoltion.
     * </p>
     * 
     * @param fileMode
     *        The file mode to apply during conflict resoltion.
     * @see FileModeTypeEnum
     */

    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The file mode to apply during conflict resoltion.
     * </p>
     * 
     * @return The file mode to apply during conflict resoltion.
     * @see FileModeTypeEnum
     */

    public String getFileMode() {
        return this.fileMode;
    }

    /**
     * <p>
     * The file mode to apply during conflict resoltion.
     * </p>
     * 
     * @param fileMode
     *        The file mode to apply during conflict resoltion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileModeTypeEnum
     */

    public ReplaceContentEntry withFileMode(String fileMode) {
        setFileMode(fileMode);
        return this;
    }

    /**
     * <p>
     * The file mode to apply during conflict resoltion.
     * </p>
     * 
     * @param fileMode
     *        The file mode to apply during conflict resoltion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileModeTypeEnum
     */

    public ReplaceContentEntry withFileMode(FileModeTypeEnum fileMode) {
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
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getReplacementType() != null)
            sb.append("ReplacementType: ").append(getReplacementType()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
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

        if (obj instanceof ReplaceContentEntry == false)
            return false;
        ReplaceContentEntry other = (ReplaceContentEntry) obj;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getReplacementType() == null ^ this.getReplacementType() == null)
            return false;
        if (other.getReplacementType() != null && other.getReplacementType().equals(this.getReplacementType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
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

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getReplacementType() == null) ? 0 : getReplacementType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        return hashCode;
    }

    @Override
    public ReplaceContentEntry clone() {
        try {
            return (ReplaceContentEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.ReplaceContentEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
