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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error describing a failure to retrieve attached file metadata through BatchGetAttachedFileMetadata action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AttachedFileError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachedFileError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Status code describing the failure.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * Why the attached file couldn't be retrieved.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     */
    private String fileId;

    /**
     * <p>
     * Status code describing the failure.
     * </p>
     * 
     * @param errorCode
     *        Status code describing the failure.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Status code describing the failure.
     * </p>
     * 
     * @return Status code describing the failure.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Status code describing the failure.
     * </p>
     * 
     * @param errorCode
     *        Status code describing the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachedFileError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Why the attached file couldn't be retrieved.
     * </p>
     * 
     * @param errorMessage
     *        Why the attached file couldn't be retrieved.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Why the attached file couldn't be retrieved.
     * </p>
     * 
     * @return Why the attached file couldn't be retrieved.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Why the attached file couldn't be retrieved.
     * </p>
     * 
     * @param errorMessage
     *        Why the attached file couldn't be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachedFileError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * 
     * @param fileId
     *        The unique identifier of the attached file resource.
     */

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * 
     * @return The unique identifier of the attached file resource.
     */

    public String getFileId() {
        return this.fileId;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * 
     * @param fileId
     *        The unique identifier of the attached file resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachedFileError withFileId(String fileId) {
        setFileId(fileId);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getFileId() != null)
            sb.append("FileId: ").append(getFileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachedFileError == false)
            return false;
        AttachedFileError other = (AttachedFileError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getFileId() == null ^ this.getFileId() == null)
            return false;
        if (other.getFileId() != null && other.getFileId().equals(this.getFileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getFileId() == null) ? 0 : getFileId().hashCode());
        return hashCode;
    }

    @Override
    public AttachedFileError clone() {
        try {
            return (AttachedFileError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AttachedFileErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
